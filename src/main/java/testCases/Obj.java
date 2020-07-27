package testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Obj {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		String path = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(path + "/src/main/resources/config.properties");
		prop.load(fis);
		String sHubUrl = prop.getProperty("HUB");
		String sHubPort = prop.getProperty("PORT");
		String sUrl = prop.getProperty("URL");
		System.out.println(sHubUrl + " " + sHubPort);

		FileOutputStream fos = new FileOutputStream("./src/main/resources./Config/config.properties");
		prop.setProperty("name", "tittu");
		prop.store(fos, "This is prop");
		String ssHubUrl = prop.getProperty("name");
		System.out.println(ssHubUrl);

	}

}
