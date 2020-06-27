import java.util.*;

import java.util.stream.*;

public class Streams_Lambda {

	
	public static Double average(List<Integer> arr) {
		Double avg = arr.stream().mapToInt(x->x).average().getAsDouble();
		return avg;
	}
	
	public static List<String> filter(List<String> words) {
		
		List<String> res = words.stream().filter(s->s.startsWith("S")).filter(s->s.length()==3).collect(Collectors.toList());
		return res;
		
	}
	
	public static boolean is_palindrome(String x) {
		
		String temp = x.replaceAll("\\s+", "").toLowerCase();
	    return IntStream.range(0, x.length() / 2)
	        .allMatch(i -> temp.charAt(i) == temp.charAt(temp.length() - i - 1));
		
		
	}
	public static void main(String args[])
	{
		List<Integer> nums = Arrays.asList();
		Scanner obj = new Scanner(System.in)
			int N;
			N = obj.nextInt();
			for(int i = 0 ; i < N ; i++)
			{
				int number = obj.nextInt();
				nums.add(number);
			}
			
			System.out.println(average(nums));
			
			List<String> strings = Arrays.asList();
			
			
			for(int i =0 ; i < N ; i++ )
			{
				String word = obj.next();
				strings.add(word);
			}
			
			System.out.println(filter(strings));
			
			
			for(String x: strings) {
				if(is_palindrome(x)) {
					System.out.print(x+"is a Palindrome");
				}
			}
		
		
		
	}
}
