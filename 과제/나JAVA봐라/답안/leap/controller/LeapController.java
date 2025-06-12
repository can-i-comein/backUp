package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {
	public boolean isLeapYear(int year) {

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}

		return false;
	}

	public long leapDate(Calendar c) {
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);

		long count = 0L;

		for (int i = 1; i < year; i++) {
			if (isLeapYear(i)) {
				count += 366;
			} else {
				count += 365;
			}
		}

		if (isLeapYear(year)) {
			for (int i = 1; i < month; i++) {
				switch (i) {
				case 1:	case 3:	case 5:
				case 7:	case 8:	case 10: case 12:
					count += 31;
					break;
				case 2:
					count += 29;
					break;
				default:
					count += 30;
				}
			}
		} else {
			for (int i = 1; i < month; i++) {
				switch (i) {
				case 1:	case 3:	case 5:
				case 7:	case 8:	case 10: case 12:
					count += 31;
					break;
				case 2:
					count += 28;
					break;
				default:
					count += 30;
				}
			}
		}
		
		count += date;
		return count;
	}
}
