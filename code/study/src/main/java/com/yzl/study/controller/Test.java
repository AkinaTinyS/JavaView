package com.yzl.study.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Test {

    public static void main(String[] args) {

//        int a=Integer.valueOf(args[0]);
//        int b=Integer.valueOf(args[1]);
        Scanner input=new Scanner(System.in);
        String str=input.toString();
        int n=input.nextInt();
        System.out.println(n);

        ConcurrentHashMap map = new ConcurrentHashMap();
        File file = new File("a.txt");

        System.out.println(file.getAbsolutePath());
    }
}
