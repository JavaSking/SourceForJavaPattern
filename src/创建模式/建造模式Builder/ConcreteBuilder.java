package ����ģʽ.����ģʽBuilder;

/**
 * �����Ʒ�����߽�ɫ��
 * 
 * @author JavaSking 2017��1��13��
 */
public class ConcreteBuilder extends Builder {

	/**
	 * ��Ʒ��ɫ��
	 */
	private Product product = new Product();

	public void buildPart1() {

		//�������
	}

	public void buildPart2() {

		//�������
	}

	public Product build() {

		return product;
	}
}
