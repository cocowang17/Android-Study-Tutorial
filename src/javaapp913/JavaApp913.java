/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp913;

import java.util.Scanner;

/**
 *
 * @author wangwei
 */
public class JavaApp913 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Father f = new Father("李","欣");
//       Son s = new Son();
//       s.show();
       Son s1 = new Son(f);
       s1.show();
       Son s2 = new Son(f);
       s2.show();
       Son s3 = new Son(f);
       s3.show();
       Son s4 = new Son(f);
       s4.show();
       f.setFirstName("司马");
       s1.show();
       s2.show();
       s3.show();
       s4.show();

       
    }
    
}
