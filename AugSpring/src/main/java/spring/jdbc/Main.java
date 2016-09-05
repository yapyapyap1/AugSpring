package spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import DTO.User;

public class Main {

	public static void main(String[] args){
		ApplicationContext context=new GenericXmlApplicationContext("jdbcEx.xml");
		UserDAOImpl dao=context.getBean("userDAOImpl2",UserDAOImpl.class);
		
/*		User user= dao.selectOne();
		System.out.println(user.toString());*/
		int i= dao.memcount();
		System.out.println("테이블 레코드 개수 "+ i);
		/*int i= dao.insert();
		System.out.println("insert 성공갯수 " +i);*/
	/*	List<User> mem=dao.selectAll();
		for(User user:mem){
			System.out.println(user);
		}
		System.out.println("end!!");*/
	}
}
