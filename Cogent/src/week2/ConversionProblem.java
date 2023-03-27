package week2;

public class ConversionProblem {

	public static void main(String[] args) {
		int a = 5;
		double b = 5.43;
		float c = 8.99f;
		byte d = 1;
		short e = 3;
		long f = 100_000l;
		char g = 'C';
		boolean h = true;
		
		Integer i = Integer.valueOf(a);
		Double j = Double.valueOf(b);
		Float k = Float.valueOf(c);
		Byte l = Byte.valueOf(d);
		Short m = Short.valueOf(e);
		Long n = Long.valueOf(f);
		Character o = Character.valueOf(g);
		Boolean p = Boolean.valueOf(h);
		
		int q = i.intValue();
		double r = j.doubleValue();
		float s = k.floatValue();
		byte t = l.byteValue();
		short u = m.shortValue();
		long v = n.longValue();
		char w = o.charValue();
		boolean x = p.booleanValue();
		
	}

}
