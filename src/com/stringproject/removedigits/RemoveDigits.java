package com.stringproject.removedigits;

public class RemoveDigits {
	public static void main(String[] args) {
		String s="ad3daddfd5443dfsfss";
		String str=s.replaceAll("[0-9]", "");
		System.out.println(str);
	}

}
