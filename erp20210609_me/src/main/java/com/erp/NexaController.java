package com.erp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

// 넥사크로를 사용하는 경우임.
public class NexaController implements Controller {

	String requestName = null;
	Logger logger = Logger.getLogger(NexaController.class);
	
	public NexaController(String requestName) {
		logger.info("NexaController 생성 성공");
		this.requestName=requestName;
	}
	
	@Override
	public ModelAndView process(String cud, HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException
	{
		return null;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException
	{
//		if("empXML".equals(requestName)) {
//			logger.info("emp조회 결과를 xml포맷으로 내보내기");
//		}
		return null;
	}

}
