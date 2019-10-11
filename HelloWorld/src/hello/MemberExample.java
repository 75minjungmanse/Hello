package hello;

import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setName("김민정");
		m1.setId("KMJ");
		m1.setPasswd("alswjd");
		m1.setAge(25);
		
		Member m2 = new Member("관리자", "admin");
		m2.setPasswd("owner");
		m2.setAge(27);
		
		Member m3 = new Member("사용자", "user1", "user123", 45);
		
		Member[] memberAray = {m1, m2, m3};
		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 id 입력: ");
		String id = sc.nextLine();
		for(Member m : memberAray) {
			if(m.getId().contentEquals(id))
			System.out.println("name :"+m.getName()+", id: "+m.getId()+", passwd: "+m.getPasswd()+", Age: "+m.getAge());
		}
		
	}

}
