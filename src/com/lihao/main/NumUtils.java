package com.lihao.main;

import java.text.DecimalFormat;

public class NumUtils {

	private static DecimalFormat formator = new DecimalFormat("#,###");

	public static String formatNum(String s) {
		String[] buffArr = s.split("\\.");
		String front = buffArr[0];
		String back = "";

		try {
			back = buffArr[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			return formatFront(front) + ".00";
		}
		return formatFront(front) + "." + formatBack(back);
	}

	public static String formatFront(String front) {
		double frontDB = Double.parseDouble(front);
		return formator.format(frontDB);
	}

	public static String formatBack(String back) {
		return back.length() > 2 ? back.substring(0, 2) : addZeroBack(back);
	}

	public static String addZeroBack(String back) {
		String resultBack = null;
		switch (back.length()) {
		case 1:
			resultBack = back + "0";
			break;
		case 2:
			resultBack = back;
			break;
		default:
			break;
		}
		return resultBack;
	}
}
