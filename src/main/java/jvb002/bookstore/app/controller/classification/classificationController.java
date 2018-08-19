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

	private ClassificationService classificationService;

	@Autowired(required = true)
	@Qualifier(value="classificationService")
	public void setCategoryService(ClassificationService c){
		this.classificationService = c;
	}
	
	@RequestMapping(value = "/categories", method = RequestMethod.GET)
	public String listCategory(Model model) {
		model.addAttribute("category", new Category());
		model.addAttribute("listCategories", this.classificationService.getAll());
		return "/categorymanagement/category";
	}
	
	@RequestMapping(value = "/categorymanagement/category_create", method = RequestMethod.GET)
	public String save(Model model) {
		model.addAttribute("category", new Category());
		
		return "/bookstore/categorymanagement/category_create";
	}
	
	// For add and update person both
	@RequestMapping(value = "/categorymanagement/category_create", method = RequestMethod.POST)
	public String save(@ModelAttribute("category") Category c) {

		if (c.getCategoryID() == 0) {
			// new category, add it
			this.classificationService.save(c);
		} else {
			// existing category, call update
			this.classificationService.update(c);
		}
		return "redirect:/categories";
	}
	@RequestMapping("/category/detail/{id}")
	public String detail(@PathVariable("id") int id ) {
		this.classificationService.delete(id);
		
		return "redirect:/categories";
	}
	
	@RequestMapping("/category/delete/{id}")
	public String delete(@PathVariable("id") int id ) {
		this.classificationService.delete(id);
		
		return "redirect:/categories";
	}
	
	@RequestMapping("/category/edit/{id:\\d+}")
	public String edit(@PathVariable int id,Model model) {
		model.addAttribute("category", this.classificationService.getOne(id));
        model.addAttribute("listCategories", this.classificationService.getAll());
        return "categorymanagement/category";
	}
	
}
