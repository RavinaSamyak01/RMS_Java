package RMS;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RMS {
	WebDriver  driver;
	public void driver() {
		try {
			System.setProperty("webdriver.chrome.driver","D:\\Tathya\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
	        } catch (Exception e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	}
	}
	//URL
	public void URL() throws InterruptedException {
		driver.get("http://qa.rms-samyak.in/login");
		  Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"NavLoginUserId\"]")).sendKeys("kshah@samyak.com");
		driver.findElement(By.xpath("//*[@id=\"passwordId\"]")).sendKeys("Kssipl45@");
		driver.findElement(By.xpath("//*[@id=\"Login-btn\"]")).click();
		  System.out.println("Login successfully");
	      Thread.sleep(2000);

	}

	//admin company master
	public void companyMaster() throws InterruptedException {
		driver.findElement(By.id("usermanagement")).click();
		  System.out.println("usermanagment");
		  Thread.sleep(2000);
		driver.findElement(By.id("AdminList0")).click();
		  System.out.println("company master");
		  Thread.sleep(2000);
		//update logo
		 //driver.findElement(By.id("uploadiconimg")).click(); 
//		     String imagepath = System.getProperty("user.dir")+ "\\RMS\\img\\report_RMS.png";
//		     WebElement upload = driver.findElement(By.xpath("//*[@id=\"uploadiconimg\"]"));
//		     highLight(upload, driver);
//		     upload.click(); 
//		     System.out.println("click on select file button");
//		     Thread.sleep(2000);
//		     WebElement selectfile = driver.findElement(By.xpath("//*[@id=\"btnfileUploadselctfile\"]"));
//		     highLight(selectfile, driver);
//		     
//		     selectfile.sendKeys(imagepath);
//		     System.out.println("send image path");
//		     
//		     
//		     
////		     public class FileUploadPage extends BasePage{
////		    	 private By chooseFileBtn = By.id("file_upload");
////		    	 private By uploadBtn = By.xpath("//input[@value= 'Upload']");
////		    	 private By uploadstatus = By.xpath("//div[@class='wpcf-response-output']");
////		    	 
////		    	 public FileUploadPage uploadfile(String filepath) {
////		     driver.findElement(chooseFileBtn).sendKeys(filepath);
////                 click(uploadBtn);
////                 waitForElementText(uploadstatus"Thank you");
////		    	 return this;
////		    	 
//		    	 }
//		     }
		     //add site	  
		driver.findElement(By.id("AddSite")).click();
		  System.out.println("clicked add site");
		driver.findElement(By.id("CompSiteName0")).sendKeys("S0101");
		driver.findElement(By.id("CompSiteName0")).sendKeys(Keys.TAB);
		  Thread.sleep(5000);
	   //add panel  
		driver.findElement(By.xpath("//*[@id=\"btnadminaddsiteaddsiteAdd0\"]")).click();
		  System.out.println("click site +");
		driver.findElement(By.id("txtadminaddsitePanelname0")).sendKeys("P0101");
		driver.findElement(By.id("txtadminaddsitePanelname0")).sendKeys(Keys.TAB);
		  Thread.sleep(2000);
	   //add device	  
		driver.findElement(By.id("btnadminaddsiteAdd0")).click();
		  System.out.println("click panel +");
		driver.findElement(By.id("txtadminaddsiteDeviceName0")).sendKeys("D0101");
		driver.findElement(By.id("txtadminaddsiteDeviceName0")).sendKeys(Keys.TAB);
          Thread.sleep(2000);
       //configuration   
        driver.findElement(By.id("btnadminaddsiteConfiguration0")).click();
          System.out.println("configuration");
          Thread.sleep(5000);
	}
