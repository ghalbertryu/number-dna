package org.albertryu.numberdna.utils;

import java.util.HashMap;
import java.util.Map;

public class JiJing {
	private Map<String, String> pairNumberChart;
	public JiJing() {
		pairNumberChart = new HashMap<>();
		pairNumberChart.put("00", "伏位");
		pairNumberChart.put("11", "伏位");
		pairNumberChart.put("22", "伏位");
		pairNumberChart.put("33", "伏位");
		pairNumberChart.put("44", "伏位");
		pairNumberChart.put("66", "伏位");
		pairNumberChart.put("77", "伏位");
		pairNumberChart.put("88", "伏位");
		pairNumberChart.put("99", "伏位");
		
		pairNumberChart.put("19", "延年");
		pairNumberChart.put("26", "延年");
		pairNumberChart.put("34", "延年");
		pairNumberChart.put("43", "延年");
		pairNumberChart.put("62", "延年");
		pairNumberChart.put("78", "延年");
		pairNumberChart.put("87", "延年");
		pairNumberChart.put("91", "延年");

		pairNumberChart.put("14", "生氣");
		pairNumberChart.put("28", "生氣");
		pairNumberChart.put("39", "生氣");
		pairNumberChart.put("41", "生氣");
		pairNumberChart.put("67", "生氣");
		pairNumberChart.put("76", "生氣");
		pairNumberChart.put("82", "生氣");
		pairNumberChart.put("93", "生氣");

		pairNumberChart.put("13", "天醫");
		pairNumberChart.put("27", "天醫");
		pairNumberChart.put("31", "天醫");
		pairNumberChart.put("49", "天醫");
		pairNumberChart.put("68", "天醫");
		pairNumberChart.put("72", "天醫");
		pairNumberChart.put("86", "天醫");
		pairNumberChart.put("94", "天醫");
		       
		pairNumberChart.put("17", "禍害");
		pairNumberChart.put("23", "禍害");
		pairNumberChart.put("32", "禍害");
		pairNumberChart.put("46", "禍害");
		pairNumberChart.put("64", "禍害");
		pairNumberChart.put("71", "禍害");
		pairNumberChart.put("89", "禍害");
		pairNumberChart.put("98", "禍害");
		       
		pairNumberChart.put("16", "六煞");
		pairNumberChart.put("29", "六煞");
		pairNumberChart.put("38", "六煞");
		pairNumberChart.put("47", "六煞");
		pairNumberChart.put("61", "六煞");
		pairNumberChart.put("74", "六煞");
		pairNumberChart.put("83", "六煞");
		pairNumberChart.put("92", "六煞");

		pairNumberChart.put("12", "絕命");
		pairNumberChart.put("21", "絕命");
		pairNumberChart.put("37", "絕命");
		pairNumberChart.put("48", "絕命");
		pairNumberChart.put("69", "絕命");
		pairNumberChart.put("73", "絕命");
		pairNumberChart.put("84", "絕命");
		pairNumberChart.put("96", "絕命");
		        
		pairNumberChart.put("18", "五鬼");
		pairNumberChart.put("24", "五鬼");
		pairNumberChart.put("36", "五鬼");
		pairNumberChart.put("42", "五鬼");
		pairNumberChart.put("63", "五鬼");
		pairNumberChart.put("79", "五鬼");
		pairNumberChart.put("81", "五鬼");
		pairNumberChart.put("97", "五鬼");
	}
	
	public Map<String, String> getPairNumberChart() {
		return pairNumberChart;
	}
}
