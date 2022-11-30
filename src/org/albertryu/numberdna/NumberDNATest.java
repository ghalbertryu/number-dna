package org.albertryu.numberdna;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.albertryu.numberdna.utils.NumberDNAInterpreter;
import org.junit.Before;
import org.junit.Test;

public class NumberDNATest {
	
	private NumberDNAInterpreter interpreter;

	@Before
	public void setUp() throws Exception {
		interpreter = new NumberDNAInterpreter();
	}
	
	@Test
	public void canSplitTwoNumberString() throws Exception {
		List<String> numberStringPairList = interpreter.transToPairList("45");
		List<String> $45stringPairList = new ArrayList<String>();
		$45stringPairList.add("45");
		
		assertEquals(numberStringPairList, $45stringPairList);
	}
	
	@Test
	public void canSplitThreeNumberString() throws Exception {
		List<String> numberStringPairList = interpreter.transToPairList("123");
		List<String> $123stringPairList = new ArrayList<String>();
		$123stringPairList.add("12");
		$123stringPairList.add("23");
		
		assertEquals(numberStringPairList, $123stringPairList);
	}
	
	@Test
	public void canSplitTenNumberString() throws Exception {
		List<String> numberStringPairList = interpreter.transToPairList("0987654321");
		List<String> $10DigisStringPairList = new ArrayList<String>();
		$10DigisStringPairList.add("09");
		$10DigisStringPairList.add("98");
		$10DigisStringPairList.add("87");
		$10DigisStringPairList.add("76");
		$10DigisStringPairList.add("65");
		$10DigisStringPairList.add("54");
		$10DigisStringPairList.add("43");
		$10DigisStringPairList.add("32");
		$10DigisStringPairList.add("21");
		
		assertEquals(numberStringPairList, $10DigisStringPairList);
	}
	
	@Test
	public void canTransToPairListWithInner5() throws Exception {
		List<String> output = interpreter.transToPairListWithYear("2555551");
		List<String> expected = new ArrayList<String>();
		expected.add("21");
		assertEquals(expected, output);
	}
	
	@Test
	public void canTransToPairListWith159() throws Exception {
		List<String> output = interpreter.transToPairListWithYear("21591");
		List<String> expected = new ArrayList<String>();
		expected.add("21");
		expected.add("19");
		expected.add("91");
		expected.add("19");
		expected.add("91");
		assertEquals(expected, output);
	}
	
	@Test
	public void canTransToPairListWith951() throws Exception {
		List<String> output = interpreter.transToPairListWithYear("29511");
		List<String> expected = new ArrayList<String>();
		expected.add("29");
		expected.add("91");
		expected.add("19");
		expected.add("91");
		expected.add("11");
		assertEquals(expected, output);
	}
	
	@Test
	public void canTransToPairListWithOutter5() throws Exception {
		List<String> output = interpreter.transToPairListWithYear("525");
		List<String> expected = new ArrayList<String>();
		expected.add("22");
		expected.add("22");
		assertEquals(expected, output);
	}
	
	@Test
	public void canTransToPairListWith0() throws Exception {
		List<String> output = interpreter.transToPairListWithYear("040");
		List<String> expected = new ArrayList<String>();
		expected.add("44");
		expected.add("44");
		assertEquals(expected, output);
	}
	
	@Test
	public void canTransToPairListWithA() throws Exception {
		List<String> output = interpreter.transToPairListWithYear("A");
		List<String> expected = new ArrayList<String>();
		expected.add("11");
		assertEquals(expected, output);
	}
	
	@Test
	public void canTransToPairListWithZ() throws Exception {
		List<String> output = interpreter.transToPairListWithYear("Z");
		List<String> expected = new ArrayList<String>();
		expected.add("26");
		assertEquals(expected, output);
	}
	
	@Test
	public void canTransToPairListWithLowerA() throws Exception {
		List<String> output = interpreter.transToPairListWithYear("A");
		List<String> expected = new ArrayList<String>();
		expected.add("11");
		assertEquals(expected, output);
	}
	
	@Test
	public void canTransToPairListWith5And0() throws Exception {
		List<String> output = interpreter.transToPairListWithYear("51595059515");
		List<String> expected = new ArrayList<String>();
		expected.add("11");
		expected.add("19");
		expected.add("91");
		expected.add("19");
		expected.add("99");
		expected.add("99");
		expected.add("91");
		expected.add("19");
		expected.add("91");
		expected.add("11");
		assertEquals(expected, output);
	}
	
	@Test
	public void canDecode111() throws Exception {
		List<String> output = interpreter.decodeYear("111");
		List<String> expected = new ArrayList<String>();
		expected.add("伏位");
		expected.add("伏位");
		assertEquals(expected, output);
	}
	
	@Test
	public void canDecodeFuWe() throws Exception {
		String[] fuweNum = {"11", "22", "33", "44", "66", "77", "88", "99"};
		int index = ((int)(Math.random() * 10)) % 8;
		List<String> output = interpreter.decodeYear(fuweNum[index]);
		List<String> expected = new ArrayList<String>();
		expected.add("伏位");
		assertEquals(expected, output);
	}
	
	@Test
	public void canDecodeWuGue() throws Exception {
		List<String> output = interpreter.decodeYear("97");
		List<String> expected = new ArrayList<String>();
		expected.add("五鬼");
		assertEquals(expected, output);
	}
	
	@Test
	public void canDecodeWithYear() throws Exception {
		List<String> output = interpreter.decodeYear("011");
		List<String> expected = new ArrayList<String>();
		expected.add("伏位");
		expected.add("伏位");
		assertEquals(expected, output);
	}
	
	@Test
	public void canDecodeWithFate() throws Exception {
		List<String> output = interpreter.decodeFate("011");
		List<String> expected = new ArrayList<String>();
		expected.add("伏位");
		assertEquals(expected, output);
	}
	
	@Test
	public void canCountTopOne() throws Exception {
		List<String> output = interpreter.decodeFate("11912435");
		Map<String, Integer> topOneCount = interpreter.countTopOne(output);
		Map<String, Integer> expected = new HashMap<String, Integer>();
		expected.put("延年", 3);
		assertEquals(expected, topOneCount);
	}
	
	@Test
	public void canCountTopTwo() throws Exception {
		List<String> output = interpreter.decodeFate("11912435");
		Map<String, Integer> topOneCount = interpreter.countTopTwo(output);
		Map<String, Integer> expected = new HashMap<String, Integer>();
		expected.put("伏位", 2);
		assertEquals(expected, topOneCount);
	}
}
