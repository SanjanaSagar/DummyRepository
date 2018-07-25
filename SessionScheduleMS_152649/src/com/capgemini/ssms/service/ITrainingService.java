package com.capgemini.ssms.service;

import java.util.List;


import com.capgemini.ssms.dto.ScheduledSessions;

public interface ITrainingService {

	
	public List<ScheduledSessions> viewSessions();
	
	public ScheduledSessions getSession(String id);
	
}
