package cn.entity;
/**
 * ���ཫ������˷��͹�����JSON�ַ���ת���ɶ���
 * @author asus1
 *
 */
public class ContentVo {
	private String name;//����Ŀ�������
	private String content;//��������
	private int type;//1�㲥 2����
	public ContentVo() {
		super();
	}
	public ContentVo(String name, String content, int type) {
		super();
		this.name = name;
		this.content = content;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}

	
}
