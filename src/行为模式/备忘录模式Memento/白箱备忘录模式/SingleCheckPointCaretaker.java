package ��Ϊģʽ.����¼ģʽMemento.���䱸��¼ģʽ;

/**
 * �����˽�ɫ�����𱣴汸��¼���󵫲����޸ģ��������ܶ�ȡ����<br>
 * ���䱸��¼ģʽ + �����㱸��¼
 * 
 * @author JavaSking 2017��1��14��
 */
public class SingleCheckPointCaretaker {

	/**
	 * ����ı���¼��ɫ��
	 */
	private SingleCheckPointMemento memento;

	/**
	 * ��ȡ����¼����
	 * 
	 * @return ����¼����
	 */
	public SingleCheckPointMemento retrieveMemento() {

		return this.memento;
	}

	/**
	 * ���汸��¼��
	 * 
	 * @param memento
	 *          ������ı���¼����
	 */
	public void saveMemento(SingleCheckPointMemento memento) {

		this.memento = memento;
	}
}
