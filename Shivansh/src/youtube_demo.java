


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class demo{ 
	



	public demo() {
		
	}

	
		
public static void main(String[] args) throws MalformedURLException, InterruptedException {
			
			DesiredCapabilities dc= new DesiredCapabilities();
			
			dc.setCapability("AUTOMATION_NAME", "APPIUM");
			dc.setCapability("PLATFORM_NAME", "ANDROID");
			dc.setCapability("PLATFORM_VERSION", "11.0");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "sdk_gphone_x86");
			dc.setCapability(MobileCapabilityType.APPLICATION_NAME, "youtube");	
			dc.setCapability("appPackage", "com.google.android.youtube");
			dc.setCapability("appActivity", "com.google.android.youtube.HomeActivity");
				
			
			
			
			URL url = new URL("http:\\0.0.0.0:4723/wd/hub");
			
			System.out.println("demo_Started\n");
			AndroidDriver<WebElement> d=new AndroidDriver<WebElement> (url,dc);
			System.out.println("youtube_opened\n");
			
			Thread.sleep(2000);
			
			d.findElement(By.xpath("//android.widget.ImageView[@content-desc='Search']")).click();
			Thread.sleep(1000);
			
			d.findElementById("com.google.android.youtube:id/search_edit_text").sendKeys("astronomia");
			Thread.sleep(1000);
			
			d.pressKey(new KeyEvent(AndroidKey.ENTER));
			Thread.sleep(2000);
			
			d.findElement(By.xpath("//android.view.ViewGroup[@index='0']")).click();
			System.out.println("video_opened");
			 Thread.sleep(35000);
			 
			   TouchAction touchAction = new TouchAction(d);
		          touchAction.tap(PointOption.point(512, 536)).perform();
		          
			 d.findElement(By.xpath("//android.widget.ImageView[@content-desc='Pause video']")).click();
			 Thread.sleep(1000);
			 d.findElementById("com.google.android.youtube:id/player_collapse_button").click();
			 Thread.sleep(1000);
			 
			 d.findElement(By.xpath("//android.widget.ImageView[@content-desc='Close']")).click();
			 d.pressKey(new KeyEvent(AndroidKey.HOME));
			 System.out.println("\nclosed video\tcame back to home screen");  
		             
			
			 		        

        
 
			}







}
