/*Usually when you buy something, you're asked whether your 
credit card number, phone number or answer to your
most secret question is still correct. However, 
since someone could look over your shoulder, 
you don't want that shown on your screen. Instead, we mask it.

Your task is to write a function maskify, which 
changes all but the last four characters into '#'.
*/
package katas;

public class Maskify {

	public static void main(String[] args) {
		Maskify mask = new Maskify();
		System.out.println(mask.maskify("oly"));

}

	public String maskify(String str) {
		if (str.length() < 4) {
			return str;
		}

		int replaceStr = str.length() - 4;
		String secondPart = str.substring(replaceStr);
		String firstPart = "#";
		StringBuilder sb = new StringBuilder(firstPart);
		for (int i = 0; i <= replaceStr - 2; i++) {
			sb = sb.append("#");

		}
		return sb.toString() + secondPart;

	}
}
