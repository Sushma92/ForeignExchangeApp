package com.forex.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.forex.common.entity.TradingInfo;
import com.forex.service.BaseService;
import com.forex.service.TradingInfoService;

@RestController
public class TradingInfoController extends BaseController<TradingInfo, TradingInfo>{

	@Autowired
	TradingInfoService tradingInfoService;

	@Override
	protected BaseService<TradingInfo, TradingInfo> getBaseService() {
		return tradingInfoService;
	}
	
	
}
