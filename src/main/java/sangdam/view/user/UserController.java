package sangdam.view.user;

import sangdam.biz.user.dao.UserDAO;
import sangdam.biz.user.vo.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @RequestMapping(value="/login.do",method= RequestMethod.GET)
    public String ildanKajaLogin()
    {
        return "login.html";
    }



    @RequestMapping(value="/login.do",method= RequestMethod.POST)
    public String loginUser(UserVO vo, UserDAO userDAO, HttpSession session) throws Exception
    {
        UserVO user = userDAO.getUser(vo);
        if(user!=null) //해당 유저가 있는지 없는지 찾는것 // 이때부터 상담 게시판을 사용할 수 있게됨
        {
            session.setAttribute("user",user);
            return "getBoardList.do"; //등록된 유저일때 상담 게시판으로 보내는것

        }
        else{
            return "login.html";//등록된 유저가 아니면 회원가입을 안내함
        }
    }
    @RequestMapping(value="/insertUser.do",method= RequestMethod.POST)
    public String insertUser(UserVO vo,UserDAO userDAO,HttpSession session) throws Exception
    {
        UserVO user = userDAO.getUser(vo);
        UserVO newu = new UserVO(vo.getId(),vo.getPw(),vo.getName(),"g");

        if(user==null)
        {

            userDAO.insertUser(newu);
            session.setAttribute("user",newu);
            return "login.html";
        }
        else{
            return "board.jsp";
        }

    }

    @RequestMapping(value="/logout.do")
    public String logoutUser(HttpSession session) throws Exception
    {
        session.invalidate();
        //session.invalidate() : 세션을 다 없애버린다. 따라서 나가버릴 수 밖에 없다.
        return "index.html";
    }


}
