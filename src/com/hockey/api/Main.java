package com.hockey.api;

import java.net.MalformedURLException;

import static com.hockey.api.HttpCallOne.httpCallOne;
import static com.hockey.api.HttpCallTwo.httpCallTwo;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        httpCallOne();
//        httpCallTwo();
    }
}
