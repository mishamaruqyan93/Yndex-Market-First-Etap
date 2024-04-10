package com.example.intervyu;

import java.util.Objects;

/**
 * Банкомат.
 * Инициализируется набором купюр и умеет выдавать купюры для заданной суммы, либо отвечать отказом.
 * При выдаче купюры списываются с баланса банкомата.
 * Допустимые номиналы: 50₽, 100₽, 500₽, 1000₽, 5000₽.
 */
public class ATM {

    private Integer balance50;
    private Integer balance100;
    private Integer balance500;
    private Integer balance1000;
    private Integer balance5000;

    public ATM(Integer balance50, Integer balance100,
               Integer balance500, Integer balance1000, Integer balance5000) {
        this.balance50 = balance50;
        this.balance100 = balance100;
        this.balance500 = balance500;
        this.balance1000 = balance1000;
        this.balance5000 = balance5000;
    }

    public ATM() {
    }

    public Integer getBalance50() {
        return balance50;
    }

    public void setBalance50(Integer balance50) {
        this.balance50 = balance50;
    }

    public Integer getBalance100() {
        return balance100;
    }

    public void setBalance100(Integer balance100) {
        this.balance100 = balance100;
    }

    public Integer getBalance500() {
        return balance500;
    }

    public void setBalance500(Integer balance500) {
        this.balance500 = balance500;
    }

    public Integer getBalance1000() {
        return balance1000;
    }

    public void setBalance1000(Integer balance1000) {
        this.balance1000 = balance1000;
    }

    public Integer getBalance5000() {
        return balance5000;
    }

    public void setBalance5000(Integer balance5000) {
        this.balance5000 = balance5000;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ATM atm = (ATM) o;
        return Objects.equals(balance50, atm.balance50) && Objects.equals(balance100, atm.balance100) && Objects.equals(balance500, atm.balance500) && Objects.equals(balance1000, atm.balance1000) && Objects.equals(balance5000, atm.balance5000);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance50, balance100, balance500, balance1000, balance5000);
    }

    @Override
    public String toString() {
        return "ATM{" +
                "balance50=" + balance50 +
                ", balance100=" + balance100 +
                ", balance500=" + balance500 +
                ", balance1000=" + balance1000 +
                ", balance5000=" + balance5000 +
                '}';
    }
}
