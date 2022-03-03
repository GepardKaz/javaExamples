package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.sql.*;


public class Main {

    public static void main(String[] args) {

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/recycle","kadyl","QWERTYqwerty!23456");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from ref_tn_code ORDER BY id ASC");

                File yourFile = new File("./ref_tn_code.txt");
                yourFile.createNewFile();
                final OutputStream os = new FileOutputStream(yourFile);
                final PrintStream printStream = new PrintStream(os);

            while(rs.next()) {
                if(rs.getString(2) == null) {continue;}

                printStream.print(rs.getInt(1) + " || " + rs.getString(2) + " || " + rs.getString(3) + " || " + rs.getDouble(5) + " || " + rs.getDouble(6) + "\n");
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getDouble(5) + "  " + rs.getDouble(6));

            }

            con.close();
            printStream.close();

        }catch(Exception e){
            System.out.println(e);
        }


    /*print stars */
    // *
    // **
    // ***
    // ****
    // *****

//        int n = 20;
//        for(int i = 0; i < n; i++){
//            for(int j = 1; j < i + 1; j++){
//                System.out.print("*");
//            }
//            System.out.print("*\n");
//        }

  /** ********* Generic example ************/

//        GenericExample<String> gen = new GenericExample<String>();
//        gen.setTitle("blablaa");
//        System.out.println("result: " + gen.test());
//
//        GenericExample<Double> gen1 = new GenericExample<Double>();
//        gen1.setTitle(23.56);
//        System.out.println("result1: " + gen1.test());
//
//        GenericExample<Integer> gen2 = new GenericExample<Integer>();
//        gen2.setTitle(65);
//        System.out.println("result2: " + gen2.test());

 /******* final example *********/

//        InterfaceClass int_class = new InterfaceClass() {
//            @Override
//            public void someMethod() {
//                System.out.println("dada");
//            }
//        };
//        int_class.someMethod();
//        double mrp_2021;
//        double mrp_2022;
//
//        FinalExample finl = new FinalExample();
//        mrp_2021 = finl.getMRP_2021();
//        mrp_2022 = finl.getMRP_2022();
//
//        System.out.println("МРП за 2021 г = " + mrp_2021);
//        System.out.println("МРП за 2022 г = " + mrp_2022);
    }
}
