package ����ģʽ.����ģʽ.�򵥹���ģʽSimpleFactory;

/**
 * �������ɫ��
 * 
 * @author JavaSking
 * 2017��1��13��
 */
public class Creator {
	
	/**
	 * ��̬������������Ʒ��ɫ��
	 * 
	 * @return ��Ʒ��ɫ��
	 */
	public static Product factory() {
		
		return new ConcreteProduct();
	}

}
