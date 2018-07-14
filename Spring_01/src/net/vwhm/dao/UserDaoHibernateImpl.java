package net.vwhm.dao;

public class UserDaoHibernateImpl implements UserDao {

	public void save() {
		System.out.println("hibernate方式保存用户");
	}

}
