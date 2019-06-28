package com.qdhuafens.web.service.impl;

import com.qdhuafens.web.dao.NoticDao;
import com.qdhuafens.web.entity.Notice;
import com.qdhuafens.web.service.NoticService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: Huafens
 * @description: 通知服务层
 * @author: 张清
 * @create: 2019-06-24 08:57
 **/
@Service
public class NoticeServiceImpl implements NoticService {

    @Resource
    private NoticDao noticDao;

    public void setNoticDao(NoticDao noticDao) {
        this.noticDao = noticDao;
    }

    @Override
    public List<Notice> querryAllNotic() {
        return noticDao.qerryNotice();
    }

    @Override
    public List<Notice> querryByNotic(Notice notice) {
        return noticDao.qerryByNotic(notice);
    }

    @Override
    public Integer addNotic(Notice notice) {
        return noticDao.addNotice(notice);
    }

    @Override
    public Integer delNotic(Integer id) {
        return noticDao.deleteNotic(id);
    }

    @Override
    public Integer updateNotic(Notice notice) {
        return noticDao.updateNotic(notice);
    }
}
