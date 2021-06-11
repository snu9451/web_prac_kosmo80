package web.mvc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;

import com.vo.BoardMVO;

public class Board41MDao {
	Logger logger = Logger.getLogger(Board41MDao.class);
	
	private SqlSessionTemplate sqlSessionTemplate = null;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
//	public BoardMVO getBoardList() {
	public List<Map<String, Object>> getBoardList(Map<String, Object> pmap) {
		
		logger.info("getBoardList 호출 성공");
		logger.info("sqlSessionTemplate ===> "+sqlSessionTemplate);
		logger.info(sqlSessionTemplate.selectOne("time"));
		
		List<Map<String, Object>> boardList = null;
		boardList = sqlSessionTemplate.selectList("getBoardList", pmap);
		
		return boardList;
//		return bmVO;
	}

	public int boardMInsert(Map<String, Object> pmap) {
		int result = 0;
		// MN: insert 후 곧바로 (정수 타입의) 결과를 반환받음
		logger.info("#########################"+pmap);
		result = sqlSessionTemplate.insert("boardInsert", pmap);
		return result;
	}
}
