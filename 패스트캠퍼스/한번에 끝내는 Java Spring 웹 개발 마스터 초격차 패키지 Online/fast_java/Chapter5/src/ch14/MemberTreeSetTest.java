package ch14;

import java.util.TreeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
//		TreeSet<String> set = new TreeSet<>();
//		set.add("ȫ�浿");
//		set.add("������");
//		set.add("�̼���");
//		
//		System.out.println(set);
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberHong = new Member(1004, "ȫ�浿");
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");
		

		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);
		memberTreeSet.addMember(memberHong);
		memberTreeSet.addMember(memberKang);

		memberTreeSet.showAllMember();	

		
	}

}
