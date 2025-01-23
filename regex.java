import java.util.regex.*;
import java.util.*;

class S {
public static void main(String [] args){

Scanner sc = new Scanner(System.in);

String str =  sc.nextLine();
String regex = "[ @ # $ % & *]+";

String[] st = str.split(regex);

StringBuffer ns = new StringBuffer();

for(String i : st){
	 ns.append(i);
}
System.out.println(ns);

/*
we can also use Pattern like this :

 Pattern pattern = Pattern.compile(regex);
 
 Matcher matcher = pattern.matcher(str);
 
 boolean matches = matcher.matches(); // matches return type is boolean
 
 System.out.println(matches);
*/
}
}
