package springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/silly")
public class SillyController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	//a controller method to process the HTML form
	@RequestMapping("/processFormVersionThree")
	public String letsShoutDude(@RequestParam("studentName") String theName, Model model) {
//		// read the request parameter from the HTML form
//		String theName = request.getParameter("studentName");
//		
		// convert the data to all capitals
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Hey this is the third version of fetch form data, " + theName + "!";
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
