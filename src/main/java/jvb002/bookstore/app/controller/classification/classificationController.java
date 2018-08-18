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
import jvb002.bookstore.app.test.classification.Classification;

@Controller
public class classificationController {

	private ClassificationService classificationService;

//	@Autowired(required = true)
//	@Qualifier(value="classificationService")
	public void setCategoryService(ClassificationService c){
		this.classificationService = c;
	}
	
	@RequestMapping(value = "/categories", method = RequestMethod.GET)
	public String listCategory(Model model) {
		model.addAttribute("category", new Classification());
		model.addAttribute("listCategorys", this.classificationService.getAll());
		return "category";
	}
	
	
	// For add and update person both
	@RequestMapping(value = "/category/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("category") Category c) {

		if (c.getCategoryID() == 0) {
			// new category, add it
			this.classificationService.save(c);
		} else {
			// existing category, call update
			this.classificationService.update(c);
		}
		return "redirect:/categorys";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id ) {
		this.classificationService.delete(id);
		
		return "redirect:/categories";
	}
	
	@RequestMapping("/edit/{id:\\d+}")
	public String edit(@PathVariable int id,Boolean parentID,Model model) {
		model.addAttribute("category", this.classificationService.getOne(id,parentID));
        model.addAttribute("listCategorys", this.classificationService.getAll());
        return "category";
	}
	
}
