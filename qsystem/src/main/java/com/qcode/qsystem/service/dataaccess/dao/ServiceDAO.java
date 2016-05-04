package com.qcode.qsystem.service.dataaccess.dao;

import java.util.List;

import com.qcode.qsystem.service.common.entity.ServiceEntity;
public interface ServiceDAO {
	public List<ServiceEntity> selectAll();
}
