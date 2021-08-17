package com.thisisaloksingh.spapps.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
//  annotation for other table ??
// 	@SecondaryTable
//  mapping annotation
//	@JoinColumn
	
	@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)//?? //
    @Column(name = "id")
	private int id;
	
	@Column(name="pname")
	private String pname;
	
	@Column(name="batchno")
	private int batchno;
	
	@Column(name="price")
	private double price;
	
	@Column(name="noofproduct")
	private int noofproduct;

/*	public Product(int id, String pname, int batchno, double price, int noofproduct) {
		super();
		this.id = id;
		this.pname = pname;
		this.batchno = batchno;
		this.price = price;
		this.noofproduct = noofproduct;
	}*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getBatchno() {
		return batchno;
	}

	public void setBatchno(int batchno) {
		this.batchno = batchno;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoofproduct() {
		return noofproduct;
	}

	public void setNoofproduct(int noofproduct) {
		this.noofproduct = noofproduct;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", batchno=" + batchno + ", price=" + price + ", noofproduct="
				+ noofproduct + "]";
	}
	
	
}
