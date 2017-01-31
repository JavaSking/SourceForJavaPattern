package ��Ϊģʽ.����¼ģʽMemento.���䱸��¼ģʽ;

/**
 * �����˽�ɫ������һ������¼����洢�Լ����ڲ�״̬����<br>
 * ���䱸��¼ģʽ + �����㱸��¼
 * 
 * @author JavaSking 2017��1��14��
 */
public class SingleCheckPointOriginator {

	/**
	 * �ڲ�״̬�������㣩��
	 */
	private State state;

	/**
	 * ����һ������¼����洢�ڲ�״̬��
	 * 
	 * @return �洢�ڲ�״̬�ı���¼����
	 */
	public SingleCheckPointMemento createMemento() {

		return new SingleCheckPointMemento(state);
	}

	/**
	 * ����ǰ�����˻ָ�������¼�����ص�״̬��
	 * 
	 * @param memento
	 *          ����¼����
	 */
	public void restoreMemento(SingleCheckPointMemento memento) {

		this.state = memento.getState();
	}

	/**
	 * ��ȡ״̬��
	 * 
	 * @return ״̬��
	 */
	public State getState() {

		return this.state;
	}

	/**
	 * ����״̬��
	 * 
	 * @param state
	 *          �����õ�״̬��
	 */
	public void setState(State state) {

		this.state = state;
	}
}
