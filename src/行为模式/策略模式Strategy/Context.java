package 行为模式.策略模式Strategy;

/**
 * 环境角色，持有一个Strategy类的引用。
 * 
 * @author JavaSking
 * 2017年1月13日
 */
public class Context {

	private Strategy strategy;
	
	/**
	 * 策略方法。
	 */
	public void contextInterface() {
		
		strategy.strategyInterface();
	}
}
