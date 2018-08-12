package jvb002.bookstore.app.controller.bookmanagement;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class bookmanagementController {
	private static final Logger logger = LoggerFactory.getLogger(bookmanagementController.class);

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		model.addAttribute("create", "Create Book");
		return "bookstore/bookmanagement/create";	
	}
	
}
