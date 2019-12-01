package com.forex.common.entity;

import java.util.Date;

public class TradeInfo {

	private String fromCurrency;

	private String toCurrency;

	private float fromCurrencyValue;

	private float toCurrencyValue;

	private Date tradingDate;

	private Date tradingCompletionDate;

	private float totalAmount;

	private float totalDiscount;

	private float profit;

	private float overallSum;

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

	public float getFromCurrencyValue() {
		return fromCurrencyValue;
	}

	public void setFromCurrencyValue(float fromCurrencyValue) {
		this.fromCurrencyValue = fromCurrencyValue;
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
