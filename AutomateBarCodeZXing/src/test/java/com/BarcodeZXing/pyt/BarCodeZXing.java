package com.BarcodeZXing.pyt;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class BarCodeZXing {

	public static void main(String[] args) throws IOException, NotFoundException, InterruptedException {
		// Chrome version is not supporting. Firefox is working.
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		String barcodeURL = driver.findElement(By.xpath(
				"/html/body/div[4]/div[2]/div[2]/div[2]/footer/div/div[2]/div[2]/table/tbody/tr/td[2]/div/div[1]/div[1]/img[1]"))
				.getAttribute("src");

		System.out.println(barcodeURL);
		URL url = new URL(barcodeURL);
		BufferedImage bimage = ImageIO.read(url);
		LuminanceSource lsource = new BufferedImageLuminanceSource(bimage);
		BinaryBitmap bbmap = new BinaryBitmap(new HybridBinarizer(lsource));
		// it will return result object
		Result result = new MultiFormatReader().decode(bbmap);
		System.out.println(result.getText());
		Thread.sleep(5000);
		driver.quit();

	}

}
