package com.capgemini.ssms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.ssms.dto.ScheduledSessions;
import com.capgemini.ssms.service.ITrainingService;


@Controller
public class TrainingController {

	
	@Autowired
	ITrainingService trainingservice;
	
	
	@RequestMapping(value="/viewAll",method=RequestMethod.GET)
	public ModelAndView getAllClients() {
		
		List<ScheduledSessions> list=trainingservice.viewSessions();
		return new ModelAndView("ScheduledSessions","sess",list);
		
	}
	
	@RequestMapping(value="/success/{id}",method=RequestMethod.GET)
	public ModelAndView success(@PathVariable("id") String id) {
		
		ScheduledSessions session= trainingservice.getSession(id);
		
		return new ModelAndView("success","sess1",session);
		
	}
	
	/*@RequestMapping(value="/successDisplay",method=RequestMethod.POST)
	public ModelAndView successDisplay(@ModelAttribute("sess")ScheduledSessions session) {
		
		return new ModelAndView("success","sess1",session);
	}
	*/
	
	
}
