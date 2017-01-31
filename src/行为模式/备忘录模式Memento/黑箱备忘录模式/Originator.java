package ��Ϊģʽ.����¼ģʽMemento.���䱸��¼ģʽ;

/**
 * �����˽�ɫ������һ������¼����洢�Լ����ڲ�״̬����<br>
 * 
 * @author JavaSking 2017��1��14��
 */
public class Originator {

	/**
	 * �ڲ�״̬��
	 */
	private State state;

	/**
	 * Ĭ�Ϲ��캯����
	 */
	public Originator() {

	}

	/**
	 * ����һ������¼����
	 * 
	 * @return �½��ı���¼����
	 */
	public MementoIF createMemento() {

		return new Memento(this.state);
	}

	public void restoreMemento(MementoIF memento) {

		Memento amemento = (Memento) memento;
		this.setState(amemento.getState());
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

	/**
	 * ����¼խ�ӿڣ����Է����˶���¶��
	 * 
	 * @author JavaSking 2017��1��14��
	 */
	protected class Memento implements MementoIF {

		/**
		 * ״̬��
		 */
		private State state;

		/**
		 * ���캯����
		 * 
		 * @param state
		 *          �����õ�״̬��
		 */
		private Memento(State state) {

			this.state = state;
		}

		/**
		 * ����״̬��
		 * 
		 * @param state
		 *          �����õ�״̬��
		 */
		private void setState(State state) {

			this.state = state;
		}

		/**
		 * ��ȡ״̬��
		 * 
		 * @return ״̬��
		 */
		private State getState() {

			return this.state;
		}
	}
}
