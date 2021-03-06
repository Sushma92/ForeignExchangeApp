package com.forex.common.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "TradingInfo")
@Table(name = "trading_info")
public class TradingInfo extends BaseEntity{

	@Column(name = "from_currency")
	private String fromCurrency;

	@Column(name = "to_currency")
	private String toCurrency;

	@Column(name = "from_currency_value")
	private float fromCurrencyvalue;

	@Column(name = "to_currency_value")
	private float toCurrencyValue;

	@Column(name = "trading_date")
	private Date tradingDate;

	@Column(name = "trading_completion_date")
	private Date tradingCompletionDate;

	@Column(name = "total_amount")
	private float totalAmount;

	@Column(name = "total_discount")
	private float totalDiscount;

	@Column(name = "profit")
	private float profit;

	@Column(name = "overall_sum")
	private float overallSum;

	@Column(name = "")
	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public float getFromCurrencyvalue() {
		return fromCurrencyvalue;
	}

	public void setFromCurrencyvalue(float fromCurrencyvalue) {
		this.fromCurrencyvalue = fromCurrencyvalue;
	}

	public float getToCurrencyValue() {
		return toCurrencyValue;
	}

	public void setToCurrencyValue(float toCurrencyValue) {
		this.toCurrencyValue = toCurrencyValue;
	}

	public Date getTradingDate() {
		return tradingDate;
	}

	public void setTradingDate(Date tradingDate) {
		this.tradingDate = tradingDate;
	}

	public Date getTradingCompletionDate() {
		return tradingCompletionDate;
	}

	public void setTradingCompletionDate(Date tradingCompletionDate) {
		this.tradingCompletionDate = tradingCompletionDate;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public float getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(float totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	public float getProfit() {
		return profit;
	}

	public void setProfit(float profit) {
		this.profit = profit;
	}

	public float getOverallSum() {
		return overallSum;
	}

	public void setOverallSum(float overallSum) {
		this.overallSum = overallSum;
	}

}
