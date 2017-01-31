package 创建模式.建造模式Builder;

/**
 * 抽象建造者。
 * 
 * @author JavaSking
 * 2017年1月13日
 */
public abstract class Builder {
	
	/**
	 * 创建产品零件1。
	 */
	public abstract void buildPart1();

	/**
	 * 创建产品零件2。
	 */
	public abstract void buildPart2();
	
	/**
	 * 创建产品。
	 * 
	 * @return 产品。
	 */
	public abstract Product build();

}
