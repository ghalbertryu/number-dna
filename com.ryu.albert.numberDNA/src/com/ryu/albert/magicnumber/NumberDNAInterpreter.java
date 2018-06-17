package com.ryu.albert.magicnumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class NumberDNAInterpreter {

	public List<String> transToPairList(String numString) {
		ArrayList<String> numberStringPairList = new ArrayList<String>();
		int times = numString.length() - 1;
		for (int i = 0; i < times; i++) {
			String stringPair = numString.substring(i, i + 2);
			numberStringPairList.add(stringPair);
		}
		return numberStringPairList;
	}

	public List<String> transToPairListWithYear(String numString) {
		numString = _transLetterToNumber(numString);
		String converted5NumString = _convert5Case(numString);
		List<String> pairList = transToPairList(converted5NumString);
		pairList = _convert0AndOuter5Case(pairList);
		return pairList;
	}
	
	public List<String> transToPairListWithFate(String numString) {
		numString = _transLetterToNumber(numString);
		String firstDigi = numString.substring(0, 1);
		if ("0".equals(firstDigi)) {
			numString = numString.replaceFirst("0", "");
		}
		String converted5NumString = _convert5Case(numString);
		List<String> pairList = transToPairList(converted5NumString);
		pairList = _convert0AndOuter5Case(pairList);
		return pairList;
	}

	public List<String> decodeYear(String numString) {
		List<String> pairList = transToPairListWithYear(numString);
		List<String> retList = new ArrayList<>();
		Map<String, String> pairNumberChart = new JiJing().getPairNumberChart();
		for (String numPair : pairList) {
			retList.add(pairNumberChart.get(numPair));
		}
		return retList;
	}
	
	public List<String> decodeFate(String numString) {
		List<String> pairList = transToPairListWithFate(numString);
		List<String> retList = new ArrayList<>();
		Map<String, String> pairNumberChart = new JiJing().getPairNumberChart();
		for (String numPair : pairList) {
			retList.add(pairNumberChart.get(numPair));
		}
		return retList;
	}

	public Map<String, Integer> countTopOne(List<String> numPairs) {
		Set<String> keySet = new HashSet<String>();
		for (String numPair : numPairs) {
			keySet.add(numPair);
		}
		
		String topKey = "";
		int topValue = 0;
		int tmpCount;
		for (String key : keySet) {
			tmpCount = Collections.frequency(numPairs, key);
			if (tmpCount > topValue) {
				topValue = tmpCount;
				topKey = key;
			}
		}
		
		Map<String, Integer> ret = new HashMap<String, Integer>();
		ret.put(topKey, topValue);
		return ret;
	}

	public Map<String, Integer> countTopTwo(List<String> numPairs) {
		List<String> numPairsCopy = new ArrayList<>(numPairs);
		Set<String> topOneKey = countTopOne(numPairsCopy).keySet();
		numPairsCopy.removeAll(topOneKey);
		return countTopOne(numPairsCopy);
	}

	private String _transLetterToNumber(String numString) {
		numString = numString.toUpperCase();
		for(int i = 'A'; i <= 'Z'; i++) {
			String letter = ((Character.valueOf((char)i))).toString();
			numString = numString.replaceAll(letter, _upperLetterToNumber(letter));
		}
		return numString;
	}

	private String _upperLetterToNumber(String uppterLetter) {
		String retNumber = String.valueOf(((int) uppterLetter.toCharArray()[0]) - 64);
		if (retNumber.length() == 1) {
			retNumber = "0" + retNumber;
		}
		return retNumber;
	}

	private String _convert159(String numString) {
		String convertedNumString = numString.replaceAll("159", "1919");
		return convertedNumString;
	}

	private String _convert951(String numString) {
		String convertedNumString = numString.replaceAll("951", "9191");
		return convertedNumString;
	}

	private String _removeInner5(String numString) {
		String firstChar = numString.substring(0, 1);
		String lastChar = numString.substring(numString.length() - 1, numString.length());
		String innerString = numString.substring(1, numString.length() - 1);
		String convertedInnerString = innerString.replaceAll("5", "");
		return firstChar + convertedInnerString + lastChar;
	}

	private String _convert5Case(String numString) {
		numString = this._convert159(numString);
		numString = this._convert951(numString);
		numString = this._removeInner5(numString);
		return numString;
	}

	private List<String> _convert0AndOuter5Case(List<String> numPairs) {
		List<String> retList = new ArrayList<String>();
		for(String numPair : numPairs) {
			int zeroIndex = numPair.indexOf("0");
			int fiveIndex = numPair.indexOf("5");
			String convertedNumPair = numPair;
			if(zeroIndex != -1) {
				if("00".equals(numPair)) {
					convertedNumPair = numPair;
				} else {
					String anotherNum = numPair.replaceAll("0", "");
					convertedNumPair = numPair.replaceAll("0", anotherNum);
				}
			} else if (fiveIndex != -1) {
				String anotherNum = numPair.replaceAll("5", "");
				convertedNumPair = numPair.replaceAll("5", anotherNum);
			}
			retList.add(convertedNumPair);
		}
		return retList;
	}
}
