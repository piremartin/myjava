package com.chj.useOptional;

import java.util.Optional;

public class Demo1 {

    public static void main(String[] args) {
    }

    //2018-9-24 22:35 at home
    private static void try1() {
        Optional<Object> o = Optional.ofNullable(null);
        System.out.println(o);
    }
}
