package ��Ϊģʽ.״̬ģʽState;

/**
 * ��ΪģʽState��������ɫ��<br>
 * ����һ��״̬��ʵ����ʾ������ǰ����״̬���û�����ɫ�����Ե�״̬��״̬������Ϊ��
 * 
 * @author JavaSking 2017��1��14��
 */
public class Context {

	/**
	 * ��ǰ������ɫ������״̬��ί�ɣ���
	 */
	private State state;

	/**
	 * ��ǰ����״̬����Ӧ����Ϊ��
	 */
	public void operation() {

		this.state.operation();
	}

	/**
	 * ���õ�ǰ״̬��
	 * 
	 * @param state
	 *          �����õ�״̬��
	 */
	public void setState(State state) {

		this.state = state;
	}
}
