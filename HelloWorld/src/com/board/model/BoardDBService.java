package com.board.model;

import java.util.List;

public interface BoardDBService {
	
	public String loginCheck(String id, String passwd); // 로그인 체크
	public void insertBoard(BoardDB board); // 게시글 작성
	public List<BoardDB> getBoardList(); // 전체 게시글 조회
	public BoardDB getBoard(int boardNo); // 게시글 조회
	public List<BoardDB> getReply(int boardBo); // 댓글 조회
	public void insertReply(BoardDB board); // 댓글 추가
	public void updateBoard(BoardDB board); // 게시글 수정
	public void deleteBoard(int boardNo); // 게시글 삭제
	
	
	
}
