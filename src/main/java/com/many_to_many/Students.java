package com.many_to_many;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="student_table")
public class Students {

	@Id
	@Column
	private int s_id;
	@Column
	private String s_name;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Student_Trainer",joinColumns=@JoinColumn(name="s_id"),
			inverseJoinColumns=@JoinColumn(name="t_id"))
	private Set<Trainer> set;

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public Set<Trainer> getSet() {
		return set;
	}

	public void setSet(Set<Trainer> set) {
		this.set = set;
	}
	
	
}
