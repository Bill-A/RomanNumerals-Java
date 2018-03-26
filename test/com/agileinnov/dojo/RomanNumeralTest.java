package com.agileinnov.dojo;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralTest {

    @Test
    public void returnsIwhenGiven1() {
        Assert.assertEquals("I", com.agileinnov.dojo.RomanNumeral.of(1));
    }

}
