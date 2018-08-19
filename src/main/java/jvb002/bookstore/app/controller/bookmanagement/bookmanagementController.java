package jvb002.bookstore.app.controller.bookmanagement;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jvb002.bookstore.app.model.bookmanagement.Book;
import jvb002.bookstore.app.service.bookmanagement.BookService;
import jvb002.bookstore.app.service.classification.ClassificationService;

@Controller
public class bookmanagementController {
	private static final Logger logger = LoggerFactory.getLogger(bookmanagementController.class);
	private BookService bookService;
	private ClassificationService classificationService;
	
	@RequestMapping(value = "/book/create", method = RequestMethod.GET)
	public String create(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		model.addAttribute("create", "Create Book");
		return "bookstore/bookmanagement/create";	
	}
	
	@RequestMapping(value = "/book/create", method = RequestMethod.POST)
	public String createPost(@ModelAttribute("book") Book book) {
		if(book.getId() == 0) {
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
	public String list() {
//		this.bookService.getBook();
		return "bookstore/bookmanagement/listbook";	
	}
}
