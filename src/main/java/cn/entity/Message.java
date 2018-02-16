package cn.entity;
/**
 * �������е���Ϣ��,
 * ����������ContentVo.content��JSON�ַ����ķ�ʽת���͸��������
 */

import java.util.Date;
import java.util.List;

import com.google.gson.Gson;

public class Message {
	private String alert; // ĳĳ�˽�����������/�˳�������

	private List<String> names; // ������������������

	private String content; // ����Ϣ������

	private String username;// ����Ϣ�˵��û���

	
	public static Gson gson = new Gson();
	public Message() {
		super();
	}

	public String getAlert() {
		return alert;
	}

	public void setAlert(String alert) {
		this.alert = alert;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setContent(String name, String content) {
		this.content = name + " " + new Date().toLocaleString() + "<br/>" + content;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	



	
}
