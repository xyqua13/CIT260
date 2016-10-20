import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class mapSandbox {

	public static void main(String[] args) {
		Map map = new HashMap();
		
		//Happy Paths Add
		map.put("BMW", 5);
		map.put("Mercedes", 3);
		map.put("Audi", 4);
		map.put("Ford", 10);
		System.out.println(map);
	
		// Nasty Put
		try {
			map.put("","");
			map.put(null, null);
			map.put(-1, 5);
			map.put(1, "/n");
			map.put("9aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa99999as9dfa9sdf9asdf", 1);
		} catch(Exception ex) {
		    ex.printStackTrace();
	}
	System.out.println(map);
	//Happy Remove
	map.remove("BMW");
	map.remove(1);
	System.out.println(map);
	// Nasty Remove
			try {
				map.remove("");
				map.remove(null);
				map.remove(-1);
				map.remove(1);
				map.remove("9aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa99999as9dfa9sdf9asdf");
				map.remove(1);
			} catch(Exception ex) {
			    ex.printStackTrace();
		}
		System.out.println(map);
	}
	
	
}