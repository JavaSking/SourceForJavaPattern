package 创建模式.工厂模式.简单工厂模式SimpleFactory;

/**
 * 工厂类角色。
 * 
 * @author JavaSking
 * 2017年1月13日
 */
public class Creator {
	
	/**
	 * 静态方法，创建产品角色。
	 * 
	 * @return 产品角色。
	 */
	public static Product factory() {
		
		return new ConcreteProduct();
	}

}
