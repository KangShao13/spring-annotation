package com.qq.service;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.qq.dao.BookDao;

@Service
public class BookService {

//	@Qualifier("bookDao")
//	@Autowired(required = false)
//	@Resource(name = "bookDao2")
	@Inject
	private BookDao bookDao;

	@Override
	public String toString() {
		return "BookService [bookDao=" + bookDao + "]";
	}
	
}
