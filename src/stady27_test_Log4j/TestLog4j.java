package stady27_test_Log4j;

import org.apache.log4j.Logger;
import org.junit.Test;

public class TestLog4j {
	Logger logger = Logger.getLogger(TestLog4j.class);

	@Test
	public void save() {
		try {
			// System.out.println("保存开始");
			logger.info("保存开始");
			int i = 1 / 0;
			logger.debug(i);
			// System.out.println("保存结束");
			logger.info("保存结束");
		} catch (Exception e) {
			logger.error("执行 stady27_test_Log4j 的 save 方法出现异常");
			// System.out.println("执行 stady27_test_Log4j 的 save 方法出现异常");
			e.printStackTrace();
		}
	}

	@Test
	public void testLog() {
		logger.info("信息提示");
		logger.debug("调试信息");
		logger.warn("警告");
		logger.error("异常");
	}
}
