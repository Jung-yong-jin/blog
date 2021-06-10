package sample.jung.web.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BoardDTO {

	private int bid;
	private String cateCd;
	private String title;
	private String content;
	private String tag;
	private int viewCnt; 
	private String regId; 
	private String regDt; 
	private String editDt;
}
