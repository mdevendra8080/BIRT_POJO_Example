package com.birt.pojo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class StockDataSet {
	public List<StockData> getStockValues(String ticker) {

		List<StockData> history = new ArrayList<StockData>();

		double begin = 2.5d;

		for (int i = 0; i < 31; i++) {
			Calendar day = Calendar.getInstance();
			day.set(Calendar.HOUR, 0);
			day.set(Calendar.MINUTE, 0);
			day.set(Calendar.SECOND, 0);
			day.set(Calendar.MILLISECOND, 0);
			day.set(Calendar.YEAR, 2019);
			day.set(Calendar.MONTH, 0);
			day.set(Calendar.DAY_OF_MONTH, i);

			StockData data = new StockData();
			data.setOpen(begin);
			double close = Math.round(begin + (Math.random() * begin * 0.1));
			data.setClose(close);
			data.setLow(Math.round(Math.min(begin, (begin - Math.random() * begin * 0.1))));
			data.setHigh(Math.round(Math.max(begin, close) + Math.random() * 2));

			data.setVolume(1000 + (int) (Math.random() * 500));

			begin = close;
			data.setDate(day.getTime());
			data.setTicker(ticker);
			history.add(data);

		}

		return history;
	}
}
