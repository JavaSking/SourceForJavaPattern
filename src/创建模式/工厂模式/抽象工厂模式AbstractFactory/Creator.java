package 创建模式.工厂模式.抽象工厂模式AbstractFactory;

/**
 * 抽象工厂角色。
 * 
 * @author JavaSking 2017年1月13日
 */
public interface Creator {

	/**
	 * 创建产品线A产品。
	 * 
	 * @return A产品。
	 */
	public ProductA factoryA();

	/**
	 * 创建产品线B产品。
	 * 
	 * @return B产品。
	 */
	public ProductB factoryB();

}
