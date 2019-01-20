package com.birt.pojo;

import java.util.List;

public class CustomerData {

	private String fname;
	private String lname;

	private List<StockData> stockData;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public List<StockData> getStockData() {
		return stockData;
	}

	public void setStockData(List<StockData> stockData) {
		this.stockData = stockData;
	}
	
	
}
