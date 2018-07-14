package net.vwhm.dao;

import org.junit.Test;

public class BeyondMain {
	@Test
	public void test_1() {
		// 传统方式,必须手动new 一个实现类
		UserDao dao = new UserDaoJdbcImpl();
		dao.save();
	}
	
	@Test
	public void test_2() {
		// 传统方式,必须手动new 一个实现类
		UserDao dao = new UserDaoHibernateImpl();
		dao.save();
	}
}
