package com.qcode.qsystem.service.business.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qcode.qsystem.service.dataaccess.dao.ServiceDAO;
@Service
public interface ServiceManagement {
	  public List<Integer> getAllService(); 
      public ServiceDAO getServiceDAO();
}
