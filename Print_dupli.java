package geeks_prac;

//The program to print duplicates in a string
public class Print_dupli {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "asdefrhhjk";
		int asciival[] = new int[256];
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			asciival[ch-'a']++;
		}
		StringBuilder sb = new StringBuilder();
		char charmax = 0;
		
		
		for(int j=0;j<str.length();j++)
		{
			char kl = str.charAt(j);
			int fig = kl - 'a';
			if(asciival[fig]>=2)
			{
				 charmax = (char)(fig+97);
				 sb.append(charmax);
				
				asciival[fig] = 0;
			}
		}
		System.out.println(sb.toString());
		
	}

}
