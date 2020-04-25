package com.databaseJdbc.pyt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumJDBCTsesting {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();

		Class.forName("com.mysql.jdbc.Driver");
		String URL = "jdbc:mysql://localhost:3306/test";
		String uname = "root";
		String pawsd = "root";
		String query = "select name,pwd from studenttest";
		Connection con = DriverManager.getConnection(URL, uname, pawsd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			String username = rs.getString("name");
			String pwd = rs.getString("pwd");
			System.out.print(username + "  ");
			System.out.println(pwd);
			driver.findElement(By.name("userName")).sendKeys(username);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
			driver.findElement(By.name("login")).click();
			if (driver.getTitle().contains("Sign-on: Mercury Tours")) {
				System.out.println("test case is passed!!!!");
			} else {
				System.out.println("Sorry Failed!!");
			}
			driver.findElement(By.linkText("Home")).click();
		}
		rs.close();
		st.close();
		con.close();
		Thread.sleep(5000);
		driver.close();
	}

}
