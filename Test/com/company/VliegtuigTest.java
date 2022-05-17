package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VliegtuigTest {

    @Test
    public void kanOpstijgenTest(){
        Vliegtuig vliegtuig = new Vliegtuig(60, 999, true);

        assertTrue(vliegtuig.kanOpstijgen(51, 1001, true));
        assertTrue(vliegtuig.kanOpstijgen(40, 999, true));

        assertFalse(vliegtuig.kanOpstijgen(51, 998, false));
        assertFalse(vliegtuig.kanOpstijgen(49, 42069, true));


  }
  @Test
    public void prijsVoorGewichtVliegtuigTest(){
        assertEquals(100, new Vliegtuig(60, 999, true).prijsVoorGewichtVliegtuig(0) );
      assertEquals(100, new Vliegtuig(60, 999, true).prijsVoorGewichtVliegtuig(999) );
      assertEquals(500, new Vliegtuig(60, 999, true).prijsVoorGewichtVliegtuig(1000) );
      assertEquals(500, new Vliegtuig(60, 999, true).prijsVoorGewichtVliegtuig(4999) );
      assertEquals(2500, new Vliegtuig(60, 999, true).prijsVoorGewichtVliegtuig(5000) );

  }
  @Test
    public void prijsVoorVluchtTest(){
        assertEquals(1089, new Vliegtuig(60,999,true).prijsVoorVlucht(500,1,true,true));
        assertEquals(150, new Vliegtuig(60,999,true).prijsVoorVlucht(500,5,false,false));
        assertEquals(605, new Vliegtuig(60,999,true).prijsVoorVlucht(2000,1,false,true));
        assertEquals(1550, new Vliegtuig(60,999,true).prijsVoorVlucht(2000,5,true,false));
        assertEquals(3300, new Vliegtuig(60,999,true).prijsVoorVlucht(7000,1,true,false));
        assertEquals(4537.5, new Vliegtuig(60,999,true).prijsVoorVlucht(7000,5,false,true));
  }

}