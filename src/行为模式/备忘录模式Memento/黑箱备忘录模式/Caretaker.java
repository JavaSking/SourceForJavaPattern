package ��Ϊģʽ.����¼ģʽMemento.���䱸��¼ģʽ;

/**
 * �����˽�ɫ�����𱣴汸��¼���󵫲����޸ģ��������ܶ�ȡ����
 * 
 * @author JavaSking
 * 2017��1��14��
 */
public class Caretaker {
	
	/**
	 * ����¼����
	 */
	private MementoIF memento;

	/**
	 * ��ȡ����¼����
	 * 
	 * @return ����¼����
	 */
	public MementoIF retrieveMemento() {

		return this.memento;
	}

	/**
	 * ���汸��¼��
	 * 
	 * @param memento
	 *          ������ı���¼����
	 */
	public void saveMemento(MementoIF memento) {

		this.memento = memento;
	}
}
