package com.nnapolit.pricechartingjava.controller;

import android.view.View;

import java.io.InputStream;

public class Product {
//    public static void main(String[] args) {
//
//    }

    public void readFile(View view) {
        try {
//            File file = new File("app/src/main/assets/temp.txt");
            InputStream inputStream= view.getContext().getAssets().open("temp.txt");
            System.out.println(inputStream);
            int r=0;
            while((r=inputStream.read())!=-1)
            {
                System.out.print((char)r);      //prints the content of the file
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
