package com.selenium.A1_seleniumInterviewEx;


import java.awt.*;
import java.awt.event.KeyEvent;
/*

Robot class is a built-in Java AWT utility (java.awt.Robot) used in Selenium automation to simulate native
operating system-level keyboard and mouse events. It allows tests to control the cursor, click coordinates, type keystrokes,
and interact with native OS dialogs like file uploads, basic HTTP authentication prompts, or print windows that the browser-restricted
WebDriver cannot reach

*/

public class RobotUtility {
        public static void pressEnterKey() {
            try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
    }

