package sangdam.biz.user.dao;

import sangdam.biz.user.imp.UserService;
import sangdam.biz.user.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;


    public void insertUser(UserVO vo) throws Exception {
        userDAO.insertUser(vo);
    }


    public void updateUser(UserVO vo) throws Exception {
        userDAO.updateUser(vo);
    }


    public void deleteUser(UserVO vo) throws Exception {
        userDAO.deleteUser(vo);
    }


    public ArrayList<UserVO> getUserList(UserVO vo) throws Exception {
        return userDAO.getUserList(vo);
    }


    public UserVO getUser(UserVO vo) throws Exception {
        return userDAO.getUser(vo);
    }
}
