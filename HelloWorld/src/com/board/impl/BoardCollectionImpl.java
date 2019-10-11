package com.board.impl;

import java.util.ArrayList;
import java.util.List;

import com.board.model.Board;
import com.board.model.BoardCollection;
import com.board.model.BoardService;

public class BoardCollectionImpl implements BoardCollection {

	@Override
	public void writeBoard(Board board, List<Board> boards) {
		boards.add(board);
		
	}

	@Override
	public Board getBoard(int boardNo, List<Board> boards) {
		Board boardTemp = null;
		for (Board board : boards) {
			if (board.getBoardNo() == boardNo) {
				boardTemp = board;
			}
		}
		return boardTemp;
	}

	@Override
	public List<Board> getBoardList(List<Board> boards) {
		List<Board> list = new ArrayList<>();
		for (Board board : boards) {
			list.add(board);
		}
		return list;

	}

	@Override
	public void updateBoard(Board board, List<Board> boards) {
		for (Board boardTemp : boards) {
			if (board.getBoardNo() == boardTemp.getBoardNo()) {
				boardTemp.setTitle(board.getTitle());
				boardTemp.setContents(board.getContents());
				boardTemp.setWriter(board.getWriter());
			}
		
	}
	}

	@Override
	public void deleteBoard(int boardNo, List<Board> boards) {
		for (Board board : boards) {
			if (board.getBoardNo() == boardNo) {
				boards.remove(board);
			}
		
	}
	

}


//	public void writeBoard(Board board, List<Board> boards) {
//		for (int i = 0; i < boards.length; i++) {
//			if (boards[i] == null) {
//				boards[i] = board;
//				break;
//			}
//		}
//
//	}
//
//	public Board getBoard(int boardNo, List<Board> boards) {
//		Board board = null;
//		for (int i = 0; i < boards.length; i++) {
//			if (boards[i] != null && boards[i].getBoardNo() == boardNo) {
//				board = boards[i];
//			}
//		}
//		return board;
//	}
//
//	public Board[] getBoardList(List<Board> boards) {
//		Board[] boardAry = new Board[boards.length]; // 입력 받은 값과 같은 크기의 배열 생성
//		for (int i = 0; i < boards.length; i++) {
//			boardAry[i] = boards[i];
//		}
//		return boardAry;
//	}
//
//	public void deleteBoard(int boardNo, List<Board> boards) {
//		for (int i = 0; i < boards.length; i++) {
//			if (boards[i] != null && boards[i].getBoardNo() == boardNo) {
//				boards[i] = null;
//			}
//		}
//
//	}
//
//	public void updateBoard(Board board, List<Board> boards) {
//		for (int i = 0; i < boards.length; i++) {
//			if (boards[i] != null && boards[i].getBoardNo() == board.getBoardNo())
//				boards[i].setContents(board.getContents());
//		}
//		
//	}
//
//	@Override
//	public void writeBoard(Board board, List<Board> boardAry) {
//		
//	}
//
//	@Override
//	public Board getBoard(int boardNo, List<Board> boardAry) {
//		return null;
//	}
//
//	@Override
//	public Board[] getBoardList(List<Board> boardAry) {
//		return null;
//	}
//
//	@Override
//	public void updateBoard(Board board, List<Board> boardAry) {
//		
//	}
//
//	@Override
//	public void deleteBoard(int boardNo, List<Board> boardAry) {
//		
//	}

}
