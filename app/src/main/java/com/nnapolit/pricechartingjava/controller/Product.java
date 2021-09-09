package com.nnapolit.pricechartingjava.controller;

import android.view.View;

import java.io.InputStream;

public class Product {
    public String readFile(View view) {
        String fileContents = "";
        try {
            InputStream inputStream = view.getContext().getAssets().open("temp.txt");
            System.out.println(inputStream);
            int r = 0;
            StringBuilder stringBuilder = new StringBuilder();
            while ((r = inputStream.read()) != -1) {
                stringBuilder.append ((char) r);
//                System.out.print((char) r);      //prints the content of the file
            }
            fileContents=stringBuilder.toString();
            return fileContents;

        } catch (Exception e) {
            e.printStackTrace();
            return fileContents;
        }
    }
}
