package com.example.demo.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Before("execution(* com.example.demo.service.DemoServices.display(..))")
    public void beforeMethodExecution(JoinPoint joinPoint) {

        String methodName = joinPoint.getSignature().getName();
        logger.info("Executed before method: " + methodName);
    }
}
