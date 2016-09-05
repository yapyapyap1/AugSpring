package spring.mybatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import DTO.User;

public class Main {

	public static void main(String[] args){
		ApplicationContext context=new GenericXmlApplicationContext("mybatis.xml");
		
		MemberDAO dao= context.getBean("dao",MemberDAO.class);
		/*List<User> mem =dao.selectAllMem();
		for(User user:mem){
			System.out.println(user);
		}
		System.out.println("End!");*/
		
	/*	User user =new User("hhh","hhhh","hhhh","hhhhh");
		int i= dao.insertMem(user);
		if(i==0){
			System.out.println("인설트 실패");
		}else{
			System.out.println("인설트 성공");
		}*/
		
		/*User user= new User("hh","haha","hahaha","2323213");
		int i= dao.updateMem(user);
		if(i==0){
			System.out.println("업데이트 실패");
		}else{
			System.out.println("업데이트 성공");
		}*/
		
/*		int i = dao.deleteMem("hh");
		if(i==0){
			System.out.println("삭제 실패");
		}else{
			System.out.println("삭제 성공");
		}*/
		
		int i= dao.countMem();
		System.out.println("레코드의 개수  " +i);
		User user= dao.selectOneMem("mem");
		System.out.println(user);
	}
}
