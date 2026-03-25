import java.util.*;

class CountOccurences{
public static Map<Integer,Count> countOccurences(ArrayList<Integer> ls){
		
		Set <Integer> elementTracker = new HashSet<Integer>(ls);	
		Map<Integer,Count> count= new HashMap< > ();
		for(int i=0;i<ls.size();i++){
			count.put(ls.get(i),new Count());
		}
		for(Integer i:elementTracker){
			for(Integer j:ls){
				if(i==j){
					count.get(i).increment();
				}
			}
		}
return count;
	}
}