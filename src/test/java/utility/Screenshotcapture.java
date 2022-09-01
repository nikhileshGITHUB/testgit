package utility;


import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class Screenshotcapture {

	public static void capturescfailed(WebDriver driver ,String methodname) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File destination = new File("D:\\java programs\\Aframework\\screenshot\\"  + methodname +  ".png");
		  FileHandler.copy(src,destination);
		 
	}
	
}
