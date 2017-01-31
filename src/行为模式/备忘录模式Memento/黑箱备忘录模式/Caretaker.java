package 行为模式.备忘录模式Memento.黑箱备忘录模式;

/**
 * 负责人角色（负责保存备忘录对象但不能修改，甚至不能读取）。
 * 
 * @author JavaSking
 * 2017年1月14日
 */
public class Caretaker {
	
	/**
	 * 备忘录对象。
	 */
	private MementoIF memento;

	/**
	 * 获取备忘录对象。
	 * 
	 * @return 备忘录对象。
	 */
	public MementoIF retrieveMemento() {

		return this.memento;
	}

	/**
	 * 保存备忘录。
	 * 
	 * @param memento
	 *          待保存的备忘录对象。
	 */
	public void saveMemento(MementoIF memento) {

		this.memento = memento;
	}
}
