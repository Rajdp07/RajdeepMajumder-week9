package week9.TddjunitTask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyTests {
	 MyClass tester = new MyClass(); // MyClass is tested
   @Test
   public void mtest() {
      

       // assert statements
       assertEquals("BCD", tester.remove("ABCD"));
   } 
   @Test
   public void mtest1() {
       
       
       assertEquals("BAA", tester.remove("AABAA"));
   }
   @Test
   public void mtest2() {
      
       assertEquals("", tester.remove("AA"));
   }
   @Test
   public void mtest3() {
      
       assertEquals("", tester.remove("A"));
   }
   @Test
   public void mtest4() {
      
       assertEquals("", tester.remove(""));
   }
   @Test
   public void mtest5() {
      
       assertEquals("BBAA", tester.remove("BBAA"));
   }
   @Test
   public void mtest6() {
      
       assertEquals("BCD", tester.remove("BACD"));
   }
   @Test
   public void mtest7() {
      
       assertEquals("CD", tester.remove("AACD"));
   }
   
   
}
