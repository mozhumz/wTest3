package cn.service;

import cn.entity.User;
import cn.service.NameException;
import cn.service.PasswordException;

public interface UserService {
	//��¼����
	User login(String name,String password)throws NameException,PasswordException;
	//ע�Ṧ��
	User regist(String name,String nick,String password,String confirm)
	throws NameException,PasswordException;
	//�������
	boolean checkToken(String userId, String token);
}
