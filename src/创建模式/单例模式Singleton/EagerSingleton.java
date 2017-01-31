package 创建模式.单例模式Singleton;

/**
 * 饿汉单例模式。
 * 
 * @author JavaSking 2017年1月13日
 */
public class EagerSingleton {

	/**
	 * 单例，预先完成初始化。
	 */
	private static EagerSingleton instance = new EagerSingleton();

	/**
	 * 私有构造函数。
	 */
	private EagerSingleton() {
		
	}

	/**
	 * 获取单例。
	 * 
	 * @return 单例。
	 */
	public static EagerSingleton getInstance() {

		return instance;
	}
}
