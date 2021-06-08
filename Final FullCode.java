package trainModule;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Full_Code {

	public static void main(String[] args) throws InterruptedException {

	 	System.setProperty("webdriver.gecko.driver","D:\\selenium jar\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver w = new FirefoxDriver();
		w.get("https://www.goibibo.com/");
		
w.manage().window().maximize();
		
		w.findElement(By.id("roundTrip")).click();//select the round trip option
		
		WebElement ele= w.findElement(By.cssSelector("input[id='gosuggest_inputSrc']"));//source
		ele.sendKeys("Pune");
		Thread.sleep(2000);
		ele.sendKeys(Keys.ARROW_DOWN);
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele2=w.findElement(By.cssSelector("input[id='gosuggest_inputDest']"));//destination
		ele2.sendKeys("Mumbai");
		Thread.sleep(2000);
		ele2.sendKeys(Keys.ARROW_DOWN);
		ele2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//Departure		
		w.findElement(By.id("departureCalendar")).click();
		
		
	while(!w.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]/div[1]/div[1]/div[1]/div/div[6]/div/div/div/div[2]/div/div[1]")).getText().contains("July"))

		{
		
		w.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]/div[1]/div[1]/div[1]/div/div[6]/div/div/div/div[1]/span[2]")).click();
		  }
		
		
	List<WebElement> datelist=w.findElements(By.className("calDate"));
	int count=datelist.size();

        for(int i=0;i<count;i++) 
          {

                  String text=w.findElements(By.className("calDate")).get(i).getText();

                  System.out.println("text is"+text);  
 
                    if(text.equalsIgnoreCase("20"))
	
                     {
                      	w.findElements(By.className("calDate")).get(i).click();
                        break;
                     }
 
	      }
        Thread.sleep(2000);
//Return
        Thread.sleep(5000);
        w.findElement(By.id("returnCalendar")).click();
		Thread.sleep(2000);
		
	while(!w.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]/div[1]/div[1]/div[1]/div/div[8]/div/div/div/div[2]/div/div[1]")).getText().contains("July"))

		{
		
		w.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]/div[1]/div[1]/div[1]/div/div[8]/div/div/div/div[1]/span[2]")).click();
		  }
		
		
	List<WebElement> datelist1=w.findElements(By.className("calDate"));
	int count1=datelist1.size();

        for(int i=0;i<count1;i++) 
          {

                  String text1=w.findElements(By.className("calDate")).get(i).getText();

                  System.out.println("text is"+text1);  
 
                    if(text1.equalsIgnoreCase("24"))
	
                     {
                      	w.findElements(By.className("calDate")).get(i).click();
                        break;
                     }
 
	      }
        
        
        //Search
        
        w.findElement(By.id("gi_search_btn")).click();
        
        // Next Page departure time
        
       
        Thread.sleep(2000);
        w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[4]/div[1]/div[1]/div/div/div/div/div/div[2]/div[1]/div[2]/a/span")).click();//flight details
        Thread.sleep(2000);
        w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[4]/div[1]/div[1]/div/div/div/div/div/div[1]/div[2]/div/div")).click();
	//     w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[1]/div/div[2]/span[2]/input")).click();    To book the ticket
	
        w.navigate().back();
        
      //Read More
		
      		Thread.sleep(2000);
      		
      		w.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/div[3]/div[3]/a[1]/img[1]")).click();
      		Thread.sleep(2000);
      		
      		Set <String> window = w.getWindowHandles();
      		Iterator <String> it = window.iterator(); 
      		String parentWindow = it.next();
      		String childWindow1 = it.next(); 
      	
      		w.switchTo().window(childWindow1);
      		Thread.sleep(2000);
      		// International Travel Guidelines
      		w.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]")).click();
      		
      		//search box Search country
      		w.findElement(By.id("country-search")).sendKeys("Qatar");
      		w.findElement(By.xpath("//*[@id=\"country-list\"]/div")).click();
      		
      		
      		
      		Thread.sleep(7000);
      		w.switchTo().window(parentWindow);
      		Thread.sleep(2000);
      		
      		
      		w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/ul/li[2]")).click();
      		Thread.sleep(2000);
      		w.findElement(By.xpath("//*[@id=\"productAnchor\"]/div[3]/div/div[2]/a")).click();
      		Thread.sleep(7000);
      		
      		Set <String> window1 = w.getWindowHandles();
      		Iterator <String> it1 = window1.iterator(); 
      		String parentWindow2 = it1.next();
      		String childWindow2 = it1.next(); 
      		
      		w.switchTo().window(childWindow2);
      		
      		Thread.sleep(3000);
      		w.close();
        
      		w.get("https://www.goibibo.com/");
    		
    		w.manage().window().maximize();
    		Thread.sleep(5000);
    		
    		w.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/ul/li[2]/a")).click();//hotel tab
    		
    		w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div/div[1]/div[1]/input")).click();//radio button
    		w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div/div[2]/div")).click();
    		
    		WebElement ele4= w.findElement(By.cssSelector("input[id='downshift-1-input']"));//source
    		ele4.sendKeys("Mumbai");
    		Thread.sleep(2000);
    		ele4.sendKeys(Keys.ARROW_DOWN);
    		ele4.sendKeys(Keys.ENTER);
    		
    		//Search button
    		
    		Thread.sleep(5000);
    		 w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div/button")).click();//click on search button
    			Thread.sleep(2000);

    			
    			WebElement ele3 = w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div[1]/div[2]/div/div[1]/div[1]/div"));

    			Actions action = new Actions(w);

    			//Performing the mouse hover action on the Top locations.
    			action.moveToElement(ele3).perform();
    			//Performing the mouse hover action on Top landmark
    			WebElement ele5 = w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div[1]/div[2]/div/div[1]/div[2]/div"));

    			action.moveToElement(ele5).perform();
    			//Performing the mouse hover action on Top transit
    			WebElement ele6 = w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div[1]/div[2]/div/div[1]/div[3]/div"));

    			action.moveToElement(ele6).perform();
    		//	w.findElement(By.xpath("//span=[@title='Chhatrapati Shivaji International Airport']")).click();
    			
    			//click on Pay At Hotel
    			w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div[1]/div[2]/div/div[1]/div[4]")).click();
    			 //click on Free Breakfast
    			w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div[1]/div[2]/div/div[1]/div[5]")).click();
    			WebDriverWait wait=new WebDriverWait(w, 12);
    			
    			WebElement ele7=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4[class*='dwebCommonstyles']")));
    			ele7.click();
    								
    				Thread.sleep(10000);
    				
    			
    				//navigate to main window
    				Set <String> windows = w.getWindowHandles();
    			    String mainwindow = w.getWindowHandle();

    			    for (String handle: windows)
    			    {
    			        w.switchTo().window(handle);
    			        System.out.println("switched to "+w.getTitle()+"  Window");
    			        String pagetitle = w.getTitle();
    			        if(pagetitle.equalsIgnoreCase("Online Hotel Booking"))
    			        {
    			            w.close();
    			            System.out.println("Closed the  '"+pagetitle+"' Tab now ...");
    			        }
    			    }

    			    w.switchTo().window(mainwindow);
    			    
    			    w.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/ul/li[2]/a")).click();//hotel tab
    				

    		
    		//explore More From Hotel tab
    		Thread.sleep(5000);
    		w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/button/h4")).click();
    		
    		Thread.sleep(5000);
    		//click on the destination hotel
    		w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/section/section/ul/li[1]/a/img")).click();
    		
    		Thread.sleep(5000);
    		
    		//back to the main hotel page
    		/*Set <String> windows = w.getWindowHandles();
    	    String mainwindow = w.getWindowHandle();

    	    for (String handle: windows)
    	    {
    	        w.switchTo().window(handle);
    	        System.out.println("switched to "+w.getTitle()+"  Window");
    	        String pagetitle = w.getTitle();
    	        if(pagetitle.equalsIgnoreCase("Online Hotel Booking"))
    	        {
    	            w.close();
    	            System.out.println("Closed the  '"+pagetitle+"' Tab now ...");
    	        }
    	    }*/

    	    w.switchTo().window(mainwindow);
    	    
    	    w.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/ul/li[2]/a")).click();//hotel tab
    	    
    	    Thread.sleep(3000);
    	    
    	    JavascriptExecutor jse=(JavascriptExecutor) w;
    	    jse.executeScript("window.scrollBy(0,400)");
    	    
    	    w.quit();
    	    
    		//From
			w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/section[1]/section[1]/section[1]/aside[1]/label[1]/div[1]/div[1]/input[1]")).sendKeys("MSB, Chennai Beach Railway Station", Keys.ENTER);
			 Thread.sleep(2000);
			 w.findElement(By.xpath("/html/body/div[2]/div[1]/div/section/section[1]/section[1]/aside[1]/label[1]/div/div/div/ul/li")).click();
			 
			 //To
			 w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/section[1]/section[1]/section[1]/aside[1]/label[2]/div[1]/div[1]/input[1]")).sendKeys("NZM, Hazrat Nizamuddin Railway Station", Keys.ENTER);
			 Thread.sleep(2000);
			 w.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/section[1]/section[1]/section[1]/aside[1]/label[2]/div[1]/div[1]/div[1]/ul[1]/li[1]")).click();
			 
			//radio
			w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/section[1]/section[1]/section[1]/aside[3]/div[2]/div[1]/label[2]/span[1]/input[1]")).click();
			 
			//search train
			w.findElement(By.xpath("//button[contains(text(),'Search Trains')]")).click();
			System.out.println("Search train"); 
			
			//AVL-40
			w.findElement(By.xpath("//li[contains(text(),'AC Only')]")).click();
			w.findElement(By.xpath("//li[contains(text(),'Late Depart (After 6 pm)')]")).click();	 
			w.findElement(By.xpath("//body/div[@id='app']/div[@id='srpPageWrap']/section[2]/section[2]/section[1]/aside[1]/div[2]/label[1]/span[1]")).click();
			Thread.sleep(2000);
			w.findElement(By.xpath("/html/body/div[2]/div/section[2]/section[2]/section/aside[3]/ul/li[1]/div/div[2]/p[1]")).click();
			Thread.sleep(2000); 
			
			 //proceed
			w.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click(); 
			Thread.sleep(2000);
			
			//pay
			w.manage().window().maximize();
			JavascriptExecutor js = (JavascriptExecutor)w;
			js.executeScript("window.scrollTo(0,500)");
			 
			Thread.sleep(2000);
			w.findElement(By.xpath("//div[contains(text(),'Female')]")).click();
			w.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[2]/div[3]/div[1]/div[2]/div[2]/input")).sendKeys("Priya");
			w.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[2]/div[3]/div[1]/div[3]/div[2]/div/input")).sendKeys("25");
			w.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[2]/div[3]/div[2]/div/div")).click();
			w.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[2]/div[3]/div[2]/div/div[2]/div/ul/li[4]")).click();
			w.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[2]/div[4]/div/button")).click();
			Thread.sleep(2000);
			 
			w.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[3]/div[2]/div/div/div/div/input")).sendKeys("No.1, New Street");
			w.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[3]/div[3]/div/div/div/div/input")).sendKeys("600008");
			w.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[4]/div[2]/div[1]/div[1]/div/input")).sendKeys("9999999999");
			w.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[4]/div[2]/div[2]/div/div/input")).sendKeys("priya@gmail.com");
			Thread.sleep(2000);
			 
			js.executeScript("window.scrollTo(0,1349)");
			Thread.sleep(2000);
			w.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[5]/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("Priya123");
			Thread.sleep(2000);
			 
			w.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[8]/button")).click();
			Thread.sleep(2000);
			
			//error
			w.findElement(By.xpath("/html/body/div[2]/div/section/div[2]/div/div/span")).click();
			
			//train module button
			js.executeScript("window.scrollTo(0,-1349)");
			w.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/ul/li[3]/a")).click(); 
			Thread.sleep(2000);
			System.out.println("search train module over");
			
			//PNR status button
			w.findElement(By.xpath("//span[contains(text(),'PNR Status')]")).click();
				
		    Set <String> window4 = w.getWindowHandles();
			Iterator <String> it4 = window4.iterator(); 
			String parentWindow4 = it4.next();
			String childWindow14 = it4.next(); 
			
				
			//PNR Page
			w.switchTo().window(childWindow14);
			Thread.sleep(1000);
				
			w.findElement(By.name("pnr_code")).sendKeys("1123456778");
			w.findElement(By.xpath("//h2[contains(text(),'Check PNR Status')]")).click();
			w.navigate().back();
			w.close();
			
			w.switchTo().window(parentWindow4);	
			w.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/ul/li[3]/a")).click();
			System.out.println("PNR status module over");
			
			//Live Status button
			w.findElement(By.xpath("//span[contains(text(),'Live train status')]")).click();
			Thread.sleep(2000);
				
			Set <String> window5 = w.getWindowHandles();
			Iterator <String> it5 = window5.iterator(); 
			String parentWindow5 = it5.next();
			String childWindow15 = it5.next(); 
			
			//LIVE STATUS Page
			w.switchTo().window(childWindow15);
				
			//check train status
			w.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/section/div[1]/div/input")).sendKeys("16127");
			Thread.sleep(1000);
			w.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/section/div[1]/div/div/div/ul/li/div/div/div/span")).click();
			w.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/section/div[3]/div/div/div/div[1]/button[2]")).click();
			w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).click();
			w.close();
			
			w.switchTo().window(parentWindow5);
			w.findElement(By.xpath("/html/body/div[1]/div/div/header/ul/li[3]/a")).click();
			System.out.println("live status module over");
			Thread.sleep(1000);
				 
			//View Train Coach position
			w.findElement(By.xpath("//span[contains(text(),'View train coach position')]")).click();
					

			Set <String> window6 = w.getWindowHandles();
			Iterator <String> it6 = window6.iterator(); 
			String parentWindow6 = it6.next();
			String childWindow6 = it6.next(); 
					
			w.switchTo().window(childWindow6);
			Thread.sleep(2000);		
			w.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[3]/div/div[1]/div/input")).sendKeys("23226");
			Thread.sleep(2000);
			w.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[3]/div/div[1]/div/div/div/ul/li/div/div/div/span")).click();
			Thread.sleep(2000);
			w.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[4]/div/button")).click();
			w.findElement(By.xpath("/html/body/div[2]/div/div[2]/section[1]/div/div/a/button")).click();
			System.out.println("Live train coach module over");
			w.close();
					
			w.switchTo().window(parentWindow6);
			Thread.sleep(2000);
			w.findElement(By.xpath("/html/body/div[1]/div/div/header/ul/li[3]/a")).click();
			Thread.sleep(2000); 
			
			//PLATFORM LOCATOR
			w.findElement(By.xpath("//span[contains(text(),'Platform Locator')]")).click();
			Thread.sleep(2000);
		
	    	Set <String> window7 = w.getWindowHandles();
			Iterator <String> it7 = window7.iterator(); 
			String parentWindow7 = it7.next();
			String childWindow17 = it7.next(); 
			
			w.switchTo().window(childWindow17);
			Thread.sleep(1000);
			
			w.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/section/div[1]/div/input")).sendKeys("23226");
			Thread.sleep(2000);
			w.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/section/div[1]/div/div/div/ul/li/div/div/div/span")).click();
			Thread.sleep(2000);
			
			w.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/section/div[2]/div/label/div/input")).click();
			Thread.sleep(2000);
		    w.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/section/div[2]/div/label/div/div/div/ul/li[1]/span/span")).click();
			Thread.sleep(2000);
		    w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).click();
		    w.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/section/ul/li[1]/a[2]/button")).click();
		    System.out.println("Platform locator module over");
		    w.close();
		    
		    w.switchTo().window(parentWindow7);
		    w.findElement(By.xpath("/html/body/div[1]/div/div/header/ul/li[3]/a")).click();
		    Thread.sleep(2000); 
			
			//Forgot IRCTC password
			js.executeScript("window.scrollTo(0,500)");
			Thread.sleep(1000);
				
			w.findElement(By.xpath("/html/body/div[2]/div[1]/div/section/section[4]/div/aside[1]/div/a/span")).click();
				
			Set <String> win = w.getWindowHandles();
			Iterator <String> it8 = win.iterator(); 
			String parent = it8.next();
			String child = it8.next();
				
			//Forgot password page
			w.switchTo().window(child);
			Thread.sleep(1000);		
			js.executeScript("window.scrollTo(0,200)");
			Thread.sleep(1000);
			w.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("priya123");
			w.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("9999999999");
			w.findElement(By.xpath("/html/body/div[2]/div[1]/section/div/div[4]/div[1]/button")).click();
			System.out.println("Forgot IRCTC password module over");
			Thread.sleep(2000);
			w.close();
			
			w.switchTo().window(parent);
			w.findElement(By.xpath("/html/body/div[1]/div/div/header/ul/li[3]/a")).click(); 
			
			 
			//Forgot IRCTC user
			js.executeScript("window.scrollTo(0,500)");
			
			Thread.sleep(1000);
			w.findElement(By.xpath("/html/body/div[2]/div[1]/div/section/section[4]/div/aside[2]/div/a/span")).click();
			 

			Set <String> window3 = w.getWindowHandles();
			Iterator <String> it3 = window3.iterator(); 
			String parentWindow3 = it3.next();
			String childWindow3 = it3.next();
			
			w.switchTo().window(childWindow3);
				
			w.findElement(By.xpath("//*[@id=\"registered_id\"]")).sendKeys("abc@gmail.com");
			w.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("01/01/1996");
			Thread.sleep(2000);
			w.findElement(By.xpath("/html/body/div[2]/div[1]/section/section/div/div[4]/div[1]/button")).click();
			System.out.println("Forgot IRCTC user module over");
			w.close();
			
			w.switchTo().window(parentWindow3); 
			w.close();
			
			
			 //Driver gets the web application to open
		    w.get("https://www.goibibo.com/");
		    System.out.println("goibibo.com is opened");
		    

		    //Driver clicks on the cab option to get access on it
		    w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/ul[1]/li[4]/a[1]")).click();
		    System.out.println("cab module was Automated");
		    Thread.sleep(2000);

		    //To Automate the radio button
		    w.findElement(By.xpath("//body/div[@id='root']/section[1]/section[1]/section[1]/section[1]/div[1]/label[3]/div[1]/span[1]")).click();
		    System.out.println("Third radio button is Automated");
		    
		    //From
		    w.findElement(By.id("downshift-1-input")).sendKeys("Chennai, Tamil Nadu, India", Keys.ENTER);
		    Thread.sleep(2000);
		    w.findElement(By.xpath("//body/div[@id='root']/section[1]/section[1]/section[1]/section[1]/div[2]/section[1]/div[1]/div[1]/li[1]/div[1]")).click();
		    
		    //To
		    w.findElement(By.id("downshift-2-input")).sendKeys("Bangalore, Karnataka, India", Keys.ENTER);
		    Thread.sleep(2000);
		    w.findElement(By.xpath("//body/div[@id='root']/section[1]/section[1]/section[1]/section[1]/div[3]/section[1]/div[1]/div[1]/li[1]")).click();
		
		    //Pickup date
		    w.findElement(By.xpath("//span[contains(text(),\"07 Jun' 21\")]")).click();
		    Thread.sleep(2000);
		    w.findElement(By.xpath("//span[contains(text(),'23')]")).click();
		    Thread.sleep(2000);
		    
		    //search cab
		    w.findElement(By.xpath("//button[contains(text(),'SEARCH CABS')]")).click();
		    System.out.println("Search button is clicked");
		    
		    w.manage().window().maximize();
			js.executeScript("window.scrollTo(0,500)");
		    Thread.sleep(2000);
		    
			//select
			w.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div[2]/div[2]/div/span/button")).click();
			Thread.sleep(2000);
			System.out.println("select button is clicked");
			w.manage().window().maximize();
			js.executeScript("window.scrollTo(0,1000)");
			Thread.sleep(2000);
			  
			
			//Gender
			Select s = new Select(w.findElement(By.id("gender")));
			s.selectByVisibleText("Miss");
			Thread.sleep(2000);
			
			//Name
			w.findElement(By.xpath("//body/div[@id='root']/div[2]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Lakshmi");
			
			//phone number
			w.findElement(By.xpath("//body/div[@id='root']/div[2]/div[3]/div[1]/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys("9876543210");
			
			//Email
			w.findElement(By.xpath("//body/div[@id='root']/div[2]/div[3]/div[1]/div[4]/div[2]/div[3]/div[1]/input[1]")).sendKeys("lakshmi@gmail.com");
			Thread.sleep(2000);
			
			//pay button
			w.findElement(By.id("paymentButton")).click();
			System.out.println("pay button clicked");
			
			js.executeScript("window.scrollTo(0,-1000)");
			Thread.sleep(2000);
			w.findElement(By.linkText("Cabs")).click();
			Thread.sleep(2000);
			
			//latest update
			w.findElement(By.xpath("//body/div[@id='root']/section[1]/section[1]/section[1]/div[1]/div[2]/ul[1]/li[1]/img[1]")).click();
			
			Set <String> win1 = w.getWindowHandles();
			Iterator <String> i = win1.iterator(); 
			String parent1 = i.next();
			String child1 = i.next(); 
								
			//Travel soon
			w.switchTo().window(child1);
			Thread.sleep(1000);
			js.executeScript("window.scrollTo(0,500)");
			Thread.sleep(2000);
			System.out.println("Travel soon page");
			
			//karnataka
			w.findElement(By.xpath("//span[contains(text(),'Karnataka')]")).click();
			Thread.sleep(2000);
			
			//maharashtra
			w.findElement(By.xpath("//span[contains(text(),'Maharashtra')]")).click();
			Thread.sleep(2000);
			
			//Gujarath
			w.findElement(By.xpath("//span[contains(text(),'Gujarat')]")).click();
			Thread.sleep(2000);
			
			//madhya pradesh
			w.findElement(By.xpath("//span[contains(text(),'Madhya Pradesh')]")).click();
			
			w.close();
			w.switchTo().window(parent1);
			Thread.sleep(2000);
			
			//gosafe-cabs
			w.findElement(By.xpath("//body/div[@id='root']/section[1]/section[1]/section[1]/div[1]/div[2]/ul[1]/li[2]/img[1]")).click();
			Thread.sleep(2000);
			
			Set <String> win2 = w.getWindowHandles();
			Iterator <String> i1 = win2.iterator(); 
			String parent2 = i1.next();
			String child2 = i1.next(); 
								
			//Check the Latest State-wise Travel Guidelines page
			w.switchTo().window(child2);
			System.out.println("Check the Latest State-wise Travel Guidelines page");
			Thread.sleep(1000);
			js.executeScript("window.scrollTo(0,2000)");
			Thread.sleep(1000);
			js.executeScript("window.scrollTo(0,-2000)");
			
			w.close();
			w.switchTo().window(parent2);
			Thread.sleep(2000);
			
			//explore
			w.findElement(By.xpath("//h4[contains(text(),'Explore More')]")).click();
			Thread.sleep(2000);
			System.out.println("Explore button is clicked");
			
			js.executeScript("window.scrollTo(0,1500)");
			Thread.sleep(2000);
			
			//Delhi To Jaipur Cab
			w.findElement(By.linkText("Delhi To Jaipur Cab")).click();
			System.out.println("Delhi To Jaipur Cab");
			Thread.sleep(2000);
			w.navigate().back();
			Thread.sleep(2000);
			
			//Delhi To Dehradun Cab
			w.findElement(By.linkText("Delhi To Dehradun Cab")).click();
			System.out.println("Delhi To Dehradun Cab");
			Thread.sleep(2000);
			w.navigate().back();
			Thread.sleep(2000);
			
			//Cab From Delhi
			w.findElement(By.linkText("Cab From Delhi")).click();
			System.out.println("Cab From Delhi");
			Thread.sleep(2000);
			w.navigate().back();
			Thread.sleep(2000);
			
			//Cab To Bangalore
			w.findElement(By.linkText("Cab To Bangalore")).click();
			System.out.println("Cab To Bangalore");
			Thread.sleep(2000);
			w.navigate().back();
			Thread.sleep(2000);
			
			//Cab To Patna
			w.findElement(By.linkText("Cab To Patna")).click();
			System.out.println("Cab To Patna");
			Thread.sleep(2000);
			w.navigate().back();
			Thread.sleep(2000);
			
			w.close();
			
			  w.get("https://www.goibibo.com/");
			    System.out.println("goibibo.com is opened");
			    
			    //bus
			    w.findElement(By.linkText("Bus")).click();
			
			    //from
			    w.findElement(By.id("autosuggestBusSRPSrcHome")).sendKeys("Chennai Intl Airport");
			    Thread.sleep(2000);
			    w.findElement(By.xpath("//body/div[@id='root']/section[1]/section[1]/section[1]/section[1]/div[1]/section[1]/ul[1]/div[1]/div[1]/li[1]")).click();
			    Thread.sleep(2000);
			    
			    //to
			    w.findElement(By.id("autosuggestBusSRPDestHome")).sendKeys("Ahmedabad");
			    Thread.sleep(2000);
			    w.findElement(By.xpath("//body[1]/div[1]/section[1]/section[1]/section[1]/section[1]/div[2]/section[1]/ul[1]/div[1]/div[1]/li[1]/span[1]")).click();
			    Thread.sleep(2000);
			    
			    //tomorrow
			    w.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
			    Thread.sleep(1000);
			    
			    //search bus
			    w.findElement(By.xpath("//button[contains(text(),'Search Bus')]")).click();
			    Thread.sleep(2000);
			    System.out.println("Search module");
			    
			    //know more
			    w.findElement(By.xpath("//body/div[@id='root']/section[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[5]/section[1]/section[1]/div[1]/div[1]/img[1]")).click();
			    Thread.sleep(2000);
			    
			    Set <String> win3 = w.getWindowHandles();
				Iterator <String> i3 = win3.iterator(); 
				String parent4 = i3.next();
				String child4 = i3.next(); 
									
				//Travel soon
				w.switchTo().window(child4);
				Thread.sleep(2000);
				
				//Guidelines
				w.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]")).click();
				Thread.sleep(2000);
				w.navigate().back();
				
				//Guidelines
				w.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/a[1]")).click();
				Thread.sleep(2000);
				w.navigate().back();
				
				//Guidelines
				w.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/a[1]")).click();
				Thread.sleep(2000);
				w.navigate().back();
				System.out.println("Guidelines module over");
				w.close();
				
				w.switchTo().window(parent4);
				w.findElement(By.linkText("Bus")).click();
				Thread.sleep(2000);
				
				w.manage().window().maximize();
				js.executeScript("window.scrollTo(0,750)");
				Thread.sleep(2000);
				
				//manali
				w.findElement(By.linkText("Manali")).click();
				Thread.sleep(2000);
				js.executeScript("window.scrollTo(0,500)");
				Thread.sleep(2000);
				
				//select seat
				w.findElement(By.xpath("//body/div[@id='root']/div[2]/section[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]/span[1]")).click();
				Thread.sleep(2000);
				
				//view bus
				w.findElement(By.xpath("//body[1]/div[1]/section[1]/section[1]/div[1]/div[2]/ul[1]/li[1]/div[2]/a[1]")).click();
				System.out.println("Manali mmodule");
				Thread.sleep(2000);
				
				w.findElement(By.linkText("Bus")).click();
				Thread.sleep(2000); 
				
			    js.executeScript("window.scrollTo(0,500)");
				Thread.sleep(2000);
				
				//mumbai
				w.findElement(By.linkText("Mumbai")).click();
				Thread.sleep(2000);
				
				w.findElement(By.xpath("//body/div[@id='root']/div[2]/section[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]/span[1]")).click();
				System.out.println("mumbai module");
				w.findElement(By.linkText("Bus")).click();
				Thread.sleep(2000); 
				
			    js.executeScript("window.scrollTo(0,500)");
			  	Thread.sleep(2000);
			  	
			  	//digha
			  	w.findElement(By.linkText("Digha")).click();
			  	Thread.sleep(2000);
			  
			  	w.findElement(By.xpath("//body/div[@id='root']/div[2]/section[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
			  	System.out.println("digha");
			  	w.findElement(By.linkText("Bus")).click();
			  	Thread.sleep(2000); 
			  	
			    js.executeScript("window.scrollTo(0,500)");
		  		Thread.sleep(2000);
		  		
		  		//APSRTIC
			    w.findElement(By.linkText("APSRTC")).click();
			    Thread.sleep(2000);
			    w.findElement(By.xpath("//body[1]/div[1]/div[3]/section[2]/div[2]/div[4]/button[1]")).click();
			    Thread.sleep(2000);
			    w.findElement(By.xpath("//span[contains(text(),'10')]")).click();
			    Thread.sleep(2000);
			    w.findElement(By.xpath("//div[contains(text(),'GOT IT')]")).click();
			    Thread.sleep(2000);
			    w.findElement(By.xpath("//span[contains(text(),'HIDE BUSES')]")).click();
			    System.out.println("APSRTIC module over");
			    w.close();

			
    			
    	}
        
        
	}



