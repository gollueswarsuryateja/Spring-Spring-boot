package com.ltts.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int stdid;
	private String stdname;
	private String stdaddress;
	
	
	
	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", stdname=" + stdname + ", stdaddress=" + stdaddress + "]";
	}



	public int getStdid() {
		return stdid;
	}



	public void setStdid(int stdid) {
		this.stdid = stdid;
	}



	public String getStdname() {
		return stdname;
	}



	public void setStdname(String stdname) {
		this.stdname = stdname;
	}



	public String getStdaddress() {
		return stdaddress;
	}



	public void setStdaddress(String stdaddress) {
		this.stdaddress = stdaddress;
	}



	void displayinfo() {
		System.out.println("dfnwdb");
	}

}