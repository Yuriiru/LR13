package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try(FileReader Rd = new FileReader("kot.txt");
            FileWriter Wr = new FileWriter("reading.txt")){
            int A;
            String st = "";
            while((A = Rd.read()) != -1){
                st = st + (char)A;
            }

            String del1 = st.replaceAll("\\//.+", "");
            String del2 = del1.replaceAll("/\\*(?s).*?\\*/", "");

            Wr.write(del2);
            Wr.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}