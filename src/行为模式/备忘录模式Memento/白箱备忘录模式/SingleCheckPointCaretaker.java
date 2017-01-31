package 行为模式.备忘录模式Memento.白箱备忘录模式;

/**
 * 负责人角色（负责保存备忘录对象但不能修改，甚至不能读取）。<br>
 * 白箱备忘录模式 + 单检查点备忘录
 * 
 * @author JavaSking 2017年1月14日
 */
public class SingleCheckPointCaretaker {

	/**
	 * 保存的备忘录角色。
	 */
	private SingleCheckPointMemento memento;

	/**
	 * 获取备忘录对象。
	 * 
	 * @return 备忘录对象。
	 */
	public SingleCheckPointMemento retrieveMemento() {

		return this.memento;
	}

	/**
	 * 保存备忘录。
	 * 
	 * @param memento
	 *          待保存的备忘录对象。
	 */
	public void saveMemento(SingleCheckPointMemento memento) {

		this.memento = memento;
	}
}
