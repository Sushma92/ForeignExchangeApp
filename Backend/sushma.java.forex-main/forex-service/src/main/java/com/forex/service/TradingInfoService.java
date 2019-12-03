package com.forex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forex.common.entity.TradingInfo;
import com.forex.dao.TradingInfoDAO;

@Service
public class TradingInfoService extends BaseService<TradingInfo, TradingInfo> {

	@Autowired
	TradingInfoDAO tradingInfoDao;

	@Override
	public TradingInfo create(TradingInfo tradingInfo) {
		tradingInfo = tradingInfoDao.save(tradingInfo);
		return tradingInfo;
	}

	@Override
	public TradingInfo update(TradingInfo tradingInfo) {
		tradingInfo = tradingInfoDao.save(tradingInfo);
		return tradingInfo;
	}

	@Override
	public TradingInfo read(Long id) {
		TradingInfo tradingInfo = tradingInfoDao.findById(id).orElse(null);
		return tradingInfo;
	}

	@Override
	public void delete(Long id) {
		tradingInfoDao.deleteById(id);
	}

	@Override
	public void generateMultiple(Integer noOfEntities) {

	}
}
