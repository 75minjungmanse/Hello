package com.board.model;

import java.util.List;

public interface BoardCollection {
	public void writeBoard(Board board, List<Board> boards); // 글 작성
	public Board getBoard(int boardNo, List<Board> boards); // 글 조회
	public List<Board> getBoardList(List<Board> boards); // 전체 리스트
	public void updateBoard(Board board, List<Board> boards); // 내용 수정
	public void deleteBoard(int boardNo, List<Board> boards); // 글 삭제

	

}
