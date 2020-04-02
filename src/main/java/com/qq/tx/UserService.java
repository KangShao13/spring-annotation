package com.qq.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.qq.tx.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	@Transactional
	public void insteruser() {
		userDao.insert();
		System.out.println("插入成功");
		//模拟一系列操作过程中报错，
//		int a=10/5;
	}
}
