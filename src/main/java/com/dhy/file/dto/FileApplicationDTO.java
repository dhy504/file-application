package com.dhy.file.dto;

public class FileApplicationDTO {


    /**
     * 文件名
     */
    public String fileName;

    /**
     * 重命名名称
     */
    public String rename;

    /**
     * 文件路径
     */
    public String path;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getRename() {
        return rename;
    }

    public void setRename(String rename) {
        this.rename = rename;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
