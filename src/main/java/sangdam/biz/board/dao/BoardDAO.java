package sangdam.biz.board.dao;

import sangdam.biz.board.vo.BoardVO;
import sangdam.biz.connect.JDBCConnect;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/*import org.springframework.*;*/

@Repository
public class BoardDAO{
    private Connection conn2;
    private PreparedStatement stmt2;
    private ResultSet rs2;

    public void insertBoard(BoardVO vo) throws Exception{
        conn2= JDBCConnect.getConnection();
        stmt2 = conn2.prepareStatement("insert into board(seqno,title,writer,content)values ((select nvl(max(seqno),0)+1 from board),?,?,?)");
        stmt2.setString(1,vo.getTitle());
        stmt2.setString(2,vo.getWriter());
        stmt2.setString(3,vo.getContent());
        stmt2.executeUpdate();
        JDBCConnect.close(stmt2,conn2);
    }
    public void updateBoard(BoardVO vo) throws Exception{
        conn2 = JDBCConnect.getConnection();
        stmt2=conn2.prepareStatement("update board set content=?, title=? where seqno=?");
        stmt2.setString(1,vo.getContent());
        stmt2.setString(2,vo.getTitle());
        stmt2.setInt(3,vo.getSeqno());
        stmt2.executeUpdate();
        JDBCConnect.close(stmt2,conn2);
    }
    public void deleteBoard(BoardVO vo) throws Exception{ //user입장이므로 현재 삭제는 쓰지 않을수도 있다.
        conn2 = JDBCConnect.getConnection();
        stmt2=conn2.prepareStatement("delete board where seqno=?");
        stmt2.setInt(1,vo.getSeqno());
        stmt2.executeUpdate();
        JDBCConnect.close(stmt2,conn2);
    }
    public ArrayList<BoardVO> getBoardList(BoardVO vo) throws Exception{

        conn2 = JDBCConnect.getConnection();
        stmt2=conn2.prepareStatement("select* from board order by seqno asc");
        rs2=stmt2.executeQuery();
        ArrayList<BoardVO> av = new ArrayList<BoardVO>();
        while(rs2.next())
        {
            vo.setTitle(rs2.getString("title"));
            vo.setContent(rs2.getString("content"));
            vo.setWriter(rs2.getString("writer"));
            vo.setSearchcnt(rs2.getInt("searchcnt"));
            vo.setSeqno(rs2.getInt("seqno"));
            vo.setWritedate(rs2.getDate("writedate"));
            av.add(vo);
        }
        JDBCConnect.close(stmt2,conn2);
        return av;
    }

    public ArrayList<BoardVO> getBoardList() throws Exception{

        conn2 = JDBCConnect.getConnection();
        stmt2=conn2.prepareStatement("select* from board order by seqno asc"); //번호를 내림차순으로 정렬시켜 출력
        rs2=stmt2.executeQuery();
        ArrayList<BoardVO> av = new ArrayList<BoardVO>();

        BoardVO board=null;
        while(rs2.next())
        {
            board = new BoardVO();
            board.setTitle(rs2.getString("title"));
            board.setContent(rs2.getString("content"));
            board.setWriter(rs2.getString("writer"));
            board.setSearchcnt(rs2.getInt("searchcnt"));
            board.setSeqno(rs2.getInt("seqno"));
            board.setWritedate(rs2.getDate("writedate"));
            av.add(board);
        }
        JDBCConnect.close(rs2,stmt2,conn2);
        return av;
    }

    public BoardVO getBoard(BoardVO vo) throws Exception{
        conn2 = JDBCConnect.getConnection();
        stmt2=conn2.prepareStatement("select * from board where seqno=?");
        stmt2.setInt(1,vo.getSeqno());
        rs2=stmt2.executeQuery();
        BoardVO vo2 = null;
        if(rs2.next())
        {
            vo2 = new BoardVO();
            vo2.setTitle(rs2.getString("title"));
            vo2.setContent(rs2.getString("content"));
            vo2.setWriter(rs2.getString("writer"));
            vo2.setSearchcnt(rs2.getInt("searchcnt"));
            vo2.setSeqno(rs2.getInt("seqno"));
            vo2.setWritedate(rs2.getDate("writedate"));
        }
        JDBCConnect.close(rs2,stmt2,conn2);
        return vo;
    }
}
