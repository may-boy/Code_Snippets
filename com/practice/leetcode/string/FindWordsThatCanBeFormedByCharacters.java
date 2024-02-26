package practice.leetcode.string;

public class FindWordsThatCanBeFormedByCharacters
{
	public static void main(String[] args)
	{
		int count = countCharacters(new String[] {"cat","bt","hat","tree"}, "atach");
		System.out.println(count);
	}

	public static int countCharacters(String[] words, String chars) {
		int[] charCount = new int[26];

		for (char ch : chars.toCharArray()) {
			charCount[ch - 'a']++;
		}

		int result = 0;

		for (String word : words) {
			int[] wordCount = new int[26];
			for (char ch : word.toCharArray()) {
				wordCount[ch - 'a']++;
			}

			boolean ok = true;
			for (int i = 0; i < 26; i++) {
				if (wordCount[i] > charCount[i]) {
					ok = false;
					break;
				}
			}

			if (ok) {
				result += word.length();
			}
		}

		return result;
	}
}
