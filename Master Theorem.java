/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package master;
import java.util.*;
/**
 *
 * @author Amity
 */
public class Master {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
float a,b,k,p;        // TODO code application logic here
Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of a");
do{
    a=sc.nextFloat();
}while(a<1);
System.out.println("Enter the value of b");
do{
    b=sc.nextFloat();
}while(b<=1);
System.out.println("Enter the value of k");
do{
    k=sc.nextFloat();
}while(k<0);
System.out.println("Enter the value of p");
    p=sc.nextFloat();
if(a>Math.pow(b,k))        
{  System.out.println("T(n)=Theta(n^("+Math.log(a)/Math.log(b)+"))");
    }
else if(a==Math.pow(b,k))
{ if(p>-1)
    System.out.println("T(n)=Theta(n^("+Math.log(a)/Math.log(b)+")*(logn)^"+p+1+")");
else if(p==0)
    System.out.println("T(n)=Theta(n^("+Math.log(a)/Math.log(b)+")*logn)");
else if(p==-1)
    System.out.println("T(n)=Theta(n^("+Math.log(a)/Math.log(b)+")*log log n)");
else 
    System.out.println("T(n)=Theta(n^("+Math.log(a)/Math.log(b)+"))");
}
else
{
if(p>0)
 System.out.println("T(n)=Theta(n^"+k+"*(logn)^"+p+")");
else if(p==0)
    System.out.println("T(n)=Theta(n^"+k+")");
else if(p==1)
     System.out.println("T(n)=Theta(n^"+k+"*logn)");
else
     System.out.println("T(n)=Theta(n^"+k+")");

    
}
}
}
