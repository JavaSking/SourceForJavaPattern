package ��Ϊģʽ.ģ�巽��ģʽTemplateMethod;

/**
 * ����ģ���ɫ�����嶥���߼���
 * 
 * @author JavaSking 2017��1��13��
 */
public abstract class AbstractTemplate {

	/**
	 * ģ�巽���������˶����߼��Ŀ�ܡ�
	 */
	public void TemplateMethod() {

		doOperation1();

		doOperation2();

		doOperation3();

	}

	/**
	 * �߼���ɲ���1���ӳٵ�����ʵ�֡������󷽷���
	 */
	protected abstract void doOperation1();

	/**
	 * �߼���ɲ���2���Ѿ�ʵ�֣�������������û���ʵ�֡������ӷ�����<br>
	 * ���ӷ��������淶����do��ʼ��������HttpServlet�е�service��������
	 */
	protected void doOperation2() {

		//�շ���
	}

	/**
	 * �߼���ɲ���3���Ѿ�ʵ�֣�Ϊͨ���߼����裬���಻�ܽ����û��������巽����
	 */
	private final void doOperation3() {

		//����ʵ��
	}
}
