package 行为模式.备忘录模式Memento.白箱备忘录模式;

/**
 * 备忘录角色（用来存储发起人内部状态的快照的对象）。<br>
 * 白箱备忘录模式 + 单检查点备忘录
 * 
 * @author JavaSking 2017年1月14日
 */
public class SingleCheckPointMemento {

	/**
	 * 状态（单检查点）。
	 */
	private State state;

	/**
	 * 构造函数。
	 * 
	 * @param state
	 *          待设置的状态。
	 */
	public SingleCheckPointMemento(State state) {

		this.state = state;
	}

	/**
	 * 获取状态。
	 * 
	 * @return 状态。
	 */
	public State getState() {

		return this.state;
	}

	/**
	 * 设置状态。
	 * 
	 * @param state
	 *          待设置的状态。
	 */
	public void setState(State state) {

		this.state = state;
	}
}
