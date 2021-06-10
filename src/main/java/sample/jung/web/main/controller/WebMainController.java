package sample.jung.web.main.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sample.jung.web.board.dto.BoardDTO;

@Controller
public class WebMainController{

	@GetMapping("/")
	public String indexPage(Model model) {
		BoardDTO board = BoardDTO.builder()
						.bid(1)
						.title("테스트 제목")
						.regId("정용진")
						//.updateTime(LocalDateTime.now())
						.build();
		
		BoardDTO board2 = BoardDTO.builder()
				.bid(2)
				.title("테스트 제목")
				.regId("정용진")
				//.editDt(LocalDateTime.now())
				.build();
		
		BoardDTO board3 = BoardDTO.builder()
				.bid(3)
				.title("테스트 제목")
				.regId("정용진")
				//.editDt(LocalDateTime.now())
				.build();
		
		List<BoardDTO> boardList = new ArrayList<>();
		boardList.add(board);
		boardList.add(board2);
		boardList.add(board3);
		//boardList.add(board4);
		
		model.addAttribute("board", board);
		model.addAttribute("boardList", boardList);
		
		return "index";
	}
	
	
	
	@GetMapping("serverName")
	public String getServerName() {
		
		return "serverName";
	}
}