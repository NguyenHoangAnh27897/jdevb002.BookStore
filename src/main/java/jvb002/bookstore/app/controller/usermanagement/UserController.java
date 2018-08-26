package jvb002.bookstore.app.controller.usermanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jvb002.bookstore.app.dto.UserVO;
import jvb002.bookstore.app.model.usermanagement.User;
import jvb002.bookstore.app.service.usermanagement.UserService;
import jvb002.bookstore.app.util.ConvertUtils;

/**
 * Handles requests for the application home page.
 */
@Controller
@Component
@ComponentScan("jvb002.bookstore.app.controller.usermanagement")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	private UserService userService;

	@Autowired(required = true)
	@Qualifier(value = "userService")
	public void setUserService(UserService us) {
		this.userService = us;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/user/register", method = RequestMethod.GET)
	public String home(Model model) {

		return "bookstore/user/create";
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/user/edit/{id}", method = RequestMethod.GET)
	public String editUser(Model model, @PathVariable int id, @ModelAttribute("userVO") UserVO userVO) {

		User user = userService.getUserById(id);
		userVO = ConvertUtils.convertUserToUserVO(user);
		model.addAttribute("id", user.getId());
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("password", user.getPassword());
		model.addAttribute("fullName", user.getFullName());

		
		return "bookstore/user/edit";
	}

	@RequestMapping(value = "/user/user-save", method = RequestMethod.POST)
	public String save(@ModelAttribute("userVO") UserVO userVO) {

		userService.insertUser(userVO);

		return "redirect:/";
	}
}
