package com.gof.designpattern.prototype;

/**
 * Created by yl3 on 22.11.15.
 */
public class PopMusic extends Music {

    public PopMusic(){
        title = "What do you mean?";
    }

    @Override
    public void play() {
        System.out.println();
        System.out.println("play a pop music");
    }
}
