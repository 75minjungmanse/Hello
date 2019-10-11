package com.board.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardCollectionImpl;
import com.board.impl.BoardServiceImpl;
import com.board.model.Board;
import com.board.model.BoardCollection;
import com.board.model.BoardService;

public class BoardProc {
	Scanner sc = new Scanner(System.in);
//	Board[] boardAry = new Board[10];
	List<Board> boardAry = new ArrayList<>();
//	BoardService service = new BoardServiceImpl();
	BoardCollection service = new BoardCollectionImpl();
	
	public void execute() { // BoardMain에서 실행
		while(true) {
			
			loginCheck();
			
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 작성 | 2. 글 조회 | 3. 전체 글 조회 | 4. 변경 | 5. 삭제 | 6. 종료");
			
			int menu = 0;
			try {
				menu = sc.nextInt(); //에러 발생 가능한 곳
			} catch (Exception e) {
				System.out.println("정상적인 메뉴를 선택해 주세요.");
				e.printStackTrace();
			}
			
			menu = sc.nextInt(); sc.nextLine();
			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
				getBoard();
			} else if (menu == 3) {
				getBoardList();
			} else if (menu == 4) {
				updateBoard();
			} else if (menu == 5) {
				deleteBoard();
			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("프로그램 종료.");
		
		
		
	}
	public void updateBoard() {
		System.out.println("변경할 글 번호: ");
		int boardNo = sc.nextInt(); sc.nextLine();
		System.out.println("변경할 내용: ");
		String content = sc.nextLine();
		Board board = new Board(boardNo, " ", content, " ");
		service.updateBoard(board, boardAry);
	}
	

	
	public void writeBoard() {
		System.out.println("< 글 작성 >");
		System.out.println("게시글 번호 입력: ");
		int boardNo = sc.nextInt(); sc.nextLine();
		System.out.println("제목 입력: ");
		String title = sc.nextLine();
		System.out.println("내용 입력: ");
		String contents = sc.nextLine();
		System.out.println("작성자 입력: ");
		String writer = sc.nextLine();
		Board board = new Board(boardNo, title, contents, writer);
		service.writeBoard(board, boardAry);
		
/*		for (int i = 0; i < boardAry.length; i++) {
			if (boardAry[i] == null) {
				boardAry[i] = board;
				break;
			}
		}*/
		
	}
	
	
	
	public void getBoard() {
		System.out.println("글 조회");
		System.out.println("조회할 번호 입력: ");
		int boardNo = sc.nextInt();
		service.getBoard(boardNo, boardAry);
		Board board = service.getBoard(boardNo, boardAry);
		System.out.println(board);
		
/*		for (int i = 0; i < boardAry.length; i++) {
			if (boardAry[i]!= null && boardAry[i].getBoardNo() == boardNo) {
				System.out.println(boardAry[i].getTitle()+", "+boardAry[i].getBoardNo()+", "+boardAry[i].getContents()+", "+boardAry[i].getWriter());
			}
		}*/
		
	}
	
	
	
	
	
	public void getBoardList() {
		System.out.println("전체 글 조회");
		List<Board> resultAry = service.getBoardList(boardAry);
		for (Board brd : resultAry) {
			System.out.println(brd);
		}

		/*for (int i = 0; i < boardAry.length; i++) {
			if (boardAry[i]!= null) {
				System.out.println(boardAry[i].getTitle()+", "+boardAry[i].getBoardNo()+", "+boardAry[i].getContents()+", "+boardAry[i].getWriter());
			}
		}*/
		
	}
	
	
	public void deleteBoard() {
		System.out.println("삭제할 게시글 번호: ");
		int boardNo = sc.nextInt();
		service.deleteBoard(boardNo, boardAry);
	}
	
	
	public void loginCheck() {
		while(true) {
			System.out.println("ID: ");
			String id = sc.nextLine();
			System.out.println("PW: ");
			String passwd = sc.nextLine();
			if (id.equals("user1") && passwd.contentEquals("1234")) {
				System.out.println("방문자1 님 환영합니다.");
				break;
			} else {
				System.out.println("ID 혹은 비밀번호를 확인하세요.");
			}
		}
	}

}
