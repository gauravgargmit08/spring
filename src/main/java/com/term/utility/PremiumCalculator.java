package com.term.utility;

import com.term.dto.FormDTO;
import com.term.model.Quote;


public class PremiumCalculator {
	
public static double calculatePremium(Quote quote,FormDTO form) {
	
	
	
	
	 double premium = quote.getBasepremium();

	    if (form.getAge() >= 18) {
	        premium *= 1.1;
	    }
	    if (form.getAge() >= 25) {
	        premium *= 1.1;
	    }
	    if (form.getAge() >= 30) {
	        premium *= 1.1;
	    }
	    if (form.getAge() >= 35) {
	        premium *= 1.1;
	    }
	    if (form.getAge() >= 40) {
	    	premium *= 1.2;
	    }
	
		
	    
		return premium;
	}

	
	
}
