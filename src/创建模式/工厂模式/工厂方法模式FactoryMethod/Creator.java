package 创建模式.工厂模式.工厂方法模式FactoryMethod;

/**
 * 抽象工厂角色。
 * 
 * @author JavaSking
 * 2017年1月13日
 */
public interface Creator {
	
	/**
	 * 创建产品。
	 * 
	 * @return 产品。
	 */
	public Product factory();

}
