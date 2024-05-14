package com.example.demo.pojo;

import java.time.LocalDateTime;

public class Oder_Format {
    int no;
    private String major;
    private int fee;
    private String addr;
    private String time;
    private String openid;
    private LocalDateTime data;
    private String telephone;
    private String text;
    private String student_id;


    public Oder_Format(int no, String major, int fee, String addr, String time, String openid, LocalDateTime data, String telephone,String text, String student_id) {
        this.no = no;
        this.major = major;
        this.fee = fee;
        this.addr = addr;
        this.time = time;
        this.openid = openid;
        this.data = data;
        this.text = text;
        this.student_id = student_id;
        this.telephone=telephone;
    }

    public int getFee() {
        return fee;
    }
}
