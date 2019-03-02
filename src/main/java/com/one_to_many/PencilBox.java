package com.one_to_many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Pencil_box")
public class PencilBox {

	@Id
	@Column(name="box_id")
	private int box_id;
	@Column(name="box_cap")
	private int box_cap;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="box_id")
	private List<Pencil>p;
	public int getBox_id() {
		return box_id;
	}
	public void setBox_id(int box_id) {
		this.box_id = box_id;
	}
	public int getBox_cap() {
		return box_cap;
	}
	public void setBox_cap(int box_cap) {
		this.box_cap = box_cap;
	}
	public List<Pencil> getP() {
		return p;
	}
	public void setP(List<Pencil> p) {
		this.p = p;
	}
	
	
	
}
