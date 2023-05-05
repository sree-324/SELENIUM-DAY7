package day7;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ce2 {
	int a,b,c;
	@BeforeTest
	void getdata()
	{
	System.out.println("Enter the values to calculate:");
	Scanner ob=new Scanner(System.in);
	a=ob.nextInt();
	b=ob.nextInt();
//		a=7;
//		b=4;
	}
  @Test
  
  public void add() {
	  c=a+b;
	  Assert.assertEquals(c,11);
  }
  @Test

  public void sub() {
	  c=a-b;
	  Assert.assertEquals(c,3);
  }
  @Test

  public void mul() {
	  c=a*b;
	  Assert.assertEquals(c, 28);
  }
  @Test

  public void divide() {
	  c=a/b;
	  Assert.assertEquals(c, 1);
  }
}









