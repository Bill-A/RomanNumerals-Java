package com.agileinnov.dojo;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralTest {

    @Test
    public void returnsIwhenGiven1() {
        Assert.assertEquals("I", com.agileinnov.dojo.RomanNumeral.of(1));
    }
    @Test
    public void returnsIIwhenGiven2() {
        Assert.assertEquals("II", com.agileinnov.dojo.RomanNumeral.of(2));
    }

}
