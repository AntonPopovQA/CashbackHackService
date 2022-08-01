package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    @Test
    public void shouldCashbackHackService() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCashbackHackServiceAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}