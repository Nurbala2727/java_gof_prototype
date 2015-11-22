package com.gof.designpattern.prototype;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yl3 on 22.11.15.
 */
public class PrototypesModule {

    private static Set<Music> musicSet = new HashSet<Music>();

    public static void addMusic( Music music ) {
        musicSet.add(music);
    }

    public static Object findAndClone( Music music ) {

        if (musicSet.contains(music)) {
            return (Music) music.clone();
        } else {
            return null;
        }
    }
}
