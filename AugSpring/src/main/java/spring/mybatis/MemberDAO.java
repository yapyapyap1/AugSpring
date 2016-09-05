package spring.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import DTO.User;

public class MemberDAO extends SqlSessionDaoSupport {

/*	SqlSession session;

	public void setSession(SqlSession session) {
		this.session = session;
	}
	SqlSessionDaoSupport 일때 setter는 상속받으므로 없어야됨
	*/
	
	public List<User> selectAllMem(){
		return getSqlSession().selectList("myMem.selectAll");
	}
	
	public int insertMem(User user){
		return getSqlSession().insert("myMem.insert", user);
	}
	public int updateMem(User user){
		return getSqlSession().update("myMem.update",user);
	}
	public int deleteMem(String id){
		return getSqlSession().delete("myMem.delete",id);
	}
	public int countMem(){
		return getSqlSession().selectOne("myMem.countMem");
	}
	public User selectOneMem(String id){
		return getSqlSession().selectOne("myMem.selectOne", id);
	}
}
