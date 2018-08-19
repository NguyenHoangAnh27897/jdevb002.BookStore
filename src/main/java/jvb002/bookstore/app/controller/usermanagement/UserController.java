package jvb002.bookstore.app.controller.usermanagement;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
@Component
@ComponentScan("jvb002.bookstore.app.controller.usermanagement")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/user/register", method = RequestMethod.GET)
	public String home(Model model) {
		
		return "bookstore/user/create";
	}
	
	@RequestMapping(value = "/user/user-save", method = RequestMethod.POST)
	public String save(HttpServletRequest request, HttpServletResponse response) {
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String fullName = request.getParameter("fullName");
		
		return "redirect:/";
	}
}
