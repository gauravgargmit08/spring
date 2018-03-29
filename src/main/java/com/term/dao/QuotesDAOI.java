package com.term.dao;

import java.util.List;

import com.term.dto.FormDTO;
import com.term.model.Quote;

public interface QuotesDAOI {

	 List<Quote> getAllQuotes(FormDTO form);
	
}
