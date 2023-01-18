package edu.neu.csye7374;

public class Stock implements Tradable{

	private String ID;
	private double price;
	private double bid;
	private String name;
	private String description;
	private String tradeType;
	
	
	
	public Stock(String iD, double price, double bid, String name, String description, String tradeType) {
		super();
		ID = iD;
		this.price = price;
		this.bid = bid;
		this.name = name;
		this.description = description;
		this.tradeType = tradeType;
	}
	
	
	@Override
	public String toString() {
		return "Stock [ID=" + ID + ", price=" + price + ", bid=" + bid + ", name=" + name + ", description="
				+ description + ", tradeType=" + tradeType + "]";
	}


	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getBid() {
		return bid;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTradeType() {
		return tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}


	@Override
	public int getMetric() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void setBid(double bid) {
		this.bid = bid;
	}
	
	
	
}
