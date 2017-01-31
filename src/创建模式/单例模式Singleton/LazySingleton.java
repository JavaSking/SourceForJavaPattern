package 创建模式.单例模式Singleton;

/**
 * 懒汉单例模式。
 * 
 * @author JavaSking 2017年1月13日
 */
public class LazySingleton {

	/**
	 * 单例，未预先初始化。
	 */
	private static LazySingleton intance = null;
	
	/**
	 * 当前类的锁，用于多线程同步（建议使用）。
	 */
	private static Object classLock = LazySingleton.class;

	/**
	 * 私有构造函数。
	 */
	private LazySingleton() {

	}

	/**
	 * 获取单例。
	 * 
	 * @return 获取单例。
	 */
	public static synchronized LazySingleton getInstance() {

		if (intance == null) {
			intance = new LazySingleton();
		}
		return intance;
	}
	
	/**
	 * 获取单例。（方法2：使用当前类的锁进行同步）
	 * 
	 * @return 获取单例。
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
