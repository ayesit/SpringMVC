package com.dib.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountriesHandler implements Handler {

	@Override
	public String handle(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Locale locales[]=null;
		List<String> countriesList=null;
		
		locales=Locale.getAvailableLocales();
		countriesList=new ArrayList();
		
		for(Locale l:locales) {
			countriesList.add(l.getDisplayCountry());
		}
		req.setAttribute("result", countriesList);
		
		return "disp_countries";
	}

}
