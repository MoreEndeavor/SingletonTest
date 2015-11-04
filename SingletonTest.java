package com.li;

class Singleton
{
	private static Singleton single;
	private Singleton()
	{
		
	}
	public static Singleton getSingleton()
	{
		if(single==null)
		{
			single = new Singleton();
		}
		return single;
	}
}
public class SingletonTest {

	public static void main(String[] args)
	{
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		if(s1==s2)
		{
			System.out.println("Singleton pattern success!");
		}
		else 
		{
			System.out.println("Singleton pattern failed!");
		}
	}
}

