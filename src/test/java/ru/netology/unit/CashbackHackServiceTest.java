package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldMustAdd0() {
        assertEquals(1000, service.remain(0));

        System.out.println();
        System.out.println("      Nothing needs to be added");
    }

    @Test
    public void shouldMustAdd100() {
        assertEquals(900, service.remain(100));

        System.out.println();
        System.out.println("      To be added: 100");
    }

    @Test
    public void shouldMustAdd1To10000() {
        assertEquals(999, service.remain(1));

        System.out.println();
        System.out.println("      To be added: 1");
    }

    @Test
    public void shouldMustAdd999To1000() {
        assertEquals(1, service.remain(999));

        System.out.println();
        System.out.println("      To be added: 999");
    }

    @Test
    public void shouldMustAdd0To1000() {
        assertEquals(0, service.remain(1000));

        System.out.println();
        System.out.println("      Error: To be added: 1000");
    }
}