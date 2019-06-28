package com.qdhuafens.web.dao;

import com.qdhuafens.web.entity.Notice;

import java.util.List;

public interface NoticDao {

    /**
     * 查询所有的通知
     * @return Notic List
     * */
    public List<Notice> qerryNotice();

    /**
     * 根据多个参数进行查询
     * @param Notic
     * @return Notic List
     * */
    public List<Notice> qerryByNotic(Notice notice);

    /**
     * 添加通知
     * @param  Notic
     * @return Number of affected notifications in the database
     * */
    public Integer addNotice(Notice notice);

    /**
     * 修改通知
     * @param Notic
     * @return Number of affected notifications in the database
     * */
    public Integer updateNotic(Notice notice);

    /**
     * 删除通知
     * @param id
     * @return Number of affected notifications in the database
     * */
    public Integer deleteNotic(Integer id);


}
