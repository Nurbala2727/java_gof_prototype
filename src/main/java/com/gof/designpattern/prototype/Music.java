package com.gof.designpattern.prototype;

/**
 * Created by yl3 on 22.11.15.
 */
public abstract class Music implements Cloneable{


    protected String title;

    public abstract void play();

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
