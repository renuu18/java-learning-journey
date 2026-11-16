import java.util.*;
public class Strings{

   public static String Palindrome(String str) {
    String rev = "";

    for(int i = str.length()-1; i >= 0; i--) {
        rev = rev + str.charAt(i);
    }

    if(str.equals(rev)) {
        return "Palindrome";
    } else {
        return "Not Palindrome";
    }
}
 /*   public static String Reverse(String str){
       String rev="";
       for(int i=str.length()-1;i>=0;i--){
        rev=rev+str.charAt(i);
       }
       return rev;
    }*/

   /* public static int countVowels(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count++;
    }*/

   /* public static int countlength(String str,int count){
       for(int i=0;i<str.length();i++){
        count++;
       }
        return count;
    }*/

   /* public static void printString(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }*/
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str="noon";
        System.out.println(Palindrome(str));
        /*printString(str);*/
        /*int count=0;
        countlength(str,count);*/
        /*countVowels(str);*/
      /*  System.out.println("Number of vowels in the string is: "+countVowels(str));*/
     /* System.out.println("Reverse of the string is: "+Reverse(str));*/

         /* String name="Varshini";
          name=name.replace('r','m');
          System.out.println(name);*/
       /* String str="my,name,is,Stalina";
        String[] arr=str.split(",");
        for(String line:arr){
            System.out.println(line);
        }*/


       /* String str="Renu";
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }     */   


       /*  String name="Renu Loves you";
         System.out.println(name.startsWith("Renu"));
        System.out.println(name.startsWith("renu"));
        System.out.println(name.endsWith("you"));*/
       /* int num=1234;
        String str=String.valueOf(num);
        System.out.println(str);
         System.out.println(num+1);
          System.out.println(num*1);
        System.out.println(str+1);*/
        /*String str="My Brother name is Mani";
        System.out.println(str.substring(4,7));
        System.out.println(str.contains("Mani"));*/

       /* String str="  ";
        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());

        String name="  Love you ";
        System.out.println(name.length());
        name=name.trim();
        System.out.println(name.length());

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        */
       /* String str=sc.nextLine();
        System.out.println(str);
        String str1=sc.next();
        System.err.println(str1);
        */
        
        /*String str="Renu";
        String str1="Renu";
        if(str==str1){
            System.out.println("Both are same");
        }
        if(str.equals(str1)){
            System.out.println("Both are same");
        }
        if(str.equalsIgnoreCase(str1)){
            System.out.println("Both are same");
        }
        else{
            System.out.println("Both are not same");
        }
    */
       
       /* String str1=new String("Maniee");
        System.out.println(str);
System.out.println(str1);
System.out.println(str.length());
System.out.println(str.charAt(2));
System.out.println(str1.length());*/

/*str="Venu";
System.out.println(str);*/




    }
}
