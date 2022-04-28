package com.example.albamon_clone.dto;

public class AlbaDTO {
private String title, content, time, local, salary;
private int img_id;

    public AlbaDTO(int img_id,String title, String content, String time, String local, String salary) {
        this.title = title;
        this.content = content;
        this.time = time;
        this.local = local;
        this.salary = salary;
        this.img_id = img_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public int getImg_id() {
        return img_id;
    }

    public void setImg_id(int img_id) {
        this.img_id = img_id;
    }
}
