package jvb002.bookstore.app.controller.classification;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jvb002.bookstore.app.dto.CategoryVO;
import jvb002.bookstore.app.service.classification.ClassificationService;


@Controller
public class classificationController {

	private ClassificationService classificationService;
	private static String listPath = "bookstore/categorymanagement/list";
	private static String createPath = "bookstore/categorymanagement/create";
	private static String redirectList = "redirect:/categorymanagement/list";
	@Autowired(required = true)
	@Qualifier(value="classificationService")
	public void setCategoryService(ClassificationService c){
		this.classificationService = c;
	}
	
	@RequestMapping(value = "/categorymanagement/list", method = RequestMethod.GET)
	public String listCategory(Model model) {
		model.addAttribute("categoryVO", new CategoryVO());
		model.addAttribute("listCategories", this.classificationService.getAll());
		return listPath;
	}
	
	@RequestMapping(value = "/categorymanagement/create", method = RequestMethod.GET)
	public String save(Model model) {
		model.addAttribute("categoryVO", new CategoryVO());
		
		return createPath;
	}
	
	// For add and update
	@RequestMapping(value = "/categorymanagement/create", method = RequestMethod.POST)
	public String saveCategory(@ModelAttribute("categoryVO") CategoryVO categoryVO) {
		System.out.println(categoryVO.toString());
		if (categoryVO.getCategoryID() == 0) {
			// new category, add it
			this.classificationService.save(categoryVO);
		} else {
			// existing category, call update
			this.classificationService.update(categoryVO);
		}
		return redirectList;
	}
	
	@RequestMapping("/category/detail/{id}")
	public String detail(@PathVariable("id") int id ) {
		this.classificationService.delete(id);
		
		return redirectList;
	}
	
	@RequestMapping("/category/delete/{id}")
	public String delete(@PathVariable("id") int id ) {
		this.classificationService.delete(id);
		
		return redirectList;
	}
	
	@RequestMapping("/category/edit/{id:\\d+}")
	public String edit(@PathVariable int id,Model model) {
		model.addAttribute("category", this.classificationService.getOne(id));
        model.addAttribute("listCategories", this.classificationService.getAll());
        return listPath;
	}
	
}
