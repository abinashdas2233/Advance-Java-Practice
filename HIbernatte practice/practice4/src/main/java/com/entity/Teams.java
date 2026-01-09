package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Teams {
	@Id
	int teamId;
	String teamName;
	@OneToOne
	Players players;
	public Teams(int teamId, String teamName, Players players) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.players = players;
	}
	
	public Teams() {
		super();
	}

	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Players getPlayers() {
		return players;
	}
	public void setPlayers(Players players) {
		this.players = players;
	}
	
	

}
