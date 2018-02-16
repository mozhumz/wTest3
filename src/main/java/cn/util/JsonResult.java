package cn.util;

import java.io.Serializable;

public class JsonResult implements Serializable{

	private static final long serialVersionUID = 2144767199128572966L;
	public static final int SUCCESS=0;
	public static final int ERROR=1;
	//����״ֵ̬0:�ɹ�,1:ʧ��
	private int state;
	
	//�ɹ�ʱ����json����
	private Object data;
	
	//ʧ��ʱ����Ϣ
	private String msg;
	
	public JsonResult(int state, Object data, String msg) {
		super();
		this.state = state;
		this.data = data;
		this.msg = msg;
	}
	public JsonResult(int state,Throwable e){
		this.state=state;
		data=null;
		this.msg=e.getMessage();
	}
	public JsonResult() {
		super();
	}
	public JsonResult(Throwable e){
		this.state=ERROR;
		this.data=null;
		this.msg=e.getMessage();
	}
	public JsonResult(Object data){
		this.state=SUCCESS;
		this.data=data;
		this.msg="";
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "JsonResult [state=" + state + ", data=" + data + ", msg=" + msg + "]";
	}
}
