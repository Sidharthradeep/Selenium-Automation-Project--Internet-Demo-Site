package Pagepkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ABtesting{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"content\"]/ul/li[1]/a")
	WebElement abtest;
	
	@FindBy(xpath="//*[@id=\"content\"]/ul/li[2]/a")
	WebElement add_remove;
	@FindBy(xpath="//*[@id=\"content\"]/div/button")
	WebElement add;
	@FindBy(xpath="//*[@id=\"elements\"]/button")
	WebElement remove;
	
	@FindBy(xpath="//*[@id=\"content\"]/ul/li[3]/a")
	WebElement auth;
	
	@FindBy(xpath="/html/body/div[2]/div/ul/li[4]/a")
	WebElement brokimg;
	
	@FindBy(xpath="/html/body/div[2]/div/ul/li[44]/a")
	WebElement editor;
	
	@FindBy(xpath="/html/body/div[2]/div/ul/li[43]/a")
	WebElement typos;
	
	@FindBy(xpath="/html/body/div[2]/div/ul/li[42]/a")
	WebElement Statuscode;
	
	@FindBy(xpath="/html/body/div[2]/div/ul/li[6]/a")
	WebElement checkbox;
	
	@FindBy(xpath="/html/body/div[2]/div/ul/li[7]/a")
	WebElement contextmenu;
	
	@FindBy(xpath="/html/body/div[2]/div/ul/li[8]/a")
	WebElement directauth;
	
	@FindBy(xpath="/html/body/div[2]/div/ul/li[10]/a")
	WebElement dragdrop;
	
	@FindBy(xpath="/html/body/div[2]/div/ul/li[11]/a")
	WebElement dropdown;
	
	@FindBy(xpath="/html/body/div[2]/div/ul/li[13]/a")
	WebElement dycontrol;
	
	@FindBy(xpath="/html/body/div[2]/div/ul/li[14]/a")
	WebElement dyload;
	
	@FindBy(xpath="/html/body/div[2]/div/ul/li[17]/a")
	WebElement download;
	
	@FindBy(xpath="/html/body/div[2]/div/ul/li[18]/a")
	WebElement upload;
	
	@FindBy(xpath="/html/body/div[2]/div/ul/li[21]/a")
	WebElement formauth;
	
	
	@FindBy(xpath="/html/body/div[2]/div/ul/li[24]/a")
	WebElement slider;
	
	@FindBy(xpath="/html/body/div[2]/div/ul/li[25]/a")
	WebElement Hover;
	
	@FindBy(xpath="/html/body/div[2]/div/ul/li[27]/a")
	WebElement input;
	
	@FindBy(xpath="/html/body/div[2]/div/ul/li[28]/a")
	WebElement jqueryui;
	
	@FindBy(xpath="/html/body/div[2]/div/ul/li[29]/a")
	WebElement Alertpop;
	@FindBy(xpath="/html/body/div[2]/div/div/ul/li[1]/button")
	WebElement jsalert;
	@FindBy(xpath="/html/body/div[2]/div/div/ul/li[2]/button")
	WebElement jsconfirm;
	@FindBy(xpath="/html/body/div[2]/div/div/ul/li[3]/button")
	WebElement jsprompt;
	
	@FindBy(xpath="/html/body/div[2]/div/ul/li[31]/a")
	WebElement keypress;
	@FindBy(id="target")
	WebElement keytarget;
	
	@FindBy(xpath="/html/body/div[2]/div/ul/li[33]/a")
	WebElement Mulwindow;
	@FindBy(xpath="/html/body/div[2]/div/div/a")
	WebElement nextwind;
	
	public ABtesting(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	public void ABtest() throws InterruptedException {
		Thread.sleep(5000);
		abtest.click();
		driver.getTitle();
		driver.navigate().back();
	}
	
	public void addremove() {
		add_remove.click();
		add.click();
		remove.click();
		driver.navigate().back();
	}
	
	public void basic_auth() throws Exception {
		auth.click();
		Thread.sleep(4000);
        String filePath = "C:\\Users\\SidharthRadeep\\eclipse-workspace\\Selenium_Internet_Demo\\au3.exe";
        ProcessBuilder pb = new ProcessBuilder(filePath);
        Process process = pb.start();
        driver.navigate().back();
        }
	
	public void broken_img() {
		brokimg.click();
		
        List<WebElement> images = driver.findElements(By.tagName("img"));

        for (int i = 0; i < images.size(); i++) {
            WebElement img = images.get(i);
            String imgSrc = img.getAttribute("src");

            try {
                HttpURLConnection connection = (HttpURLConnection) (new URL(imgSrc).openConnection());
                connection.setRequestMethod("HEAD");
                connection.connect();

                int responseCode = connection.getResponseCode();

                if (responseCode >= 400) {
                    System.out.println("Broken Image Found: " + imgSrc + " (Status: " + responseCode + ")");
                } else {
                    System.out.println("Image OK: " + imgSrc);
                }

            } catch (Exception e) {
                System.out.println("Exception for image: " + imgSrc + e.getMessage());
            }
        }    
        driver.navigate().back();
	}
        
        public void Editor() {
        	editor.click();
        	driver.findElement(By.xpath("/html/body/div[4]/div/div/button")).click();
        	driver.navigate().back();
        }
        
        public void typos() {
        	typos.click();
        	String p1=driver.findElement(By.xpath("/html/body/div[2]/div/div/p[1]")).getText();
        	String p2=driver.findElement(By.xpath("/html/body/div[2]/div/div/p[2]")).getText();
        	Assert.assertEquals(p1,"This example demonstrates a typo being introduced. It does it randomly on each page load.");
        	Assert.assertEquals(p2,"Sometimes you'll see a typo, other times you won't.");
        	driver.navigate().back();
        }
        
        
        public void status_code() throws IOException, URISyntaxException {
        	Statuscode.click();
        	String uri=driver.getCurrentUrl();
        	URI ob=new URI(uri);
        	HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
        	System.out.println(con.getResponseCode());
        	driver.navigate().back();
        }
        
        
        public void checkbox() {
        	checkbox.click();
        	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[1]")).click();
        	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[2]")).isSelected();
        	driver.navigate().back();
        }
        
        public void contextmenu() {
        	contextmenu.click();
        	WebElement context=driver.findElement(By.id("hot-spot"));
        	Actions act=new Actions(driver);
        	act.contextClick(context).build().perform();
        	driver.switchTo().alert().accept();
        	driver.navigate().back();
        }
        
        public void directauth() throws Exception {
        	directauth.click();
        	Thread.sleep(2000);
        	String filePath = "C:\\Users\\SidharthRadeep\\eclipse-workspace\\Selenium_Internet_Demo\\directauth.exe";
            ProcessBuilder pbs = new ProcessBuilder(filePath);
            Process process = pbs.start();
            driver.navigate().back();
        }
        
        public void dragdrop() {
        	dragdrop.click();
        	WebElement a=driver.findElement(By.id("column-a"));
        	WebElement b=driver.findElement(By.id("column-b"));
        	Actions act=new Actions(driver);
        	act.dragAndDrop(a,b).build().perform();
        	driver.navigate().back();
        }
        
        public void dropdown() {
        	dropdown.click();
        	WebElement drop=driver.findElement(By.id("dropdown"));
        	Select dropdown=new Select(drop);
        	dropdown.selectByIndex(2);
        	driver.navigate().back();
        }
        
        public void dynamic_control() throws Exception {
        	dycontrol.click();
        	driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form[1]/button")).click();
        	Thread.sleep(4000);
        	driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form[2]/button")).click();
        	Thread.sleep(4000);
        	driver.navigate().back();
        }
        
        public void dynamic_load() throws Exception {
        	dyload.click();
        	Thread.sleep(2000);
        	driver.findElement(By.xpath("/html/body/div[2]/div/div/a[1]")).click();
        	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/button")).click();
        	Thread.sleep(6000);
        	driver.navigate().back();
        	driver.navigate().back();
        }
        
        public void download() {
        	download.click();
        	driver.findElement(By.xpath("/html/body/div[2]/div/div/a[1]")).click();
        	driver.navigate().back();
        }
        
        public void upload() throws Exception {
        	upload.click();
            WebElement uploadInput = driver.findElement(By.id("file-upload"));
            uploadInput.sendKeys("C:\\Users\\SidharthRadeep\\Downloads\\hippo point.jpg");
            Thread.sleep(3000);
            driver.findElement(By.id("file-submit")).click();
            if (driver.getTitle()=="File Uploaded!") {
                System.out.println("File uploaded successfully!");
            }
            driver.navigate().to("https://the-internet.herokuapp.com/");
        }
        
        public void formauth() throws Exception {
        	formauth.click();
        	driver.findElement(By.id("username")).sendKeys("tomsmith");
        	driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button/i")).click();
        	driver.navigate().to("https://the-internet.herokuapp.com/");
            Thread.sleep(5000);
        }
        
        public void slider() throws Exception {
        	JavascriptExecutor js=(JavascriptExecutor)driver;
        	js.executeScript("window.scrollBy(0,300)");
        	slider.click();
        	WebElement slide=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/input"));
        	slide.click();
        	Actions act=new Actions(driver);
        	for(int i=0;i<6;i++)
        	{
        		act.sendKeys(Keys.ARROW_RIGHT).perform();
        		Thread.sleep(200);
        	}
        	driver.navigate().back();
        }
        
        public void hover() {
        	Hover.click();
        	Actions act=new Actions(driver);
        	WebElement user1=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/img"));
        	WebElement user2=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/img"));
        	WebElement user3=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/img"));
        	act.moveToElement(user1).build().perform();
        	act.moveToElement(user2).build().perform();
        	act.moveToElement(user3).build().perform();
        	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/a")).click();
        	driver.navigate().to("https://the-internet.herokuapp.com/");
        }
        
        public void input() {
        	input.click();
        	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/input")).sendKeys("3995");
        	driver.navigate().back();
        }
        
        public void jqueryui() throws Exception {
        	jqueryui.click();
        	WebElement enabled=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/li[2]/a"));
        	Actions act=new Actions(driver);
        	act.moveToElement(enabled).build().perform();
        	enabled.click();
        	Thread.sleep(5000);
        	WebElement back=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/li[2]/ul/li[2]/a"));
        	act.moveToElement(back).build().perform();
        	back.click();
        	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/li/a")).click();
        	driver.navigate().to("https://the-internet.herokuapp.com/");
        }
        
        public void javascriptquery() {
        	Alertpop.click();
        	jsalert.click();
        	Alert js=driver.switchTo().alert();
        	js.accept();
        	jsconfirm.click();
        	js.dismiss();
        	jsprompt.click();
        	js.sendKeys("Hello");
        	js.accept();
        	driver.navigate().back();
        }
        
        public void keypress() throws Exception {
        	keypress.click();
        	keytarget.sendKeys("o");
        	keytarget.sendKeys("k");
        	keytarget.sendKeys(Keys.ENTER);
        	Thread.sleep(5000);
        	driver.navigate().to("https://the-internet.herokuapp.com/");
        }
        
        public void Mulwindow() {
        	Mulwindow.click();
        	String parent=driver.getWindowHandle();
        	nextwind.click();
        	driver.switchTo().window(parent);
        	driver.navigate().back();
        }
}
