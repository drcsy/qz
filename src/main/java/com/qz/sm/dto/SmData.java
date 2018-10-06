package com.qz.sm.dto;

import java.util.Date;

public class SmData {
    private String id;

    private String user;

    private Date sm_time;

    private String sm_data;

    private Date create_time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public Date getSm_time() {
        return sm_time;
    }

    public void setSm_time(Date sm_time) {
        this.sm_time = sm_time;
    }

    public String getSm_data() {
        return sm_data;
    }

    public void setSm_data(String sm_data) {
        this.sm_data = sm_data == null ? null : sm_data.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}