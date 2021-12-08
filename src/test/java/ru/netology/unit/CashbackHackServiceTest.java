package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldMustAdd0() {
        assertEquals(1000, service.remain(0));
    }

    @Test
    public void shouldMustAdd100() {
        assertEquals(900, service.remain(100));
    }

    @Test
    public void shouldMustAdd1To10000() {
        assertEquals(999, service.remain(1));
    }

    @Test
    public void shouldMustAdd999To11000() {
        assertEquals(1, service.remain(10999));
    }

    @Test
    public void shouldMustAdd0To1000() {
        assertEquals(1000, service.remain(0));
    }
}