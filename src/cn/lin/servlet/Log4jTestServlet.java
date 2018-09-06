package cn.lin.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@WebServlet("/Log4jTestServlet")
public class Log4jTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Logger log = Logger.getLogger(Log4jTestServlet.class);

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			log.info("进入Log4jTestServlet");
			int i = 0;
			log.debug(i);
			i = 1 / 0;
			log.info("结束Log4jTestServlet");
		} catch (Exception e) {
			log.error("数学异常", e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
