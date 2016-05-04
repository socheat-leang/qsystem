package com.qcode.qsystem.transaction.business.service;

import org.springframework.stereotype.Service;

import com.qcode.qsystem.transaction.dataaccess.dao.TransactionDAO;

@Service
public interface TransactionManagementService {
	public TransactionDAO getTransactionDAO();
	public void registerTransaction(String shortcut);
	
}
