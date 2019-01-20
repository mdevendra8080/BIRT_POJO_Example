package com.birt.pojo;

import java.util.ArrayList;
import java.util.List;

public class CustomerDataSet {
	public List<CustomerData> getCustomerValues() {
		CustomerData c = new CustomerData();
		c.setFname("Devendra");
		c.setLname("MHATRE");
				
		c.setStockData(new StockDataSet().getStockValues("BIRT"));
		List<CustomerData> customerData = new ArrayList<CustomerData>();
		customerData.add(c);
		return customerData;
	}
}
