package com.assignment;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class GlobalMeetingScheduler {
	
	String s="^(?=.*[A-Za-z])(?=.*\\d";

    // Function to convert the local meeting time to UTC
    public static ZonedDateTime convertToUTC(ZonedDateTime localTime) {
        return localTime.withZoneSameInstant(ZoneOffset.UTC);  // Convert local time to UTC
    }

    // Function to find the day of the week for a given UTC time
    public static String getDayOfWeek(ZonedDateTime utcTime) {
        DayOfWeek dayOfWeek = utcTime.getDayOfWeek();  // Get the day of the week (Monday, Tuesday, etc.)
        return dayOfWeek.toString();  // Return the name of the day (e.g., MONDAY, TUESDAY)
    }

    // Function to check if the meeting falls on a weekend
    public static boolean isWeekend(ZonedDateTime utcTime) {
        DayOfWeek dayOfWeek = utcTime.getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }

    public static void main(String[] args) {
        // Define meeting times in different time zones
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        // Local meeting time in different time zones
        ZonedDateTime newYorkTime = ZonedDateTime.of(LocalDateTime.parse("2025-01-22 09:00", formatter), ZoneId.of("America/New_York"));
        ZonedDateTime londonTime = ZonedDateTime.of(LocalDateTime.parse("2025-01-22 15:00", formatter), ZoneId.of("Europe/London"));
        ZonedDateTime sydneyTime = ZonedDateTime.of(LocalDateTime.parse("2025-01-23 05:00", formatter), ZoneId.of("Australia/Sydney"));

        // Convert local meeting times to UTC
        ZonedDateTime newYorkTimeUTC = convertToUTC(newYorkTime);
        ZonedDateTime londonTimeUTC = convertToUTC(londonTime);
        ZonedDateTime sydneyTimeUTC = convertToUTC(sydneyTime);

        // Get the day of the week in UTC
        String newYorkDay = getDayOfWeek(newYorkTimeUTC);
        String londonDay = getDayOfWeek(londonTimeUTC);
        String sydneyDay = getDayOfWeek(sydneyTimeUTC);

        // Check if the meeting falls on a weekend
        boolean isNewYorkWeekend = isWeekend(newYorkTimeUTC);
        boolean isLondonWeekend = isWeekend(londonTimeUTC);
        boolean isSydneyWeekend = isWeekend(sydneyTimeUTC);

        // Print out the meeting details
        System.out.println("Meeting Schedule (in UTC):\n");

        System.out.println("New York Meeting (Local Time: 09:00 AM) -> UTC Time: " + newYorkTimeUTC + ", Day: " + newYorkDay + ", Weekend: " + (isNewYorkWeekend ? "Yes" : "No"));
        System.out.println("London Meeting (Local Time: 03:00 PM) -> UTC Time: " + londonTimeUTC + ", Day: " + londonDay + ", Weekend: " + (isLondonWeekend ? "Yes" : "No"));
        System.out.println("Sydney Meeting (Local Time: 05:00 AM, next day) -> UTC Time: " + sydneyTimeUTC + ", Day: " + sydneyDay + ", Weekend: " + (isSydneyWeekend ? "Yes" : "No"));
    }
}

