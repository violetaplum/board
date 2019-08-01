package sangdam.biz.user.vo;

public class UserVO {
    public UserVO(){}
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public UserVO(String id,String pw,String name,String check)
    {
        this.id=id;
        this.pw=pw;
        this.name=name;
        this.check=check;
    }

    private String id;
    private String pw;
    private String name;
    private String check;

}
