package com.qcode.qsystem.teller.common.entity;

import java.io.Serializable;
import java.util.Date;

public class TellerEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2363657596945671716L;
	private int id;
	private String br_code;
	private Date trn_date;
	private String hash;
	private String username;
	private String password;
	private String type;
	private int cmd;
	private String teller_no;
	private String fullname;
	private int max_value;
	private int status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBr_code() {
		return br_code;
	}
	public void setBr_code(String br_code) {
		this.br_code = br_code;
	}
	public Date getTrn_date() {
		return trn_date;
	}
	public void setTrn_date(Date trn_date) {
		this.trn_date = trn_date;
	}
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCmd() {
		return cmd;
	}
	public void setCmd(int cmd) {
		this.cmd = cmd;
	}
	public String getTeller_no() {
		return teller_no;
	}
	public void setTeller_no(String teller_no) {
		this.teller_no = teller_no;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getMax_value() {
		return max_value;
	}
	public void setMax_value(int max_value) {
		this.max_value = max_value;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	

}
