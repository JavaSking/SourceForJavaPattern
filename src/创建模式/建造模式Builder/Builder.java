package ����ģʽ.����ģʽBuilder;

/**
 * �������ߡ�
 * 
 * @author JavaSking
 * 2017��1��13��
 */
public abstract class Builder {
	
	/**
	 * ������Ʒ���1��
	 */
	public abstract void buildPart1();

	/**
	 * ������Ʒ���2��
	 */
	public abstract void buildPart2();
	
	/**
	 * ������Ʒ��
	 * 
	 * @return ��Ʒ��
	 */
	public abstract Product build();

}
