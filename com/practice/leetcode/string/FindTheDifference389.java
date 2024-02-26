package practice.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference389
{

	//389. Find the Difference.

	public static void main(String[] args)
	{

		char a = firstApproach("abcd","abcdg");
		System.out.println(a);
	}

	private static char firstApproach(String s, String t)
	{
		System.out.println("Inside first Approach.");

		Map<Character, Integer> mp = new HashMap<>();

		for (char ch : s.toCharArray()) {
			mp.put(ch, mp.getOrDefault(ch, 0) + 1);
		}

		for (char ch : t.toCharArray()) {
			mp.put(ch, mp.getOrDefault(ch, 0) - 1);

			if (mp.get(ch) < 0)
				return ch;
		}

		return 'a';
	}

	private static char secondApproach(String s, String t) {
		int sum = 0;

		for(char ch: s.toCharArray())
			sum += ch;

		for(char ch:t.toCharArray())
			sum -=ch;

		return (char) sum;
	}

	//Best approach using XOR property.
	//T.C: Linear
	//S.C: Linear
	private static char thirdApproach(String s, String t) {
		int xor = 0;

		for (char ch : t.toCharArray())
			xor ^= ch;

		for (char ch : s.toCharArray())
			xor ^= ch;

		return (char) xor;
	}

}
