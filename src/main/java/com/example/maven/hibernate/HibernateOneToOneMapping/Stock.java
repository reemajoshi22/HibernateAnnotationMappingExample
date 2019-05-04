package com.example.maven.hibernate.HibernateOneToOneMapping;

public class Stock implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer stockId;
	public Stock(Integer stockId, String stockCode, String stockName,
			StockDetail stockDetail) {
		super();
		this.stockId = stockId;
		this.stockCode = stockCode;
		this.stockName = stockName;
		this.stockDetail = stockDetail;
	}
	
	public Stock() {
		// TODO Auto-generated constructor stub
	}

	

	private String stockCode;
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public StockDetail getStockDetail() {
		return stockDetail;
	}
	public void setStockDetail(StockDetail stockDetail) {
		this.stockDetail = stockDetail;
	}
	private String stockName;
	private StockDetail stockDetail;

}
