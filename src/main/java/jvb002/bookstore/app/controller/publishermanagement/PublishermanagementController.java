package jvb002.bookstore.app.controller.publishermanagement;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PublishermanagementController {
	
	private static final Logger logger =  LoggerFactory.getLogger(PublishermanagementController.class);
		
	@RequestMapping(value="/Create", method= RequestMethod.POST)
	public String create(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		return "Create";	
	}
	
	@RequestMapping(value="/Update", method= RequestMethod.POST)
	public String update(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		return "Update";
	}
}