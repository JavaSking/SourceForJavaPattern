package ��Ϊģʽ.�۲���ģʽObserver.JDK;

/**
 * �¼�����{@link java.util.EventObject}
 * 
 * @author JavaSking 2017��1��13��
 */
public class EventObject implements java.io.Serializable {

	/**
	 * ���кš�
	 */
	private static final long serialVersionUID = 5516075349620653480L;

	/**
	 * �¼�Դ��
	 */
	protected transient Object source;

	/**
	 * ���캯����
	 *
	 * @param source
	 *          �¼�Դ��
	 * @exception IllegalArgumentException
	 *              �¼�ԴΪ�ա�
	 */
	public EventObject(Object source) {
		if (source == null)
			throw new IllegalArgumentException("null source");

		this.source = source;
	}

	/**
	 * ��ȡ�¼�Դ��
	 * 
	 * @return �¼�Դ��
	 */
	public Object getSource() {

		return source;
	}

	public String toString() {

		return getClass().getName() + "[source=" + source + "]";
	}
}
