package ��Ϊģʽ.�۲���ģʽObserver;

/**
 * ���������ɫ�����屻�۲����ʵ�ַ���2��<br>
 * 
 * @author JavaSking 2017��1��13��
 */
public class ConcreteSubject2 extends Subject2{
	
	/**
	 * ״̬��
	 */
	@SuppressWarnings("unused")
	private String state;

	/**
	 * ����״̬��
	 * 
	 * @param newState ��״̬��
	 */
	public void change(String newState) {
		
		this.state = newState;
		this.notifyObservers();
	}
}
