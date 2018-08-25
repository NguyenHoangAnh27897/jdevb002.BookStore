package jvb002.bookstore.app.controller.bookmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.inject.Qualifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jvb002.bookstore.app.dto.BookVO;
import jvb002.bookstore.app.dto.CategoryVO;
import jvb002.bookstore.app.dto.PublisherVO;
import jvb002.bookstore.app.model.bookmanagement.Book;
import jvb002.bookstore.app.model.classification.Category;
import jvb002.bookstore.app.service.bookmanagement.BookService;
import jvb002.bookstore.app.service.classification.ClassificationService;
import jvb002.bookstore.app.service.publishermanagement.PublisherService;

@Controller
public class BookController {
	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	private BookService bookService;
	private ClassificationService classificationService;
	private PublisherService publisherService;

	@Autowired(required = true)
	public void setPersonService(BookService bookService) {
		this.bookService = bookService;
	}
	
    @Autowired(required = true)
    public void setPublisherService(PublisherService publisherService) {
		this.publisherService = publisherService;
	}

	@RequestMapping(value = "/book/create", method = RequestMethod.GET)
	public String create(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		model.addAttribute("create", "Create Book");
		model.addAttribute("categoryList", this.bookService.getCategory());
		model.addAttribute("publisher", this.bookService.getPublisher());
		model.addAttribute("category", new Category());
		BookVO bookVO = new BookVO();
		List<PublisherVO> publisherVOs = new ArrayList<PublisherVO>();
		PublisherVO publisherVO = new PublisherVO();

		
		
		publisherVO.setPublishID(1);
		publisherVO.setName("numberone");
		publisherVO.setPublishID(2);
		publisherVO.setName("numbertwo");
		
		publisherVOs.add(publisherVO);
		
		bookVO.setPublish(publisherVOs);
		
		List<CategoryVO> categoryVOs = new ArrayList<CategoryVO>();
		
//		CategoryVO categoryVO = new CategoryVO();
//		categoryVO.setCategoryID(1);
//		categoryVO.setDescription("Name");
//		categoryVO.setCategoryID(2);
//		categoryVO.setDescription("asd");
//		categoryVOs.add(categoryVO);
		
		bookVO.setListCategory(this.classificationService.getAll());
		
		model.addAttribute("book", bookVO);
//		model.addAttribute("publish", publisherVOs);
//		model.addAttribute("category", new Category());
//		model.addAttribute("publisher", new Publisher());
		
		return "bookstore/bookmanagement/create";
	}

	@RequestMapping(value = "/book/create", method = RequestMethod.POST)
	public String createPost(@ModelAttribute("book") Book book) {
		if (book.getId() == 0) {
			this.bookService.create(book);
		} else {
			this.bookService.update(book);
		}
		return "redirect:/";
	}

	@RequestMapping(value = "/book/edit/{id:\\d+}", method = RequestMethod.GET)
	public String edit(@PathVariable("id") int id, Model model) {
		model.addAttribute("edit", "Edit Book");
		model.addAttribute("book", this.bookService.getDetail(id));
		model.addAttribute("listCategorys", this.classificationService.getAll());

		return "bookstore/bookmanagement/edit";
	}

	@RequestMapping(value = "/book/delete/{id:\\d+}", method = RequestMethod.DELETE)
	public String delete(@PathVariable("id") int id, @ModelAttribute("book") Book book) {
		this.bookService.delete(book);
		return "redirect:/";
	}

	@RequestMapping(value = "/book/listbook", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("book", new BookVO());
		model.addAttribute("listbooks", this.bookService.getBook());
		return "bookstore/bookmanagement/listbook";
	}

	@RequestMapping(value = "/book/detailbook/{id:\\d+}", method = RequestMethod.GET)
	public String detailbook(@PathVariable("id") int id, Model model) {
		model.addAttribute("detail",  new BookVO());
		model.addAttribute("listbooks", this.bookService.getBook());
		model.addAttribute("book", this.bookService.getDetail(id));

		return "bookstore/bookmanagement/detailbook";
	}
}
