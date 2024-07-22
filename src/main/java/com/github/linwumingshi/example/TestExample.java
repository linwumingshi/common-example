package com.github.linwumingshi.example;

import com.github.linwumingshi.TestUtils;
import com.google.gson.Gson;

public class TestExample {


    public static void main(String[] args) {
        String randomString = TestUtils.getRandomString(6);
        System.out.println(randomString);
        Gson gson = new Gson();
        System.out.println(gson.toJson(randomString));
    }
}
