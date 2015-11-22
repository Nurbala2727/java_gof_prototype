package com.gof.designpattern;

import com.gof.designpattern.prototype.HiphopMusic;
import com.gof.designpattern.prototype.Music;
import com.gof.designpattern.prototype.PopMusic;
import com.gof.designpattern.prototype.PrototypesModule;

/**
 * Created by yl3 on 22.11.15.
 */
public class CommandCenter {

    public static void main( String[] args ) {


        PopMusic popMusic = new PopMusic();
        HiphopMusic hiphopMusic = new HiphopMusic();

        PrototypesModule.addMusic(popMusic);
        PrototypesModule.addMusic(hiphopMusic);

        Music clonedPopMusic01 = (Music) PrototypesModule.findAndClone(popMusic);
        Music clonedPopMusic02 = (Music) PrototypesModule.findAndClone(popMusic);

        Music clonedHiphopMusic01 = (Music) PrototypesModule.findAndClone(hiphopMusic);
        Music clonedHiphopMusic02 = (Music) PrototypesModule.findAndClone(hiphopMusic);


        clonedPopMusic01.play();
        System.out.println("Music Title: " + clonedPopMusic01.getTitle());

        clonedPopMusic02.play();
        System.out.println("Music Title: " + clonedPopMusic02.getTitle());

        clonedHiphopMusic01.play();
        System.out.println("Music Title: " + clonedHiphopMusic01.getTitle());

        clonedHiphopMusic02.play();
        System.out.println("Music Title: " + clonedHiphopMusic02.getTitle());

    }
}
