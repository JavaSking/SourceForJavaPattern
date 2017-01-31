package 行为模式.状态模式State;

/**
 * 状态模式State：抽象状态角色。<br>
 * 定义接口封装环境对象的一个特定的状态所对应的行为。
 * 
 * @author JavaSking 2017年1月14日
 */
public interface State {

	/**
	 * 封装环境对象的一个特定的状态所对应的行为。
	 */
	public void operation();
}
