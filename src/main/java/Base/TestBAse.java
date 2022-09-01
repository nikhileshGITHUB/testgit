package Base;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBAse {

  public static WebDriver driver;
	
  
 /// public void initalizationm()
  
	public void initalization() throws Exception
	{
		
		//String browser = Readpropertyfile("browser");
		if(readexcelfile(0, 4).equals("chrome"))
		{
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
// 
//		else if (readexcelfile(0, 4).equals("firefox"))
//		{
//	
//		WebDriverManager.chromedriver().setup();
//		driver = new FirefoxDriver();
//		}
//		else if (readexcelfile(0, 4).equals("opera"))
//		{
//	
//		WebDriverManager.chromedriver().setup();
//		driver = new OperaDriver();
//		}
	//driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		//driver.get(Readpropertyfile("url"));
		driver.get(readexcelfile(0, 0));
	}
	
	
	public String readexcelfile(int row,int col) throws Exception
	{
		FileInputStream file = new FileInputStream("D:\\java programs\\Aframework\\testdata\\Book1.xlsx");
	Sheet excelfile = WorkbookFactory.create(file).getSheet("Sheet1");
	String value =  excelfile.getRow(row).getCell(col).getStringCellValue();
	return value;
	}
//  public String Readpropertyfile(String value) throws Exception
//  {
//	 Properties prop = new Properties();
//	 FileInputStream file = new FileInputStream("D:\\java programs\\Aframework\\testdata\\config.properties");
//	 prop.load(file);
//	return prop.getProperty(value);
//  }
//	public void capturescfailed(String methodname) throws IOException
//	{
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		  File destination = new File("D:\\java programs\\Aframework\\screenshot\\"  + methodname +  ".png");
//		  FileHandler.copy(src,destination);
//		 
//	}
}
