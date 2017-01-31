package 结构模式.适配器模式Adapter.对象适配器;

/**
 * 新的适配类，继承所需的类，并利用现有类的实例对象，通过委派将现有类适配为符合客户端的需要。
 * 
 * @author JavaSking
 * 2017年1月11日
 */
public class AdapterClass extends RequiredClass{
	
	/**
	 * 委派给提供所需服务的现有类的实例对象。
	 */
	private ExistingClass exist;
	
	/**
	 * 构造函数。
	 * 
	 * @param exist 提供所需服务的现有类的实例对象。
	 */
	public AdapterClass(ExistingClass exist) {
		
		this.exist = exist;
	}
	
	public void requiredMethod() {
		
		exist.usefulMethod();
	}
}
