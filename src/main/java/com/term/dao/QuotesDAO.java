package com.term.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.term.dto.FormDTO;
import com.term.model.Quote;

@Transactional
@Repository
public class QuotesDAO implements QuotesDAOI {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Quote> getAllQuotes(FormDTO form) {

		Query q = entityManager
				.createQuery("SELECT a FROM Quote a WHERE a.location = :location "
						+ "and a.tobacco=:tobacco  and a.amount=:amount and "
						+ "a.insurance_type=:insurance_type and  a.tenure=:tenure");
		q.setParameter("location", form.getLocation());
		q.setParameter("tobacco", form.getTobacco());
		q.setParameter("amount", form.getAmount());
		q.setParameter("insurance_type", form.getInsurance_type());
		q.setParameter("tenure", form.getTenure());
		
		
		
		List<Quote> quotes = q.getResultList();
		
		return quotes;
	}

}
