package com.chj.useOptional;

import java.time.LocalTime;
import java.util.Optional;

public class Demo1 {

    private static Integer startHour;
    private static Integer startMinute;
    private static Integer startSecond;
    private static Integer endHour;
    private static Integer endMinute;
    private static Integer endSecond;
    private static String restTimeStart;
    private static String restTimeEnd;
    private static boolean startBeforeEnd;

    public static void main(String[] args) {
//        restTimeStart = "08:20:00";
//        restTimeEnd = "17:30:00";

        restTimeStart = "18:01:00";
        restTimeEnd = "08:30:00";

        LocalTime start = LocalTime.parse(restTimeStart);
        LocalTime end = LocalTime.parse(restTimeEnd);

        if(start.isBefore(end)){
            System.out.println("before");
            startBeforeEnd = true;
        }else {
            System.out.println("after");
            startBeforeEnd = false;
        }

        testTime();

        System.out.println("---main");
    }

    //2018-9-24 22:35 at home
    private static void try1() {
        Optional<Object> o = Optional.ofNullable(null);
        System.out.println(o);
    }

    private static void testVoidReturn(Boolean b){
        if(b){
            System.out.println("--true");
            return;
        }
        System.out.println("---other");
    }

    private static void testTime(){
        LocalTime now = LocalTime.now();
//        now = LocalTime.parse("01:02:00");

        if(startBeforeEnd){
            if(now.isAfter(LocalTime.parse(restTimeStart))
                    && now.isBefore(LocalTime.parse(restTimeEnd))){
                return;
            }
        }else {
            if(now.isAfter(LocalTime.parse(restTimeStart))
                    || now.isBefore(LocalTime.parse(restTimeEnd))){
                return;
            }
        }
        System.out.println("---other");
    }
}
