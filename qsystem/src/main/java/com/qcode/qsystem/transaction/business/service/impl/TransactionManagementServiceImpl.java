package com.qcode.qsystem.transaction.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qcode.qsystem.transaction.business.service.TransactionManagementService;
import com.qcode.qsystem.transaction.common.entity.TransactionEntity;
import com.qcode.qsystem.transaction.dataaccess.dao.TransactionDAO;
@Service
public class TransactionManagementServiceImpl implements TransactionManagementService{
	
	@Autowired
	private TransactionDAO transactionDAO;

	@Override
	public TransactionDAO getTransactionDAO() {
		return transactionDAO;
	}

	@Override
	public void registerTransaction(String shortcut) {
		Integer max_code = getTransactionDAO().selectMaxCode(shortcut);
		if(max_code==null){
			max_code=0;
		}
		max_code++;
		String ticketNo= getTicketNo(shortcut,max_code);
		TransactionEntity trnEntity = new TransactionEntity();
		trnEntity.setTicket_no(ticketNo);
		trnEntity.setMax_value(max_code);
		trnEntity.setShortcut(shortcut);
		getTransactionDAO().register(trnEntity);
	}
	
	protected String getTicketNo(String shortcut, Integer max_code){
		int lg=5;
		int lg_mc = max_code.toString().length();
		String code = "";
		for(int i = 0; i <(lg-lg_mc);i++){
			code += "0";
		}
	    String result =shortcut+code+max_code;
		return result;
	}
	

}
