package com.kh.spring05.entity;

public class boardDto {
 String board_type, board_title, board_content;

public boardDto() {
	super();
}

public String getBoard_type() {
	return board_type;
}

public void setBoard_type(String board_type) {
	this.board_type = board_type;
}

public String getBoard_title() {
	return board_title;
}

public void setBoard_title(String board_title) {
	this.board_title = board_title;
}

public String getBoard_content() {
	return board_content;
}

public void setBoard_content(String board_content) {
	this.board_content = board_content;
}
 
 
}
