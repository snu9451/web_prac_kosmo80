package web.mvc;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

// deprecated: 향후에 지원하지 않겠다.
public class Board41Controller extends MultiActionController {
//	<bean id="board-controller">
//		<property name="setter의 이름인 boardLogic">
	// 직접 인스턴스화 하지 않고 Spring의 지원을 받을 것이므로 null로 둔다.
	// setter 객체 주입법으로 주입받을 수 있다. (게으른 객체주입)
	private Board41Logic boardLogic = null;
	Logger logger = Logger.getLogger(Board41Controller.class);
	
	public ModelAndView getBoardList() {
		
		logger.info("getBoardList 호출 성공");
		return mav;
	}

	public void setBoardLogic(Board41Logic boardLogic) {
		this.boardLogic = boardLogic;
	}
}
