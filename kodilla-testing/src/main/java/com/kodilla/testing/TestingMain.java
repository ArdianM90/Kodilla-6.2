package com.kodilla.testing;

import com.kodilla.testing.calculator.SimpleCalculator;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.SimpleCalculator;

public class TestingMain {
    public static void main(String[] args){
        //System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println();

        System.out.println("===Testing calculator===");
        SimpleCalculator simpleCalc = new SimpleCalculator();
        int testVal1 = 10;
        int testVal2 = -13;
        System.out.println("add operation test...");
        if(simpleCalc.add(testVal1, testVal2) == (testVal1 + testVal2)) {
            System.out.println("add operation OK");
        } else {
            System.out.println("add operation ERROR");
        }
        System.out.println("substract operation test...");
        if(simpleCalc.substract(testVal1, testVal2) == (testVal1 - testVal2)) {
            System.out.println("substract operation OK");
        } else {
            System.out.println("substract operation ERROR");
        }
    }
}