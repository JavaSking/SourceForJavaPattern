package 行为模式.备忘录模式Memento.白箱备忘录模式;

/**
 * 发起人角色（利用一个备忘录对象存储自己的内部状态）。<br>
 * 白箱备忘录模式 + 单检查点备忘录
 * 
 * @author JavaSking 2017年1月14日
 */
public class SingleCheckPointOriginator {

	/**
	 * 内部状态（单检查点）。
	 */
	private State state;

	/**
	 * 创建一个备忘录对象存储内部状态。
	 * 
	 * @return 存储内部状态的备忘录对象。
	 */
	public SingleCheckPointMemento createMemento() {

		return new SingleCheckPointMemento(state);
	}

	/**
	 * 将当前发起人恢复到备忘录所记载的状态。
	 * 
	 * @param memento
	 *          备忘录对象。
	 */
	public void restoreMemento(SingleCheckPointMemento memento) {

		this.state = memento.getState();
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
