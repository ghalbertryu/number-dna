package com.ryu.albert.magicnumber;

import java.util.List;
import java.util.Map;

public class NumberDNARunner {

	public static void main(String[] args) {
		NumberDNAInterpreter interpreter = new NumberDNAInterpreter();
		String input = "AlbertRyu";
		String type = "fate"; //fate, year
		if ("fate".equals(type)) {
			List<String> fateNumPairList = interpreter.transToPairListWithFate(input);
			List<String> fateDecodeList = interpreter.decodeFate(input);
			Map<String, Integer> topOne = interpreter.countTopOne(fateDecodeList);
			Map<String, Integer> topTwo = interpreter.countTopTwo(fateDecodeList);
			System.out.println(fateNumPairList);
			System.out.println(fateDecodeList);
			System.out.println("最多屬性：" + topOne.keySet() + "x" + topOne.values());
			System.out.println("次多屬性：" + topTwo.keySet() + "x" + topTwo.values());
		} else if ("year".equals(type)) {
			List<String> yearNumPairList = interpreter.transToPairListWithYear(input);
			List<String> yearDecodeList = interpreter.decodeYear(input);
			System.out.println(yearNumPairList);
			System.out.println(yearDecodeList);
			System.out.println("1-10, 10-15, 15-20, 20-25, 25-30, 30-35, 35-40, 40-45, 45-50, 50-70");
		}
	}

}
