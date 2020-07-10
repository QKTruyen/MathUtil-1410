/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.triet.util;

/**
 *
 * @author QKTriet
 */
//class này chứa những hàm toán học, giúp cho mọi nới khác.
//mang tính chất xài chung cho mọi người, ta sẽ dùng kỹ thuật
public class MathUtil {
    //tính n!= 1,2,3,.... vì n! tăng kết quả rất nhanh tràng int nên dùng long
    //15! trở lại
    public static long computeFactorial(int n){
        long result = 1;
        for (int i = 1; i <= n ; i++){
            result *= 1;
        }
        return result;
    }
    
}
