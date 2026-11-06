package Practies;

import org.testng.annotations.Test;

public class Annotations {
	
 @Test(priority=1)
 public void a()
 {
	 System.out.println("hi hello");
 }
 
 @Test(priority=3)
 public void b()
 {
	 System.out.println("i am prabhakar");
 }
 
 @Test(priority=2)
 public void c()
 {
	 System.out.println("i am from kurnool");
 }
}
