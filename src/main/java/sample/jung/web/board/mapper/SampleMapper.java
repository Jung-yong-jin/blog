package sample.jung.web.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import sample.jung.web.board.dto.SampleDTO;

@Repository("sampleMapper")
@Mapper
public interface SampleMapper {
	List<SampleDTO> sampleSelectA();
}
