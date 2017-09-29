package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test.
 *
 *@author deniskaa (koty.denis@gmail.com)
 *@version 1.0
 *since 29.09.2017
 */

public class CalculateTest {
/**
 *Test echo.
 */
 @Test
 public void whenTakeNameThreeEchoPlusName(){
   String input = "deniskaa";
   String expect = "Echo, echo, echo: deniskaa";
   Calculate calc = new Calculate();
   String result = calc.echo(input);
   assertThat(result,is(expect));
 }
}
