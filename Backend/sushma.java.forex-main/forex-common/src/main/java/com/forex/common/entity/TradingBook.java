package com.forex.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "TradingBook")
@Table(name = "trading_book")
public class TradingBook extends BaseEntity{

	@Column(name = "trading_book_name", length = 50)
	private String tradingBookName;

	@Column(name = "trading_book_description", length = 1000)
	private String tradingBookDescription;

	public String getTradingBookName() {
		return tradingBookName;
	}

	public void setTradingBookName(String tradingBookName) {
		this.tradingBookName = tradingBookName;
	}

	public String getTradingBookDescription() {
		return tradingBookDescription;
	}

	public void setTradingBookDescription(String tradingBookDescription) {
		this.tradingBookDescription = tradingBookDescription;
	}

}
