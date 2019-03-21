package com.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class MapDemo
{
	int ConvertedNumber(String lstrNum)
	{
	  int lintNum=0;
	  
	  for(int i=0;i<lstrNum.length();i++)
	  {
		  int lintDigit=((int)lstrNum.charAt(i)-48);
		  lintNum=lintNum*10+lintDigit;
	  }
	  return lintNum;
	}	
	void ArrayListDemmo()
	{
		Stack lobjStack=new Stack();
		ArrayList lobjList=new ArrayList();
		lobjList.add(2);
		lobjList.add("sda");
		lobjList.add(25.25);
		System.out.print("\nList Item:");
		for (Object object : lobjList) 
		{
			System.out.print(" "+object);			
		}
		for (Object object : lobjList)
		{			
			lobjStack.push(object);
		}
		System.out.print("\nRevers List: ");
		while(!lobjStack.isEmpty())
		{
			System.out.print(" "+lobjStack.pop());
		}		
	}
	void removeDouplicate()
	{
		String str[] ={"Ajay","Rahul","Sachin","Ajay","Yuvi"};
		Set objSet=new HashSet();
		System.out.print("\n After Array Remove douplicate: ");
		for(String strObj:str)
		{
			if(objSet.add(strObj))
				System.out.print(" "+strObj);
		}
	}
}

public class MainDemo 
{
	public static void main(String args[])
	{
		MapDemo ldemoObj=new MapDemo();
		System.out.println("Integer value :"+ldemoObj.ConvertedNumber("10000"));	
		ldemoObj.ArrayListDemmo();
		ldemoObj.removeDouplicate();		
	}
}
