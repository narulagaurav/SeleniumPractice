package com.qa.Util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class Screenshot {

    public static void screenshot_element(WebElement element) throws IOException {
        File srcFile1=element.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile1,new File("./image1.png"));
    }
}
