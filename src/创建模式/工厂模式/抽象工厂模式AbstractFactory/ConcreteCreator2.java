package ����ģʽ.����ģʽ.���󹤳�ģʽAbstractFactory;

/**
 * ���幤����ɫ2��
 * 
 * @author JavaSking 2017��1��13��
 */
public class ConcreteCreator2 implements Creator {

	public ProductA factoryA() {

		return new ProductA2();
	}

	public ProductB factoryB() {

		return new ProductB2();
	}

}
