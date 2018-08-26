package jvb002.bookstore.app.controller.publishermanagement;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jvb002.bookstore.app.model.publishermanagement.Publisher;
import jvb002.bookstore.app.service.publishermanagement.PublisherService;

import jvb002.bookstore.app.dto.PublisherVO;
import jvb002.bookstore.app.service.publishermanagement.PublisherService;

/**
 * PublisherController Nha -Quan
 *
 */
@Controller
public class PublishermanagementController {
	private PublisherService publisherService;
	private static final Logger logger = LoggerFactory.getLogger(PublishermanagementController.class);

	@Autowired(required = true)
	@Qualifier(value = "publisherService")
	public void setPublisherService(PublisherService publisherService) {
		this.publisherService = publisherService;
	}

	@RequestMapping(value = "/publisher/create", method = RequestMethod.GET)
	public String createView(Locale locale, Model model) {
		// logger.info("Welcome home! The client locale is {}.", locale);
		model.addAttribute("publisher", new PublisherVO());
		return "/bookstore/publisher/create";
	}

	@RequestMapping(value = "/publisher/createPublisher", method = RequestMethod.POST)
	public String create(@ModelAttribute("publisher") PublisherVO publisherVO) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		java.util.Date date = new java.util.Date();
		formatter.format(date);
		publisherVO.setCreatedDate(new Date(date.getTime()));
		publisherService.create(publisherVO);
		return "redirect:/";
	}

	@RequestMapping(value = "/publisher/update/{publishID}", method = RequestMethod.GET)
	public String updateView(@PathVariable("publishID") int id, Model model) {
		PublisherVO publisherVO = publisherService.getPublisher(id);
		model.addAttribute("publisher", publisherVO);
		return "/bookstore/publisher/update";
	}

	@RequestMapping(value = "/publisher/update/updatePublisher", method = RequestMethod.POST)
	public String update(@ModelAttribute("publisher") PublisherVO publisherVO) {
		publisherService.update(publisherVO);
		return "redirect:/";
	}

	/**
	 * GET LIST
	 */
	@RequestMapping(value = "/publisher/list", method = RequestMethod.GET)
	public String list(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		model.addAttribute("publisher", new Publisher());
		model.addAttribute("listPublishers", this.publisherService.getDetail());

		return "/bookstore/publisher/publisher_list";
	}

	/**
	 * GET DETAIL
	 */
	@RequestMapping(value = "/publisher/detail/{id}", method = RequestMethod.GET)
	public String detail(@PathVariable("publishID") long publishID, Model model) {
		// logger.info("Welcome home! The client locale is {}.", locale);
		model.addAttribute("publisher", this.publisherService.getPublisherByID(publishID));
		// model.addAttribute("listPublishers",
		// this.publisherService.getDetail());

		return "/bookstore/publisher/publisher_detail";
	}

	/**
	 * DELETE FUNCTION
	 */
	@RequestMapping(value = "/publisher/delete/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable("publishID") long publishID, Model model) {
		// logger.info("Welcome home! The client locale is {}.", locale);
		this.publisherService.delete(publishID);
		;
		// model.addAttribute("listPublishers",
		// this.publisherService.getDetail());

		return "/bookstore/publisher/publisher_delete";
	}
}