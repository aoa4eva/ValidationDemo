package me.aoa4eva.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	@Autowired 
	private UserRepository userRepository; 
	
	
	@GetMapping("/")
	public String mainInfo(Model m)
	{
		m.addAttribute("newUser",new User());
		return "index";
	}
	
	@PostMapping("/submit")
	public String examineInfo(@ModelAttribute("newUser") @Valid User u, BindingResult thisResult, Model m)
	{
		if(!thisResult.hasErrors())
		{
				try{
						userRepository.save(u);
						m.addAttribute("newUser",u);
						return "saved";
					}
				catch(DataIntegrityViolationException ex)
					{
						//Check to see if e-mail is unique. If not, assume that's were the violation comes from
						thisResult.rejectValue("email", "error.user", "An account already exists for this email.");
					}
		}
			
		return "index";
	}

}
