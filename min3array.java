import java.util.Scanner;

public class min3array {
        public static void smalle(int[] a,int n){
            int first,second,third;
            if(n<3)
            {
                System.out.println("not valid");
            }
            third=second=first=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                if(a[i]<first)
                {
                    third=second;
                    second=first;
                    first=a[i];
                }
                else if(a[i]<second)
                {
                    third=second;
                    second=a[i];
                }
                else if(a[i]<third)
                {
                    third=a[i];
                }}
            System.out.println("three small numbers are"+first+" "+second+" "+third);
        }


        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int k=s.nextInt();
            System.out.println("enter array elements");
            int []a =new int[k];
            int n=a.length;
            for(int i=0;i<a.length;i++)
            {
                a[i]=s.nextInt();
            }
            smalle(a,n);
        }}


