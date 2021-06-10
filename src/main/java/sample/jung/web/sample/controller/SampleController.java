package sample.jung.web.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sample.jung.web.board.service.BoardService;

@Controller
@RequestMapping("/more")
public class SampleController{

	@Autowired
	BoardService boardService;
	
	@GetMapping("/main")
	public String main(Model model){
		List<?> list = boardService.listBoard();
		model.addAttribute("list", list);
		return "main";
	}
	
	@GetMapping("/sample01")
	public String sample01(Model model){
		return "more/sample01";
	}
	
	@GetMapping("/sample02")
	public String sample02(Model model){
		return "more/sample02";
	}
	
	@GetMapping("/sample03")
	public String sample03(Model model){
		return "more/sample03";
	}
	
	@GetMapping("/sample04")
	public String sample04(Model model){
		return "more/sample04";
	}
	
	@GetMapping("/sample05")
	public String sample05(Model model){
		return "more/sample05";
	}
	
	@GetMapping("/sample06")
	public String sample06(Model model){
		return "more/sample06";
	}
	
	@GetMapping("/sample07")
	public String sample07(Model model){
		return "more/sample07";
	}
	
	@GetMapping("/sample08")
	public String sample08(Model model){
		return "more/sample08";
	}
	
	@GetMapping("/sample09")
	public String sample09(Model model){
		return "more/sample09";
	}
	
	@GetMapping("/sample10")
	public String sample10(Model model){
		return "more/sample10";
	}
	
	@GetMapping("/sample11")
	public String sample11(Model model){
		return "more/sample11";
	}
	
	@GetMapping("/sample12")
	public String sample12(Model model){
		return "more/sample12";
	}
	
	@GetMapping("/sample13")
	public String sample13(Model model){
		return "more/sample13";
	}
}