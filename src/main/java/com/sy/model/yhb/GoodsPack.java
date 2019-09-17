package com.sy.model.yhb;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class GoodsPack {
    private Integer id;
    private String goodsPackName;
    private String goodsPackCode;
    private Integer typeId;
    private String typeName;
    private Integer totalPrice;
    private Integer state;
    private String note;
    private Integer num;
    private String createdBy;
    private Date createTime;
    @JsonFormat(pattern ="yyyy-MM-dd ")
    private Date lastUpdateTime;
    private Integer starNum;
    private Integer pageSize;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsPackName() {
        return goodsPackName;
    }

    public void setGoodsPackName(String goodsPackName) {
        this.goodsPackName = goodsPackName;
    }

    public String getGoodsPackCode() {
        return goodsPackCode;
    }

    public void setGoodsPackCode(String goodsPackCode) {
        this.goodsPackCode = goodsPackCode;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
