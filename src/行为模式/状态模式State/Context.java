package 行为模式.状态模式State;

/**
 * 行为模式State：环境角色。<br>
 * 持有一个状态类实例表示环境当前所处状态，该环境角色有明显的状态和状态过渡行为。
 * 
 * @author JavaSking 2017年1月14日
 */
public class Context {

	/**
	 * 当前环境角色所处的状态（委派）。
	 */
	private State state;

	/**
	 * 当前环境状态所对应的行为。
	 */
	public void operation() {

		this.state.operation();
	}

	/**
	 * 设置当前状态。
	 * 
	 * @param state
	 *          待设置的状态。
	 */
	public void setState(State state) {

		this.state = state;
	}
}
