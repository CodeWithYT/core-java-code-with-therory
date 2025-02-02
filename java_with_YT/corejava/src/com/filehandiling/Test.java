package com.filehandiling;

import com.ExceptionHandling.CustomException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\tarun\\Documents\\CLASSES\\tarun.txt");
        boolean status = f.createNewFile();
        if (status) {
            System.out.println("File created successfully: " + f.getName());

        } else {
            System.out.println("Already Exists!! (or) Something went wrong while creating the file!");
            System.out.println("Path: " + f.getPath());
        }

        FileWriter fw = new FileWriter(f);
        fw.write("Hello, everyone\n");
        fw.write("I'm Tarun");
        fw.write("\n");
        fw.write("this is my intro");
        fw.flush();
        fw.close();
        File items = new File("C:\\Users\\tarun\\Documents\\CLASSES");
        System.out.println(Arrays.toString(items.listFiles()));


    }
}
