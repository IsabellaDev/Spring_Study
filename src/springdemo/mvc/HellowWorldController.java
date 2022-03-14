package springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HellowWorldController {
	
	// a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	//a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// controller method to read form data and add data to model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		// convert the data to all capitals
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Hey " + theName + "!";
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}

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
