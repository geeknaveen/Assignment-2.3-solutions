
//Write a program to print the “X” pattern:  

package asst2_3;

public class XPattern {

	public static void main(String[] args) {
		
		int i =1;
				
				for(i=1;i<=5;i++)
				{
					for(int j=1;j<=5;j++)
					{
						if(i==j)
						{
							System.out.print(" *");
																				
						}
					
						if(i==1 && j==5)
						{
							System.out.print("* ");
													
						}
						if(i==2 && j==4)
						{
							System.out.print("* ");
							
						}	
					
						if(i==4 && j==2)
						{
							System.out.print("*");
							
						}
						if(i==5 && j==1)
						{
							System.out.print("* ");
							
						}
						else
						{
							System.out.print(" ");
													}
					}System.out.println();
					
				}

			}

		}
