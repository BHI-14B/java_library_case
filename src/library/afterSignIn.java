
package library;

import java.util.Scanner;

public class afterSignIn {

	static Scanner sc=new Scanner(System.in);
	
	public static int afterSignInMenuList()
	{
		System.out.println("0.SignOut");
		System.out.println("1.edit profile");
		System.out.println("2.change password");
		
		System.out.println("3.subjectwise copies report");
		System.out.println("4.Fees/Fine report");
		System.out.println("5.Add librarian");
		return sc.nextInt();
		
	}
	public static void afterSignInmenuDriven() throws Exception
	{
		int choice;
		daoSignIn dao=new daoSignIn();
		
				while((choice=afterSignIn.afterSignInMenuList())!=0)
				{
					   switch(choice) 
				      {
					      
					   case 1:
						   pojo_user editP=signIn.getSignUp();
						   dao.update(editP);
						   break;
					   case 2:
						   break;
					   case 3:
						   break;
					   case 4:
						   break;
					   case 0:
						   break;
				      }
				 }
			
	}
	
}
