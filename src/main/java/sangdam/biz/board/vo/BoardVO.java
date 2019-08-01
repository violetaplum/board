package sangdam.biz.board.vo;

import java.sql.Date;

public class BoardVO {
    public BoardVO(){}
    public BoardVO(String title,String writer,String content,Date d, int searchcnt,int seqno)
    {
        this.title=title;
        this.writer=writer;
        this.content=content;
        this.writedate=d;
        this.searchcnt=searchcnt;
        this.seqno=seqno;
    }

    public int getSeqno() {
        return seqno;
    }

    public void setSeqno(int seqno) {
        this.seqno = seqno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getWritedate() {
        return writedate;
    }

    public void setWritedate(Date writedate) {
        this.writedate = writedate;
    }

    public int getSearchcnt() {
        return searchcnt;
    }

    public void setSearchcnt(int searchcnt) {
        this.searchcnt = searchcnt;
    }

    private int seqno;
    private String title;
    private String writer;
    private String content;
    private Date writedate;
    private int searchcnt;







}
