package testselenium;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileExer {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		// u can use FileInputStream or FileReader to read the file(both of them will work) ..
		//FileInputStream file = new FileInputStream("C:\\Users\\swath\\Desktop\\Swathi.properties");
		
//		FileReader file = new FileReader("C:\\Users\\swath\\Desktop\\Swathi.properties");
//		prop.load(file);
//		System.out.println(prop.getProperty("name"));
//		System.out.println(prop.getProperty("course"));
//		System.out.println(prop.getProperty("Age"));
//		System.out.println(prop.getProperty("Gender"));
		FileReader file = new FileReader("C:\\Users\\swath\\Desktop\\sele.txt");
		BufferedReader bf = new BufferedReader(file);
		//how to print all the data present in File.
		String readData;
		while((readData=bf.readLine())!=null) {
			System.out.println(readData);
		}

	}

}
