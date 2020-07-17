/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;
 
import com.triet.util.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author QKTriet
 */
public class MathUtilTest {
    
   @Test 
   public void testSuccessfullCases(){
       //hàm test đầu vào
       Assert.assertEquals(1, MathUtil.computeFactorial(0));
       Assert.assertEquals(1, MathUtil.computeFactorial(1));
       Assert.assertEquals(2, MathUtil.computeFactorial(2));
       Assert.assertEquals(6, MathUtil.computeFactorial(3));
       //màu xanh khi all đúng, máu đỏ only if sai là sai.
   }
    
   @Test(expected = IllegalArgumentException.class)
   public void testFailedCases(){
       //test đầu vào trường hợp sai      
           MathUtil.computeFactorial(-5);
       
   }
}
