package cn.dao;

import java.util.List;

import cn.entity.User;

public interface UserDao {
	void saveUser(User user);//�����û�
	void deleteUser(User user);//ɾ���û�
	void updateUser(User user);//�����û���Ϣ

	User findUserByName(String name);
	User findUserById(String id);
	List<User> findAllUsers();
}
