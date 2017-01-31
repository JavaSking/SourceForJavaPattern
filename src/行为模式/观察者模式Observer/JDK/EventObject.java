package 行为模式.观察者模式Observer.JDK;

/**
 * 事件对象。{@link java.util.EventObject}
 * 
 * @author JavaSking 2017年1月13日
 */
public class EventObject implements java.io.Serializable {

	/**
	 * 序列号。
	 */
	private static final long serialVersionUID = 5516075349620653480L;

	/**
	 * 事件源。
	 */
	protected transient Object source;

	/**
	 * 构造函数。
	 *
	 * @param source
	 *          事件源。
	 * @exception IllegalArgumentException
	 *              事件源为空。
	 */
	public EventObject(Object source) {
		if (source == null)
			throw new IllegalArgumentException("null source");

		this.source = source;
	}

	/**
	 * 获取事件源。
	 * 
	 * @return 事件源。
	 */
	public Object getSource() {

		return source;
	}

	public String toString() {

		return getClass().getName() + "[source=" + source + "]";
	}
}
