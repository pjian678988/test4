package cn.xplanet.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class DoubleTest {

	/** 
	 * 描述该方法的功能及算法流程
	 *
	 * @autor: ablesky  2013-7-19 下午5:01:42
	 * @param args    
	 * @return void 
	 */
	public static void main(String[] args) {
		System.out.println(Double.toString(121321214));
		System.out.println(String.valueOf(121321214d));
		System.out.println(String.valueOf(1.21321214E8));
		System.out.println(121321214d + "");
		System.out.println(new DecimalFormat("0").format(121321214d));
		System.out.println(new DecimalFormat("#").format(213.23));
	}

}
