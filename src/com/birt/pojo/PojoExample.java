package com.birt.pojo;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PojoExample {
	public static void main(String args[]) {
	}

	Iterator<CustomerData> i;
	Iterator<StockData> i2;

	public void open(Object appContext, Map<String, Object> dataSetParamValues) {
		List<CustomerData> stockData = new CustomerDataSet().getCustomerValues();
		i = stockData.iterator();

	}
	
	public Object next(){
		if(i.hasNext()){
			return i.next();
		}
		return null;		
	}
	
	public void close(){
		i = null;
	}

	
	/*public void open2(Object appContext, Map<String, Object> dataSetParamValues) {
		List<StockData> stockData = (List<StockData>)next();
		i2 = stockData.iterator();

	}
	
	public Object next2(){
		if(i2.hasNext()){
			return i2.next();
		}
		return null;		
	}
	
	public void close2(){
		i2 = null;
	}
	*/

}
