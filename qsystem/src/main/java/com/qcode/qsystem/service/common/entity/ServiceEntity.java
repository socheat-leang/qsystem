package com.qcode.qsystem.service.common.entity;

import java.io.Serializable;

public class ServiceEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7037221548077779731L;
	/*id of service*/
	private int id;
	/*brand code*/ 
	private String br_code;
	/*service code*/
	private String set_code;
	/*service name*/
	private String set_name;
	/*hash code*/
	private String hash;
	/*assign by*/
	private String assign_by;
	/*image*/
	private byte[] img;
	/*shortcut*/
	private String shortcut;
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
	public String getSet_code() {
		return set_code;
	}
	public void setSet_code(String set_code) {
		this.set_code = set_code;
	}
	public String getSet_name() {
		return set_name;
	}
	public void setSet_name(String set_name) {
		this.set_name = set_name;
	}
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public String getAssign_by() {
		return assign_by;
	}
	public void setAssign_by(String assign_by) {
		this.assign_by = assign_by;
	}
	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
		this.img = img;
	}
	public String getShortcut() {
		return shortcut;
	}
	public void setShortcut(String shortcut) {
		this.shortcut = shortcut;
	}
	
}
