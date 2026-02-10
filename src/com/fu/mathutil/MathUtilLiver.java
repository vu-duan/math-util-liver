/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;


public class MathUtilLiver {

 
    public static void main(String[] args) {
        // TODO code application logic here
        long result = MathUtil.getFactorial(5);
        System.out.println(result);
        //Thêm code sau lần đầu tiên chơi với git-Đưa code lên Server  5:19pm(10/2/2026)
        System.out.println("expected: 0! = 1; actual: " + MathUtil.getFactorial(0));
        System.out.println("expected: 1! = 1; actual: " + MathUtil.getFactorial(1));
        System.out.println("expected: 3! = 6; actual: " + MathUtil.getFactorial(3));
        //Thêm code sau lần đầu thứ 4 chơi với git-Đưa code lên Server  11:45pm(10/2/2026)
        System.out.println("expected: 4! = 24; actual: " + MathUtil.getFactorial(4));
    }
    
}
