package 创建模式.工厂模式.抽象工厂模式AbstractFactory;

/**
 * 具体工厂角色1。
 * 
 * @author JavaSking 2017年1月13日
 */
public class ConcreteCreator1 implements Creator {

	public ProductA factoryA() {

		return new ProductA1();
	}

	public ProductB factoryB() {

		return new ProductB1();
	}
}
