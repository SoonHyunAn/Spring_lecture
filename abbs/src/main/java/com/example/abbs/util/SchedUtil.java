package com.example.abbs.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class SchedUtil {

	public boolean isLeapYear(int year) {
		if (year % 400 == 0)
			return true;
		if (year % 100 == 0)
			return false;
		if (year % 4 == 0)
			return true;
		return false;
	}
	
	public List<String> genTime() {
		List<String> list = new ArrayList<>();
		for (int hour=0; hour<24; hour++)
			for (int min=0; min<60; min+=30)
				list.add(String.format("%02d:%02d", hour, min));
		return list;
	}
	
}