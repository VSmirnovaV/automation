package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldBeCalculateBoundaryLess1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldBeCalculateBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldBeCalculateTheAmountWhenBuying1() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1);
        int expected = 999;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldBeCalculateTheAmountWhenBuying0() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);

    }
}
