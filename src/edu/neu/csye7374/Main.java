package edu.neu.csye7374;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println("============Main Execution Start===================\n\n");

		// Add your code in between these two print statements
		StockMarket market = StockMarket.getInstance();
		

		
		Stock stock1 = new Intel("1", 50.0, 0, "Intel", "Intel Stock", null);
		Stock stock2 = new Asus("1", 250.0, 0, "Asus", "Asus Stock", null);
		
		market.addStock(stock1);
		market.addStock(stock2);
		
		market.displayStocks();
		
		
		System.out.println("--------------------------------------------------------------------");	
		// Simulation of stock1
		for (int i=0; i<10; i++)
		{
			double bid_now = stock1.getPrice() + stock1.getMetric();
			System.out.println("Bidding on Intel: "+bid_now);
			System.out.println("After bid on Intel of stock market");
			stock1.setBid(bid_now);
			market.displayStocks();
			System.out.println("After trade on Intel of stock market");
			market.addTradeTxn(stock1);
			market.displayTrades();	
		}
		
		System.out.println("--------------------------------------------------------------------");

		System.out.println("--------------------------------------------------------------------");	
		// Simulation of stock2
		for (int i=0; i<10; i++)
		{
			double bid_now = stock2.getPrice() + stock2.getMetric();
			System.out.println("Bidding on Asus: "+bid_now);
			System.out.println("After bid on Asus of stock market");
			stock2.setBid(bid_now);
			market.displayStocks();
			System.out.println("After trade on Asus of stock market");
			market.addTradeTxn(stock2);
			market.displayTrades();	
		}
		
		System.out.println("--------------------------------------------------------------------");

		
		
		System.out.println("\n\n============Main Execution End===================");
	}
}
