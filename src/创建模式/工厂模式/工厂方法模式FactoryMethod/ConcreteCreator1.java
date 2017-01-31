package 创建模式.工厂模式.工厂方法模式FactoryMethod;

/**
 * 具体工厂角色1。
 * 
 * @author JavaSking
 * 2017年1月13日
 */
public class ConcreteCreator1 implements Creator{
	
	public Product factory() {
		
		return new ConcreteProduct1();
	}

}
