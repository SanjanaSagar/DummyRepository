package com.capgemini.ssms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="ScheduledSessions")
public class ScheduledSessions {

	
	@Id
	@Column(name="id")
	@NotNull(message="Id is required")
	private int id;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Column(name="name")
	//@NotNull(message="Session name is required")
	private String name;
	
	@Column(name="duration")
	private int duration;
	
	@Column(name="faculty")
	private String faculty;
	
	

	public ScheduledSessions(int id, String name, int duration, String faculty, String mode) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.faculty = faculty;
		this.mode = mode;
	}


	public ScheduledSessions() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "ScheduledSessions [id=" + id + ", name=" + name + ", duration=" + duration + ", faculty=" + faculty
				+ ", mode=" + mode + "]";
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public String getFaculty() {
		return faculty;
	}


	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}


	public String getMode() {
		return mode;
	}


	public void setMode(String mode) {
		this.mode = mode;
	}


	@Column(name="mode")
	private String mode;
	
	
	
}
