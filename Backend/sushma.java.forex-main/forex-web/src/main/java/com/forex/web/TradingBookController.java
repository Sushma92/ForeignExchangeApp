package com.forex.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.forex.common.entity.TradingBook;
import com.forex.service.BaseService;
import com.forex.service.TradingBookService;

@RestController
public class TradingBookController extends BaseController<TradingBook, TradingBook>{

	@Autowired
	TradingBookService tradingBookService;
	
	@Override
	protected BaseService<TradingBook, TradingBook> getBaseService() {
		return tradingBookService;
	}

	
}
