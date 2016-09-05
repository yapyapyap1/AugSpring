package spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import DTO.User;

public class UserRowMapper implements RowMapper<User>{

	public User mapRow(ResultSet rs,int rowNum)throws SQLException{
		User user= new User();
		user.setMemberid(rs.getString("memberid"));
		user.setPassword(rs.getString("password"));
		user.setName(rs.getString("name"));
		user.setEmail(rs.getString("email"));
		return user;
	}
}
