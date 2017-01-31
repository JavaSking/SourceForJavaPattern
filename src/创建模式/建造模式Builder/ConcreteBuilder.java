package 创建模式.建造模式Builder;

/**
 * 具体产品建造者角色。
 * 
 * @author JavaSking 2017年1月13日
 */
public class ConcreteBuilder extends Builder {

	/**
	 * 产品角色。
	 */
	private Product product = new Product();

	public void buildPart1() {

		//具体操作
	}

	public void buildPart2() {

		//具体操作
	}

	public Product build() {

		return product;
	}
}
