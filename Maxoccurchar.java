package geeks_prac;

//The program to find the maximum occurring character in a string
public class Maxoccurchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "testeeeeeeaaaaaaaaaaaaaa";
		int asciival[] = new int[256];
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			asciival[ch-'a']++;
		}
		int maxcount=0;
		char charmax = 0;
		int maxindex=0;
		
		for(int j=0;j<asciival.length;j++)
		{
			int count = asciival[j];
			if(count>maxcount)
			{
				maxcount = count;
				charmax = (char)(j+97);
				maxindex=j;
			}
		}
		System.out.println(charmax);
	}

}
