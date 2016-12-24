package com.lara.suezistar.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lara.suezistar.model.dao.TradeDao;
import com.lara.suezistar.model.entity.Trade;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class TradeService {

  @Autowired
  TradeDao tradeDao;
  
  public void createTrade(Trade trade) {
    tradeDao.save(trade);
    System.out.println("Trade save");
  }
}
