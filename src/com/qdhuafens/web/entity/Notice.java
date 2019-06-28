package com.qdhuafens.web.entity;

/**
 * @program: Huafens
 * @description: 通知实体类
 * @author: 张清
 * @create: 2019-06-24 08:41
 **/
public class Notice {
    /**
     * 通知id号
     * */
    private Integer noticeId;

    /**
     * 通知标题
     * */
    private String noticTitle;

    /**
     * 通知标签
     * */
    private String noticLabel;

    /**
     * 通知内容
     * */
    private String noticContent;

    /**
     * 发帖人id
     * */
    private Integer userId;


    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticTitle() {
        return noticTitle;
    }

    public void setNoticTitle(String noticTitle) {
        this.noticTitle = noticTitle;
    }

    public String getNoticLabel() {
        return noticLabel;
    }

    public void setNoticLabel(String noticLabel) {
        this.noticLabel = noticLabel;
    }

    public String getNoticContent() {
        return noticContent;
    }

    public void setNoticContent(String noticContent) {
        this.noticContent = noticContent;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "noticeId=" + noticeId +
                ", noticTitle='" + noticTitle + '\'' +
                ", noticLabel='" + noticLabel + '\'' +
                ", noticContent='" + noticContent + '\'' +
                ", userId=" + userId +
                '}';
    }
}
