package src;
import java.util.ArrayList;
import java.util.List;

	public class TwoMissingNumbers {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 100; ++i)
			list.add(i);
		list.remove(new Integer(12));
		list.remove(new Integer(79));
		Integer[] missing = getTwoMissingNumbers(list);
		System.out.println(missing[0] + "," + missing[1]);
	}

	private static Integer[] getTwoMissingNumbers(List<Integer> list) {
		int n = list.size() + 2;
		int expectedSum = n * (n + 1) / 2;
		int expectedSquaredSum = n * (n + 1) * (2 * n + 1) / 6;
		int sum = 0;
		int squaredSum = 0;
		for (int num : list) {
			sum += num;
			squaredSum += num * num;
		}
		int xplusy = expectedSum - sum;
		int xsquareplusysquare = expectedSquaredSum - squaredSum;
		int twoxy = xplusy * xplusy - xsquareplusysquare;
		int xminusy = (int) Math.sqrt(xsquareplusysquare - twoxy);
		int x = (xplusy + xminusy) / 2;
		int y = (xplusy - xminusy) / 2;
		return new Integer[] { x, y };
	}
}