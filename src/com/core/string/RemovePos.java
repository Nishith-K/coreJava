package com.core.string;
public class RemovePos {
  public static void main(String args[]) {
    String str = "this is a test";
    System.out.println(removeCharAt(str, 3));
  }

  public static String removeCharAt(String s, int pos) {
    return s.substring(0, pos) + s.substring(pos + 1);
  }
}