package jvb002.bookstore.app.controller.classification;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jvb002.bookstore.app.model.classification.Category;
import jvb002.bookstore.app.service.classification.ClassificationService;

@Controller
public class classificationController {

	private ClassificationService ClassificationService;

	@Autowired(required = true)

	// For add and update person both
	@RequestMapping(value = "/category/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("category") Category c) {

		if (c.getCategoryID() == 0) {
			// new category, add it
			this.ClassificationService.save(c);
		} else {
			// existing category, call update
			this.ClassificationService.update(c);
		}
		return "redirect:/categorys";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id ) {
		this.ClassificationService.delete(id);
		
		return "ridirect:/categorys";
	}
	
	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable("id") int id,Model model) {
		model.addAttribute("category", this.ClassificationService.getOne(id));
        model.addAttribute("listCategorys", this.ClassificationService.getAll());
        return "category";
	}

}
