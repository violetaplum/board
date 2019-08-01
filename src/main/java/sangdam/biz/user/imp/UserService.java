package sangdam.biz.user.imp;


import sangdam.biz.user.vo.UserVO;

import java.util.ArrayList;

public interface UserService
{
        public void insertUser(UserVO vo) throws Exception;
        public void updateUser(UserVO vo) throws Exception;
        public void deleteUser(UserVO vo)throws Exception;
        public ArrayList<UserVO> getUserList(UserVO vo) throws Exception;
        public UserVO getUser(UserVO vo)throws Exception;
}


