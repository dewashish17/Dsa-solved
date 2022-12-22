// Aim :- we will search from an sorted array
import java.util.Scanner;

class Binary_search{

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt(); 
        }
        System.out.println("enter the number to be search:- ");

        int searchElement=sc.nextInt();
        int res=search(arr,searchElement);
        if(res!=-1)
        System.out.println("Element found at : "+res);
        else
        System.out.println("Element not found") ;


        sc.close();
    }
    public static int search(int arr[],int element)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid= start-(start-end)/2;
            if(arr[mid]==element) return mid;
            else if (arr[mid]>element) {
                end=mid-1;
            }
            else if(arr[mid]<element){
                start=mid+1;
            }
        }
        return -1;
    }
    
}