package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTestJunitJupiter4 {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldMustAdd0() {
        assertEquals(1000, service.remain(0));

        System.out.println();
        System.out.println("      Nothing needs to be added");
    }

    @org.junit.Test
    public void shouldMustAdd100() {
        assertEquals(900, service.remain(100));

        System.out.println();
        System.out.println("      To be added: 100");
    }

    @org.junit.Test
    public void shouldMustAdd1To1000() {
        assertEquals(999, service.remain(1));

        System.out.println();
        System.out.println("      To be added: 1");
    }

    @org.junit.Test
    public void shouldMustAdd999To1000() {
        assertEquals(1, service.remain(999));

        System.out.println();
        System.out.println("      To be added: 999");
    }

    @org.junit.Test
    public void shouldMustAdd0To1000() {
        assertEquals(0, service.remain(1000));

        System.out.println();
        System.out.println("      Error: To be added: 1000");
    }

    @Test
    public void remain() {
    }
}