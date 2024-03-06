package string;

public class LicenseKeyFormatting {


	public static void main(String[] args) {
		LicenseKeyFormatting licenseKeyFormatting = new LicenseKeyFormatting();
		// String s = "8F3Z-2E-9-w";
		// int k = 4;
		String s = "8-5g-3-J";
		int k = 2;
		// result = 8F3Z-2E9W, 8-5G-3J
		System.out.println(licenseKeyFormatting.solution(s, k));
	}

	private String solution(String s, int k) {
		s = s.toUpperCase().replace("-", "");
		StringBuilder sb = new StringBuilder(s);

		for (int i = k; i < s.length(); i = i + k) {
			sb.insert(s.length() - i, "-");

		}
		return sb.toString();
	}


}
