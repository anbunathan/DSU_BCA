// **Charith_calculator_demo**
package getText;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;

public class calculator_demo1 {
  
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "APPIUM");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Andriod Emulator");
		
		dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\kchar\\Downloads\\Calculator_v7.8.apk");
		
		URL url = new URL("http:\\127.0.0.1:4723/wd/hub");
		System.out.println("calculator_demo_Exceution_Started");
		
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement> (url,dc);
	
		Thread.sleep(4000);
		System.out.println("Clicking Digits.......\n");
		WebElement one=driver.findElementById("com.google.android.calculator:id/digit_1") ;
		one.click();                                                                        //Number1
		
		WebElement two=driver.findElementById("com.google.android.calculator:id/digit_2") ;
		two.click();                                                                        //Number2
		
	    WebElement three=driver.findElementById("com.google.android.calculator:id/digit_3") ;
		three.click();                                                                       //Number3
		
		
		driver.findElementById("com.google.android.calculator:id/op_add").click();          //Add
		
		
		WebElement nine=driver.findElementById("com.google.android.calculator:id/digit_9") ;
		nine.click();                                                                        //Number9
		
		WebElement eigth=driver.findElementById("com.google.android.calculator:id/digit_8") ;
		eigth.click();                                                                       //Number8 
		
		WebElement seven=driver.findElementById("com.google.android.calculator:id/digit_7") ; 
		seven.click();                                                                       //Number7
		
		driver.findElementById("com.google.android.calculator:id/op_add").click();          //Add
		
		WebElement five=driver.findElementById("com.google.android.calculator:id/digit_5") ;
		five.click();                                                                        //Number5
		
		WebElement six=driver.findElementById("com.google.android.calculator:id/digit_6") ;
		six.click();                                                                        //Number6
		
		WebElement four=driver.findElementById("com.google.android.calculator:id/digit_4") ; 
		four.click();                                                                       //Number4
		
		Thread.sleep(2000);
		driver.findElementById("com.google.android.calculator:id/eq").click();              //Equal Button
		
		String results= driver.findElement(By.className("android.widget.TextView")).getText();
		
		Thread.sleep(5000);

      
        driver.findElementById("com.google.android.calculator:id/clr").click();
        
        Thread.sleep(2500);
       
        driver.pressKey(new KeyEvent(AndroidKey.HOME));
        driver.quit();
        
		if(results.equals("1674")) 
        {
        	
        	System.out.println("(1,674) value has matched.\n Therefore test has passed..........");
        	
        }	
        else
        {
        	System.out.println("test failed...");
        }
       	
	}
}
