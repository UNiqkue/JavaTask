package com.company.data;


import org.junit.Assert;
import org.junit.Test;


public class TimeFileReaderTest {

    @Test
    public void readLineValid() {
        String fileName = "input.txt";
        Assert.assertTrue(TimeFileReader.isLineValid(fileName));
    }

    @Test
    public void readLineNotValid(){
        String fileName = "notinput123";
        Assert.assertTrue(TimeFileReader.isLineValid(fileName));
    }

    @Test
    public void readLineNull(){
        String fileName = null;
        Assert.assertFalse(TimeFileReader.isLineValid(fileName));
    }

    @Test
    public void readLineEmpty(){
        String fileName = "";
        Assert.assertFalse(TimeFileReader.isLineValid(fileName));
    }

    @Test
    public void readLineHtml(){
        String fileName = "input.html";
        Assert.assertFalse(TimeFileReader.isLineValid(fileName));
    }





}
