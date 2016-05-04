package com.qcode.qsystem.service.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qcode.qsystem.service.business.service.ServiceManagement;
import com.qcode.qsystem.service.common.entity.ServiceEntity;
import com.qcode.qsystem.service.dataaccess.dao.ServiceDAO;
@Service
public class ServiceManagementImpl implements ServiceManagement{
	@Autowired
    ServiceDAO serviceDAO;
	
	@Override
	public List<ServiceEntity> getAllService() {
		return getServiceDAO().selectAll();
	}

	@Override
	public ServiceDAO getServiceDAO() {
		return serviceDAO;
	}

}
