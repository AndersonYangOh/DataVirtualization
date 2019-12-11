package com.chinaunicom.testweb.pojo;

public class AICheckReport {
	
	private int id;
	private String checkTime;
	private String checkResult;
	private String checkResultName;
	private String factoryID;
	private String picDir;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}
	public String getCheckResult() {
		return checkResult;
	}
	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}
	public String getCheckResultName() {
		return checkResultName;
	}
	public void setCheckResultName(String checkResultName) {
		this.checkResultName = checkResultName;
	}
	public String getFactoryID() {
		return factoryID;
	}
	public void setFactoryID(String factoryID) {
		this.factoryID = factoryID;
	}
	public String getPicDir() {
		return picDir;
	}
	public void setPicDir(String picDir) {
		this.picDir = picDir;
	}
	
}
