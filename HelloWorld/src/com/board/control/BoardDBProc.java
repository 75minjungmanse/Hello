package com.board.control;

import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardDBServiceImpl;
import com.board.model.Board;
import com.board.model.BoardDB;
import com.board.model.BoardDBService;
import com.board.model.Employee;

public class BoardDBProc {
	Scanner sc = new Scanner(System.in);
	BoardDBService service = new BoardDBServiceImpl();
	String loginId = null;

	public void execute() {
		loginCheck();
		while (true) {
			int menu = 0;
			System.out.println("1. 게시글 작성 | 2. 전체 게시글 조회 | 3. 게시글 조회 | 4. 게시글 수정 | 5. 게시글 삭제 | 6. 종료");

			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				writeBoard(); // 게시글 작성
			} else if (menu == 2) {
				getBoardList(); // 전체 게시글 조회
			} else if (menu == 3) {
				getBoard(); // 게시글 조회 
			} else if (menu == 4) {
				updateBoard(); // 게시글 수정
			} else if (menu == 5) {
				deleteBoard(); // 게시글 삭제
			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
		System.out.println("프로그램 종료.");
	}

	public void loginCheck() {
		while (true) {
			System.out.println("ID: ");
			String id = sc.nextLine();
			System.out.println("PW: ");
			String passwd = sc.nextLine();
			String name = service.loginCheck(id, passwd);
			if (name != null) {
				System.out.println(name + "님 환영합니다.");
				loginId = id;
				break;
			} else {
				System.out.println("아이디와 비밀번호를 다시 확인하세요.");
			}
		}
	}

	public void writeBoard() {
		System.out.println("< 게시글 작성 >");
		System.out.println("제목: ");
		String title = sc.nextLine();
		System.out.println("내용: ");
		String content = sc.nextLine();
		BoardDB board = new BoardDB();
		board.setTitle(title);
		board.setContent(content);
		board.setWriter(loginId);
		service.insertBoard(board);
	}

	public void getBoardList() {
		System.out.println("< 전체 게시글 조회 >");
		List<BoardDB> board = service.getBoardList();
		for (BoardDB brd : board) {
			System.out.println(brd.getBoardNo() 
			                   + ") 제목: " + brd.getTitle() + ") 작성자: " + brd.getWriter()
			                   + ") 작성일자: " + brd.getCreationDate());

		}
	}

	public void getBoard() {
		System.out.println("< 게시글 조회 >");
		System.out.println("조회할 번호 입력: ");
		int boardNo = sc.nextInt();
		sc.nextLine(); // 원본 글에 대한 정보와 댓글 함께 나오도록
		System.out.println("----------------< 글 >------------------");
		BoardDB board = service.getBoard(boardNo);
		if (board != null) {
		System.out.println("제목: " + board.getTitle());
		System.out.println("내용: " + board.getContent());
		System.out.println("작성자: " + board.getWriter());
		System.out.println("작성일자: " + board.getCreationDate());

		List<BoardDB> list = service.getReply(boardNo);
		if (list.size() > 0) {
			System.out.println("----------------< 댓글 >----------------");
			for (BoardDB brd : list) {
				System.out.println("-> " + brd.getBoardNo() + " | " + brd.getContent() + " | " + brd.getCreationDate());
			} 
			System.out.println("---------------------------------------");
		} else {
			System.out.println("댓글이 없습니다.");
		}
			System.out.println("1. 댓글 작성 | 2. 이전 메뉴로 되돌아가기");
		int subMenu = 0;
		subMenu = sc.nextInt();
		sc.nextLine();
		if (subMenu == 1) {
			System.out.println("댓글 작성: ");
			String reply = sc.nextLine();
			BoardDB board1 = new BoardDB();
			board1.setContent(reply);
			board1.setOrignNo(boardNo);
			board1.setWriter(loginId);
			service.insertReply(board1);
			
		} else {
			return;
		}

		} else {
			System.out.println("없는 글 번호입니다.");
			return;
	}
}


	

	public void updateBoard() {
		System.out.println("수정할 글 번호: ");
		int boardNo = sc.nextInt(); sc.nextLine();
		System.out.println("제목 수정: ");
		String title = sc.nextLine();
		System.out.println("내용 수정: ");
		String content = sc.nextLine();
		BoardDB board = new BoardDB();
		board.setBoardNo(boardNo);
		board.setTitle(title);
		board.setContent(content);
		
		service.updateBoard(board);

	}

	public void deleteBoard() {

	}

}
