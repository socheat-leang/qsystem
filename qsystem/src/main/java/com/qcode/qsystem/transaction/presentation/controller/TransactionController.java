package com.qcode.qsystem.transaction.presentation.controller;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.qcode.qsystem.transaction.business.service.TransactionManagementService;

@Controller
public class TransactionController {
	private static final Logger logger = LoggerFactory.getLogger(TransactionController.class);
	
	@Autowired
	TransactionManagementService service;
	@RequestMapping(value="rgtn",method=RequestMethod.GET)
	public String registerTransaction(@RequestParam("shortcut")String shortcut,HttpServletRequest request){
		Integer i=1001;
		logger.info("Run on TrasactionController on sub controller [rgtn] with shortcut "+shortcut+"-"+i.intValue()+"-"+i.toString().length()+"-"+i.byteValue()+"-");
		service.registerTransaction(shortcut);
		return "home";
	}
}
