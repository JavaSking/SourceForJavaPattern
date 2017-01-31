package ��Ϊģʽ.����¼ģʽMemento.���䱸��¼ģʽ;

import java.util.Vector;

/**
 * ���ؼ��㱸��¼����<br>
 * ���Դ洢������״̬���������ʹ�ü���ָ������ȡĿ������״̬��
 * ���䱸��¼ģʽ + ����㱸��¼
 * 
 * @author JavaSking 2017��1��14��
 */
public class MultipleCheckpointMemento {

	/**
	 * ״̬����
	 */
	private Vector<State> state;

	/**
	 * ����ָ����
	 */
	private int index;

	/**
	 * ���캯����
	 * 
	 * @param state
	 *          ״̬����
	 * @param index
	 *          ����ָ����
	 */
	@SuppressWarnings("unchecked")
	public MultipleCheckpointMemento(Vector<State> state, int index) {

		/* ��¡���ݣ�����ͻ��˺ͱ���¼������ж�ͬһ��״̬�������ã����ͬʱ�޸�״̬���Ĵ��� */
		this.state = (Vector<State>) state.clone();
		this.index = index;
	}

	/**
	 * ��ȡ״̬����
	 * 
	 * @return ״̬����
	 */
	public Vector<State> getStates() {

		return this.state;
	}

	/**
	 * ��ȡ����ָ����
	 * 
	 * @return ����ָ����
	 */
	public int getIndex() {

		return this.index;
	}
}
