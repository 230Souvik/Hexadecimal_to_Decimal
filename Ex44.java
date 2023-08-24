
package ex44;
import java.util.Scanner;
public class Ex44 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter hex value");
        String hex=sc.next();
        int len=hex.length();
        int i,j=0,res=0;
        for(i=len-1;i>=0;i--){
            //System.out.println(res);
            if(hex.charAt(i)>='0' && hex.charAt(i)<='9'){
                res+=(hex.charAt(i)-48)*Math.pow(16, j);
                j++;
            }
            else if(hex.charAt(i)>='A' && hex.charAt(i)<='F'){
                res+=(hex.charAt(i)-55)*Math.pow(16, j);
                j++;
            }   
            
        }
        System.out.println("decimal value is  "+res);
    }
    
}
