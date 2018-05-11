package com.udemy.baseclass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadTextFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\abc.txt"));
			String readline;
			
			while(( readline=br.readLine()) != null)
			{
				System.out.println(readline);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		

	}

}
