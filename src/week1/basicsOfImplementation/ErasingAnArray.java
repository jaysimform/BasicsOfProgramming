package week1.basicsOfImplementation;
/*Problem

You are given a binary array
of

elements. The array consists of 0's and 1's. You can perform the following operations as many times as possible:

    Select a subarray starting from the first index that is inversion-free and delete it.

Determine the minimum number of operations to delete the entire array.

    Inversion free: There are no two indices 

and in array such that and (

    ). 
    Subarray: A subarray is an array obtained after deleting some elements from the beginning (prefix) possibly 0 and deleting some elements from the end (suffix) possibly 0.

Input format

    The first line contains an integer 

denoting the number of test cases. 
The first line of each test case contains an integer
denoting the number of elements in array
.
The second line contains
space-separated integers of array

    .

Output Format

Print

lines and for each test case:

    Print the minimum number of operations to delete the entire array.
*/
import java.util.*;



class ErasingAnArray {

public static void main(String args[] ) throws Exception {

 

Scanner s = new Scanner(System.in);

int t = s.nextInt();
 

for(int j=0;j<t;j++){

int n=s.nextInt();

StringBuilder sb=new StringBuilder();

 

for(int i=0;i<n;i++){

int o=s.nextInt();

sb.append(o);

}

int count=0;

while(sb.length()>0){

int k=0;

for(int i=0;i<sb.length();i++){

try{

if(sb.charAt(i+1)>=sb.charAt(i)){

k++;

}

else break;

}catch(Exception e){

continue;

}

}
 

sb.delete(0,k+1);

count++;

}

System.out.println(count);

}
 

}//end of main

}//end of TestClass