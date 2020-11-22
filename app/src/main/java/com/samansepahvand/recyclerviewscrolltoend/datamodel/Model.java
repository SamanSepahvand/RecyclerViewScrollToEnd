package com.samansepahvand.recyclerviewscrolltoend.datamodel;

public class Model {


    private String title;
    private int id;
    private String desc;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Model(String title, int id, String desc) {
        this.title = title;
        this.id = id;
        this.desc = desc;
    }
}
