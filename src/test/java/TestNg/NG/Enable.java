package TestNg.NG;
import org.testng.annotations.Test;


public class Enable {
@Test(priority=0)
public void testcase1() {
	System.out.println("Testcase 1 Excecuted Suceesfully");
	
	
}
@Test(priority=2, enabled=false)
public void testcase2(){
	System.out.println("Testcase 2 Excecuted Suceesfully");
}
@Test(priority=1)
public void testcase3(){
	System.out.println("Testcase 3 Excecuted Suceesfully");
}	

}
