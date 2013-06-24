package cn.xplanet.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		Collections.shuffle(list);
		for(Integer i : list){
			System.out.println(i);
		}
	}
}
