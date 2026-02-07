/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

public class MathUtil {

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid Argument. n must be between 0..20");
        }
        //Hàm dừng liền không cần return
        
        if (n == 0 || n == 1) {
            return 1;
        }
        long tem = 1;
        for (int i = 2; i <= n; i++) 
            tem = tem * i;
        return tem;
           
    }       
             
}
