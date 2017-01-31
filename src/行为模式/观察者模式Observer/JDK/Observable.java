package ��Ϊģʽ.�۲���ģʽObserver.JDK;

import java.util.Vector;

/**
 * ���۲��߶���{@link java.util.Observable}
 * 
 * @author JavaSking 2017��1��13��
 */
public class Observable {

	/**
	 * ״̬��ʶ��
	 */
	private boolean changed = false;

	/**
	 * ����ǼǵĹ۲��ߡ�
	 */
	private Vector<Observer> obs;

	/**
	 * Ĭ�Ϲ��캯����
	 */
	public Observable() {

		obs = new Vector<>();
	}

	/**
	 * ��ӹ۲��ߡ�
	 * 
	 * @param o
	 *          ����ӵĹ۲��ߡ�
	 */
	public synchronized void addObserver(Observer o) {

		if (o == null)
			throw new NullPointerException();
		if (!obs.contains(o)) {
			obs.addElement(o);
		}
	}

	/**
	 * ɾ��Ŀ��۲��ߡ�
	 * 
	 * @param o
	 *          ��ɾ����Ŀ��۲��ߡ�
	 */
	public synchronized void deleteObserver(Observer o) {

		obs.removeElement(o);
	}

	/**
	 * �����й۲��߷���֪ͨ��
	 */
	public void notifyObservers() {

		notifyObservers(null);
	}

	/**
	 * �����й۲��߷���֪ͨ��������Ŀ�������
	 * 
	 * @param arg
	 *          �����ݵ�Ŀ�������
	 */
	public void notifyObservers(Object arg) {

		/**
		 * ע����ǰ�۲��߿��ա��Ӷ�ʹ��粻���޸ı��۲��߶����Լ�ʹ�õĿ�����������¼ģʽ��
		 */
		Object[] arrLocal;

		synchronized (this) {
			if (!changed)
				return;
			arrLocal = obs.toArray();
			clearChanged();//��λ״̬��ʶ��
		}

		for (int i = arrLocal.length - 1; i >= 0; i--)
			((Observer) arrLocal[i]).update(this, arg);
	}

	/**
	 * �Ƴ�ȫ���ǼǵĹ۲��ߡ�
	 */
	public synchronized void deleteObservers() {

		obs.removeAllElements();
	}

	/**
	 * ����״̬�����仯��
	 */
	protected synchronized void setChanged() {

		changed = true;
	}

	/**
	 * ��λ״̬��ʶ����
	 */
	protected synchronized void clearChanged() {

		changed = false;
	}

	/**
	 * �жϵ�ǰ���۲��߶���״̬�Ƿ����仯��
	 * 
	 * @return �����ǰ���۲��߶���״̬�����仯�򷵻�true�����򷵻�false��
	 */
	public synchronized boolean hasChanged() {

		return changed;
	}

	/**
	 * ��ȡ�ǼǵĹ۲�������
	 * 
	 * @return �ǼǵĹ۲�������
	 */
	public synchronized int countObservers() {

		return obs.size();
	}
}
