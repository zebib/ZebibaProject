import java.util.Scanner;


public class EnterName {

	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder();
		
		
		Scanner sc = new Scanner(System.in);
		String response = "Y";
		
		while(!response.equals("N")){
			System.out.println("Enter a name: (N to exit)");
			response = sc.next();
			
			if(response.equals("N")) break;
			else {
				if(StringInput.countString(sb.toString(), response)>0){
					System.out.println("Name already exists. ");
					
					break;
				}
				else {
					sb.append(response.concat(" "));
				}
			}
		}
		
		System.out.println(sb.toString());
	}



	}


