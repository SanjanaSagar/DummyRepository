package com.cg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraySumPro {

	public static void main(String[] args) {
		
		int sum=0;
		int pro=1;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter size of array:");
			int size=Integer.parseInt(br.readLine());
			if(size%2!=0) {
				
			int[] arr=new int[size];
			
			System.out.println("enter array elements:");
			for(int i=0;i<size;i++) {
				
				arr[i]=Integer.parseInt(br.readLine());
				if(i<(size/2))
					sum+=arr[i];
				else if(i==(size/2))
					continue;
				else
					pro*=arr[i];
			}
			
			System.out.println(sum+pro);
			
			}
			else {
				System.out.println("Enter odd size");
			}
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
