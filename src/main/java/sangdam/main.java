package sangdam;


import sangdam.biz.user.dao.UserDAO;
import sangdam.biz.user.vo.UserVO;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws Exception
    {
        UserVO vo = new UserVO("1","1234","JangHeeSoo","a");
        UserDAO dao = new UserDAO();
        dao.insertUser(vo);
        ArrayList<UserVO> al= dao.getUserList(vo);
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i));
            System.out.println();
        }
       /*

       user table##

        id pw name check(a!dmin/g!eneral값만 들어가서 구분하도록)

        create table users(id varchar2(30), pw varchar2(30), name varchar2(30), checker varchar2(2));
        */


    }
}
