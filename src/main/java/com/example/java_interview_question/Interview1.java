package com.example.java_interview_question;

public class Interview1 {

	static StringBuffer sb = new StringBuffer(". position 1 no. @ Durga is This");

	public static void swap(int i, int j) {

		while (i < j) {
			char ch = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, ch);
			j--;
			i++;
		}
	}

	public static void main(String[] args) {
		int i = 0, j = 0, w = 0;
		while (i < sb.length()) {
			if (sb.charAt(i) == ' ' || i == sb.length() - 1) {
				j = i;
				if (i == sb.length() - 1) {
					j = i;
				} else {
					j--;
				}
				swap(w, j);
				w = i + 1;
			}
			i++;
		}
		swap(0, sb.length() - 1);
		System.out.println(sb);
	}
}
