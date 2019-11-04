package co.micol.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.micol.dto.MemberDto;

public class MemberDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "soyoon";
	private String password = "1234";
	
	
	
	public MemberDao() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	// 로그인(id, pw 받아서 회원 등급 체크)
	public String isLoginCheck(String id, String pw) {
		String grant = null;
		String sql = "SELECT * FROM member WHERE memberid = ? AND memberpw = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				grant = rs.getString("MEMBERGRANT");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return grant;
	}
	
	
	
	
	
	
	public MemberDto select(String id) { // 한 사람의 데이터 확인
		MemberDto dto = new MemberDto();
		String sql = "SELECT * FROM member WHERE memberid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				dto.setId(rs.getString("MEMBERID"));
				dto.setName(rs.getString("MEMBERNAME"));
				dto.setPassword(rs.getString("MEMBERPW"));
				dto.setGrant(rs.getString("MEMBERGRANT"));
				dto.setEnterDate(rs.getDate("MEMBERENTERDATE"));
				dto.setAddr(rs.getString("MEMBERADDR"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return dto;
	}
	
	
	
	
	
	public ArrayList<MemberDto> select() { // 여러 명의 데이터 확인
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		MemberDto dto;
		String sql = "SELECT * FROM member";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				dto = new MemberDto();
				dto.setId(rs.getString("memberid"));
				dto.setName(rs.getString("membername"));
				dto.setGrant(rs.getString("membergrant"));
				dto.setEnterDate(rs.getDate("memberenterdate"));
				dto.setAddr(rs.getString("memberaddr"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}
	
	
	
	
	
	public int insert(MemberDto dto) {
		int n = 0;
		String sql = "INSERT INTO member(memberid, membername, memberpw, memberaddr) VALUES(?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getPassword());
			pstmt.setString(4, dto.getAddr());
			n = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}
	
	
	
	
	
	
	public int update(MemberDto dto) {
		int n = 0;
		String sql = "UPDATE member SET membername=?, memberaddr=? WHERE memberid=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setString(3, dto.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}
	
	
	
	
	
	
	public int delete(MemberDto dto) {
		int n = 0;
		// 삭제 구문 작성
		return n;
	}
	
	
	public boolean isIdCheck(String id) {
		boolean b = true;
		String sql = "SELECT memberid FROM member WHERE memberid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				b = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return b;
	}
	
	

	
	
	private void close() {
		try {
			if (rs != null) rs.close();
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}

