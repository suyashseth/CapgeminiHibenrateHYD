package com.capgemini.dev.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//To make Persistence
@Table(name="Student_Table")//To declare class as table
public class StudentTable {

    @Id//To make identifier
    @Column(name="s_user_id")//To declare column
	private int suserid;
    @Column(name="s_name")
	private String sname;
    @Column(name="s_password")
	private String spass;
    @Column(name="s_backlog")
	private int sbacklogs;
    
	public int getSuserid() {
		return suserid;
	}
	public void setSuserid(int suserid) {
		this.suserid = suserid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSpass() {
		return spass;
	}
	public void setSpass(String spass) {
		this.spass = spass;
	}
	public int getSbacklogs() {
		return sbacklogs;
	}
	public void setSbacklogs(int sbacklogs) {
		this.sbacklogs = sbacklogs;
	}
	@Override
	public String toString() {
		return "StudentTable [suserid=" + suserid + ", sname=" + sname + ", spass=" + spass + ", sbacklogs=" + sbacklogs
				+ "]";
	}

}
