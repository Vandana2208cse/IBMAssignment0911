package testCases;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



public class FirstTestngScript {
	
	@Test
	public void printName() {
		System.out.println("Vandana");
	}
	
	@Test
	public void printName1() {
		System.out.println("Bishun");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	
   @AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
   
   @BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
   
   @AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
   
   
}
