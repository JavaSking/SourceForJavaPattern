package 结构模式.合成模式Composite;

/**
 * 组件接口，为单一对象和组合对象共同实现，保持客户端调用一致性。
 * 
 * @author JavaSking
 * 2017年1月11日
 */
public interface Component {
	
	/**
	 * 一致性方法。
	 */
	public void operation();

}
