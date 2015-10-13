package sword;

/**
 * 数值的整数次方
 * 
 * @author xhy
 *
 */
public class Solution11 {
	public double power(double base, int exponent) throws Exception {
		if (equal(base, 0) && exponent < 0)
			throw new Exception("非法输入");
		if (exponent == 0)
			return 1.0;
		else if (exponent < 0)
			return 1 / powerWithExponent(base, -exponent);
		else
			return powerWithExponent(base, exponent);
	}

	private double powerWithExponent(double base, int exponent) {
		if (exponent == 1)
			return base;
		double result = powerWithExponent(base, exponent >>> 1);
		result *= result;
		if ((exponent & 1) == 1)
			result *= base;
		return result;
	}

	private boolean equal(double num1, double num2) {
		if (Math.abs(num1 - num2) < 0.0000001)
			return true;
		else
			return false;
	}
}