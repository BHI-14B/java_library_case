package library;

import java.util.Scanner;
public class signIn {
	private String email;
	private String password;
	
	static Scanner sc=new Scanner(System.in);
	public static int signInMenuList()
	{
		System.out.println("0.Exit");
		System.out.println("1.Sign In");
		System.out.println("2.Sign Up");
		System.out.println("Enter Choice  :");
		return sc.nextInt();
		
	}
	public static signIn getSign()
	{
		System.out.println("Enter email");
        signIn signin=new signIn();
        sc.nextLine();
        signin.email=sc.nextLine();
        System.out.println("Enter password");
        signin.password=sc.nextLine();
         return signin;
	}
	public static pojo_user getSignUp()
	{
		pojo_user signin=new pojo_user();
    
		System.out.println("Enter email");
        signin.setEmail(sc.nextLine());
        sc.nextLine();
        System.out.println("Enter password");
        signin.setPassword(sc.nextLine());
        System.out.println("Enter Name");
        signin.setPassword(sc.nextLine());
        System.out.println("Enter Phone No");
        signin.setPhone(sc.nextLine());
         
        return signin;	
		
	}
	
	public static void main(String[] args) throws Exception {
		int choice;
		daoSignIn dao=new daoSignIn();
		
				while((choice=signIn.signInMenuList())!=0)
				{
					   switch(choice) 
				      {
					   case 1:signIn signin=signIn.getSign();	
					           int status=dao.select(signin.email,signin.password);
					           if(status==1)
					           {
					        	   int choice1=afterSignIn.afterSignInMenuList();  
					        	   
					           }
					           else
					           {
					        	   System.out.println("Something went wrong !!!  email or password is invalid");
					           }
						      break;
					   case 2:
						       pojo_user signup=signIn.getSignUp();
						       int status1=dao.insert(signup);
						       if(status1==1)
						       {
						    	   System.out.println("Sign up done... ");
						       }
						       else
						    	   System.out.println("Something went wrong !!! ");
						         
						      break;
					  }
		
			  	}
     	}

}
