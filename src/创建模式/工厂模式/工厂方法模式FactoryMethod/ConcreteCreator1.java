package ����ģʽ.����ģʽ.��������ģʽFactoryMethod;

/**
 * ���幤����ɫ1��
 * 
 * @author JavaSking
 * 2017��1��13��
 */
public class ConcreteCreator1 implements Creator{
	
	public Product factory() {
		
		return new ConcreteProduct1();
	}

}
