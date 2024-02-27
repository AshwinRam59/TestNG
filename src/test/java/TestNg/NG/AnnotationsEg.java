package TestNg.NG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsEg {
	
	
	
	@Test
	public void testcase1() {
		
		
		System.out.println("Tescase 1 is executed");
	}
	
	@Test
	public void testcase2() {
		
		
		System.out.println("Tescase 2 is executed");
	}
	
	@Test
	public void testcase3() {
		
		
		System.out.println("Tescase 3 is executed");
	}
	
	
	@Test
	public void testcase4() {
		
		
		System.out.println("Tescase 4 is executed");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("Launch Browser");
		
		
	}
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("Close Browser");
		
		
	}
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Open db connection");
		
		
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("Close db connection");
		
		
	}
	
	
	
	
	
	
	
	

}
