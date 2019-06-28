package com.qdhuafens.web.service;

import com.qdhuafens.web.entity.Notice;

import java.util.List;

public interface NoticService {
    /**
     * 查看所有的通知
     * */
    public List<Notice> querryAllNotic();

    /**
     * 根据信息，查询所有通知
     * */
    public List<Notice> querryByNotic(Notice notice);

    /**
     * 添加通知
     * */
    public Integer addNotic(Notice notice);

    /**
     * 删除通知
     * */
    public Integer delNotic(Integer id);

    /**
     * 修改通知
     * */
    public Integer updateNotic(Notice notice);
}
