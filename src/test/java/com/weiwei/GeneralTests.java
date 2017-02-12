package com.weiwei;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Test;

public class GeneralTests {
	
	@Test
	public void test1() {
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		Instant instant = Instant.now();
		long timeStampMillis = instant.toEpochMilli();
		long timeStampSeconds = instant.getEpochSecond();
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println(timeStampMillis);
		System.out.println(timeStampSeconds);
	}
}
