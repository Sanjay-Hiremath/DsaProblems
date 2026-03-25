import java.util.*;
interface InsightGenerator{
	public  Map <Integer,Count> countOccurences(ArrayList<Integer> ls);
	public List<Integer> TrackUnique(ArrayList<Integer> ls);
	
	
}

class ArrayInsightAnalyzer //implements InsightGenerator
{

//	feature to count the occurences of an element 
//	in the arraylist
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

		public static List trackUnique(ArrayList<Integer> ls){
		Map<Integer,Count> occurences=countOccurences(ls);
		HashSet <Integer>lsRef= new HashSet<>(ls);
		List <Integer> resultList= new ArrayList<>();
		for(Integer i:lsRef){
			if(occurences.get(i).getCount()==1){
				resultList.add(i);
			}
			
		}
		return resultList;
	}

	public static void main(String[] args) {
		ArrayList <Integer> list= new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		Map<Integer,Count> count= countOccurences(list);
		Map<Integer,Integer> resMap= new HashMap<>();
		for(Integer i:list){
			resMap.put(i,count.get(i).getCount());
		}
		System.out.println(resMap);
		System.out.println(trackUnique(list));


		}
		
}
class Count{
	private int count=0;
	public void increment(){
		count++;
	}
	public int getCount(){
	return count;
	}
	
}
