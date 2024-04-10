package com.example.intervyu;

import com.example.intervyu.service.ATMService;
import com.example.intervyu.service.impl.ATMServiceImpl;

public class Test {
    public static void main(String[] args) {

        ATM atm = new ATM(50, 100, 500, 1000, 5000);
        ATMService atmService = new ATMServiceImpl(atm);

        System.out.println(atmService.withdraw(5000));
        System.out.println(atmService.withdraw(7250));
        System.out.println(atmService.withdraw(6750));
    }
}
