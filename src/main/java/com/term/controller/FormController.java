package com.term.controller;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.term.dto.FormDTO;
import com.term.model.DisplayQuote;
import com.term.model.Quote;
import com.term.service.QuotesService;
import com.term.utility.PremiumCalculator;

@Controller
public class FormController {
	
	@Autowired
	QuotesService quotesService;

   @RequestMapping("/")
   public String index() {
      return "index";
   }

   @PostMapping("/quotes")
   public String sayHello(@ModelAttribute FormDTO form, Model model) {
	   
	  List<DisplayQuote> disp= new ArrayList<DisplayQuote>();
	  List<Quote> list=  quotesService.getQuotes(form);
	  
	  for(Quote q:list)
	  {
		  DisplayQuote displayQuote= new DisplayQuote();
		  double premium=  PremiumCalculator.calculatePremium(q,form);
		  DecimalFormat df = new DecimalFormat("#.##");      
		  double value = Double.valueOf(df.format(premium));
		  
		  displayQuote.setAmount(q.getAmount());
		  displayQuote.setCompanyName(q.getCompanyName());
		  displayQuote.setPremium(value);
		  displayQuote.setTenure(q.getTenure());
		  disp.add(displayQuote);

	  }
	  
      model.addAttribute("quote", disp);
      return "quotes";
   }
}
