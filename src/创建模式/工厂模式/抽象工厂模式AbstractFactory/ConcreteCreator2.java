package 创建模式.工厂模式.抽象工厂模式AbstractFactory;

/**
 * 具体工厂角色2。
 * 
 * @author JavaSking 2017年1月13日
 */
public class ConcreteCreator2 implements Creator {

	public ProductA factoryA() {

		return new ProductA2();
	}

	public ProductB factoryB() {

		return new ProductB2();
	}

}
