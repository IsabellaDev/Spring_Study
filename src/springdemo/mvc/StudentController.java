package springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	// add an InitBinder ... to convert trim input string
	// remove leading and trailing whitespaces
	// resolve issue for our validation (whitespaces would pass!!!)
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		// create a new student object
		Student theStudent = new Student();
		// add student object to the model
		theModel.addAttribute("student", theStudent);

		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult bindingResult) {

		System.out.println("Last name: |" + theStudent.getLastName() + "|");
		
		System.out.println("Binding result: " + bindingResult);
		
		System.out.println("\n\n\n");
		
		if (bindingResult.hasErrors()) {
			return "student-form";
		} else {
			// log the input data
			System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());

			return "student-confirmation";
		}
	}
}
