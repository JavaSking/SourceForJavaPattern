package ����ģʽ.����ģʽSingleton;

/**
 * ��������ģʽ��
 * 
 * @author JavaSking 2017��1��13��
 */
public class EagerSingleton {

	/**
	 * ������Ԥ����ɳ�ʼ����
	 */
	private static EagerSingleton instance = new EagerSingleton();

	/**
	 * ˽�й��캯����
	 */
	private EagerSingleton() {
		
	}

	/**
	 * ��ȡ������
	 * 
	 * @return ������
	 */
	public static EagerSingleton getInstance() {

		return instance;
	}
}
