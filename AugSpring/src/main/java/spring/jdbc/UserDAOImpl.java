package spring.jdbc;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import DTO.User;

public class UserDAOImpl extends JdbcDaoSupport{
/*
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	jdbcDaoSupport 를 상속받으면 setter가 겹침
	*/
	
	public List<User> selectAll(){
		String sql="select * from member";	
		UserRowMapper mapper= new UserRowMapper();
		List<User> member= getJdbcTemplate().query(sql, mapper);
		return member;
	}
	
	public int insert(){
		String sql="insert into member values(?,?,?,?)";
		Object[] o= {"hh1","hhhh1","aa1","sadidsiofadsoi1"};
		int i=getJdbcTemplate().update(sql,o);
		return i;
	}
	public User selectOne(){
		String sql="select*from member where memberid=?";
		Object[] o={"hh1"};
		UserRowMapper mapper= new UserRowMapper();
		User user=getJdbcTemplate().queryForObject(sql,o,mapper);
		return user;
	}
	public int memcount(){
		String sql ="select count(*) from member";
		Integer i=getJdbcTemplate().queryForObject(sql,Integer.class);
		return i;
	}
}
