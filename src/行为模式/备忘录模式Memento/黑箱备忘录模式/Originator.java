package 行为模式.备忘录模式Memento.黑箱备忘录模式;

/**
 * 发起人角色（利用一个备忘录对象存储自己的内部状态）。<br>
 * 
 * @author JavaSking 2017年1月14日
 */
public class Originator {

	/**
	 * 内部状态。
	 */
	private State state;

	/**
	 * 默认构造函数。
	 */
	public Originator() {

	}

	/**
	 * 创建一个备忘录对象。
	 * 
	 * @return 新建的备忘录对象。
	 */
	public MementoIF createMemento() {

		return new Memento(this.state);
	}

	public void restoreMemento(MementoIF memento) {

		Memento amemento = (Memento) memento;
		this.setState(amemento.getState());
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

	/**
	 * 备忘录窄接口，仅对发起人对象暴露。
	 * 
	 * @author JavaSking 2017年1月14日
	 */
	protected class Memento implements MementoIF {

		/**
		 * 状态。
		 */
		private State state;

		/**
		 * 构造函数。
		 * 
		 * @param state
		 *          待设置的状态。
		 */
		private Memento(State state) {

			this.state = state;
		}

		/**
		 * 设置状态。
		 * 
		 * @param state
		 *          待设置的状态。
		 */
		private void setState(State state) {

			this.state = state;
		}

		/**
		 * 获取状态。
		 * 
		 * @return 状态。
		 */
		private State getState() {

			return this.state;
		}
	}
}
