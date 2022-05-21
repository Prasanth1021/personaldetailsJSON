package org.string;

public class PreDefinedMethodsInString {
	static int length(String S) {
		int length1= S.length();
		return length1; 
	}
	static int indexof(String S) {
		int indexof1 =S.indexOf('a');
		return indexof1;
	}
	static int lastindexof(String S) {
		int  lastindexof =S.lastIndexOf('a');
		return lastindexof;
	}
	static boolean contains(String S) {
		boolean contains =S.contains("e");
		return contains;
	}
	static String upperclass(String S) {
		String upperclass= S.toUpperCase();
		return upperclass;
	}
	static String ls(String S) {
		String lowerclass= S.toLowerCase();
		return lowerclass;
	}
	static char chatat(String S, int i) {
		char chatAt = S.charAt(i);
		return chatAt;
	}
	static boolean startwith(String S, String S1) {
		boolean startwith = S.startsWith(S1);
		return startwith;
	}
	static boolean endswith(String S,String S1) {
		boolean end =S.endsWith("S1");
		return end;
	}
	static String Trim (String S) {
		String TR = S.trim();
		return TR;
	}
	static boolean equls(String s,String s1) {
		boolean EQ = s.equals(s1);
		return EQ;
	}
	static boolean EQI (String s, String s1) {
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		return equalsIgnoreCase;
	}
	static String SubSt(String S, int A) {
		String SS = S.substring(A);
		return SS;
	}
	static String SubSt(String S, int a, int b) {
		String SS = S.substring(a,b);
		return SS;
	}
	static int compare(String S, String S1) {
		int CoT = S.compareTo(S1);
		return CoT;
	}
	static String replace(String S, char a, char b) {
		String RP = S.replace(a,b);
		return RP;
	}
	static String replaceAll(String S, String S1, String S2) {
		String RPA = S.replaceAll(S1,S2);
		return RPA;
	}
	static String concat(String S, String S1) {
		String cont = S1.concat(S);
		return cont;
	}
	public static void main(String[] args) {
		
		int length1 = length ("Anna University");
		System.out.println(length1);
		int indexof = indexof("Anna University");
		System.out.println(indexof);
		int lastindexof = lastindexof("Metro Rail Project a");
		System.out.println(lastindexof);
		boolean contains = "Anna University".contains("e");
		System.out.println (contains);
		String upperclass = upperclass("i am a disco dance ah ahh");
		System.out.println(upperclass);
		String lowerclass = ls("LEADING Handloom");
		System.out.println(lowerclass);
		char chatat = chatat("Java is a open source programing language which is used widely", 22);
		System.out.println(chatat);
		boolean startwith = "Old buddha say accept the pain".startsWith("pain");
		System.out.println(startwith);
		boolean endswith = "Old buddha say acept the pain".endsWith("Old");
		System.out.println(endswith);
		boolean eqi = EQI("Aravind", "Akash");
		System.out.println(eqi);
		String SuSt = "Machine Tools".substring(7);
		System.out.println(SuSt);
		String subString = "MachineTools".substring(6,7);
		System.out.println(subString);
		String replace = "Co-Optex".replace('O','o');
		System.out.println(replace);
		String replaceAll = "I am a Disco Dancer".replaceAll("Disco Dancer", "JavaProgrammer");
		System.out.println(replaceAll);
		String conct = "Co".concat("Optex");
		System.out.println(conct);
		System.out.println("Updated");
	}

}
