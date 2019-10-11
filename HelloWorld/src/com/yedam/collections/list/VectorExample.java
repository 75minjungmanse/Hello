package com.yedam.collections.list;

import java.util.List;
import com.board.model.Board;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		list.add(new Board(1, "제목 1", "내용 1", "작성자 1"));
		list.add(new Board(2, "제목 2", "내용 2", "작성자 2"));
		list.add(new Board(3, "제목 3", "내용 3", "작성자 3"));
		list.add(new Board(4, "제목 4", "내용 4", "작성자 4"));
		list.add(new Board(5, "제목 5", "내용 5", "작성자 5"));
	}

}
