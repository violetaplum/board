package sangdam.biz.board.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;
import sangdam.biz.board.vo.BoardVO;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BoardDAOIbatis{
    @Autowired
    private SqlMapClientTemplate ibatis;
    public void insertBoard(BoardVO vo)
    {
        ibatis.insert("insertBoard",vo);
    }
    public void updateBoard(BoardVO vo)
    {
        ibatis.update("updateBoard",vo);
    }
    public void deleteBoard(BoardVO vo)
    {
        ibatis.delete("deleteBoard",vo);
    }
    public Object getBoardList(BoardVO vo)
    {
        return ibatis.queryForObject("getBoardList",vo);
    }
    public Object getBoard(BoardVO vo)
    {
        return ibatis.queryForObject("getBoard",vo);
    }

}
