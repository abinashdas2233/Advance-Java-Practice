package com.password.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.password.entity.PasswordLog;
import com.password.entity.UserInfo;
import com.password.exception.EmailNotFoundException;

@Repository
public class ResetPasswordDao {

    @Autowired
    private SessionFactory sf;

    public PasswordLog getPasswordLogEntity(String currentEmail) {

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        String hql = "SELECT u.id FROM UserInfo u WHERE u.email = :email";
        Integer currentUserId = (Integer) session
                .createQuery(hql)
                .setParameter("email", currentEmail)
                .uniqueResult();

        if (currentUserId == null) {
            tx.rollback();
            session.close();
            throw new EmailNotFoundException("Email Does not Exist...");
        }

        String logHql = "FROM PasswordLog p WHERE p.userId = :uid";
        PasswordLog passwordLogEntity = (PasswordLog) session
                .createQuery(logHql)
                .setParameter("uid", currentUserId)
                .uniqueResult();

        tx.commit();
        session.close();

        return passwordLogEntity;
    }

    public String updatePassword(String newPassword, PasswordLog passwordLogEntity) {

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        passwordLogEntity.setOldestPassword(passwordLogEntity.getOldPassword());
        passwordLogEntity.setOldPassword(passwordLogEntity.getCurrentPassword());
        passwordLogEntity.setCurrentPassword(newPassword);
        session.update(passwordLogEntity);

        String hql = "FROM UserInfo u WHERE u.id = :userId";
        UserInfo userEntity = (UserInfo) session
                .createQuery(hql)
                .setParameter("userId", passwordLogEntity.getUserId())
                .uniqueResult();

        userEntity.setPassword(newPassword);
        session.update(userEntity);

        tx.commit();
        session.close();

        return "Password Reset Successfully";
    }
}
