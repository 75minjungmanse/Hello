package com.board.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardCollectionImpl;
import com.board.impl.BoardServiceImpl;
import com.board.impl.EmployeeServiceImpl;
import com.board.model.Board;
import com.board.model.BoardCollection;
import com.board.model.BoardService;
import com.board.model.Employee;
import com.board.model.EmployeeService;

public class EmpProc {
	Scanner sc = new Scanner(System.in);
	EmployeeService service = new EmployeeServiceImpl();

	public void execute() {
		while (true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 사원 등록 | 2. 사원 조회 | 3. 전체 사원 조회 | 4. 사원 정보 변경 | 5. 삭제 | 6. 종료");

			int menu = 0;
			try {
				menu = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("정상적인 메뉴를 선택해 주세요.");
				sc.nextLine();
				e.printStackTrace();
			}

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
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.println("변경할 내용: ");
		String content = sc.nextLine();
		Board board = new Board(boardNo, " ", content, " ");
//		service.updateBoard(board, boardAry);
	}

	public void writeBoard() {
		System.out.println("< 직원 등록 >");
		System.out.println("직원 번호 입력: ");
		int empId = sc.nextInt();
		sc.nextLine();
		System.out.println("이름 입력: ");
		String firstName = sc.nextLine();
		System.out.println("성 입력: ");
		String lastName = sc.nextLine();
		System.out.println("급여 입력: ");
		int salary = sc.nextInt(); sc.nextLine();
		System.out.println("email 입력: ");
		String email = sc.nextLine();
		System.out.println("JOB ID 입력: ");
		String jobId = sc.nextLine(); 	
		System.out.println("입사일 입력: ");
		String hireDate = sc.nextLine();

		Employee emp = new Employee();
		emp.setEmployeeId(empId);
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setSalary(salary);
		emp.setEmail(email);
		emp.setJobId(jobId);
		emp.setHireDate(hireDate); // 2010-10-05
		service.insertEmployee(emp);

	}

	public void getBoard() {
		System.out.println("< 사원 조회 >");
		System.out.println("조회할 사원 번호 입력: ");
		int empNo = sc.nextInt();
		Employee emp = service.getEmployee(empNo);
		System.out.println(emp);

	}

	public void getBoardList() {
		System.out.println("전체 사원 조회");
		List<Employee> employees = service.getEmpList();
		for (Employee employee : employees) {
			System.out.println(employee);
		}

	}

	public void deleteBoard() {
		System.out.println("< 사원 정보 삭제 >");
		System.out.println("삭제할 사원 번호: ");
		int empNo = sc.nextInt();
		service.deleteEmployee(empNo);
	}

}
