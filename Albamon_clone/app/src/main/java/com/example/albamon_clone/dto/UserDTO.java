package com.example.albamon_clone.dto;

public class UserDTO {
    private String name, age,gender,info, career,alba_info, time,local;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getAlba_info() {
        return alba_info;
    }

    public void setAlba_info(String alba_info) {
        this.alba_info = alba_info;
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

    public UserDTO(String name, String age, String gender, String info, String career, String alba_info, String time, String local) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.info = info;
        this.career = career;
        this.alba_info = alba_info;
        this.time = time;
        this.local = local;
    }
}
