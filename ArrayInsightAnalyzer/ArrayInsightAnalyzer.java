import java.util.*;
import ArrayInsightAnalyzer.*;
class ArrayInsightAnalyzer 
{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList <Integer> ls= new ArrayList<>();
		Set <Integer> compare= new HashSet<>();
		System.out.println("Array Analyzer");
		System.out.println(
			"Choose the option/n 1)CountOccurence/n 2)TrackUnique/n  "

		);

		int ch= sc.nextInt();
		switch (ch) {
// Count the occurences of each elements in the arraylist  with histogram
			case 1:
				System.out.println("Enter the number of elements in the array");
				int n=sc.nextInt();
				ls.clear();
				for(int i=0;i<n;i++){
					ls.add(sc.nextInt());
				}compare.addAll(ls);
				Map<Integer,Count> resultMap=CountOccurences.countOccurences(ls); // return the object count which contains count.The count object is paired with integer in map.
				System.out.println("Occurences are as follows");
				System.out.println("Number      count    histogram");
				System.out.println();

				for(Integer i:compare){
					System.out.println("  "+i+"     :     "+resultMap.get(i).getCount()+"       "+resultMap.get(i).getHistogram()+"\n");
				}
				break;
// displays the unique elements in the arraylist  
			case 2:
				System.out.println("Enter the number of elements in the array");
				int m=sc.nextInt();
				ls.clear();
				System.out.println("Enter the array elements ");
				for(int i=0;i<m;i++){
					ls.add(sc.nextInt());
				}
				ArrayList<Integer> resulList=TrackUnique.trackUnique(ls); // return unique elements in the list.   
				System.out.println(resulList);
				break ;

			default:
// Performs all operations 
				System.out.println("Performing all:");
				System.out.println();
System.out.println("Counting occurences:");
				System.out.println();
				System.out.println("Enter the number of elements in the array");
				int o=sc.nextInt();
				ls.clear();
				for(int i=0;i<o;i++){
					ls.add(sc.nextInt());
				}compare.clear();
				compare.addAll(ls);
				Map<Integer,Count> resultMap_=CountOccurences.countOccurences(ls);
//  Prints all the elements in occerances in the list 
				System.out.println("Occurences are as follows");
				for(Integer i:compare){
					System.out.println(i+" -> "+resultMap_.get(i).getCount()+" "+"/n");
				}
				System.out.println();
//  Displays the unique elements in the list which are unrepeting
				System.out.println("Unique elements in the list");
				System.out.println();
				ArrayList<Integer> resulList__=TrackUnique.trackUnique(ls);
				System.out.println(resulList__);
				break ;

		}
		}
		
}