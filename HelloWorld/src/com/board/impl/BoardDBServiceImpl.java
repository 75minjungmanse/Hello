package com.board.impl;

import java.util.List;

import com.board.model.BoardDB;
import com.board.model.BoardDBService;
import com.board.model.Employee;

public class BoardDBServiceImpl implements BoardDBService {
	BoardDBDAO dao = new BoardDBDAO();
	

	@Override
	public String loginCheck(String id, String passwd) {
		String name = dao.getUserName(id, passwd);
		return name;
	}

	@Override
	public void insertBoard(BoardDB board) {
		dao.insertBoard(board);
		
	}

	@Override
	public List<BoardDB> getBoardList() {
		List<BoardDB> list = dao.getBoardList();
		return list;
	}

	@Override
	public BoardDB getBoard(int boardNo) {
		return dao.getBoard(boardNo);
	}

	@Override
	public List<BoardDB> getReply(int boardNo) {
		return dao.getReply(boardNo);
	}

	@Override
	public void insertReply(BoardDB board) {
		dao.replyBoard(board);
		
	}

	@Override
	public void updateBoard(BoardDB board) {
		// 해당 글에 대한 권한이 있는지(해당 글의 작성자인지) 확인
		if (dao.chechResponsiblility(board)) {
			dao.updateBoard(board);
			System.out.println("변경되었습니다.");
		} else {
			System.out.println("해당 글에 대한 권한이 없습니다.");
			dao.updateBoard(board);
		}
		
	}

	@Override
	public void deleteBoard(BoardDB board) {
		if (dao.chechResponsiblility(board)) {
			if (!dao.checkForReply(board.getBoardNo())) {
				dao.deleteBoard(board);
				System.out.println("게시글이 삭제되었습니다.");
			
		} else {
			System.out.println("댓글이 존재합니다.");
		}
	} else {
		System.out.println("해당 글에 대한 권한이 없습니다.");
	}
	}
}
	


