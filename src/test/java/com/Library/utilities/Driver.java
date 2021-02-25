package com.Library.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver
    {

        private Driver()
            {
            }
        private static  ThreadLocal<WebDriver> driverpoll = new ThreadLocal<>();


        public static WebDriver getDriver()
            {
                synchronized (Driver.class)
                    {

                        if (driverpoll.get() == null)
                            {
                                String browser = ConfigurationReader.getProperty("browser");
                                switch (browser)
                                    {
                                        case "chrome":
                                            WebDriverManager.chromedriver().setup();
                                            driverpoll.set(new ChromeDriver());
                                            driverpoll.get().manage().window().maximize();
                                            driverpoll.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                            break;

                                        case "remote-chrome":
                                            ChromeOptions  chromeOptions = new ChromeOptions();
                                            try
                                                {
                                                    URL url = new URL("http://54.197.231.12:4444/wd/hub");

                                                    driverpoll.set(new RemoteWebDriver(url,chromeOptions));
                                                } catch (MalformedURLException e)
                                                {
                                                    e.printStackTrace();
                                                }
                                        case "firefox":
                                            WebDriverManager.firefoxdriver().setup();
                                            driverpoll.set(new FirefoxDriver());
                                            driverpoll.get().manage().window().maximize();
                                            driverpoll.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                            break;
                                        default:
                                            WebDriverManager.chromedriver().setup();
                                            driverpoll.set(new ChromeDriver());
                                            driverpoll.get().manage().window().maximize();
                                            driverpoll.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                            break;

                                    }
                            }
                        return driverpoll.get();
                    }
            }



        public static void closeDriver()
        {
            if (driverpoll.get() != null)
            {
                driverpoll.get().quit();

                driverpoll.remove();
            }


        }



    }