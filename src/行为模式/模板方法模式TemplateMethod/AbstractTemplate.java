package 行为模式.模板方法模式TemplateMethod;

/**
 * 抽象模版角色，定义顶级逻辑。
 * 
 * @author JavaSking 2017年1月13日
 */
public abstract class AbstractTemplate {

	/**
	 * 模板方法，给出了顶级逻辑的框架。
	 */
	public void TemplateMethod() {

		doOperation1();

		doOperation2();

		doOperation3();

	}

	/**
	 * 逻辑组成步骤1，延迟到子类实现。（抽象方法）
	 */
	protected abstract void doOperation1();

	/**
	 * 逻辑组成步骤2，已经实现，但是子类可以置换该实现。（钩子方法）<br>
	 * 钩子方法命名规范：以do开始（类似于HttpServlet中的service方法）。
	 */
	protected void doOperation2() {

		//空方法
	}

	/**
	 * 逻辑组成步骤3，已经实现，为通用逻辑步骤，子类不能进行置换。（具体方法）
	 */
	private final void doOperation3() {

		//具体实现
	}
}
