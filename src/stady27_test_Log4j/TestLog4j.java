package stady27_test_Log4j;

import org.apache.log4j.Logger;
import org.junit.Test;

public class TestLog4j {
	Logger logger = Logger.getLogger(TestLog4j.class);

	@Test
	public void save() {
		try {
			// System.out.println("���濪ʼ");
			logger.info("���濪ʼ");
			int i = 1 / 0;
			logger.debug(i);
			// System.out.println("�������");
			logger.info("�������");
		} catch (Exception e) {
			logger.error("ִ�� stady27_test_Log4j �� save ���������쳣");
			// System.out.println("ִ�� stady27_test_Log4j �� save ���������쳣");
			e.printStackTrace();
		}
	}

	@Test
	public void testLog() {
		logger.info("��Ϣ��ʾ");
		logger.debug("������Ϣ");
		logger.warn("����");
		logger.error("�쳣");
	}
}
