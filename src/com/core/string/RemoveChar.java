package com.core.string;
public class RemoveChar {
  public static void main(String args[]) {
    String str = "this is a test";
    
    System.out.println(removeChar(str,'i'));
  }

  public static String removeChar(String s, char c) {
    String r = "";
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != c)
        r += s.charAt(i);
    }
    return r;

  }
}