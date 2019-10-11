package com.board.model;

import java.util.List;

public interface BoardService {
	public void writeBoard(Board board, Board[] boards); // 글 작성
	public Board getBoard(int boardNo, Board[] boards); // 글 조회
	public Board[] getBoardList(Board[] boards); // 전체 리스트
	public void updateBoard(Board board, Board[] boards); // 내용 수정
	public void deleteBoard(int boardNo, Board[] boards); // 글 삭제

	

}
