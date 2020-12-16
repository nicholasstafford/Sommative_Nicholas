/*
* Author : nicopicko
* Date : Dec. 16, 2020
*/
public class sommativeNicholas1partie2
	{

		public static void main(String[] args)
			{
			int []myTab = new int [20];								
			
			for(int i = 0; i < 20; i++)
				{myTab[i] = (int)(Math.random()*(i+1));} 			
			
			System.out.println(isPair(myTab));
			}
		
		static int isPair(int []tab)
					{
				int somme = 0;
				
				for(int i = 0; i<tab.length; i++)
				{
					if (tab[i]%2==0)
					
					for(int j = 0; i < tab.length;i++)
						{
						somme += tab[i];
						}
							
				}
				return somme/tab.length;
		}

		
	}
	
