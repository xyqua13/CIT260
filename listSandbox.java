import java.util.*;
public class listSandbox {
	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		//Sandbox Code for ArrayList
		//Happy Path - add to list
		try {
			list.add("Burger"); // push normal stuff.
			list.add("Fries");
			list.add("Pizza");
			list.add("Fries"); // Push Second fries to list RESULTS pushes second at new index
    	} catch(Exception ex) {
    	    ex.printStackTrace();
    	}
		System.out.println(list);
		
		//Happy Path - add to list
		try {
			list.add(4,"Milkshake");// add at index RESULTS adds to position 5 (end of array)
			list.add(1,"Soda"); //adds soda to spot one RESULT adds soda at 1 and moves list down.
    	} catch(Exception ex) {
    	    ex.printStackTrace();
    	}
		System.out.println(list);
		
		//Nasty Add Path
		try {
			list.add("/t /n /t a");//trys to push tab return line to list.
			list.add(null); //add null RESULT null added
			list.add(""); //add empty string RESULT adds empty string
			list.add(9999999,"NUMBER");//Huge Index RESULT throws out of bound exception
		} catch(Exception ex) {
		    ex.printStackTrace();
		}
		try {
			list.add(-1,"NUMBER");//negative Index RESULT throws out of bound exception
		} catch(Exception ex) {
		    ex.printStackTrace();
		}
		//result prints out all three results plain texts
		System.out.println(list);
		
		
		//REALLY nasty add path
		try {
			list.add((Integer) null,"Fried Chicken");//integer null as the index destroys this. RESULT: throws null poointer error
		} catch(Exception ex) {
		    ex.printStackTrace();
		}

		
		
		//Happy Path Removes
		try {
			list.remove("Fries");// removes fries RESULT removes first instance of fries
			list.remove(1); //removes index RESULT removes index 1
    	} catch(Exception ex) {
    	    ex.printStackTrace();
    	}
		System.out.println(list);
	
		
		//Nasty Remove Path
		try {
			list.remove("/t /n /t a");//trys to remove tab return line to list. RESULT works
			list.remove(null); //remove null RESULT null added
			list.remove(""); //remove empty string RESULT adds empty string
			list.remove(9999999);//trys to removeHuge Index RESULT throws out of bound exception
		} catch(Exception ex) {
		    ex.printStackTrace();
		}
		//result prints out all three results plain texts
		System.out.println(list);
		
		try {
			list.remove(-1);//trys to remove negative Index RESULT throws out of bound exception
		} catch(Exception ex) {
		    ex.printStackTrace();
		}

		//Nasty Path remove non created
		try {
			list.remove(17);//removes a non created index RESULT Out of bounds thrown.
		} catch(Exception ex) {
		    ex.printStackTrace();
		}
		System.out.println(list);

		try {
			list.remove("Water");//looks for water to remove RESULT no error nothing removed.
		} catch(Exception ex) {
		    ex.printStackTrace();
		}
		System.out.println(list);
				
		
				
		try {
			list2.add("Grapes"); // push normal stuff.
			list2.add("Watermellon");
			list2.add("Honeydew");
			list2.add("Apple"); // Push Second fries to list RESULTS pushes second at new index
    	} catch(Exception ex) {
    	    ex.printStackTrace();
    	}
		System.out.println(list2);
		
		//Happy - Merge
		try
		{
			list.addAll(list2);//merge list2 with list RESULT Everything pushed to list
		}catch(Exception ex) {
		    ex.printStackTrace();
		}
		System.out.println(list);
				
				

	
	}
}
