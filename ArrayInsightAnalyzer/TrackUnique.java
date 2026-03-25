import java.util.*;
import ArrayInsightAnalyzer.CountOccurence;
class TrackUnique{
public static ArrayList<Integer> trackUnique(ArrayList<Integer> ls){
		Map<Integer,Count> occurences=CountOccurences.countOccurences(ls);
		HashSet <Integer>lsRef= new HashSet<>(ls);
		ArrayList <Integer> resultList= new ArrayList<>();
		for(Integer i:lsRef){
			if(occurences.get(i).getCount()==1){
				resultList.add(i);
			}
			
		}
		return resultList;
	}
}