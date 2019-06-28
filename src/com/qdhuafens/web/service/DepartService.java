package com.qdhuafens.web.service;

import com.qdhuafens.web.entity.Depart;

import java.util.List;

public interface DepartService {
    /**
     * 查询所有的部门
     * */
    public List<Depart> querryAllDepart();

    /**
     * 查询部门根据信息
     * */
    public List<Depart> qurryByDepart(Depart depart);

    /**
     * 根据id号查询部门信息
     * */
    public Depart qurryById(Integer id);

    /**
     * 添加部门
     * */
    public Integer addDepart(Depart depart);

    /**
     * 删除部门
     * */
    public Integer deleteDepart(Integer id);

    /**
     * 修改部门
     * */
    public Integer updateDepart(Depart depart);
}
