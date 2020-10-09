package com.company;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {
//        WebDriver driver = new FirefoxDriver();
        WebDriver driver = new OperaDriver();
        System.out.println("Driver");
    }
}
