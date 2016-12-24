package com.lara.suezistar.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lara.suezistar.model.entity.Trade;

@Repository
public class TradeDao {

  @PersistenceContext
  public EntityManager em;
  
  public void save(Trade trade) {
    em.persist(trade);
  }
}
