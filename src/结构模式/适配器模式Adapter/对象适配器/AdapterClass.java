package �ṹģʽ.������ģʽAdapter.����������;

/**
 * �µ������࣬�̳�������࣬�������������ʵ������ͨ��ί�ɽ�����������Ϊ���Ͽͻ��˵���Ҫ��
 * 
 * @author JavaSking
 * 2017��1��11��
 */
public class AdapterClass extends RequiredClass{
	
	/**
	 * ί�ɸ��ṩ���������������ʵ������
	 */
	private ExistingClass exist;
	
	/**
	 * ���캯����
	 * 
	 * @param exist �ṩ���������������ʵ������
	 */
	public AdapterClass(ExistingClass exist) {
		
		this.exist = exist;
	}
	
	public void requiredMethod() {
		
		exist.usefulMethod();
	}
}
