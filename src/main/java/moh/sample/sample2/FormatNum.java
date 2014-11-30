package moh.sample.sample2;

import java.text.DecimalFormat;

public class FormatNum {

	FormatNum() {
	}
	
	public static double formatDec(double n) {
		DecimalFormat df = new DecimalFormat("###0.00");
		double d = new Double(df.format(n));
		System.out.println(df.format(n));
		return d;
	}

}
