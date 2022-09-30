package intToRoman.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import intToRoman.IntToRomanGuts;

@Controller 
public class webController {
	
	
	@GetMapping("/toRoman")
	public String toRoman(@RequestParam(value ="num") int num, Model model) {
		
		String roman = IntToRomanGuts.convertToRoman(num);
		
		model = model.addAttribute("num",roman);
		
		
		return "index";
		
	}
	

}
