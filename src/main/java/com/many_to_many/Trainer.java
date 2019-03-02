package com.many_to_many;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Trainer_table")
public class Trainer {

	@Id
	@Column
	private int t_id;
	@Column
	private String t_name;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<Students> stu;

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public Set<Students> getStu() {
		return stu;
	}

	public void setStu(Set<Students> stu) {
		this.stu = stu;
	}
	
	
	
}
