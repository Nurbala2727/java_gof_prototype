package com.gof.designpattern.prototype;

/**
 * Created by yl3 on 22.11.15.
 */
public class HiphopMusic extends Music {

    public HiphopMusic() {
        title = "Hotline Bling";
    }

    @Override
    public void play() {
        System.out.println();
        System.out.println("play a hiphop music");
    }
}
