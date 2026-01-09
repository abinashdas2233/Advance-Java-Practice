package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Players {
	@Id
	int playersId;
	String name;
	@OneToOne
	Teams teams;
	public Players(int playersId, String name, Teams teams) {
		super();
		this.playersId = playersId;
		this.name = name;
		this.teams = teams;
	}
	public int getPlayersId() {
		return playersId;
	}
	public void setPlayersId(int playersId) {
		this.playersId = playersId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Teams getTeams() {
		return teams;
	}
	public void setTeams(Teams teams) {
		this.teams = teams;
	}
	
	
	

}
