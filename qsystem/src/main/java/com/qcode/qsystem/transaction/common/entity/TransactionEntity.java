package com.qcode.qsystem.transaction.common.entity;

import java.io.Serializable;
import java.util.Date;

public class TransactionEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5452498573138839706L;
	private int id;
	private String br_code;
	private String hash;
	private String type;
	private String ticket_no;
	private int feedback;
	private Date trn_date;
	private Date request_time;
	private Date call_time;
	private Date end_time;
	private int status;
	private String shortcut;
	private String teller_no;
	private String description;
	private int max_value;
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
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTicket_no() {
		return ticket_no;
	}
	public void setTicket_no(String ticket_no) {
		this.ticket_no = ticket_no;
	}
	public int getFeedback() {
		return feedback;
	}
	public void setFeedback(int feedback) {
		this.feedback = feedback;
	}
	public Date getRequest_time() {
		return request_time;
	}
	public void setRequest_time(Date request_time) {
		this.request_time = request_time;
	}
	public Date getTrn_date() {
		return trn_date;
	}
	public void setTrn_date(Date trn_date) {
		this.trn_date = trn_date;
	}
	public Date getCall_time() {
		return call_time;
	}
	public void setCall_time(Date call_time) {
		this.call_time = call_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getShortcut() {
		return shortcut;
	}
	public void setShortcut(String shortcut) {
		this.shortcut = shortcut;
	}
	public String getTeller_no() {
		return teller_no;
	}
	public void setTeller_no(String teller_no) {
		this.teller_no = teller_no;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getMax_value() {
		return max_value;
	}
	public void setMax_value(int max_value) {
		this.max_value = max_value;
	}
	


}
