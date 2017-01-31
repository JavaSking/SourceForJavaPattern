package 行为模式.备忘录模式Memento.白箱备忘录模式;

import java.util.Vector;

/**
 * 多重检查点备忘录对象。<br>
 * 可以存储任意多的状态，外面可以使用检查点指数来获取目标检查点的状态。
 * 白箱备忘录模式 + 多检查点备忘录
 * 
 * @author JavaSking 2017年1月14日
 */
public class MultipleCheckpointMemento {

	/**
	 * 状态集。
	 */
	private Vector<State> state;

	/**
	 * 检查点指数。
	 */
	private int index;

	/**
	 * 构造函数。
	 * 
	 * @param state
	 *          状态集。
	 * @param index
	 *          检查点指数。
	 */
	@SuppressWarnings("unchecked")
	public MultipleCheckpointMemento(Vector<State> state, int index) {

		/* 克隆备份，避免客户端和备忘录对象持有对同一个状态集的引用，造成同时修改状态集的错误 */
		this.state = (Vector<State>) state.clone();
		this.index = index;
	}

	/**
	 * 获取状态集。
	 * 
	 * @return 状态集。
	 */
	public Vector<State> getStates() {

		return this.state;
	}

	/**
	 * 获取检查点指数。
	 * 
	 * @return 检查点指数。
	 */
	public int getIndex() {

		return this.index;
	}
}
