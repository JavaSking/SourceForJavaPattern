package ��Ϊģʽ.�۲���ģʽObserver;

/**
 * ���������ɫ�����󱻹۲��ɫ��ʵ�ַ���1��<br>
 * 
 * @author JavaSking
 * 2017��1��13��
 */
public interface Subject1 {
	
	/**
	 * ���Ŀ��۲��ߡ�
	 * 
	 * @param observer ����ӵ�Ŀ��۲��ߡ�
	 */
	public void attach(Observer observer);
	
	/**
	 * ɾ��Ŀ��۲��ߡ�
	 * 
	 * @param observer ��ɾ����Ŀ��۲��ߡ�
	 */
	public void detach(Observer observer);
	
	/**
	 * ͨ���Ǽǹ��Ĺ۲��߶���
	 */
	public void notifyObservers();
}
