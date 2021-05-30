package com.kh.collection.silsub1.model.vo;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable { //객체 직렬화(파일입출력위해서)

	/**
	 * 
	 */
	private static final long serialVersionUID = -865002328518106727L;
	//객체 입출력하기위해서는 직렬화 반드시 필요
	//객체 -> 바이트배열로 변환 -> 메모리에 저장 필요한 것 : UID
	//명시해줘야 함! (역직렬화에 사용됨)
	private int boardNo;
	private String boardTitle;
	private String boardWriter;
	private Date boardDate;
	private String boardContent;
	private int readCount;
	
	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(int boardNo, String boardTitle, String boardWriter, Date boardDate, String boardContent) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardWriter = boardWriter;
		this.boardDate = boardDate;
		this.boardContent = boardContent;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public Date getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardWriter=" + boardWriter+ ""
				+ ", boardDate=" + boardDate + ", boardContent=" + boardContent + ", readCount=" + readCount ;
	}
	
	
}
