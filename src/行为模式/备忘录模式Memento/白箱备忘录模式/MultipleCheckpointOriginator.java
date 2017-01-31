package 行为模式.备忘录模式Memento.白箱备忘录模式;

import java.util.Vector;

/**
 * 发起人对象。<br>
 * 白箱备忘录模式 + 多检查点备忘录
 * 
 * @author JavaSking 2017年1月14日
 */
public class MultipleCheckpointOriginator {

	/**
	 * 内部状态集。
	 */
	private Vector<State> state;

	/**
	 * 检查点指数。
	 */
	private int index;

	/**
	 * 默认构造函数。
	 */
	public MultipleCheckpointOriginator() {

		state = new Vector<State>();
		index = 0;
	}

	/**
	 * 创建一个多重检查点备忘录对象存储内部状态。
	 * 
	 * @return 存储内部状态的多重检查点备忘录对象。
	 */
	public MultipleCheckpointMemento createMemento() {

		return new MultipleCheckpointMemento(state, index);
	}

	/**
	 * 将当前发起人恢复到备忘录所记载的状态。
	 * 
	 * @param memento
	 *          备忘录对象。
	 */
	public void restoreMemento(MultipleCheckpointMemento memento) {

		this.state = memento.getStates();
		this.index = memento.getIndex();
	}

	/**
	 * 设置状态。
	 * 
	 * @param state
	 *          待设置的状态。
	 */
	public void setState(State state) {

		this.state.add(state);
		this.index++;
	}
}
