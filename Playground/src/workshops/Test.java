package workshops;

public class Test {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		nums[1] = 5;
		System.out.println(nums[1]);
		
		double[] x = new double[5];
		double[] y = new double[5];
		
		double[] angles = {-3, -1, 0, 1, 3};
		for (int i = 0; i < angles.length; i++) {
			x[i] = Math.cos(angles[i]);
			y[i] = Math.sin(angles[i]);
			System.out.format("x:  %f    y:  %f\n", Math.cos(angles[i]), Math.sin(angles[i]));
		}
		
		for (int i = 0; i < angles.length; i++) {
			System.out.format("x:  %f    y:  %f   h:   %f\n", x[i], y[i], Math.atan2(y[i], x[i]));
		}
		
		System.out.println("hello".equals(null));
	}
}
