package 行为模式.观察者模式Observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 抽象主题角色实现方案2。<br>
 * 持有所有登记过的观察对象的引用，在内部状态发生改变时，通过所有登记过的观察者。
 * 
 * @author JavaSking
 * 2017年1月13日
 */
public abstract class Subject2 {

	/**
	 * 登记的观察者。
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
	 * 获取当前登记观察者的备份，防止外界修改主题角色的拷贝。
	 */
	@SuppressWarnings("unchecked")
	public Enumeration<Observer> clone() {
		
		return ((Vector<Observer>)observers.clone()).elements();
	}
}
