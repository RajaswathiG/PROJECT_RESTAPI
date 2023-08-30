package com.example.demo.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="FRUITS")
public class FruitModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int fid;

	private String fname;
	private long fprice;
	public int getFId() {
		return fid;
	}
	public void setId(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public long getFprice() {
		return fprice;
	}
	public void setFprice(long fprice) {
		this.fprice = fprice;
	}
	public FruitModel(int fid, String fname, long fprice)
	{
		super();
		this.fid = fid;
		this.fname = fname;
		this.fprice = fprice;
	}
	public FruitModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}