//	private void highLight(WebElement selectfile, WebDriver driver2) {
//		// TODO Auto-generated method stub
//		
//	}
	public void configuration() throws InterruptedException {
		
        //device type
		driver.findElement(By.id("btngsmconfigCancel")).click();
		  System.out.println("cancel");
		  Thread.sleep(2000);
		  
		//configuration for validation  
		    driver.findElement(By.id("btnadminaddsiteConfiguration0")).click();
		      System.out.println("configuration");
		      Thread.sleep(5000);
		      
	   //click save for validation
		  driver.findElement(By.id("btngsmconfigSave")).click();
		  Thread.sleep(2000);
		  
	   //Enter data
		WebElement Device = driver.findElement(By.xpath("//*[@id=\"dtype\"]"));
          Device.click();
        driver.findElement(By.xpath("//*[@id=\"dtype\"]")).sendKeys(Keys.DOWN);
        driver.findElement(By.xpath("//*[@id=\"dtype\"]")).sendKeys(Keys.ENTER);
          System.out.println("selected device type");
          Thread.sleep(2000);
       
       //Baudrate
        WebElement Baurate = driver.findElement(By.xpath("//*[@id=\"brate\"]"));
          Baurate.click();
        driver.findElement(By.xpath("//*[@id=\"brate\"]")).sendKeys(Keys.DOWN);
        driver.findElement(By.xpath("//*[@id=\"brate\"]")).sendKeys(Keys.ENTER);
          System.out.println("selected Baudrate");
          Thread.sleep(2000);
       
       //Interval
        driver.findElement(By.id("intm")).sendKeys("32");
          Thread.sleep(2000);
       
       //HTTP Url
        driver.findElement(By.id("UnitRate")).sendKeys("rms.com");
          Thread.sleep(2000);
        
       //MQTT Key
        driver.findElement(By.id("kid")).sendKeys("55");
          Thread.sleep(2000);
        
       //FTP username
        driver.findElement(By.id("FTPUsername")).sendKeys("rms");
          Thread.sleep(2000);
        
       //FTP password
        driver.findElement(By.id("CSVFileName")).sendKeys("1234");
          Thread.sleep(2000);
       
       //Maximum slave
        driver.findElement(By.id("Maxslav")).sendKeys("5");
          Thread.sleep(2000);
      
       //parity
        WebElement parity = driver.findElement(By.id("prty"));
          parity.click();
        driver.findElement(By.id("prty")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("prty")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("prty")).sendKeys(Keys.ENTER);
          System.out.println("selected parity");
     
       //APN
        WebElement APN = driver.findElement(By.id("apnname"));
          APN.click();
        driver.findElement(By.id("apnname")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("apnname")).sendKeys(Keys.ENTER);
          System.out.println("selected APN");
        
       //HTTP Port
        WebElement port = driver.findElement(By.id("port"));
          port.sendKeys("10");
          System.out.println("get the port value=="+ port.getText());
          Thread.sleep(5000);
        driver.findElement(By.id("FTPPassword")).sendKeys("1234");
          System.out.println("password");
          Thread.sleep(2000);
       
       //save
        driver.findElement(By.id("btngsmconfigSave")).click();
          System.out.println("clicked on save");
          Thread.sleep(2000);
        //  driver.findElement(By.id("btngsmconfigCancel")).click();
        //     System.out.println("clicked on cancel");
	}
	
       // RTC
        public void RTC () throws InterruptedException {
        	driver.findElement(By.id("btnadminaddsiteConfiguration0")).click();
              System.out.println("click on configuration");
              Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"mat-tab-label-2-1\"]")).click(); 
              Thread.sleep(2000);
              System.out.println("clicked RTC");
              Thread.sleep(2000);
              
           //save for validation
              driver.findElement(By.id("btngsmconfigSave")).click();
                Thread.sleep(2000);
    
           //Time Zone
            driver.findElement(By.xpath("//*[@id=\"Maxslav\"]")).sendKeys("11");
            //String exp = "Timezone is require";
            //String actualerrormessage = driver.findElement(By.xpath("//mat-tab-body[contains(@id,'mat-tab-content-4-1')]//p[contains(@class,'error_msg error-sms-Interval ng-star-inserted')]")).getText();
            //System.out.println("Error message is: "+ act);
            //Assert.assertEquals(exp, actualerrormessage);
              System.out.println("max slav");
              Thread.sleep(2000);
           
           //Date & Time
            driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("02/25/2022");
              System.out.println("Date & Time");
              Thread.sleep(2000);
            driver.findElement(By.id("btngsmconfifGet")).click();
              Thread.sleep(2000);
              
           //save RTC   
            driver.findElement(By.id("btngsmconfigSave")).click();
              System.out.println("Save RTC");

           //confg for setting
            driver.findElement(By.id("btnadminaddsiteConfiguration0")).click();
        	  System.out.println("click on configuration");
              Thread.sleep(5000);
              
            driver.findElement(By.xpath("//*[@id=\"mat-tab-label-3-2\"]")).click();
              System.out.println("click on setting");
              Thread.sleep(2000);
              

           //save for validation
            driver.findElement(By.id("btngsmconfigSave")).click();
                 
           //protocol
            WebElement protocol = driver.findElement(By.xpath("//*[@id=\"protocol\"]"));
              protocol.click();
            driver.findElement(By.xpath("//*[@id=\"protocol\"]")).sendKeys(Keys.DOWN);
            driver.findElement(By.xpath("//*[@id=\"protocol\"]")).sendKeys(Keys.ENTER);
            System.out.println("selected protocol");
              Thread.sleep(2000);
              
          //MQTT port
            driver.findElement(By.id("port")).sendKeys("10");
              System.out.println("port");
              Thread.sleep(2000);
            driver.findElement(By.id("MqttPassword")).sendKeys("1234");
              Thread.sleep(2000);
            
          //uname
            driver.findElement(By.id("ClientName")).sendKeys("tat12");
            driver.findElement(By.id("MqttUsername")).sendKeys("taT1");
              Thread.sleep(2000);
            driver.findElement(By.id("btngsmconfigSave")).click();
              System.out.println("Save all configuration details");
              Thread.sleep(2000);
            
          //Meter
            driver.findElement(By.xpath("//*[@id=\"btnadminaddsiteAddicon0\"]//img[@class=\"ursor-pointer comman-icon\"]")).click(); 
              System.out.println("click meter +");
              Thread.sleep(2000);
           
           //Meter Id   
            driver.findElement(By.xpath("//*[@id=\"EnergymeterID0\"]")).sendKeys("M0101");
              System.out.println("Enter Meter Id");
              Thread.sleep(2000);
           
           // device type
            WebElement device = driver.findElement(By.xpath("//*[@id=\"DeviceTypeId0\"]"));
              device.click();
            driver.findElement(By.xpath("//*[@id=\"DeviceTypeId0\"]")).sendKeys(Keys.DOWN);
            driver.findElement(By.xpath("//*[@id=\"DeviceTypeId0\"]")).sendKeys(Keys.DOWN);
            driver.findElement(By.xpath("//*[@id=\"DeviceTypeId0\"]")).sendKeys(Keys.ENTER);
            driver.findElement(By.xpath("//*[@id=\"DeviceTypeId0\"]")).sendKeys(Keys.TAB);
              System.out.println("device type selected");
              Thread.sleep(2000);
            
           //date
            driver.findElement(By.xpath("//*[@id=\"dteadminaddsiteValidToDate0\"]")).sendKeys("10/25/2022");
            Thread.sleep(2000);
            
           //Meter name and description
              driver.findElement(By.id("txtadminaddsiteEnergymeterMeterName0")).sendKeys("01000020001");
              driver.findElement(By.id("txtadminaddsiteEnergymeterDesc0")).sendKeys("01000020001");
                System.out.println("Enter meter name and description");
                Thread.sleep(2000);
             
             //isDisplay
              driver.findElement(By.id("txtadminaddsiteIsDisplay0")).click();
                System.out.println("check display");
                Thread.sleep(2000);
                
              //Meter configuration
               driver.findElement(By.id("btnadminaddsiteConfiguration0")).click();
                 System.out.println("click on meter configuration");
                 Thread.sleep(2000);
              
              //slave id   
               driver.findElement(By.xpath("//*[@id=\"slaveid\"]")).sendKeys("11");
                 Thread.sleep(2000);
              
              //maximum register   
               driver.findElement(By.xpath("//*[@id=\"maxregister\"]")).sendKeys("01");
                 System.out.println("maximum register");
                 Thread.sleep(2000);
              
              //show button
               driver.findElement(By.xpath("//*[@id=\"show_fields\"]")).click();
                 Thread.sleep(2000);
              
              //register details
               driver.findElement(By.xpath("//*[@id=\"rname0\"]")).sendKeys("RTPL000004");
                 Thread.sleep(2000);
               driver.findElement(By.xpath("//*[@id=\"rnumber\"]")).sendKeys("1");
                 Thread.sleep(2000);
               driver.findElement(By.xpath("//*[@id=\"unit\"]")).sendKeys("kg");
                 Thread.sleep(2000);
                 
               //data type  
                 WebElement datatype = driver.findElement(By.xpath("//*[@id=\"datatype\"]"));
                 datatype.click();
               driver.findElement(By.xpath("//*[@id=\"datatype\"]")).sendKeys(Keys.DOWN);
               driver.findElement(By.xpath("//*[@id=\"datatype\"]")).sendKeys(Keys.ENTER);
                 System.out.println("data type selected");
                 Thread.sleep(2000);
              
              //functional code
               WebElement functional = driver.findElement(By.xpath("//*[@id=\"fcode\"]"));
                 functional.click();
               driver.findElement(By.xpath("//*[@id=\"fcode\"]")).sendKeys(Keys.DOWN);
               driver.findElement(By.xpath("//*[@id=\"fcode\"]")).sendKeys(Keys.ENTER);
                 System.out.println("functional code selected");
                 Thread.sleep(2000);
                
              //decimal
               WebElement decimal = driver.findElement(By.xpath("//*[@id=\"dpoint\"]"));
                 decimal.click();
               driver.findElement(By.xpath("//*[@id=\"dpoint\"]")).sendKeys(Keys.DOWN);
               driver.findElement(By.xpath("//*[@id=\"dpoint\"]")).sendKeys(Keys.ENTER);
                 System.out.println("decimal selected");
                 Thread.sleep(2000);
                 
               //action
                 WebElement action = driver.findElement(By.xpath("//*[@id=\"ReadWriteAction\"]"));
                 action.click();
               driver.findElement(By.xpath("//*[@id=\"ReadWriteAction\"]")).sendKeys(Keys.DOWN);
               driver.findElement(By.xpath("//*[@id=\"ReadWriteAction\"]")).sendKeys(Keys.ENTER);
                 System.out.println("decimal selected");
                 Thread.sleep(2000);
                 
              //display graph   
               driver.findElement(By.xpath("//div[contains(@class,'form-group')]//input[contains(@type,'checkbox')]")).click();
                 System.out.println("check display graph");
                 Thread.sleep(2000);
                 
              //Thresold
               driver.findElement(By.xpath("//*[@id=\"rnumber1\"]")).sendKeys("12");
                 System.out.println("thresold value");
                 Thread.sleep(2000);
                 
              //save register   
               driver.findElement(By.xpath("//button[contains(@class,'btncommon width-fix67')]")).click();
                 System.out.println("save register");
                 Thread.sleep(2000);
           
               //save
               driver.findElement(By.id("btnadminaddsitesubmit")).click();
                 System.out.println("save company master details");    
                 Thread.sleep(5000);

             
 
        }
   	     //dashboard
          public void startdashboard() throws InterruptedException {
        	   driver.findElement(By.id("clkusermenudashboard")).click();
        	     System.out.println("open dashboard");
        	     Thread.sleep(2000);
        	     
        	  //click dashboard icon   
        	   driver.findElement(By.xpath("//*[@class=\"ursor-pointer dash-icon comman-icon\"]")).click();
        	     System.out.println("click dashboard icon ");
                 Thread.sleep(2000);
        	   driver.findElement(By.id("btnNewdashboardAdd")).click();
        	     System.out.println("click add button");
        	     Thread.sleep(2000);
        	     
        	  //selectsite   
        	   WebElement selectsite = driver.findElement(By.id("mat-select-0"));
        	     selectsite.click();
        	   driver.findElement(By.id("mat-select-0")).sendKeys(Keys.DOWN);
        	   driver.findElement(By.id("mat-select-0")).sendKeys(Keys.ENTER);
        	     System.out.println("selectsite");
        	     Thread.sleep(2000);
        	  //selectpanel  
        	   WebElement selectpanel = driver.findElement(By.id("mat-select-1"));
        	     selectpanel.click();
        	   driver.findElement(By.id("mat-select-1")).sendKeys(Keys.DOWN);
        	   driver.findElement(By.id("mat-select-1")).sendKeys(Keys.ENTER);
        	     System.out.println("select panel");
        	     Thread.sleep(2000);
        	   
        	  //selectmeter  
        	   WebElement selectmeter = driver.findElement(By.id("mat-select-2"));
        	     selectmeter.click();
        	   driver.findElement(By.id("mat-select-2")).sendKeys(Keys.DOWN);
        	   driver.findElement(By.id("mat-select-2")).sendKeys(Keys.ENTER);
        	     System.out.println("select meter");
        	     Thread.sleep(2000);
        	   
        	  //selectregister   
        	   WebElement register = driver.findElement(By.id("mat-select-3"));
        	     register.click();
        	   driver.findElement(By.id("mat-select-3")).sendKeys(Keys.DOWN);
        	   driver.findElement(By.id("mat-select-3")).sendKeys(Keys.ENTER);
        	     System.out.println("select register");
        	     Thread.sleep(2000);
        	   driver.findElement(By.id("btnNewdashboardAdd")).click();
        	     System.out.println("data added successfully");
        	     Thread.sleep(2000);
        	  //delete
        	   driver.findElement(By.id("delete_icon")).click();
        	     System.out.println("delete added id");
        	     Thread.sleep(2000);
        	     
        	  //again add
        	    driver.findElement(By.id("btnNewdashboardAdd")).click();
        	      System.out.println("added");
        	      Thread.sleep(2000);
        	      
        	  //click save as   
      	       driver.findElement(By.id("btnNewdashboardSaveAs")).click();
      	         System.out.println("clicked on save as");
      	         Thread.sleep(2000);
      	         
      	      //create dashboard   
      	       driver.findElement(By.id("DashboardName")).sendKeys("Tathya dashboard");
      	         System.out.println("enter dashboard name");
      	         Thread.sleep(2000);
      	       driver.findElement(By.id("send")).click();
      	         System.out.println("save dashboard details");
      	         Thread.sleep(2000);
      	         
      	      //save dashboard details   
      	       driver.findElement(By.id("btnNewdashboardSave")).click();
      	         System.out.println("save");
      	         Thread.sleep(2000);
      	       driver.findElement(By.xpath("//div[contains(@class,'text-right flow-right')]//img[contains(@class,'img-fluid closeicon2 cursor-pointer')]")).click();  
      	         System.out.println("cancel");
      	         Thread.sleep(2000);
          }
        //flograph dashboard
         public void flowdashboard()throws InterruptedException {
          driver.findElement(By.id("card-data0")).click();
            System.out.println("open flowgraph");
            Thread.sleep(2000);
          
         //select value   
          driver.findElement(By.xpath("//*[@id=\"mat-select-4\"]")).click();
            System.out.println("select value");
            Thread.sleep(2000);
            
          driver.findElement(By.id("mat-option-14")).click();
          driver.findElement(By.id("mat-option-14")).sendKeys(Keys.TAB);  
            System.out.println("meter selected");
            Thread.sleep(2000);
            
         //Thresold value
          driver.findElement(By.id("UsermenuCompanyId")).click();
            System.out.println("Thresold value");
            Thread.sleep(2000);
            
          driver.findElement(By.xpath("//button[contains(@class,'btncommon btn-border')]")).click();
            System.out.println("cancel");
            Thread.sleep(2000);
            
         //Threasold value   
          driver.findElement(By.id("UsermenuCompanyId")).click();
            Thread.sleep(2000);
            
         //save thresold value   
          driver.findElement(By.xpath("//button[contains(@class,'btncommon btn-bg-blue')]")).click();
            System.out.println("save thresold value");
            Thread.sleep(2000);
            
         //cancel thresold popup
          driver.findElement(By.xpath("//img[contains(@class,'img-fluid closeicon2 cursor-pointer')]")).click();
            System.out.println("cancel thresold popup");
            Thread.sleep(2000);
          
         //datepicker
          driver.findElement(By.xpath("//button[contains(@class,'mat-focus-indicator mat-icon-button mat-button-base')]")).click();
            System.out.println("open date picker");
            Thread.sleep(2000);  
          
          driver.findElement(By.xpath("//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr[2]/td[5]/div[1]")).click();
            System.out.println("date selected");
            Thread.sleep(2000);
            
         //Search
          driver.findElement(By.id("getGraphOnDate-btn")).click();
            System.out.println("click on search");
            Thread.sleep(2000);
         }
    
	    // Admin UserMaster
	     public void UserMaster() throws InterruptedException {
		  driver.findElement(By.id("usermanagement")).click();
		    System.out.println("userm");
		    Thread.sleep(2000);
		  driver.findElement(By.id("AdminList2")).click();
	        System.out.println("usermaster");
	        Thread.sleep(2000);
	     
	     //search user  
	      driver.findElement(By.id("mat-input-0")).sendKeys("sweta");
	        Thread.sleep(2000);
	      driver.findElement(By.xpath("//span[contains(@class,'mat-option-text')]")).click();
	        Thread.sleep(2000);
	      driver.findElement(By.id("SearchusermasterSearch")).click();
	        System.out.println("search button");
	        Thread.sleep(2000);
	        
	     //add button   
	      driver.findElement(By.id("SearchusermasterAdd")).click();
	        System.out.println("Click add button");
	        Thread.sleep(2000);
	      driver.findElement(By.id("SearchusermasterAdd")).sendKeys();
	        Thread.sleep(2000);
	        
	     //search userid  
	      List<WebElement> tablerow = driver.findElements(By.xpath("//table[@id='companytable']//tr[2]//td[1]"));
       
           
	      //	        System.out.println("added value =="+tablerow.size());
//	      for(int count=0; count<tablerow.size();count++)  
//	        String addedvalue = tablerow.get(count).getText();
	       XYZ(tablerow,"get the Login Id==");
	       
//	        System.out.println("get the Login Id=="+);
	   
	      
	     //search username 
	      List<WebElement> tablerow1 = driver.findElements(By.xpath("//table[@id='companytable']//tr[2]//td[2]"));
//	        System.out.println("added value =="+tablerow1.size());
//	      for(int count=0; count<tablerow1.size();count++) {
//	        String addedvalue1 = tablerow1.get(count).getText();
	       XYZ(tablerow1, "get the UserName==");
//	        System.out.println("get the UserName=="+p1);
	   
	   //Role   
	    WebElement Role = driver.findElement(By.xpath("//*[@id=\"drpUsermasterRoleValue1\"]"));  
	      Role.click();
	    driver.findElement(By.xpath("//*[@id=\"drpUsermasterRoleValue1\"]")).sendKeys(Keys.UP);
	    driver.findElement(By.xpath("//*[@id=\"drpUsermasterRoleValue1\"]")).sendKeys(Keys.ENTER);
	      System.out.println("Role selected");
        driver.findElement(By.id("btnUsermasterView1")).click();
	      System.out.println("open view popup");
          Thread.sleep(2000);   
//	    driver.findElement(By.id("imgFlowmeterlistaddicon0")).click();
//	      Thread.sleep(2000);
//	      System.out.println("click sipl");
//	    driver.findElement(By.id("tdFlowmeterlistchkIsAssigned0")).click();
//	      System.out.println("panelname selected");
//	      Thread.sleep(2000);
	    driver.findElement(By.id("btnflowmeterlistsave")).click();
	      System.out.println("submitted successfully");
	      Thread.sleep(2000);
	    driver.findElement(By.id("btnflowmeterlistcancel")).click();
	      System.out.println("cancel");
	   
	   //view   
	    driver.findElement(By.id("btnUsermasterView1")).click();
		  System.out.println("open view popup");
	      Thread.sleep(2000);
	    driver.findElement(By.xpath("//img[contains(@class,'img-fluid closeicon2 cursor-pointer')]")).click();  
	      System.out.println("click on cancel icon");
	      
	    //Delete
		driver.findElement(By.id("btnUsermasterdelete1")).click();
		  Thread.sleep(2000);
		driver.findElement(By.id("btn-no")).click();
	      Thread.sleep(2000);
//	  	driver.findElement(By.id("btnUsermasterdelete1")).click();
//	      Thread.sleep(2000);
//	    driver.findElement(By.id("btn-yes")).click();
//	      System.out.println("delele username");
//	      Thread.sleep(2000);   
	}
	  public static void XYZ(List<WebElement> data,String value) {
		  System.out.println("added value =="+data.size());
		  for(int count = 0; count<data.size();count++) {
			  String addedvalue = data.get(count).getText();
			  System.out.println(value + addedvalue);
			  
			  
		  }
	  }
	  //Report config
	    public void Reportconfig() throws InterruptedException {
	     driver.findElement(By.id("usermanagement")).click();
	       Thread.sleep(2000);
	     driver.findElement(By.id("AdminList3")).click();
	       System.out.println("open report config");
	       Thread.sleep(2000);
	    
	    //open report   
	     driver.findElement(By.id("btnReportNewreport")).click();
	       System.out.println("open new report");
	       Thread.sleep(2000);
	       
	    // close report
	     driver.findElement(By.xpath("//img[contains(@class,'img-fluid closeicon2 cursor-pointer')]")).click();
	       System.out.println("close");
	       Thread.sleep(2000);

		//open report   
		 driver.findElement(By.id("btnReportNewreport")).click();
		   System.out.println("open new report");
		   Thread.sleep(2000);  
	    
		//report type dropdown   
	     WebElement Report = driver.findElement(By.id("Site-Name-control"));
           Report.click();
           System.out.println("Open Report type dropdown");
           Thread.sleep(2000);
         driver.findElement(By.xpath("//mat-option[contains(@id,'mat-option-1')]//span[contains(@class,'mat-option-text')]")).click();
           Thread.sleep(2000);
           
        //save   
         driver.findElement(By.id("btnNewdashboardSave")).click();
           Thread.sleep(2000);
           System.out.println("save");
           
        //close   
         driver.findElement(By.xpath("//img[contains(@class,'img-fluid closeicon2 cursor-pointer')]")).click();
           System.out.println("close Report");
	    }
//	    //
//	    public void reportex() throws InterruptedException {
//	    	driver.findElement(By.id("AdminList3")).click();
//	    	  System.out.println("open report config");
//              Thread.sleep(2000);
//            driver.findElement(By.id("btnReportNewreport")).click();  
	    //}
	    
	    //pumpcontrol
	      public void control() throws InterruptedException { 
	    	driver.findElement(By.id("control")).click();
	       	  Thread.sleep(2000);
	    	driver.findElement(By.id("ControlList0")).click();
	    	  System.out.println("open pump control");
	    	  Thread.sleep(2000);
	    	  
	       //search	  
	    	driver.findElement(By.id("Search-control")).click();
	    	driver.close();
	    }
	
	@Test
    public static void main() throws InterruptedException {
     RMS myObj = new RMS();
       myObj.driver();
       myObj.URL();
       
       myObj.companyMaster();
       myObj.configuration();
       myObj.RTC();
       myObj.startdashboard();
       myObj.flowdashboard();
       myObj.UserMaster();
       myObj.Reportconfig();
       myObj.control();	
	}
}
