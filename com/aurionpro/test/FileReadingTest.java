package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingTest {
// 1310 enter
	//32 space
	// /n /t 
    public static void main(String[] args) {
    	
    	int numberchar=0;
    	int lines=0;
    	int noWords=0;
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\ADCB\\PROJECTS\\ADCB_CR_BUCKET5_2018\\Aur_training\\06_stream_app\\src\\com\\aurionpro\\test\\test1");
            int ch;
            while ((ch = fileInputStream.read()) != -1) {
            	
                System.out.print(ch);
                System.out.println("1");
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
