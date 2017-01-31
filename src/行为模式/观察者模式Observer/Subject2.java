package ��Ϊģʽ.�۲���ģʽObserver;

import java.util.Enumeration;
import java.util.Vector;

/**
 * ���������ɫʵ�ַ���2��<br>
 * �������еǼǹ��Ĺ۲��������ã����ڲ�״̬�����ı�ʱ��ͨ�����еǼǹ��Ĺ۲��ߡ�
 * 
 * @author JavaSking
 * 2017��1��13��
 */
public abstract class Subject2 {

	/**
	 * �ǼǵĹ۲��ߡ�
	 */
	private Vector<Observer> observers = new Vector<Observer>();
	
	public void attach(Observer observer) {

		observers.addElement(observer);
	}

	public void detach(Observer observer) {

		observers.removeElement(observer);
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
