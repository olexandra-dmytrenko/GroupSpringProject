package com.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by sergii on 30.03.15.
 */
public class Class {
    class Inner{}
    class Inner2 extends Class{}
}

class Test{
    public static void main(String[] args) {
//        new Class().new Inner();
//        Class c = new Class().new Inner2();
//
//        c.new Inner2();
//        c.new Inner2().new Inner2();
//        List<Void> a = new ArrayList<Void>();

//        Integer as = 4;
//        Integer b = null;
//
//        System.out.println(as - b);
        Date date = new Date(0);
        System.out.println(date);

        class  a {
            private void p(){};
        }

        new a().p();

        int $a = 4;
        byte _b = 2;
        double e = $a;


    }
enum a{a,b,c}

}
