package TodayWork;

public class TitleCase {
	public static void main(String[] args) {
		String s = "hello hi good evening how are you doing today?";
		StringBuilder sb = new StringBuilder();
		String ar[] = s.split(" ");
		for(int i =0; i<ar.length; i++)
		{
			sb.append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(ar[i].substring(0,ar[i].length()-1)+" ");
		}
		System.out.println(sb);
	}
}
