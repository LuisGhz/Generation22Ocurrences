package com.exercise22ocurrences.app;

//import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class OcurrencesApp {

	public static void main(String[] args) {
		//Constats declaration
		final int ELEMENTS = 10000;
		
		//Variables declaration
		int[] myArr = new int[ELEMENTS];
		
		//Objects declaration
		//Scanner kInput = new Scanner(System.in);
		Random nRandom = new Random(System.nanoTime());
		HashMap<Integer, Integer> miMap = new HashMap<Integer, Integer>();
		
		//Initialization
		for (int i = 0; i < ELEMENTS; i++)
		{
			myArr[i] = nRandom.nextInt(101);
		}
		
		//Process
		for (int element : myArr)
		{
			if (miMap.containsKey(element))
			{
				miMap.put(element, miMap.get(element) + 1);
			}
			
			miMap.putIfAbsent(element, 1);
			
		}
		
		
		
		for (Map.Entry<Integer, Integer> element : miMap.entrySet())
		{
			System.out.format("The number %d has %d ocurrences\n", element.getKey(), element.getValue());
		}
		
		
		/*for (int i : myArr)
		{
			System.out.print(i + " ");
		}*/
		
		//kInput.close();
	}

}
