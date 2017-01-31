package 结构模式.适配器模式Adapter.类适配器;

/**
 * 新的适配类，实现了客户端期望的接口，并继承了提供服务的现有类。
 * 
 * @author JavaSking
 * 2017年1月11日
 */
public class AdapterClass extends ExistingClass implements RequiredInterface {

	public void requiredMethod() {

		usefulMethod();//调用现有类的实现所需服务的方法。
	}

}
