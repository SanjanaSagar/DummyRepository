package com.capgemini.ssms.dao;

import java.util.List;


import com.capgemini.ssms.dto.ScheduledSessions;

public interface ITrainingDAO {

	public List<ScheduledSessions> viewSessions();
	
	public ScheduledSessions getSession(String id);
	
}
