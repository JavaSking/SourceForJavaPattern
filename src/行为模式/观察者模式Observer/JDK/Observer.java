package ��Ϊģʽ.�۲���ģʽObserver.JDK;

/**
 * �۲��߽ӿڡ�{@link java.util.Observer}
 * 
 * @author JavaSking 2017��1��13��
 */
public interface Observer {

	/**
	 * ���·�����
	 * 
	 * @param o
	 *          ���۲��߶���
	 * 
	 * @param arg
	 *          ����������
	 */
	void update(Observable o, Object arg);
}
