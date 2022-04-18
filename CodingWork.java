import java.util.Arrays;
import java.util.Random;

public class CodingWork {

	public static void main(String[] args) {
		System.out.println(theirProduct(new int[]{1, 3, 4}, 1));
		System.out.println(oddNumber(new int[]{3, 6, 4, 1}, 0));
		System.out.println(Arrays.toString(integersN(new int[]{32, 12, 33, 332}, 12)));
		System.out.println(targetDon(1900));
		System.out.println(textDoc("Ana are mere.  Dorel are mere dulci."));
	}

	public static int theirProduct(int[] array, int a) {
		for (int i : array) {
			a *= i;
		}
		return a;
	}

	private static int oddNumber(int[] array, int b) {
		for (int i : array) {
			if (i % 2 != 0) {
				b++;
			}
		}
		return b;
	}

	public static int[] integersN(int[] numb, int nub) {

		int count = 0;
		for (int i : numb) {
			if (i < nub) {
				count++;
			}
		}
		Arrays.sort(numb);
		int[] result;
		result = Arrays.copyOf(numb, count);
		return result;

	}

	private static String targetDon(int target) {
		String ok = "Succes";
		int donnat = 0;
		Random donation = new Random();
		while (target < donnat) {
			donnat = donnat + (donation.nextInt(18));

		}
		return ok;
	}

	private static String textDoc(String sentences) {
		String[] text1 = sentences.split("\\. ");
		for (String i : text1)
			System.out.println(i);
		return sentences;
	}
}


