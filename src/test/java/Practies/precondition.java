package Practies;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class precondition {
     @BeforeTest
     public void bTest()
     {
    	 System.out.println(" Before test");
     }
     @BeforeMethod
     public void bMethod()
     {
    	 System.out.println("before method");
     }
     @Test
     public void test()
     {
    	 System.out.println("test");
     }
     
     @AfterMethod
     public void Amethod()
     {
    	 System.out.println("Aftermethod");
     }
     
     @AfterTest
     public void ATest()
     {
    	 System.out.println("After Test");
     }
     
}
