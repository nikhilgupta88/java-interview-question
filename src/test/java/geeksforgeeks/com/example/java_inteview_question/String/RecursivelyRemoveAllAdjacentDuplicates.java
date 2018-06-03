package com.example.java_inteview_question.String;

import java.util.Scanner;

public class RecursivelyRemoveAllAdjacentDuplicates {

	public static String removeAdajcent(String s)
    {
        int j = 0;
        boolean global = true;
        if(s.length()!=0)
            while(j!=s.length()-1)
            {
                    int st = j;
                  char c = s.charAt(j);
                  char c1 = s.charAt(j+1);
                  int len = 1;
                  boolean ch = false;
                  while(c==c1 )
                  {
                      global = false;
                      len++;
                      j++;
                      if(j==s.length()-1) {ch = true; break;}
                      c1 = s.charAt(j+1);
                  }
            
                  if(len>1&&ch==false){
                  String temp = s.substring(0,st)+s.substring(j+1);
                  //System.out.print(temp+"\n");
                  s = temp;
                  j=st;
                  }
                  else if(len>1&&ch==true)
                  {
                      s = s.substring(0,st);
                      break;
                  }
                  else j++;
                  //System.out.println(s);
            }
        
            else global = true;
        
            if(global==true) {
                    System.out.println(s);
                return s;}
            else {s = removeAdajcent(s);}
    
        return s;
    }
    public static void main (String[] args) {
		String str1 = "azxxxzy";
		char[] c =  str1.toCharArray();
		System.out.println(c);
	}
       
}
	