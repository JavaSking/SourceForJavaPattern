package ��Ϊģʽ.�۲���ģʽObserver;

import java.util.Enumeration;
import java.util.Vector;

/**
 * ���������ɫ�����屻�۲����ʵ�ַ���1��<br>
 * �������еǼǹ��Ĺ۲��������ã����ڲ�״̬�����ı�ʱ��ͨ�����еǼǹ��Ĺ۲��ߡ�
 * 
 * @author JavaSking 2017��1��13��
 */
public class ConcreteSubject1 implements Subject1 {

	/**
	 * �ǼǵĹ۲��ߡ�
	 */
	private Vector<Observer> observers = new Vector<Observer>();
	
	/**
	 * ״̬��
	 */
	@SuppressWarnings("unused")
	private String state;

	public void attach(Observer observer) {

		observers.addElement(observer);
	}

	public void detach(Observer observer) {

		observers.removeElement(observer);
	}
	
	/**
	 * ��������״̬��
	 * 
	 * @param newState ��״̬��
	 */
	public void change(String newState) {
		
		state = newState;
		notifyObservers();
	}

	public void notifyObservers() {

		Enumeration<Observer> enumeration = clone();
		while (enumeration.hasMoreElements()) {
			enumeration.nextElement().update();
		}
	}
	
	/**
	 * ��ȡ��ǰ�Ǽǹ۲��ߵı��ݣ���ֹ����޸������ɫ�Ŀ�����
	 */
	@SuppressWarnings("unchecked")
	public Enumeration<Observer> clone() {
		
		return ((Vector<Observer>)observers.clone()).elements();
	}
}
