/*
* Author : nicopicko
* Date : Dec. 16, 2020
*/
public class sommativeNicholas
	{

		public static void main(String[] args)
			{
				System.out.println(saluerAmi("John"));
			}
		
		static String saluerAmi(String a) // ceci doit être static pas public
		{
			String message = "Bonjour mon ami "+a; // tu a besoin de mettre un espace après ami pour que le output est "ami john" pas "amiJohn"
			return message;
		}

	}
// tu a aussi met le methode dans le public static void mais il doit être separer du public static void