package sample.jung.web.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/bootstrap")
public class BootstrapController {

	@GetMapping("/sample01")
	public String sample01(Model model){
		return "bootstrap/sample01";
	}
	
	@GetMapping("/sample02")
	public String sample02(Model model){
		return "bootstrap/sample02";
	}
	
	@GetMapping("/sample03")
	public String sample03(Model model){
		return "bootstrap/sample03";
	}
	
	@GetMapping("/sample04")
	public String sample04(Model model){
		return "bootstrap/sample04";
	}
	
	@GetMapping("/sample05")
	public String sample05(Model model){
		return "bootstrap/sample05";
	}
	
	@GetMapping("/sample06")
	public String sample06(Model model){
		return "bootstrap/sample06";
	}
	
	@GetMapping("/sample07")
	public String sample07(Model model){
		return "bootstrap/sample07";
	}
	
	@GetMapping("/sample08")
	public String sample08(Model model){
		return "bootstrap/sample08";
	}
	
	@GetMapping("/sample09")
	public String sample09(Model model){
		return "bootstrap/sample09";
	}
	
	@GetMapping("/sample10")
	public String sample10(Model model){
		return "bootstrap/sample10";
	}
	
	@GetMapping("/sample11")
	public String sample11(Model model){
		return "bootstrap/sample11";
	}
	
	@GetMapping("/sample12")
	public String sample12(Model model){
		return "bootstrap/sample12";
	}
	
	@GetMapping("/sample13")
	public String sample13(Model model){
		return "bootstrap/sample13";
	}
}
