package 行为模式.观察者模式Observer.JDK;

import java.util.Vector;

/**
 * 被观察者对象。{@link java.util.Observable}
 * 
 * @author JavaSking 2017年1月13日
 */
public class Observable {

	/**
	 * 状态标识。
	 */
	private boolean changed = false;

	/**
	 * 保存登记的观察者。
	 */
	private Vector<Observer> obs;

	/**
	 * 默认构造函数。
	 */
	public Observable() {

		obs = new Vector<>();
	}

	/**
	 * 添加观察者。
	 * 
	 * @param o
	 *          待添加的观察者。
	 */
	public synchronized void addObserver(Observer o) {

		if (o == null)
			throw new NullPointerException();
		if (!obs.contains(o)) {
			obs.addElement(o);
		}
	}

	/**
	 * 删除目标观察者。
	 * 
	 * @param o
	 *          待删除的目标观察者。
	 */
	public synchronized void deleteObserver(Observer o) {

		obs.removeElement(o);
	}

	/**
	 * 给所有观察者发送通知。
	 */
	public void notifyObservers() {

		notifyObservers(null);
	}

	/**
	 * 给所有观察者发送通知，并传递目标参数。
	 * 
	 * @param arg
	 *          待传递的目标参数。
	 */
	public void notifyObservers(Object arg) {

		/**
		 * 注：当前观察者快照。从而使外界不能修改被观察者对象自己使用的拷贝。（备忘录模式）
		 */
		Object[] arrLocal;

		synchronized (this) {
			if (!changed)
				return;
			arrLocal = obs.toArray();
			clearChanged();//复位状态标识符
		}

		for (int i = arrLocal.length - 1; i >= 0; i--)
			((Observer) arrLocal[i]).update(this, arg);
	}

	/**
	 * 移除全部登记的观察者。
	 */
	public synchronized void deleteObservers() {

		obs.removeAllElements();
	}

	/**
	 * 设置状态发生变化。
	 */
	protected synchronized void setChanged() {

		changed = true;
	}

	/**
	 * 复位状态标识符。
	 */
	protected synchronized void clearChanged() {

		changed = false;
	}

	/**
	 * 判断当前被观察者对象状态是否发生变化。
	 * 
	 * @return 如果当前被观察者对象状态发生变化则返回true，否则返回false。
	 */
	public synchronized boolean hasChanged() {

		return changed;
	}

	/**
	 * 获取登记的观察者数。
	 * 
	 * @return 登记的观察者数。
	 */
	public synchronized int countObservers() {

		return obs.size();
	}
}
