import java.util.Scanner;

public class cheakvowelorconstant {
    public static void main(String[] args) {
        //Char ch='A,E,I,O,U,a,e,i,o,u'
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the charecter :");
       char ch=sc.next().charAt(0);
     if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'|| ch=='U'){
        System.out.println("vowel");
     }
     else{
        System.out.println("costant");
     }
     sc.close();
    }
    
}
