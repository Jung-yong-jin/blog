package sample.jung.web.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import sample.jung.web.board.dto.BoardDTO;

@Mapper
public interface BoardMapper{

	List<?> listBoard();
	
	void insertBoard(BoardDTO dto);
}