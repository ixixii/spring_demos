package net.vwhm.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeyondMain {
	@Test
	public void test_1() {
		// 传统方式,必须手动new 一个实现类
		// UserDao dao = new UserDaoJdbcImpl();
		//dao.save();
	}
	
	@Test
	public void test_2() {
		// 传统方式,必须手动new 一个实现类
		// UserDao dao = new UserDaoHibernateImpl();
		//dao.save();
	}

	@Test
	public void test_3() {
		// Spring方式,如果要换成另一个dao的实现类,只需要改xml配置文件
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao dao = (UserDao) appContext.getBean("id_userDao");
		dao.save();
	}
}
