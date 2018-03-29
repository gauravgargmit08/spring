package com.term.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.term.dao.QuotesDAOI;
import com.term.dto.FormDTO;
import com.term.model.Quote;

@Service
public class QuotesService {
	
	@Autowired
	private QuotesDAOI quotesDAO;
	
	
	public List<Quote> getQuotes(FormDTO quote){
		List<Quote> quotes = quotesDAO.getAllQuotes(quote);
		return quotes;
	}

}
