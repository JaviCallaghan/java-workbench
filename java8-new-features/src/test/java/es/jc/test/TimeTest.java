package es.jc.test;

import static org.junit.Assert.assertEquals;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import org.junit.Test;

/**
 * Java Time tests.
 * 
 * @author JaviCallaghan
 */
public class TimeTest {

	public TimeTest() {
	}

	@Test
	public void testTime() {

		final Clock utcClock = Clock.systemUTC();
		
		// continuous time: Instant and Duration
		final Instant instant = Clock.systemDefaultZone().instant();
		System.out.println("Current time: " + instant);
		
		Duration delay = Duration.between(instant, utcClock.instant());
		System.out.println("delayed " + delay.toMillis() + " ms (" + delay.toNanos() + " ns)");

		// relative time: LocalDate/Time/DateTime, Offset, Period, Year, MonthDay, YearMonth...
		LocalDateTime now = LocalDateTime.now();
		LocalDate yesterday = LocalDate.now(Clock.offset(utcClock, Duration.ofHours(-24)));
		System.out.println("LocalDate: " + now
				+ "(" + now.getDayOfMonth() + " of " + now.getMonth() + ")"
				+ " and yesterday: " + yesterday);
		assertEquals(yesterday, LocalDate.now().minusDays(1));

		Period weekPeriod = Period.ofDays(7);
		System.out.println("After a week we will be at: " + now.plus(weekPeriod));

		System.out.println(Instant.parse("2011-12-03T10:15:30.00Z").plus(30, ChronoUnit.DAYS));

	}

}
