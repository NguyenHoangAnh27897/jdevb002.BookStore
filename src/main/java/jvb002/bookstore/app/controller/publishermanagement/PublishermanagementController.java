package jvb002.bookstore.app.controller.publishermanagement;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jvb002.bookstore.app.model.publishermanagement.Publisher;
import jvb002.bookstore.app.service.publishermanagement.PublisherService;

@Controller
public class PublishermanagementController {
	
	private static final Logger logger =  LoggerFactory.getLogger(PublishermanagementController.class);
	private PublisherService publisherService;
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
	/**
	GET LIST
 */
@RequestMapping(value = "/publisher/list", method = RequestMethod.GET)
public String list(Locale locale, Model model) {
	logger.info("Welcome home! The client locale is {}.", locale);
	model.addAttribute("publisher", new Publisher());
	model.addAttribute("listPublishers", this.publisherService.getDetail());

	return "/bookstore/publisher/publisher_list";
}

/**
	GET DETAIL
 */
@RequestMapping(value = "/publisher/detail/{id}", method = RequestMethod.GET)
public String detail(@PathVariable("publishID") long publishID, Model model) {
	//logger.info("Welcome home! The client locale is {}.", locale);
	model.addAttribute("publisher", this.publisherService.getPublisherByID(publishID));
	//model.addAttribute("listPublishers", this.publisherService.getDetail());

	return "/bookstore/publisher/publisher_detail";
}
/**
	DELETE FUNCTION
 */
@RequestMapping(value = "/publisher/delete/{id}", method = RequestMethod.DELETE)
public String delete(@PathVariable("publishID") long publishID, Model model) {
	//logger.info("Welcome home! The client locale is {}.", locale);
	this.publisherService.delete(publishID);;
	//model.addAttribute("listPublishers", this.publisherService.getDetail());

	return "/bookstore/publisher/publisher_delete";
}
}