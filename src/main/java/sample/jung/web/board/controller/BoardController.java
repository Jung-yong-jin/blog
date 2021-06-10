package sample.jung.web.board.controller;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import sample.jung.web.board.dto.BoardDTO;
import sample.jung.web.board.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController{
	
	@Autowired
	BoardService boardService;
	
	@GetMapping("/list")
	@ResponseBody
	public List<?> listBoard(Model model) {
		
		List<?> list = boardService.listBoard();
		
		return list; 
	}
	
	@GetMapping("/write")
	public String main(Model model){
		
		
		List<?> list = boardService.listBoard();
		model.addAttribute("list", list);
		
		return "boardWrite";
	}
	
	@RequestMapping("/uploadFile")
	public String uploadFile(@RequestParam("file") MultipartFile  files,  BoardDTO boardDTO) {
		System.out.println(boardDTO.toString());
		String origFilename = files.getOriginalFilename();
		try {
			if(!StringUtils.isEmpty(origFilename)) {
				files.transferTo(new File("D:\\test_data\\uploadFile\\" + origFilename));
			}
			boardService.insertBoard(boardDTO);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "redirect:/more/main";
	}
}