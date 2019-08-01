package sangdam.biz.board.imp;
import sangdam.biz.board.vo.BoardVO;

import java.util.ArrayList;

public interface BoardService
{
        public void insertBoard(BoardVO vo) throws Exception;
        public void updateBoard(BoardVO vo) throws Exception;
        public void deleteBoard(BoardVO vo)throws Exception;
        public ArrayList<BoardVO> getBoardList(BoardVO vo) throws Exception;
        public BoardVO getBoard(BoardVO vo)throws Exception;

}


