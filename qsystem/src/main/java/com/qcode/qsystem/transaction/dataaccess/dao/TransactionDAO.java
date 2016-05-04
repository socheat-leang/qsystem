package com.qcode.qsystem.transaction.dataaccess.dao;

import org.apache.ibatis.annotations.Param;

import com.qcode.qsystem.transaction.common.entity.TransactionEntity;

public interface TransactionDAO {
	public Integer selectMaxCode(@Param("shortcut") String shortcut);

	public void register(TransactionEntity trnEntity);
}
