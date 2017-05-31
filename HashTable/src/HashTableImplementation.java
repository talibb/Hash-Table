/*
 * Done By: Talib Bacchus
 * This program implements a hash table and uses it to search through a directory of people
 * with their corresponding name and phone number
 */

import java.util.Hashtable;// imports hash table collection

public class HashTableImplementation {

	public static final Hashtable <String, Integer> HASH = new Hashtable <String, Integer>(){{
		// creating and adding objects and their information
		put("Talib Bacchus", 5549799);
		put("Abby Abraham", 5835626);
		put("Sophie Stewart", 9482057);
		put("Liam Sanders", 1398493);
		put("Wanda Bond", 8204810);
		put("Andrew Bailey", 30185302);
		put("Diane Stewart", 8520481);
		put("Ava Law", 7284532);
		put("Dominic Hughes", 5942104);
		put("Joe Sharp", 4440193);
		put("Nattalie Smith", 3718463);
		put("Andrew Will", 2125519);
		put("Rose Watts", 4598762);
		put("Jasmine Hunt", 8449275);
		put("Sally Smith", 9347329);
		put("Martin Brown", 8017465);
		put("Joe Snow", 3028574);
		put("Steve Notch", 4857392);
		put("Henry Lewis", 9852348);
		put("Richard Smith", 5394857);
		
		
	}};
	public static void main(String[] args) {
		System.out.println("The amount of people in the directory: ");
		System.out.println(HASH.size());//prints out size
		System.out.println();
		System.out.println("Everyone's telephone directory information: ");
		for(String keyValue : HASH.keySet())// prints out information 
		{
			System.out.println(keyValue + ": " + HASH.get(keyValue)); 
			
		}
		
		System.out.println("Searching for the telephone number of Talib Bacchus");
		if(HASH.containsKey("Talib Bacchus"))// searches for key given the values
		{
			System.out.println("Talib Bacchus phone number: ");
			System.out.println(HASH.get("Talib Bacchus"));
		}
		
		
		
	}
}
