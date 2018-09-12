package first_application;

import java.util.ArrayList;
import java.util.HashMap;

public class Tester {
	int randoNumbo;
	
	public Tester(int datNumb) {
		randoNumbo = datNumb;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester noTest = new Tester(34);
		System.out.println(noTest.randoNumbo);
		Billy newTest = new Billy();
		HashMap<String, Integer> everyonesAge = new HashMap<String, Integer>();
		everyonesAge.put("Jaclyn", 80);
		everyonesAge.put("Chris", 24);
		everyonesAge.put("Baylie", 4);
		everyonesAge.put("Kinsley", 7);
		everyonesAge.put("Atlas", 12);
		
		for(String name: everyonesAge.keySet())
		{
			System.out.println(name + " is " + everyonesAge.get(name) + " years old.");
		}
		ArrayList<String> datList = new ArrayList<String>();
		datList.add("Nobody");
		datList.add("Somebody");
		datList.add("Everybody");
		
		for (int i = 0; i < datList.size(); i++)
		{
			System.out.println(datList.get(i));
		}
		
		noTest.randoNumbo ++;
		System.out.println(noTest.randoNumbo + newTest.billzNumb);
	}

}
