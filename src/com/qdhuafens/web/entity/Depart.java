package com.qdhuafens.web.entity;

/**
 * @program: Huafens
 * @description: 部门实体类
 * @author: 张清
 * @create: 2019-06-24 08:35
 **/
public class Depart {
    /**
     * 部门id号
     * */
    private Integer departid;
    /**
     * 部门名字
     * */
    private String departName;
    /**
     * 部门描述
     * */
    private String departFunction;

    public Integer getDepartid() {
        return departid;
    }

    public void setDepartid(Integer departid) {
        this.departid = departid;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getDepartFunction() {
        return departFunction;
    }

    public void setDepartFunction(String departFunction) {
        this.departFunction = departFunction;
    }

    @Override
    public String toString() {
        return "Depart{" +
                "departid=" + departid +
                ", departName='" + departName + '\'' +
                ", departFunction='" + departFunction + '\'' +
                '}';
    }
}
