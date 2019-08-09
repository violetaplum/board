package sangdam.biz.board.dao;

import sangdam.biz.board.imp.BoardService;
import sangdam.biz.board.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("boardService")//boardService : imp안의 UserService interface를 쓰겠다는 뜻
//@Service : @Component Annotation의 구체화.. ---->  해당 클래스가 @Controller/@Service/@Repository 중 하나로 사용됨을 말해준다.
public class BoardServiceImpl implements BoardService {
    @Autowired//di로 객체주입하여~~ 기억하자
    private BoardDAO boardDAO; //이것의 선언이 없으면 bean이 없다고 오류가 만들어질 수 있다. bean객체 안만들고 끌어들인다는 의미
    //UserService interface의 메소드는 child에서 구현한다
    //UserService.java 는 인터페이스 임

    public void insertBoard(BoardVO vo) throws Exception {
        boardDAO.insertBoard(vo);
    }


    public void updateBoard(BoardVO vo) throws Exception {
        boardDAO.updateBoard(vo);
    }


    public void deleteBoard(BoardVO vo) throws Exception {
        boardDAO.deleteBoard(vo);
    }


    public ArrayList<BoardVO> getBoardList(BoardVO vo) throws Exception {
        return boardDAO.getBoardList();
    }




    public BoardVO getBoard(BoardVO vo) throws Exception {
        return boardDAO.getBoard(vo);
    }
}
