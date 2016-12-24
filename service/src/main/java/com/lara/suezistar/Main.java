package com.lara.suezistar;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.suezistar.model.entity.Trade;
import com.lara.suezistar.model.service.TradeService;

public class Main {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
    
    Trade trade = new Trade();
    trade.setName("future");
    trade.setPrice(new BigDecimal(1000));
    
    TradeService tradeService = new TradeService();
    tradeService.createTrade(trade);
    System.out.println("done");
  }
}
