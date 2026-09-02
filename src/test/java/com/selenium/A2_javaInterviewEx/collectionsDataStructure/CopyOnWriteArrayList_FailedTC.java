package com.selenium.A2_javaInterviewEx.collectionsDataStructure;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_FailedTC {

    public static void getFailedTC(String testCase){
        List<String>  failedTC = new CopyOnWriteArrayList<>();
        failedTC.add(testCase);
    }
}
