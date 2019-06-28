package com.qdhuafens.web.service.impl;

import com.qdhuafens.web.dao.DepartDao;
import com.qdhuafens.web.entity.Depart;
import com.qdhuafens.web.service.DepartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: Huafens
 * @description: 部门服务层
 * @author: 张清
 * @create: 2019-06-24 08:55
 **/
@Service
public class DepartServiceImpl implements DepartService {

    @Resource
    private DepartDao departDao;

    public void setDepartDao(DepartDao departDao) {
        this.departDao = departDao;
    }

    /**
     * 查询所有的部门
     * */
    public List<Depart> querryAllDepart(){
        return departDao.qerryDepart();
    }

    /**
     * 查询部门根据信息
     * */
    public List<Depart> qurryByDepart(Depart depart){
        return departDao.qerryByDepart(depart);
    }

    /**
     * 根据id号查询部门信息
     * */
    public Depart qurryById(Integer id) {
        return departDao.querryById(id);
    }

    /**
     * 添加部门
     * */
    public Integer addDepart(Depart depart){
        return departDao.addDepart(depart);
    }

    /**
     * 删除部门
     * */
    public Integer deleteDepart(Integer id){
        System.out.println("Service delete");
        return departDao.delteDepart(id);
    }

    /**
     * 修改部门
     * */
    public Integer updateDepart(Depart depart){
        return departDao.updataDepart(depart);
    }
}
