package sangdam.view.board;


import org.springframework.web.bind.annotation.RequestMethod;
import sangdam.biz.board.imp.BoardService;
import sangdam.biz.board.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;


    @RequestMapping(value="/getBoardList.do")
    public String kajaGetBoardList(BoardVO vo, Model model) throws Exception
    {
        model.addAttribute("boardList",boardService.getBoardList(vo));//상담글 게시 목록 내용을 모두 display해준다.
        //getBoardList.jsp 에 boardList attribute를 전달해준다!! 여기에는 BoardVO가 담겨있다.

        return "getBoardList.jsp";
    }


    @RequestMapping(value="/insertBoard.do")
    public String insertBoard(BoardVO vo) throws Exception
    {
        boardService.insertBoard(vo);
        return "getBoardList.do";
    }



    @RequestMapping(value="/getBoard.do")
    public String getBoard(BoardVO vo, Model model) throws Exception{
        boardService.updateBoard(vo);
        model.addAttribute("board",boardService.getBoard(vo));
       return "getBoard.jsp";

    }

    @RequestMapping(value="/updateBoard.do")
    public String udpateBoard(BoardVO vo, Model model) throws Exception{

        boardService.updateBoard(vo);
        return "getBoardList.do";
    }

    /*@RequestMapping(value="/updateBoard.do")
    public String udpateBoard(BoardVO vo) throws Exception{
        boardService.updateBoard(vo);
        return "getBoardList.jsp";
    }*/

    @RequestMapping(value="/deleteBoard.do")
    public String deleteBoard(BoardVO vo) throws Exception
    {
        boardService.deleteBoard(vo);
        return "getBoardList.do";
    }


/*    @RequestMapping(value="/insertBoard.do",method=RequestMethod.GET)
    public String insertBoard(BoardVO vo, Model model, HttpSession session) throws Exception{
        BoardVO newvo = new BoardVO(vo.getTitle(),vo.getWriter(),vo.getContent(),vo.getWritedate(),vo.getSearchcnt(),vo.getSeqno());
        boardService.insertBoard(newvo);
        return "board.jsp";
    }
    *//*this.title=title;
        this.writer=writer;
        this.content=content;
        this.writedate=d;
        this.searchcnt=searchcnt;
        this.seqno=seqno;*/





}
