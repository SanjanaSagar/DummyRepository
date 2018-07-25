package com.capgemini.ssms.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.ssms.dto.ScheduledSessions;




@Repository("trainingdao")
public class TrainingDAOImpl implements ITrainingDAO {

	
	@Autowired
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<ScheduledSessions> viewSessions() {
		
		Query query=entityManager.createQuery("from ScheduledSessions");
		
		List<ScheduledSessions> sessions=new ArrayList<ScheduledSessions>();
		
		sessions=query.getResultList();
		
		return sessions;
	}

	@Override
	public ScheduledSessions getSession(String id) {
		
		return entityManager.find(ScheduledSessions.class, Integer.parseInt(id));
		
	}
	
	
}
