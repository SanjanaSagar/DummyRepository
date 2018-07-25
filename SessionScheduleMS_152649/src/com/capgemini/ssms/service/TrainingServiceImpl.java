package com.capgemini.ssms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.ssms.dao.ITrainingDAO;
import com.capgemini.ssms.dto.ScheduledSessions;


@Service("trainingservice")
@Transactional
public class TrainingServiceImpl implements ITrainingService {

	@Autowired
	ITrainingDAO trainingdao;
	
	@Override
	public List<ScheduledSessions> viewSessions() {
		// TODO Auto-generated method stub
		return trainingdao.viewSessions();
	}

	@Override
	public ScheduledSessions getSession(String id) {
		// TODO Auto-generated method stub
		return trainingdao.getSession(id);
	}

	
	
}
