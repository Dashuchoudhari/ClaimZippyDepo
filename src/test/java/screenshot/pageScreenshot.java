package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import base.TestBase;

public class pageScreenshot extends TestBase{
	
	public void screenshot() throws IOException {
	
	TakesScreenshot screenshot = (TakesScreenshot)driver;
	
	File source = screenshot.getScreenshotAs(OutputType.FILE);
	
	FileHandler.copy(source, new File("+\\src\\test\\java\\screenshot\\screen"));
	
	

}
}
