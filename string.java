class string{  
 public static void main(String args[]){  
   String s1="Sachin";  
   String s2="Sachin";  
   String s3=new String("Sachin");  
   String s4="Saurav";  
   System.out.println(s1.equals(s2));//true  
   System.out.println(s1.equals(s3));//true  
   System.out.println(s1.equals(s4));//false  




    if (((regex.value.length == 1 &&  
             ".$|()[{^?*+\\".indexOf(ch = regex.charAt(0)) == -1) ||  
             (regex.length() == 2 &&  
              regex.charAt(0) == '\\' &&  
              (((ch = regex.charAt(1))-'0')|('9'-ch)) < 0 &&  
              ((ch-'a')|('z'-ch)) < 0 &&  
              ((ch-'A')|('Z'-ch)) < 0)) &&  
            (ch < Character.MIN_HIGH_SURROGATE ||  
             ch > Character.MAX_LOW_SURROGATE))  
        {  
 }  
}  