package net.vwhm.dao;

public class UserDaoJdbcImpl implements UserDao {
	public void save() {
		System.out.println("Jdbc方式保存一个用户");
	}
}
