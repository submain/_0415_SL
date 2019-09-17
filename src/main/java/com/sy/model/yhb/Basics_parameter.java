package com.sy.model.yhb;

public class Basics_parameter {
    private Integer id;
    private String code;
    private String basicsname;
    private String valued;
    private String description;
    private String dr;
    private Integer starNum;

    public Integer getStarNum() {
        return starNum;
    }

    public void setStarNum(Integer starNum) {
        this.starNum = starNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    private Integer pageSize;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBasicsname() {
        return basicsname;
    }

    public void setBasicsname(String basicsname) {
        this.basicsname = basicsname;
    }

    public String getValued() {
        return valued;
    }

    public void setValued(String valued) {
        this.valued = valued;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDr() {
        return dr;
    }

    public void setDr(String dr) {
        this.dr = dr;
    }
}
