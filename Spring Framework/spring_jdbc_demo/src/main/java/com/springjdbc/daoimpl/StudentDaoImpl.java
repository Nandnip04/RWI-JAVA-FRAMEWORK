package com.springjdbc.daoimpl;

import org.springframework.jdbc.core.JdbcTemplate;
import com.springjdbc.dao.StudentDao;
import com.springjdbc.entity.Student;
public class StudentDaoImpl implements StudentDao{
    private JdbcTemplate jdbcTemplate;
    @Override
	public int insert(Student student){

        String query="insert into Student values(?,?,?)";
        int result=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getAddress());
		return result;
    }
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

}
