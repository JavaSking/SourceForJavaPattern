package ��Ϊģʽ.����¼ģʽMemento.���䱸��¼ģʽ;

import java.util.Vector;
/**
 * �����˶���<br>
 * ���䱸��¼ģʽ + ����㱸��¼
 * 
 * @author JavaSking
 * 2017��1��14��
 */
public class MultipleCheckpointCaretaker {

	/**
	 * �����˶���
	 */
	private MultipleCheckpointOriginator originator;

	/**
	 * ����Ķ��ؼ��㱸��¼��
	 */
	private Vector<MultipleCheckpointMemento> mementos = new Vector<MultipleCheckpointMemento>();

	/**
	 * ��ǰ����ָ����
	 */
	private int current;

	/**
	 * ���캯����
	 * 
	 * @param originator
	 *          �����˶���
	 */
	public MultipleCheckpointCaretaker(MultipleCheckpointOriginator originator) {

		this.originator = originator;
		this.current = 0;
	}

	/**
	 * �½����㡣
	 * 
	 * @return �½�����ָ����
	 */
	public int createMemento() {

		MultipleCheckpointMemento memento = this.originator.createMemento();
		this.mementos.addElement(memento);
		return current++;
	}

	/**
	 * ��������״̬�ָ���ĳ�����㡣
	 * 
	 * @param index
	 *          ����ָ����
	 */
	public void restoreMemento(int index) {

		MultipleCheckpointMemento memento = this.mementos.elementAt(index);
		this.originator.restoreMemento(memento);
	}

	/**
	 * ɾ��Ŀ����㡣
	 * 
	 * @param index
	 *          ��ɾ��Ŀ�����ļ���ָ����
	 */
	public void removeMemento(int index) {

		this.mementos.removeElementAt(index);
	}
}
