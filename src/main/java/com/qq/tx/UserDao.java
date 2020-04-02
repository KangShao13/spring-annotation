package com.qq.tx;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insert() {
		String sql="INSERT into lmanage (id,macode,maname,mapassword,marange) values (?,?,?,?,?)";
																			//参数，第一个是int，其他的都是string
		String username=UUID.randomUUID().toString().substring(5);
		jdbcTemplate.update(sql,21,"99",username,"101301","3");
	}

}
