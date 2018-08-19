package jvb002.bookstore.app.controller.publishermanagement;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jvb002.bookstore.app.dto.PublisherVO;
import jvb002.bookstore.app.service.publishermanagement.PublisherService;

@Controller
public class PublishermanagementController {

	private PublisherService publisherService;

	@Autowired(required = true)
	@Qualifier(value = "publisherService")
	public void setPublisherService(PublisherService publisherService) {
		this.publisherService = publisherService;
	}

	private static final Logger logger = LoggerFactory.getLogger(PublishermanagementController.class);

	@RequestMapping(value = "/publisher/create", method = RequestMethod.GET)
	public String createView(Locale locale, Model model) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		model.addAttribute("publisher", new PublisherVO());
		return "/bookstore/publisher/Create";
	}

	@RequestMapping(value = "/publisher/create", method = RequestMethod.POST)
	public String create(@ModelAttribute("publisher") PublisherVO publisherVO) {
		publisherService.create(publisherVO);
		return "/bookstore/publisher/Update";
	}

	@RequestMapping(value = "/Update", method = RequestMethod.POST)
	public String update(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		return "Update";
	}
}