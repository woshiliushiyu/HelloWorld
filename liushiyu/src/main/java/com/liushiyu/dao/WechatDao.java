package com.liushiyu.dao;

public class WechatDao {
    private Integer id;

    private String content;

    private String resname;

    private String restype;

    private String resdesc;

    private String resimage;

    private String resurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getResname() {
        return resname;
    }

    public void setResname(String resname) {
        this.resname = resname == null ? null : resname.trim();
    }

    public String getRestype() {
        return restype;
    }

    public void setRestype(String restype) {
        this.restype = restype == null ? null : restype.trim();
    }

    public String getResdesc() {
        return resdesc;
    }

    public void setResdesc(String resdesc) {
        this.resdesc = resdesc == null ? null : resdesc.trim();
    }

    public String getResimage() {
        return resimage;
    }

    public void setResimage(String resimage) {
        this.resimage = resimage == null ? null : resimage.trim();
    }

    public String getResurl() {
        return resurl;
    }

    public void setResurl(String resurl) {
        this.resurl = resurl == null ? null : resurl.trim();
    }
}