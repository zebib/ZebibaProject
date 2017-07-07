
public class StringInput {
	public static class StringUtility {
		static int countString(String str,String lookup){
			int count = 0;
			for(int x = 0; x<=str.length()-lookup.length();x++){
				if(lookup.equals(str.substring(x,lookup.length()+x))) count++;
			}
			return count;
		}
		
	}

	public static int countString(String string, String response) {
		// TODO Auto-generated method stub
		return 0;
	}
}
