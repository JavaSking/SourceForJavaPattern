package ����ģʽ.����ģʽ.���󹤳�ģʽAbstractFactory;

/**
 * ���幤����ɫ1��
 * 
 * @author JavaSking 2017��1��13��
 */
public class ConcreteCreator1 implements Creator {

	public ProductA factoryA() {

		return new ProductA1();
	}

	public ProductB factoryB() {

		return new ProductB1();
	}
}
