package ����ģʽ.����ģʽ.���󹤳�ģʽAbstractFactory;

/**
 * ���󹤳���ɫ��
 * 
 * @author JavaSking 2017��1��13��
 */
public interface Creator {

	/**
	 * ������Ʒ��A��Ʒ��
	 * 
	 * @return A��Ʒ��
	 */
	public ProductA factoryA();

	/**
	 * ������Ʒ��B��Ʒ��
	 * 
	 * @return B��Ʒ��
	 */
	public ProductB factoryB();

}
