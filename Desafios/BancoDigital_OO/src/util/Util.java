package util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {

	public static String formatDateDMY(LocalDate date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		return formatter.format(date);
	}

	public static String formatDateYMD(LocalDate date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		return formatter.format(date);
	}

	public static String formatDateTimeYMDHm(LocalDateTime dateHour) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm");

		return formatter.format(dateHour);

	}
}