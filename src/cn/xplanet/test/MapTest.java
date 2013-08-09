package cn.xplanet.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	/** 
	 * 描述该方法的功能及算法流程
	 *
	 * @autor: ablesky  2013-7-29 下午5:53:55
	 * @param args    
	 * @return void 
	 */
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("a", null);
		map.put("b", null);
		map.remove("a");
		map.remove("b");
		System.out.println(map.isEmpty());
		System.out.println(map.size());
	}

}
