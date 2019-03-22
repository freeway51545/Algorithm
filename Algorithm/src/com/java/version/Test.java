package com.java.version;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * lamba表达式
 */
interface People{
    public void test(String name);
}
class Work{
    public void worf(People p){
        p.test("as ");
    }
}
public class Test {
    public static void main(String[] args){
//        String[] atp = {"Rafael Nadal", "Novak Djokovic",
//                "Stanislas Wawrinka",
//                "David Ferrer","Roger Federer",
//                "Andy Murray","Tomas Berdych",
//                "Juan Martin Del Potro"};
//        List<String> player = Arrays.asList(atp);
//        player.forEach((name)->System.out.println(name));

        Work ww = new Work();
        ww.worf((name)->System.out.println(name));
    }
}
