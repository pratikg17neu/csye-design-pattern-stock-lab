package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;


public class StockMarket {

	private static StockMarket instance;
	private List<Stock> stocks = new ArrayList<>();
	private List<Stock> tradedStocks = new ArrayList<>();

//	Lazy Singleton Pattern
	public static StockMarket getInstance() {
		if (instance == null) {
			instance = new StockMarket();
			return instance;
		}

		return instance;
	}

	public List<Stock> getStocks() {

		return stocks;
	}

	public void addStock(Stock s) {
		getStocks().add(s);
	}

	public void removeStock(Stock s) {
		getStocks().remove(s);
	}

	public List<Stock> getTradedStocks() {
		return tradedStocks;
	}

	public void addTrade(Stock s) {
		getTradedStocks().add(s);
	}

	public void removeTrade(Stock s) {
		getTradedStocks().remove(s);
	}

	public void displayStocks() {
		System.out.println("Stock Market...");
		for (Stock s : getStocks()) {
			System.out.println(s.toString());
		}
	}

	public void displayTrades() {
		System.out.println("Stock Market Trades...");
		for (Stock s : getTradedStocks()) {
			System.out.println(s.toString());
		}
	}

	public void addTradeTxn(Stock s) {
		if (s.getMetric() > 0) {
			if (s.getBid() >= s.getPrice()) {

				Stock buyStock = new Stock(s.getID(), s.getPrice(), s.getBid(), s.getName(), s.getDescription(),
						"Buying");
				addTrade(buyStock);
			}
		} else {
			Stock sellStock = new Stock(s.getID(), s.getPrice(), s.getBid(), s.getName(), s.getDescription(),
					"Selling");
			addTrade(sellStock);
		}

		s.setPrice(s.getPrice() + s.getMetric());
	}

}
