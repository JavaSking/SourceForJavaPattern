package ����ģʽ.����ģʽSingleton;

/**
 * ��������ģʽ��
 * 
 * @author JavaSking 2017��1��13��
 */
public class LazySingleton {

	/**
	 * ������δԤ�ȳ�ʼ����
	 */
	private static LazySingleton intance = null;
	
	/**
	 * ��ǰ����������ڶ��߳�ͬ��������ʹ�ã���
	 */
	private static Object classLock = LazySingleton.class;

	/**
	 * ˽�й��캯����
	 */
	private LazySingleton() {

	}

	/**
	 * ��ȡ������
	 * 
	 * @return ��ȡ������
	 */
	public static synchronized LazySingleton getInstance() {

		if (intance == null) {
			intance = new LazySingleton();
		}
		return intance;
	}
	
	/**
	 * ��ȡ������������2��ʹ�õ�ǰ���������ͬ����
	 * 
	 * @return ��ȡ������
	 */
	public static LazySingleton getInstance2() {

		synchronized (classLock) {
			if (intance == null) {
				intance = new LazySingleton();
			}
		}
		return intance;
	}
}
