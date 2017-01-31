package 行为模式.备忘录模式Memento.白箱备忘录模式;

import java.util.Vector;
/**
 * 负责人对象。<br>
 * 白箱备忘录模式 + 多检查点备忘录
 * 
 * @author JavaSking
 * 2017年1月14日
 */
public class MultipleCheckpointCaretaker {

	/**
	 * 发起人对象。
	 */
	private MultipleCheckpointOriginator originator;

	/**
	 * 保存的多重检查点备忘录。
	 */
	private Vector<MultipleCheckpointMemento> mementos = new Vector<MultipleCheckpointMemento>();

	/**
	 * 当前检查点指数。
	 */
	private int current;

	/**
	 * 构造函数。
	 * 
	 * @param originator
	 *          发起人对象。
	 */
	public MultipleCheckpointCaretaker(MultipleCheckpointOriginator originator) {

		this.originator = originator;
		this.current = 0;
	}

	/**
	 * 新建检查点。
	 * 
	 * @return 新建检查点指数。
	 */
	public int createMemento() {

		MultipleCheckpointMemento memento = this.originator.createMemento();
		this.mementos.addElement(memento);
		return current++;
	}

	/**
	 * 将发起人状态恢复到某个检查点。
	 * 
	 * @param index
	 *          检查点指数。
	 */
	public void restoreMemento(int index) {

		MultipleCheckpointMemento memento = this.mementos.elementAt(index);
		this.originator.restoreMemento(memento);
	}

	/**
	 * 删除目标检查点。
	 * 
	 * @param index
	 *          待删除目标检查点的检查点指数。
	 */
	public void removeMemento(int index) {

		this.mementos.removeElementAt(index);
	}
}
