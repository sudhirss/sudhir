package com.qaagility.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.qaagility.javaee.*;
 

public class AppTest {

Calculator myCalc = new Calculator();
Calcmul cal = new Calcmul();
      public void testSlow() {
        System.out.println("slow");
      }

      public void testSlower() {
        System.out.println("slower");
      }

      public void testFast() {
        System.out.println("fast-updated");
      }
	
	@Test	
      public void testCalc() {
        assertEquals("Result", 9, myCalc.add(3,6));
	assertEquals("Result", 9, myCalc.add());
	assertEquals("Result", 18, cal.mul());
      }
