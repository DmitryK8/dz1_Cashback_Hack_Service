package ru.netology.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;



public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldMustAdd0() {
        assertEquals(service.remain(0), 1000);

        System.out.println();
        System.out.println("      Nothing needs to be added");
    }

    @Test
    public void shouldMustAdd100() {
        assertEquals(service.remain(100), 900);

        System.out.println();
        System.out.println("      To be added: 100");
    }

    @Test
    public void shouldMustAdd1To1000() {
        assertEquals(service.remain(1), 999);

        System.out.println();
        System.out.println("      To be added: 1");
    }

    @Test
    public void shouldMustAdd999To1000() {
        assertEquals(service.remain(999), 1);

        System.out.println();
        System.out.println("      To be added: 999");
    }

    @Test
    public void shouldErrorMustAdd0To1000() {
        assertEquals(service.remain(1000), 0);

        System.out.println();
        System.out.println("     Error: To be added: 1000");
    }
}