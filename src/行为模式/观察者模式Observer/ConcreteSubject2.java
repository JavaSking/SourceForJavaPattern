package 行为模式.观察者模式Observer;

/**
 * 具体主题角色（具体被观察对象）实现方案2。<br>
 * 
 * @author JavaSking 2017年1月13日
 */
public class ConcreteSubject2 extends Subject2{
	
	/**
	 * 状态。
	 */
	@SuppressWarnings("unused")
	private String state;

	/**
	 * 设置状态。
	 * 
	 * @param newState 新状态。
	 */
	public void change(String newState) {
		
		this.state = newState;
		this.notifyObservers();
	}
}
