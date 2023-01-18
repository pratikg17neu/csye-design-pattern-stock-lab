package edu.neu.csye7374;

import java.util.Random;

public class Intel extends Stock {

	public Intel(String iD, double price, double bid, String name, String description, String tradeType) {
		super(iD, price, bid, name, description, tradeType);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getBid() {
		// TODO Auto-generated method stub
		return super.getBid();
	}

	@Override
	public int getMetric() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int randomNum = rand.nextInt((10 - 1) + 1) + 1;
		return randomNum > 3 ? -1 : 1;
	}

	@Override
	public void setBid(double bid) {
		// TODO Auto-generated method stub
		super.setBid(bid);
	}
	
}
