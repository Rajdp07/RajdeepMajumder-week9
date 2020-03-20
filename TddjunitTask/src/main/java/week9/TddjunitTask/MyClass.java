package week9.TddjunitTask;

import java.io.*;
import java.lang.*;
public class MyClass {
        public String remove (String s) {
        	s=s.trim();
        	String str="";
        	
        	if(s.length()==0)
        		str="";
        	else if((s.length()==1)&&((s.charAt(0)=='A')||(s.charAt(0)=='a')))
        		str="";
        	else if(s.length()==2)
        	{
        	    if(((s.charAt(0)=='A')||(s.charAt(0)=='a'))&& ((s.charAt(1)=='A')||(s.charAt(1)=='a')))
        		str="";
        		else if(((s.charAt(0)=='A')||(s.charAt(0)=='a'))&& ((s.charAt(1)!='A')||(s.charAt(1)!='a')))
        			str=str+s.charAt(1);
        		else if(((s.charAt(1)=='A')||(s.charAt(1)=='a'))&& ((s.charAt(0)!='A')||(s.charAt(0)!='a')))
        			str=str+s.charAt(0);
        		
        		else
        			str=s;}
        			else if(((s.charAt(0)=='A')||(s.charAt(0)=='a')) && ((s.charAt(1)=='A')||(s.charAt(1)=='a')))
			str=s.substring(2, s.length());
        	else if(((s.charAt(0)=='A')||(s.charAt(0)=='a'))&& ((s.charAt(1)!='A')||(s.charAt(1)!='a')))
        		str=s.substring(1, s.length());
        	else if(((s.charAt(1)=='A')||(s.charAt(1)=='a'))&& ((s.charAt(0)!='A')||(s.charAt(0)!='a')))
        		str=s.charAt(0)+s.substring(2,s.length());
        	
			else
				str=s;
        	return str;
        }
    }


