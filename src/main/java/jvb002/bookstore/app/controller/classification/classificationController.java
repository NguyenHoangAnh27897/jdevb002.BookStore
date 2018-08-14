package jvb002.bookstore.app.controller.classification;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jvb002.bookstore.app.model.classification.Category;
import jvb002.bookstore.app.service.classification.ClassificationService;

@Controller
public class classificationController {

	private ClassificationService ClassificationService;

	@Autowired(required = true)

	// For add and update person both
	@RequestMapping(value = "/category/add", method = RequestMethod.POST)
	public String addCategory(@ManagedAttribute("category") Category c) {

		if (c.getCategoryID() == 0) {
			// new category, add it
			this.ClassificationService.addCategory(c);
		} else {
			// existing category, call update
			this.ClassificationService.updateCategory(c);
		}

		return "bookstore/category/create";

	}

}
