package sample.jung.web.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.jung.web.board.dto.BoardDTO;
import sample.jung.web.board.dto.SampleDTO;
import sample.jung.web.board.mapper.BoardMapper;
import sample.jung.web.board.mapper.SampleMapper;

@Service
public class BoardService{

	@Autowired
	BoardMapper boardMapper;
	
	@Autowired
	SampleMapper sampleMapper;
	
	public List<?> listBoard(){
		System.out.println(":::::");
		return boardMapper.listBoard();
	}
	
	public List<SampleDTO> mybatisSamplesA(){
		return sampleMapper.sampleSelectA();
	}
	
	
	public void insertBoard(BoardDTO dto){
		boardMapper.insertBoard(dto);
	}
	
	
}