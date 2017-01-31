package ��Ϊģʽ.����¼ģʽMemento.���䱸��¼ģʽ;

import java.util.Vector;

/**
 * �����˶���<br>
 * ���䱸��¼ģʽ + ����㱸��¼
 * 
 * @author JavaSking 2017��1��14��
 */
public class MultipleCheckpointOriginator {

	/**
	 * �ڲ�״̬����
	 */
	private Vector<State> state;

	/**
	 * ����ָ����
	 */
	private int index;

	/**
	 * Ĭ�Ϲ��캯����
	 */
	public MultipleCheckpointOriginator() {

		state = new Vector<State>();
		index = 0;
	}

	/**
	 * ����һ�����ؼ��㱸��¼����洢�ڲ�״̬��
	 * 
	 * @return �洢�ڲ�״̬�Ķ��ؼ��㱸��¼����
	 */
	public MultipleCheckpointMemento createMemento() {

		return new MultipleCheckpointMemento(state, index);
	}

	/**
	 * ����ǰ�����˻ָ�������¼�����ص�״̬��
	 * 
	 * @param memento
	 *          ����¼����
	 */
	public void restoreMemento(MultipleCheckpointMemento memento) {

		this.state = memento.getStates();
		this.index = memento.getIndex();
	}

	/**
	 * ����״̬��
	 * 
	 * @param state
	 *          �����õ�״̬��
	 */
	public void setState(State state) {

		this.state.add(state);
		this.index++;
	}
}
