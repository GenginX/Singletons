package com.company.singleton;

import com.company.singleton.LazySingleton;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        new Thread(runnable()).start();
        new Thread(runnable()).start();
        new Thread(runnable()).start();
        new Thread(runnable()).start();

        Thread.sleep(1000);
        System.out.println(LazySingleton.getInstance().toString());

//        LazySingleton instance = LazySingleton.getInstance();
//        LazySingleton instance1 = LazySingleton.getInstance();
//        LazySingleton instance2 = LazySingleton.getInstance();
//        System.out.println(instance.toString());
//        System.out.println(instance1.toString());
//        System.out.println(instance2.toString());
    }

    private static Runnable runnable(){
        return new Runnable() {
            @Override
            public void run() {
                LazySingleton instance = LazySingleton.getInstance();
                System.out.println(instance.toString());

            }
        };
    }

}
