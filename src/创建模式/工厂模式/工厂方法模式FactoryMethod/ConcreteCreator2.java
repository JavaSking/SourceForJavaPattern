package ����ģʽ.����ģʽ.��������ģʽFactoryMethod;

/**
 * ���幤����ɫ2��
 * 
 * @author JavaSking
 * 2017��1��13��
 */
public class ConcreteCreator2 implements Creator{

	public Product factory() {
		
		return new ConcreteProduct2();
	}
}
