package com.qcode.qsystem.service.presentation.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.qcode.qsystem.service.business.service.ServiceManagement;
import com.qcode.qsystem.service.common.entity.ServiceEntity;

@Controller
public class ServiceController {

	private static final Logger logger = LoggerFactory.getLogger(ServiceController.class);
	@Autowired
	private ServiceManagement service;
	
	/**
	 * get service information
	 * @return
	 */
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String serviceGet(Model model){
		logger.info("Run on ServiceController");
		List<ServiceEntity> serviceList = service.getAllService();
		model.addAttribute("serviceList", serviceList);
		return "home";
	}
}
