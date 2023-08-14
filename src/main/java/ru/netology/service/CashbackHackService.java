package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        if (amount >= 1000) {
            return amount % boundary;
        } else {
          return boundary - amount % boundary;
        }
    }
}
