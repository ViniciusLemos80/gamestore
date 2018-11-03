package br.com.gamesbr.gamestore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView getIndex() {
		return new ModelAndView("index");
	}
	

}
