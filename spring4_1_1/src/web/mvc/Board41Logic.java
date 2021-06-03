package web.mvc;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class Board41Logic {

	Logger logger = Logger.getLogger(Board41Logic.class);
	private Board41MDao bmDao = null;
	private Board41SDao bsDao = null;
	
	public List<Map<String, Object>> getBoardList(Map<String, Object> pmap) {
		logger.info("getBoardList 호출 성공");
		List<Map<String, Object>> boardList = null;
		boardList = bmDao.getBoardList(pmap);
		return boardList;
	}

	public void setBmDao(Board41MDao bmDao) {
		this.bmDao = bmDao;
	}

	public void setBsDao(Board41SDao bsDao) {
		this.bsDao = bsDao;
	}
	
}
