package ��Ϊģʽ.����¼ģʽMemento.���䱸��¼ģʽ;

/**
 * ����¼��ɫ�������洢�������ڲ�״̬�Ŀ��յĶ��󣩡�<br>
 * ���䱸��¼ģʽ + �����㱸��¼
 * 
 * @author JavaSking 2017��1��14��
 */
public class SingleCheckPointMemento {

	/**
	 * ״̬�������㣩��
	 */
	private State state;

	/**
	 * ���캯����
	 * 
	 * @param state
	 *          �����õ�״̬��
	 */
	public SingleCheckPointMemento(State state) {

		this.state = state;
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
