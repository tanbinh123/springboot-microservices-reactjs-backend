package com.thisisaloksingh.spapps.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="custid")	
	private Integer custid;
	
	@Column(name="custname")
	private String custname;
	
	@Column(name="custpin")
	private String custpin;
	
	@Column(name="custmobile")
	private String custmobile;
	
	@Column(name="custemail")
	private String custemail;

	public Integer getCustid() {
		return custid;
	}

	public void setCustid(Integer custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCustpin() {
		return custpin;
	}

	public void setCustpin(String custpin) {
		this.custpin = custpin;
	}

	public String getCustmobile() {
		return custmobile;
	}

	public void setCustmobile(String custmobile) {
		this.custmobile = custmobile;
	}

	public String getCustemail() {
		return custemail;
	}

	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}

	@Override
	public String toString() {
		return "Customers [custid=" + custid + ", custname=" + custname + ", custpin=" + custpin + ", custmobile="
				+ custmobile + ", custemail=" + custemail + "]";
	}
	
	

}
