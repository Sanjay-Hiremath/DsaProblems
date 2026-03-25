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
			case 1:
				System.out.println("Enter the number of elements in the array");
				int n=sc.nextInt();
				ls.clear();
				for(int i=0;i<n;i++){
					ls.add(sc.nextInt());
				}compare.addAll(ls);
				Map<Integer,Count> resultMap=CountOccurences.countOccurences(ls);
				System.out.println("Occurences are as follows");
				for(Integer i:compare){
					System.out.println(i+" -> "+resultMap.get(i).getCount()+" "+"/n");
				}
				break;
			case 2:
				System.out.println("Enter the number of elements in the array");
				int m=sc.nextInt();
				ls.clear();
				System.out.println("Enter the array elements ");
				for(int i=0;i<m;i++){
					ls.add(sc.nextInt());
				}
				ArrayList<Integer> resulList=TrackUnique.trackUnique(ls);
				System.out.println(resulList);
				break ;

			default:
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
				System.out.println("Occurences are as follows");
				for(Integer i:compare){
					System.out.println(i+" -> "+resultMap_.get(i).getCount()+" "+"/n");
				}
				System.out.println();
System.out.println("Unique elements in the list");
				System.out.println();
				ArrayList<Integer> resulList__=TrackUnique.trackUnique(ls);
				System.out.println(resulList__);
				break ;

		}
		}
		
}