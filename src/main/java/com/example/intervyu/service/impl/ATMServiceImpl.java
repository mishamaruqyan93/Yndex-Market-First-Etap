package com.example.intervyu.service.impl;

import com.example.intervyu.ATM;
import com.example.intervyu.service.ATMService;

public class ATMServiceImpl implements ATMService {

    private ATM atm = new ATM();

    public ATMServiceImpl(ATM atm) {
        this.atm = atm;
    }

    @Override
    public String withdraw(int amount) {
        if (amount < 0) {
            return "Отказ";
        }
        Integer[] notes = new Integer[]{50, 100, 500, 1000, 5000};
        Integer[] noteCounter = new Integer[]{0, 0, 0, 0, 0};


        for (int i = notes.length - 1; i >= 0; i--) {
            if (amount >= notes[i]) {
                noteCounter[i] = Math.min(amount / notes[i], this.getCountOfNotes(notes[i]));
                amount -= noteCounter[i] * notes[i];
            }
        }
        if (amount > 0) {
            return "Отказ";
        } else {
            Integer balance50 = atm.getBalance50();
            balance50 -= noteCounter[0];

            Integer balance100 = atm.getBalance100();
            balance100 -= noteCounter[1];

            Integer balance500 = atm.getBalance500();
            balance500 -= noteCounter[2];

            Integer balance1000 = atm.getBalance1000();
            balance1000 -= noteCounter[3];

            Integer balance5000 = atm.getBalance5000();
            balance5000 -= noteCounter[4];
            return "Выдано : 50 " + noteCounter[0] + ", 100 " + noteCounter[1] + ", 500 "
                    + noteCounter[2] + ", 1000 " + noteCounter[3] + ", 5000 " + noteCounter[4];
        }
    }

    private int getCountOfNotes(int noteValue) {
        if (noteValue == 50) {
            return atm.getBalance50();
        } else if (noteValue == 100) {
            return atm.getBalance100();
        } else if (noteValue == 500) {
            return atm.getBalance500();
        } else if (noteValue == 1000) {
            return atm.getBalance1000();
        } else if (noteValue == 5000) {
            return atm.getBalance5000();
        } else return 0;
    }
}
