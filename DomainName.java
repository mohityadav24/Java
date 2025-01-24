import java.util.regex.*;
import java.util.*;
 
class DomainName{


 /*
 eamil validation 
 
 String regex1 = "^[a-zA-Z0-9]+@[a-z]+.[a-z]{2,}$"; 
 System.out.println(Pattern.matches(regex1,url)); 
*/ 

void protocolsM(String st){
 
 if(st.equals("https")){
	 System.out.println("it is following https protocol Which Stands for Hyper Text Transport Protocol Security");
 }
 else if(st.equals("www")){
	 System.out.println("www Stands for World Wide Web ");
 }
 
}
 
 void domainM(String s){
 if(s.equals("com")){
	 System.out.println("Domain of this url is Commercial");
 }
 else if(s.equals("in")){
	 System.out.println("Domain of this url is India");
 }
 else if(s.equals("org")){
	 System.out.println("Domain of this url is Organisation");
 }	 
 }
 
 public static void main(String [] args){

Scanner sc = new Scanner(System.in);

 String url = sc.nextLine();
 
  String regex = "[//:.]";
 String[] sarr = url.split(regex);
 

 String domain = sarr[sarr.length-1];
 String protocols = sarr[0];
 
   DomainName obj = new DomainName();
   obj.domainM(domain);
 
 obj.protocolsM(protocols);
 
}

}
 