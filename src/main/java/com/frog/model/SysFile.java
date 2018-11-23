package com.frog.model;

import java.io.Serializable;
import java.util.Date;

public class SysFile implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer fileid;

    private String app_type;

    private Short file_type;

    private Short type;

    private String file_path;

    private Date addtime;

    public Integer getFileid() {
        return fileid;
    }

    public void setFileid(Integer fileid) {
        this.fileid = fileid;
    }

    public String getApp_type() {
        return app_type;
    }

    public void setApp_type(String app_type) {
        this.app_type = app_type == null ? null : app_type.trim();
    }

    public Short getFile_type() {
        return file_type;
    }

    public void setFile_type(Short file_type) {
        this.file_type = file_type;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getFile_path() {
        return file_path;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path == null ? null : file_path.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}