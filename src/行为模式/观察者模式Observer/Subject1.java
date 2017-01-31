package 行为模式.观察者模式Observer;

/**
 * 抽象主题角色（抽象被观察角色）实现方案1。<br>
 * 
 * @author JavaSking
 * 2017年1月13日
 */
public interface Subject1 {
	
	/**
	 * 添加目标观察者。
	 * 
	 * @param observer 待添加的目标观察者。
	 */
	public void attach(Observer observer);
	
	/**
	 * 删除目标观察者。
	 * 
	 * @param observer 待删除的目标观察者。
	 */
	public void detach(Observer observer);
	
	/**
	 * 通过登记过的观察者对象。
	 */
	public void notifyObservers();
}
