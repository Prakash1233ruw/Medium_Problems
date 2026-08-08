package Problems;

import java.util.Arrays;

public class AnagramString {
public static void main(String[] args) {
	
String str1="silent";
String str2="listen";
	int index=0;
	boolean isAnagram= findAnagram(str1,str2);
System.out.println(isAnagram);
}

private static boolean findAnagram(String str1, String str2) {
char[] arr1 = str1.toCharArray();
char[] arr2 = str2.toCharArray();
Arrays.sort(arr1);
Arrays.sort(arr2);
for(int i=0;i<arr1.length;i++) {
	if(arr1[i]!=arr2[i]) {
		return false;
	
	}
}

	return true;
}
}


//public static boolean isAnagram(String str1, String str2) {
//
//    if (str1.length() != str2.length()) {
//        return false;
//    }
//
//    int[] count = new int[26];
//
//    for (int i = 0; i < str1.length(); i++) {
//        count[str1.charAt(i) - 'a']++;
//        count[str2.charAt(i) - 'a']--;
//    }
//
//    for (int i = 0; i < 26; i++) {
//        if (count[i] != 0) {
//            return false;
//        }
//    }
//
//    return true;
//}
