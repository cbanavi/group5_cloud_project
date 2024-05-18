package com.group5_sprint2_cloud.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;

public class DeckUtilsPS {


        public static WebElement findElementByTwoElements(WebElement firstElement, WebElement secondElement) {
            if (firstElement.isDisplayed()) {
                return firstElement; // Return the first element if it is displayed
            } else if (secondElement.isDisplayed()) {
                return secondElement; // Return the second element if it is displayed
            }

            throw new NoSuchElementException("Neither element is displayed");
        }



    }




