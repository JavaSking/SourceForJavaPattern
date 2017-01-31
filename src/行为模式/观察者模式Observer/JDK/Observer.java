package 行为模式.观察者模式Observer.JDK;

/**
 * 观察者接口。{@link java.util.Observer}
 * 
 * @author JavaSking 2017年1月13日
 */
public interface Observer {

	/**
	 * 更新方法。
	 * 
	 * @param o
	 *          被观察者对象。
	 * 
	 * @param arg
	 *          其他参数。
	 */
	void update(Observable o, Object arg);
}
