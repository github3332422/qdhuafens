package com.qdhuafens.web.dao;

import com.qdhuafens.web.entity.Depart;

import java.util.List;

public interface DepartDao {

    /**
     * 查询所有的部门
     * @return Department list
     * */
    public List<Depart> qerryDepart();

    /**
     * 根据部门id号查询部门信息
     * @param id
     * @return Depart
     * */
    public Depart querryById(Integer id);

    /**
     * 根据多个信息查询信息
     * @param Depart
     * @return Department List
     * */
    public List<Depart> qerryByDepart(Depart depart);

    /**
     * 添加部门
     * @param  Depart
     * @return Number of affected items in the database
     * */
    public Integer addDepart(Depart depart);

    /**
     * 删除部门
     * @param id
     * @return Number of affected items in the database
     * */
    public Integer delteDepart(Integer id);

    /**
     * 修改部门
     * @param Depart
     * @return Number of affected items in the database
     * */
    public Integer updataDepart(Depart depart);
}
