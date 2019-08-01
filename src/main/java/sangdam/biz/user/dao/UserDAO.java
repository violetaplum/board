package sangdam.biz.user.dao;

import sangdam.biz.connect.JDBCConnect;
import sangdam.biz.user.imp.UserService;
import sangdam.biz.user.vo.UserVO;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

@Repository
public class UserDAO implements UserService{
    private Connection conn2;
    private PreparedStatement stmt2;
    private ResultSet rs2;

    public void insertUser(UserVO vo) throws Exception{
        conn2 = JDBCConnect.getConnection();
        //stmt2 = conn2.prepareStatement("insert into user(id,pw,name,checker) values((select nvl(max(id),0)+1 from user),?,?,?,?)");
        stmt2 = conn2.prepareStatement("insert into users values(?,?,?,?)");
        stmt2.setString(1,vo.getId());
        stmt2.setString(2,vo.getPw());
        stmt2.setString(3,vo.getName());
        stmt2.setString(4,vo.getCheck());
        stmt2.executeUpdate();
        JDBCConnect.close(stmt2,conn2);
    }

    public void updateUser(UserVO vo) throws Exception{
        conn2 = JDBCConnect.getConnection();
        stmt2=conn2.prepareStatement("update users set name=?,checker=? where id=?");
        stmt2.setString(1,vo.getName());
        stmt2.setString(2,vo.getCheck());
        stmt2.setString(3,vo.getId());
        stmt2.executeUpdate();
        JDBCConnect.close(stmt2,conn2);
    }
    public void deleteUser(UserVO vo) throws Exception{ //user입장이므로 현재 삭제는 쓰지 않을수도 있다.
        conn2 = JDBCConnect.getConnection();
        stmt2=conn2.prepareStatement("delete users where id=?");
        stmt2.setString(1,vo.getId());
        stmt2.executeUpdate();
        JDBCConnect.close(stmt2,conn2);
    }
    public ArrayList<UserVO> getUserList(UserVO vo) throws Exception{

        conn2 = JDBCConnect.getConnection();
        UserVO vo2=new UserVO();
        stmt2=conn2.prepareStatement("select* from users");
        rs2=stmt2.executeQuery();
        ArrayList<UserVO> av = new ArrayList<UserVO>();
        while(rs2.next())
        {
            vo2.setId(rs2.getString("id"));
            vo2.setPw(rs2.getString("pw"));
            vo2.setName(rs2.getString("name"));
            vo2.setCheck(rs2.getString("checker"));

            av.add(vo2);
        }
        JDBCConnect.close(stmt2,conn2);
        return av;
    }

    public ArrayList<UserVO> getUserList() throws Exception{

        conn2 = JDBCConnect.getConnection();
        stmt2=conn2.prepareStatement("select* from users order by id desc"); //번호를 내림차순으로 정렬시켜 출력
        rs2=stmt2.executeQuery();
        ArrayList<UserVO> av = new ArrayList<UserVO>();
        UserVO vo = new UserVO();
        while(rs2.next())
        {
            vo.setId(rs2.getString("id"));
            vo.setPw(rs2.getString("pw"));
            vo.setName(rs2.getString("name"));
            vo.setCheck(rs2.getString("checker"));

            av.add(vo);
        }
        JDBCConnect.close(rs2,stmt2,conn2);
        return av;
    }

    public UserVO getUser(UserVO vo) throws Exception{
        conn2 = JDBCConnect.getConnection();
        UserVO vo2 = null;
        stmt2=conn2.prepareStatement("select * from users where id=? and pw=?");
        stmt2.setString(1,vo.getId());
        stmt2.setString(2,vo.getPw());
        rs2=stmt2.executeQuery();
        if(rs2.next())
        {
            vo2=new UserVO();
            vo2.setId(rs2.getString("id"));
            vo2.setPw(rs2.getString("pw"));
            vo2.setName(rs2.getString("name"));
            vo2.setCheck(rs2.getString("checker"));

        }
        JDBCConnect.close(rs2,stmt2,conn2);
        return vo2;
    }
}
