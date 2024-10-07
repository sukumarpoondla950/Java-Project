import java.util.*;
class unicodes
{
    static String BLACK="\u001B[30m";
    static String red="\u001B[31m";     //unicodes 31 -37 text colors
    static String green="\u001B[32m";
    static String yellow="\u001B[33m";
    static String blue="\u001B[34m";
    static String purple="\u001B[35m";
    static String skyblue="\u001B[36m";
    static String white="\u001B[37m";
    static String backred="\u001B[101m";   //101-107 background
    static String backgreen="\u001B[102m";
    static String backyellow="\u001B[103m";
    static String backblue="\u001B[104m";
    static String backpurple="\u001B[105m";
    static String backskyblue="\u001B[106m";
    static String backcement="\u001B[107m";
    static String reset="\u001B[0m";    //reset 
    static String under="\u001B[21m";    //underline
    static String blink="\u001B[5m";    //blink
    static String bold="\u001B[1m";    //bold 
    static String b="\u001B[2m";  
    static String Italic="\u001B[3m";   //Italic
    static String d="\u001B[4m";  //underline
}

class user extends unicodes
{
    static Scanner sc=new Scanner(System.in);
    private static String username="Sukumar Poondla";
    private static String password="Sukumar@123";
    private static long phone=9876543210l;
    String get_password()
    {
        return password;
    }
    void set_password(String Password)
    {
        this.password=Password;
    }
    
    long get_phone()
    {
        return phone;
    }
    void set_phone(long phone)
    {
        this.phone=phone;
    }
    
     String get_username()
    {
        return username;
    }
    void set_username(String username)
    {
        this.username=username;
    }
    void login()
    {
System.out.println();
System.out.println(bold+"--------------------------------LOGIN------------------------------------");
	
	System.out.print("Enter user name:");
        String username=sc.nextLine();
        if(username.equals(get_username()))
        {
            System.out.print("Enter Your password: ");
            String password=sc.nextLine();
            if(password.equals(get_password()))
            {
                System.out.println(green+"Login SuccessFully"+reset);
		System.out.println("\n");
		System.out.println("________________________________________________________________________________");
		os.main(null);
            }
            else
            {
                System.out.println("Wrong password\n1.Change Your Password \n 2.Show Your Password /n Any Number to Re Enter Password");
                int a=Integer.parseInt(sc.nextLine());
                if(a==1)
                {
                    System.out.println("Enter Your password");
                    password=sc.nextLine();
                    set_password(password);
		    login();
                }
                else if(a==2)
                {
                    System.out.print("Your password is="+get_password());
		    login();
                }
		else
		{
			System.out.print("Enter Your password: ");
            		password=sc.nextLine();
            		if(password.equals(get_password()))
            		{
                	System.out.println("Login SuccessFully");
			os.main(null);
            		}
			else
		{	
			System.out.println("Wrong Choice and Login again");
			login();
		}

		}
            }
            
        }
        else
        {
            System.out.println("Wrong username");
            while(true)
            {
            System.out.print("Enter Your Phone Number:");
            long phone=Long.parseLong(sc.nextLine());
	    set_phone(phone);
            long l=phone,c=0;
            while(l>0)
            {
                l=l/10;
                c++;
            }
            if(c==10)
            {

            	if(phone==get_phone())
            	{
                	
                		int otp=otp_generator();
                		System.out.println("Your Otp:"+otp);
                		System.out.print("Enter your otp:");
                		int i=Integer.parseInt(sc.nextLine());
                		if(i==otp)
                		{
                			System.out.print("Create  Your New Username:");
                			String user=sc.nextLine();
                			set_username(user);
					System.out.println();
	    System.out.println("                     Instructions For PassWord Creation");
			System.out.println("                     ----------------------------------");
			System.out.println("\n1.Password needs atleast one Captial letter");
			System.out.println("2.Password needs atleast one small letter");
			System.out.println("3.Password needs atleast one Special Character");
			System.out.println("4.Password Should be atleast 8 characters");
			System.out.println();
            while(true)
		{
			
			System.out.print(blue+"Create Your Password: :  "+reset);
			String password=sc.nextLine();
			int cap=0,small=0,special=0;
			for( i=0;i<password.length();i++)
			{
				if(password.charAt(i)>='A'&&password.charAt(i)<='Z')
				cap++;
				else if(password.charAt(i)>='a'&&password.charAt(i)<='z')
				small++;
				else if((password.charAt(i)>='!'&&password.charAt(i)<='@')||password.charAt(i)>='['&&password.charAt(i)<='`')
				special++;
			}
			if(cap==0)
				{
				System.out.println("Password needs atleast one Captial Letter");
				}
			else if(small==0)
				{
				System.out.println("Password needs atleast one small Letter");
				}
			else if(special==0)
				{
				System.out.println("Password needs atleast one Special Character");
				}
				else if(password.length()<9)
				{
				System.out.println("Password Should be atleast 8 characters");
				}
			else
			{
			System.out.print(green+"Confirm Your  Password  :  ");	
			String confirmpassword = sc.nextLine();		
			if(password.equalsIgnoreCase(confirmpassword))
			{
				set_password(password);
				break;
			}
			else
			{
			System.out.println(red+"Password and Confirm Password are not same please check once:   "+reset);
			}
			}
		}
		System.out.println();
		System.out.println(green+"your Account User name and Password  has been changed  Succesfully"+reset);

            set_password(password);
      
					
					login();
					break;
                		}
            	}
            }
            else
            {
                System.out.println("Phone Number Must conatins 10 digits");
            }
	    }
        }
        
    }
    static int otp_generator()
    {
        return (int)(Math.random()*1000)+9000;
    
    }
    void signup()
    {
	System.out.println();
	System.out.println(blue+bold+"--------------------------------SINGUP------------------------------------");
	System.out.println();
        System.out.print("Enter YouR Phone Number:");
        long phone=Long.parseLong(sc.nextLine());
        int c=0;
        long l=phone;
        user x=new user();
        while(l>0)
        {
            l=l/10;
            c++;
            
        }
        while(c==10)
        {
            int otp=otp_generator();
            System.out.println("Your otp="+otp);
            System.out.print("Enter your otp to create account:");
            if(Integer.parseInt(sc.nextLine())==otp)
            {
            System.out.print("Create Your Username:");
            String username=sc.nextLine();
            set_username(username);
	    System.out.println();
	    System.out.println("                     Instructions For PassWord Creation");
			System.out.println("                     ----------------------------------");
			System.out.println("\n1.Password needs atleast one Captial letter");
			System.out.println("2.Password needs atleast one small letter");
			System.out.println("3.Password needs atleast one Special Character");
			System.out.println("4.Password Should be atleast 8 characters");
			System.out.println();
            while(true)
		{
			
			System.out.print(blue+"Create Your Password: :  "+reset);
			String password=sc.nextLine();
			int cap=0,small=0,special=0;
			for(int i=0;i<password.length();i++)
			{
				if(password.charAt(i)>='A'&&password.charAt(i)<='Z')
				cap++;
				else if(password.charAt(i)>='a'&&password.charAt(i)<='z')
				small++;
				else if((password.charAt(i)>='!'&&password.charAt(i)<='@')||password.charAt(i)>='['&&password.charAt(i)<='`')
				special++;
			}
			if(cap==0)
				{
				System.out.println("Password needs atleast one Captial Letter");
				}
			else if(small==0)
				{
				System.out.println("Password needs atleast one small Letter");
				}
			else if(special==0)
				{
				System.out.println("Password needs atleast one Special Character");
				}
				else if(password.length()<9)
				{
				System.out.println("Password Should be atleast 8 characters");
				}
			else
			{
			System.out.print(green+"Confirm Your  Password  :  ");	
			String confirmpassword = sc.nextLine();		
			if(password.equalsIgnoreCase(confirmpassword))
			{
				set_password(password);
				break;
			}
			else
			{
			System.out.println(red+"Password and Confirm Password are not same please check once:   "+reset);
			}
			}
		}
		System.out.println();
		System.out.println(green+"your Account has been created Succesfully"+reset);

            set_password(password);
            System.out.println("Your Acount Create SuccessFully and Login into Online Shopping");
            login();
            break;
            }
        }
        if(c!=10 || l<0)
        {
            System.out.println("Please Re Enter Your Phone Number");
            signup();
        }
        
    }
	public static void main(String[] args) 
	{
System.out.println();
System.out.println(red+" ## ##   ###  ##  ####       ####   ###  ##  ### ###            ## ##   ###  ##   ## ##   ### ##   ### ##     ####   ###  ##   ## ##"+reset) ;
System.out.println(green+"##   ##    ## ##   ##         ##      ## ##   ##  ##           ##   ##   ##  ##  ##   ##   ##  ##   ##  ##     ##      ## ##  ##   ##"+reset);
System.out.println(blue+"##   ##   # ## #   ##         ##     # ## #   ##               ####      ##  ##  ##   ##   ##  ##   ##  ##     ##     # ## #  ##     "+reset) ;  
System.out.println("##   ##   ## ##    ##         ##     ## ##    ## ##             #####    ## ###  ##   ##   ##  ##   ##  ##     ##     ## ##   ##  ###  "); 
System.out.println(blue+"##   ##   ##  ##   ##         ##     ##  ##   ##                   ###   ##  ##  ##   ##   ## ##    ## ##      ##     ##  ##  ##   ##  "+reset) ;
System.out.println(green+"##   ##   ##  ##   ##  ##     ##     ##  ##   ##  ##           ##   ##   ##  ##  ##   ##   ##       ##         ##     ##  ##  ##   ##  "+reset) ;
System.out.println(red+" ## ##   ###  ##  ### ###    ####   ###  ##  ### ###            ## ##   ###  ##   ## ##   ####     ####       ####   ###  ##   ## ##   "+reset) ;

                                                                                                                                       

		System.out.println("\n1.Sign up \n2.Login\n 3.Exit");
		System.out.print(blue+"Enter Your Choice : "+reset);
		int a = Integer.parseInt(sc.nextLine());
		if(a==1)
		{

		    user x=new user();
		    x.signup();
		}
		else if(a==2)
		{
		    user y=new user();
		    y.login();
		}
		else if(a==3)
		{
		   System.out.println("Exit"); 
		}
		else 
		{
		   System.out.println("Wrong choice, Please re Enter the Number"); 
		   main(null);
		}
		
		
	}
}
class os extends unicodes
{	
	public static void main(String[] args)
	{
System.out.println("\n");
 System.out.println(red+"			##   ##    ##      ####    ##  ##            #####      ##     ####    ######  ");
 System.out.println(blue+"			### ###   ####      ##     ### ##            ##  ##    ####    ##  ##   ##      ");
 System.out.println(green+"			#######  ##  ##     ##     ######            ##  ##   ##  ##   ##       ##      "+reset);
 System.out.println("			## # ##  ######     ##     ######            #####    ######   ## ###   ####    ");
 System.out.println(green+"			##   ##  ##  ##     ##     ## ###            ##       ##  ##   ##  ##   ##      ");
 System.out.println(blue+"			##   ##  ##  ##     ##     ##  ##            ##       ##  ##   ##  ##   ##      ");
 System.out.println(red+"			##   ##  ##  ##    ####    ##  ##            ##       ##  ##    ####    ###### "+reset);
		Scanner obj=new Scanner(System.in);
	    	System.out.println(green+"\n\nEnter \n 1.Women  \n 2.Girls \n 3.Kids \n 4.Men \n 5.Home Apliances \n 6.Close \n"+reset);
		System.out.print(blue+"Enter Your Choice : "+reset);
	    	int a=obj.nextInt();
		System.out.println("\n");
	   	if(a==1)
	         	WomensClothing.main(null);
	    	else if(a==2)
	        	GirlsClothing.main(null);
	    	else if(a==3)
	    		kids.main(null);
	    
		else if(a==4)
			OnlineShopping.main(null);
		else if(a==5)
			Main.main(null);
		else if(a==6)
			{
				
			}
			

		else
		{
			System.out.println(red+"Enter Wrong Choice, Please Enter Again"+reset);
			os.main(null);
		}
	    
	}
}
class WomensClothing extends unicodes
{
	static Scanner sc = new Scanner(System.in);
	static WomensClothing W =new WomensClothing();
	static double bill;
	static double Sarees = 1500.0;
	static double Dresses = 1000.0;
	static double EthnicWear = 3000.0;
	static double western = 500.0;
	static double Tops = 300.0;
	static double Leggings = 350.0;
	static double Beautyproducts = 500.0;
	static double Jeans = 800.0;
	static double Handbags = 500.0;
	static double Footwear = 200.0;
	static double Nightsuits = 350.0;
	static double Lingerie = 300.0;
	static double Accessories = 300.0;
	void Sarees()
	{
		double KanjivaramSilk = 1000.0;
		double Banarasi = 1500.0;
		double Chikankari = 1000.0;
		double Bandhani = 1000.0;
		double Nauvari = 1500.0;
		double Chaderi  = 1000.0;
		double Kasavu = 2000.0;
		double Tant = 1000.0;
		double Pochampalli = 5000.0;
		double Dharmavaram = 4000.0;
		double Uppada = 1500.0;
		double Narayanpet = 3000.0;
		double Organza = 1500.0;
		double Dolasilk = 1000.0;
		double Zimmichoo = 2500.0;
		System.out.println(skyblue+bold+"1.Kanjivaram Silk-->$1000\n2.Banarasi-->$1500\n3.Chikankari-->$1000\n4.Bandhani-->$1000\n5.Nauvari-->$1500\n6.Chaderi-->$1000\n7.Kasavu-->$2000\n8.Tant-->$1000\n9.Pochampalli-->$5000\n10.Dharmavaram-->$4000\n11.Uppada-->$1500\n12.Narayanpet-->$3000\n13.Organza-->$1500\n14.Dolasilk-->$1000\n15.Zimmichoo-->$2500"+reset);
		System.out.println("Select a number which Item you want to buy: ");
		int a = Integer.parseInt(sc.nextLine());
		switch(a)
		{		
			case 1:
				System.out.println("Enter the number of Kanjivaram Silk you want: ");
				System.out.print("Enter the quantity: ");
				int b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*KanjivaramSilk);
				break;
			case 2:
                        	System.out.println("Enter the number of Banarasi you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Banarasi);
				break;
                        case 3:
                                System.out.println("Enter the number of Chikankari you want: ");
				System.out.print("Enter the quantity: ");			
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Chikankari);
				break;
			case 4:
				System.out.println("Enter the number of Bandhani you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Bandhani);
				break;
			case 5:
                                System.out.println("Enter the number of Nauvari you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Nauvari);
				break;
                        case 6:
                                System.out.println("Enter the number of Chaderi you want: ");	
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Chaderi);
				break;
                        case 7:
                                System.out.println("Enter the number of Kasavu you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Kasavu);
				break;	
			case 8:
				System.out.println("Enter the number of Tant you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Tant);
			case 9:
				System.out.println("Enter the number of Pochampalli you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Pochampalli);
			case 10:
				System.out.println("Enter the number of Dharmavaram you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Dharmavaram);
			case 11:
				System.out.println("Enter the number of Uppada you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Uppada);
			case 12:
				System.out.println("Enter the number of Narayanpet you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Narayanpet);
			case 13:
				System.out.println("Enter the number of Organza you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Organza);
			case 14:
				System.out.println("Enter the number of Dolasilk you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Dolasilk);
				break;
			case 15:
                                System.out.println("Enter the number of Zimmichoo you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Zimmichoo);
				break;
		default :
					System.out.println(red+bold+"Your select is invalid, please Re-Enter: "+reset);
					Sarees();
		}
	while(true)
	{
	System.out.println(yellow+bold+"Enter 0-Exit\n1-Buy Again\n2-WomensClothing"+reset);
	int d = Integer.parseInt(sc.nextLine());
	if(d==0)
		break;
	
	else if(d==1)
	{
		Sarees();break;
		}
		else if(d==2)
		{
			WomensClothing.main(null);break;
		}
		else
		{
			System.out.println("Wrong Choice , Enter Again");
		}
	}
	}
	

	void Dresses()
	{
		double KurthiSets = 1000.0;
		double PlazoSets = 1500.0;
		double DressMaterials = 1000.0;
		System.out.println(skyblue+bold+"1.KurthiSets-->1000rs\n2.PlazoSets-->1500rs\n3.DressMaterials-->1000rs"+reset);
		System.out.println("Select a number which Item you want to buy: ");
		int a = Integer.parseInt(sc.nextLine());
		switch(a)
		{
			case 1:
				System.out.println("Enter the number of KurthiSets you want: ");
				System.out.print("Enter the quantity: ");
				int b = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the size you want: ");
				String s =sc.nextLine();
				bill = bill+(b*KurthiSets);
				break;
			case 2:
                                System.out.println("Enter the number of PlazoSets you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*PlazoSets);
				break;
                        case 3:
                                System.out.println("Enter the number of DressMaterials you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*PlazoSets);
				break;
		default :
					System.out.println(red+bold+"Your select is invalid, please Re-Enter: "+reset);
					Dresses();
		}
	while(true)
	{
		System.out.println(yellow+bold+"Enter 0-Exit\n1-Buy Again\n2-Go to WomensClothing"+reset);
	int d = Integer.parseInt(sc.nextLine());
	
	if(d==1)
	{
		Dresses();break;
	}
	else if(d==2)
	{
		WomensClothing.main(null);break;
	}
	else if(d==0)
		break;
	
	else
	{
		System.out.println("Invalid Input");
	}
	}
}
	
	void EthnicWear()
	{
		double Lehengas = 2500.0;
		double HalfSarees = 3000.0;
		double CropTops = 1500.0;
		double Frocks = 2000.0;
		double Kurtas = 1000.0;
		double KurtaSuitSets = 1500.0;
		double SalwarsandChuridars = 500.0;
		double Blouses = 500.0;
		double Duppatas = 1500.0;
		double SkirtsandGagras = 1000.0;
		System.out.println(skyblue+bold+"1.Lehengas-->$2500\n2.HalfSarees-->$1500\n3.CropTops-->$1000\n4.Frocks-->$2000\n5.Kurtas-->$1000\n6.Kurta Suit Sets-->$1500\n7.Salwars & Churidars-->$500\n8.Blouses-->$500\n9.Duppatas-->$1500\n10.Skirts & Gagras-->$1000"+reset);
		System.out.println("Select a number which Item you want to buy: ");
		int a = Integer.parseInt(sc.nextLine());
          	switch(a)
		{
			case 1:
				System.out.println("Enter the number of Lehengas you want: ");
				System.out.print("Enter the quantity: ");
				int b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				String s=sc.nextLine();
				bill = bill+(b*Lehengas);
				break;
			case 2:
                                System.out.println("Enter the number of HalfSarees you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*HalfSarees);
				break;
                        case 3:
                                System.out.println("Enter the number of CropTops you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*CropTops);
				break;
                        case 4:
                                System.out.println("Enter the number of Frocks you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Frocks);
				break;	
			case 5:
				System.out.println("Enter the number of Kurtas you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Kurtas);
				break;
			case 6:
				System.out.println("Enter the number of Kurta Suit Sets you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*KurtaSuitSets);
				break;
			case 7:
				System.out.println("Enter the number of Salwars & Churidars you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*SalwarsandChuridars);
				break;
			case 8:
				System.out.println("Enter the number of Blouses you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*KurtaSuitSets);
				break;
			case 9:
				System.out.println("Enter the number of Duppatas you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Duppatas);
				break;
			case 10:
				System.out.println("Enter the number of Skirts & Gagras you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*SkirtsandGagras);
				break;
		default :
					System.out.println(red+bold+"Your select is invalid, please Re-Enter: "+reset);
					EthnicWear();
		}
		System.out.println(yellow+bold+"Enter 0-Exit\n1-Buy Again\n2-WomensClothing"+reset);
	int d = Integer.parseInt(sc.nextLine());
	if(d==1)
	{
		EthnicWear();
		}
		else if(d==2)
		{
			WomensClothing.main(null);
		}
	}
	void western()
	{
		double Jumpsuits = 1500.0;
		double Tshirts = 300.0;
		double Tops = 500.0;
		double Shirts = 1500.0;
		double Shorttops = 800.0;
		double Sweatshirts = 1000.0;
		double JacketsandShrugs = 1400.0;
		System.out.println(skyblue+bold+"1.Jumpsuits-->$1500\n2.T-shirts-->$300\n3.Tops-->$500\n4.Shirts-->$1500\5.Short tops-->$800\6.Sweatshirts-->$1000\7.Jackets&Shrugs-->$1400"+reset);
		System.out.println("Select a number which Item you want to buy: ");
		int a = Integer.parseInt(sc.nextLine());
          	switch(a)
		{
			case 1:
				System.out.println("Enter the number ofJumpsuits you want: ");
				System.out.print("Enter the quantity: ");
				int b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				String s=sc.nextLine();
				bill = bill+(b*Jumpsuits);
				break;
			case 2:
                                System.out.println("Enter the number of T-shirts you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Tshirts);
				break;
                        case 3:
                                System.out.println("Enter the number of Tops you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Tops);
				break;
                        case 4:
                                System.out.println("Enter the number of Shirts you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Shirts);
				break;	
			case 5:
				System.out.println("Enter the number of Short tops you want: ");
				System.out.print("Enter the quantity: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Shorttops);
				break;
			case 6:
				System.out.println("Enter the number of Sweatshirts you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Sweatshirts);
				break;
			case 7:
				System.out.println("Enter the number ofJackets&Shrugs you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*JacketsandShrugs);
				break;
		default :
					System.out.println(red+bold+"Your select is invalid, please Re-Enter: "+reset);
					western();
		}
		System.out.println(yellow+bold+"Enter 0-Exit\n1-Buy Again\n2-Go to WomensClothing"+reset);
	int d = Integer.parseInt(sc.nextLine());
	if(d==1)
	{
		western();
		}
		else if(d==2)
		{
			WomensClothing.main(null);
		}
	}
	void Tops()
	{
		double colourBlockedKurti = 1500.0;
		double AsymmetricalKurti = 1600.0;
		double LaceKurti = 1000.0;
		double ALineKurti = 1500.0;
		double Anarkali = 800.0;
		double FloorLengthKurti = 1000.0;
		double CollarKurti = 500.0;
		double FlaredKurti = 800.0;
		double IkatKurti = 700.0;
		double ChikenkariKurti =2000.0;
		System.out.println(skyblue+bold+"1.colour Blocked Kurti-->$1500\n2.Asymmetrical Kurti-->$1600\n3.Lace Kurti-->$1000\n4. A Line Kurti-->$1500\n5.Anarkali-->$800\n6.Floor Length Kurti-->$1000\n7.Collar Kurti-->$500\n8.Flared Kurti-->$800\n9.Ikat Kurti-->$700\n10.Chikenkari Kurti-->$2000"+reset);
		System.out.println("Select a number which Item you want to buy: ");
		int a = Integer.parseInt(sc.nextLine());
          	switch(a)
		{
			case 1:
				System.out.println("Enter the number of colour Blocked Kurti you want: ");
				System.out.print("Enter the quantity: ");
				int b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				String s=sc.nextLine();
				bill = bill+(b*colourBlockedKurti);
				break;
			case 2:
                                System.out.println("Enter the number of Asymmetrical Kurti you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*AsymmetricalKurti);
				break;
                        case 3:
                                System.out.println("Enter the number of Lace Kurti you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*LaceKurti);
				break;
                        case 4:
                                System.out.println("Enter the number of A Line Kurti you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*ALineKurti);
				break;	
			case 5:
				System.out.println("Enter the number of Anarkali you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Anarkali);
				break;
			case 6:
				System.out.println("Enter the number of Floor Length Kurti you want: ");
				System.out.print("Enter the quantity: "); 				
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*FloorLengthKurti);
				break;
			case 7:
				System.out.println("Enter the number of Collar Kurti you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*CollarKurti);
				break;
			case 8:
				System.out.println("Enter the number of Flared Kurti you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*FlaredKurti);
				break;
			case 9:
				System.out.println("Enter the number of Ikat Kurti you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*IkatKurti);
				break;
			case 10:
				System.out.println("Enter the number of Chikenkari Kurti you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*ChikenkariKurti);
				break;
		default :
					System.out.println(red+bold+"Your select is invalid, please Re-Enter: "+reset);
					Tops();
		}
		System.out.println(yellow+bold+"Enter 0-Exit\n1-Buy Again\n2-Go to WomensClothing"+reset);
	int d = Integer.parseInt(sc.nextLine());
	if(d==1)
	{
		Tops();
		}
		else if(d==2)
		{
			WomensClothing.main(null);
		}
	}
	void Leggings()
	{
		double Anklelength = 350.0;
		double Fulllength = 300.0;
		double sevenbyeightlength = 500.0;
		double Midcalf = 1500.0;
		double Footed = 800.0;
		double Ripped = 1000.0;
		double Treggings = 1400.0;
		double Jeggings = 1000.0;
		System.out.println(skyblue+bold+"1.Anklelength-->$350\n2.Fulllength-->$300\n3.7/8length-->$500\n4.Midcalf-->$1500\n5.Footed-->$800\n6.Ripped-->$1000\n7.Treggings-->$1400\n8.Jeggings-->$1000"+reset);
		System.out.println("Select a number which Item you want to buy: ");
		int a = Integer.parseInt(sc.nextLine());
          	switch(a)
		{
			case 1:
				System.out.println("Enter the number of Anklelength you want: ");
				System.out.print("Enter the quantity: ");
				int b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				String s=sc.nextLine();
				bill = bill+(b*Anklelength);
				break;
			case 2:
                                System.out.println("Enter the number of Fulllength you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Fulllength);
				break;
                        case 3:
                                System.out.println("Enter the number of 7/8length you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*sevenbyeightlength);
				break;
                        case 4:
                                System.out.println("Enter the number of Midcalf you want: ");				
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Midcalf);
				break;	
			case 5:
				System.out.println("Enter the number of Footed you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Footed);
				break;
			case 6:
				System.out.println("Enter the number of Ripped you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Ripped);
				break;
			case 7:
				System.out.println("Enter the number of Treggings you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Treggings);
				break;
			case 8:
				System.out.println("Enter the number of Jeggings you want: ");	
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Jeggings);
				break;
		default :
					System.out.println(red+bold+"Your select is invalid, please Re-Enter: "+reset);
					Tops();
		}
		System.out.println(yellow+bold+"Enter 0-Exit\n1-Buy Again\n2-Go to WomensClothing"+reset);
	int d = Integer.parseInt(sc.nextLine());
	if(d==1)
	{
		Tops();
		}
		else if(d==2)
		{
			WomensClothing.main(null);
		}
	}
	void BeautyProducts()
	{ 
		double Foundation = 500.0;
		double Lipstick = 250.0;
		double EyeLiner = 150.0;
		double Mascara = 300.0;
		double EyebrowPencil = 100.0;
		double Kajal = 200.0;
		double Sunscreen = 300.0;
		double Moisturizer = 250.0;
		double FaceSerum = 500.0;
		double HairSerum = 500.0;
		double Hairconditioner = 280.0;
		double Compact = 500.0;
		double Concealear = 500.0;
		double Blush = 200.0;
		double Lipbalm = 150.0;
		double Lipgloss = 150.0;
		double Lipliner = 150.0;
		double Eyelashes = 400.0;
		double Bodylotion = 300.0;
		double Nailpolish = 80.0;
		double Nailremover = 50.0;
		double Primer = 600.0;
		System.out.println(skyblue+bold+"1.Foundation-->$500\n2.Lipstick-->$250\n3.EyeLiner-->$150\n4.Mascara-->$300\n5.EyebrowPencil-->$100\n6.Kajal-->$200\n7.Sunscreen-->$300\n8.Moisturizer-->$250\n9.Face Serum-->$500\n10.Hair Serum-->$300\n11.Hair conditioner-->$280\n12.Compact-->$500\n13.Concealear-->$500\n14.Blush-->$200\n15.Lipbalm-->$150\n16.Lipgloss-->$150\n17.Lipliner-->$150\n18.Eyelashes-->400rs\n19.Bodylotion-->$300\n20.Nailpolish-->$80\n21.Nailremover-->$50\n22.Primer-->$600"+reset);
		System.out.println("Select a number which Item you want to buy: ");
		int a = Integer.parseInt(sc.nextLine());
  		switch(a)
		{
			case 1:
				System.out.println("Enter the number of Foundation you want: ");
				System.out.print("Enter the quantity: ");
				int b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Foundation);
				break;
			case 2:
                                System.out.println("Enter the number of Lipstick you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Lipstick);
				break;
                        case 3:
                                System.out.println("Enter the number of EyeLiner you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*EyeLiner);
				break;
                        case 4:
                                System.out.println("Enter the number of Mascara you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Mascara);
				break;
                        case 5:
                                System.out.println("Enter the number of EyebrowPencil you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*EyebrowPencil);
				break;
                        case 6:
                                System.out.println("Enter the number of Kajal you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Kajal);
				break;
			case 7:
				System.out.println("Enter the number of Sunscreen you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Sunscreen);
				break;
			case 8:
                                System.out.println("Enter the number of Moisturizer you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Moisturizer);
				break;
                        case 9:
                                System.out.println("Enter the number of Face Serum you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*FaceSerum);
				break;
                        case 10:
                                System.out.println("Enter the number of Hair Serum you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*HairSerum);
				break;
                        case 11:
                                System.out.println("Enter the number of Hair conditioner you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Hairconditioner);
				break;
                        case 12:
                                System.out.println("Enter the number of Compact you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Compact);
				break;
			case 13:
                                System.out.println("Enter the number of Concealear you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Concealear);
				break;
			case 14:
				System.out.println("Enter the number of Blush you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Blush);
				break;
			case 15:
                                System.out.println("Enter the number of Lipbalm you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Lipbalm);
				break;
                        case 16:
                                System.out.println("Enter the number of Lipgloss you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Lipgloss);
				break;
                        case 17:
                                System.out.println("Enter the number of Lipliner you want: ");		
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Lipliner);
				break;
                        case 18:
                                System.out.println("Enter the number of Eyelashes you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Eyelashes);
				break;
                        case 19:
                                System.out.println("Enter the number of Bodylotion you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Bodylotion);
				break;
			 case 20:
                                System.out.println("Enter the number of Nailpolish you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Nailpolish);
				break;
                        case 21:
                                System.out.println("Enter the number of Nailremover you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Nailremover);
				break;
                        case 22:
                                System.out.println("Enter the number of Primer you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Primer);
				break;
		default :
					System.out.println(red+bold+"Your select is invalid, please Re-Enter: "+reset);
					BeautyProducts();
		}
		System.out.println(yellow+bold+"Enter 0-Exit\n1-Buy Again\n2-Go to WomensClothing"+reset);
	int d = Integer.parseInt(sc.nextLine());
	if(d==1)
	{
		BeautyProducts();
		}
		else if(d==2)
		{
			WomensClothing.main(null);
		}
	}
	void Jeans()
	{
		double LowRise = 1000.0;
		double MidRise= 800.0;
		double HighRise = 800.0;
		double UltraHighRise = 500.0;
		double SkinnyFit = 1000.0;
		double StraightFit = 1500.0;
		double BoyfriendFit = 1000.0;
		double Bootcut = 800.0;
		double Flare = 1500.0;
		double WideLeg = 1000.0;
		double MomJeans = 1500.0;
		System.out.println(skyblue+bold+"1.Low Rise-->$1000\n2.Mid Rise-->$800\n3.High Rise-->$800\n4.Ultra HighRise-->$500\n5.Skinny Fit-->$1000\n6.Straight Fit-->$1500\n7.Boyfriend Fit-->$1000\n8.Bootcut-->$800\n9.Flare-->$1500\n10.Wide Leg-->$1000\n11.Mom Jeans-->$1500.0"+reset);
		System.out.println("Select a number which Item you want to buy: ");
		int a = Integer.parseInt(sc.nextLine());
          	switch(a)
		{
			case 1:
				System.out.println("Enter the number of Low Rise you want: ");
				System.out.print("Enter the quantity: ");
				int b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				String s =sc.nextLine();
				bill = bill+(b*LowRise);
				break;
			case 2:
                                System.out.println("Enter the number of Mid Rise you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*MidRise);
				break;
                        case 3:
                                System.out.println("Enter the number of High Rise you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*HighRise);
				break;
                        case 4:
                                System.out.println("Enter the number of Ultra HighRise you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*UltraHighRise);
				break;	
			case 5:
				System.out.println("Enter the number of Skinny Fit you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*SkinnyFit);
				break;
			case 6:
				System.out.println("Enter the number of Straight Fit you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*StraightFit);
				break;
			case 7:
				System.out.println("Enter the number of Boyfriend Fit you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*BoyfriendFit);
				break;
			case 8:
				System.out.println("Enter the number of Bootcut you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Bootcut);
				break;
			case 9:
				System.out.println("Enter the number of Flare you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Flare);
				break;
 			case 10:
				System.out.println("Enter the number of Wide Leg you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*WideLeg);
				break;
			case 11:
				System.out.println("Enter the number of Mom Jeans you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*MomJeans);
				break;
		default :
					System.out.println(red+bold+"Your select is invalid, please Re-Enter: "+reset);
					Jeans();
		}
		System.out.println(yellow+bold+"Enter 0-Exit\n1-Buy Again\n2-Go to WomensClothing"+reset);
	int d = Integer.parseInt(sc.nextLine());
	if(d==1)
	{
		Jeans();
		}
		else if(d==2)
		{
			WomensClothing.main(null);
		}
	}
	void Handbags()
	{
		double Clutch = 800.0;
		double ToteBag= 1500.0;
		double BackPackBag = 1000.0;
		double Wallet = 1000.0;
		double DoctorBag = 1500.0;
		double CoinPurse = 250.0;
		double SlingBag = 1000.0;
		double MicroBag = 500.0;
		double CameraBag = 2000.0;
		double BeltBag = 500.0;
		double BarrelBag = 1500.0;
		double PhonePouch = 500.0;
		double BowlingBag = 1300.0;
		System.out.println(skyblue+bold+"1.Clutch-->$800\n2.Tote Bag-->$1500\n3.BackPack Bag-->$1000\n4.Wallet-->$1000\n5.Doctor Bag-->$1500\n6.Coin Purse-->$250\n7.Sling Bag-->$1000\n8.Micro Bag-->$500\n9.Camera Bag-->$2000\n10.Belt Bag-->$500\n11.Barrel Bag-->$1500.0\n12.Phone Pouch-->$500\n13.Bowling Bag-->$1300.0"+reset);
		System.out.println("Select a number which Item you want to buy: ");
		int a = Integer.parseInt(sc.nextLine());
          	switch(a)
		{
			case 1:
				System.out.println("Enter the number of Clutch you want: ");
				System.out.print("Enter the quantity: ");
				int b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Clutch);
				break;
			case 2:
                                System.out.println("Enter the number of Tote Bag you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*ToteBag);
				break;
                        case 3:
                                System.out.println("Enter the number of BackPack Bag you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*BackPackBag);
				break;
                        case 4:
                                System.out.println("Enter the number of Wallet you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Wallet);
				break;	
			case 5:
				System.out.println("Enter the number of Doctor Bag you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*DoctorBag);
				break;
			case 6:
				System.out.println("Enter the number of Coin Purse you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*CoinPurse);
				break;
			case 7:
				System.out.println("Enter the number of Sling Bag you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*SlingBag);
				break;
			case 8:
				System.out.println("Enter the number of Micro Bag you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*MicroBag);
				break;
			case 9:
				System.out.println("Enter the number of Camera Bag you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*CameraBag);
				break;
			case 10:
				System.out.println("Enter the number of Belt Bag you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*BeltBag);
				break;
			case 11:
				System.out.println("Enter the number of Barrel Bag you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*BarrelBag);
				break;
			case 12:
				System.out.println("Enter the number of Phone Pouch you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*PhonePouch);
				break;
			case 13:
				System.out.println("Enter the number of Bowling Bag you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*BowlingBag);
				break;
		default :
					System.out.println(red+bold+"Your select is invalid, please Re-Enter: "+reset);
					Handbags();
		}
		System.out.println(yellow+bold+"Enter 0-Exit\n1-Buy Again\n2-Go to WomensClothing"+reset);
	int d = Integer.parseInt(sc.nextLine());
	if(d==1)
	{
		Handbags();
		}
		else if(d==2)
		{
			WomensClothing.main(null);
		}
	}
	void Footwear()
	{
		double Slippers = 200.0;
		double Sandals= 500.0;
		double Loafers = 800.0;
		double BowSandals = 500.0;
		double Gumshoes = 1000.0;
		double Platforms = 2000.0;
		double Stiletto = 1500.0;
		double PeepToe = 1500.0;
		double Chunky = 2000.0;
		double Jelly = 500.0;
		double SnowBoots = 2000.0;
		double KneeBoots = 1500.0;
		double KittenHeel = 600.0;
		double FlipFlop = 150.0;
		double BallerinaFlats = 500.0;
		double Wedge = 1000.0;
		System.out.println(skyblue+bold+"1.Slippers-->$200\n2.Sandals-->$500\n3.Loafers-->$800\n4.Bow Sandals-->$500\n5.Gumshoes-->$1000\n6.Platforms-->$2000\n7.Stiletto-->$1500\n8.Peep Toe-->$1500\n9.Chunky-->$2000\n10.Jelly-->$500\n11.Snow Boots-->$2000\n12.Knee Boots-->$1500\n13.Kitten Heel-->$600.0\n14.Flip-Flop-->$150.0\n15.Ballerina Flats-->$500\n16.Wedge-->$1000"+reset);
		System.out.println("Select a number which Item you want to buy: ");
		int a = Integer.parseInt(sc.nextLine());
          	switch(a)
		{
			case 1:
				System.out.println("Enter the number of Slippers you want: ");
				System.out.print("Enter the quantity: ");
				int b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size as number: ");
            			int f = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Slippers);
				break;
			case 2:
                                System.out.println("Enter the number of Sandals you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size as number: ");
            			f = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Sandals);
				break;
                        case 3:
                                System.out.println("Enter the number of Loafers you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size as number: ");
            			f = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Loafers);                                                                                                                                                                                                                  
				break;
                        case 4:
                                System.out.println("Enter the number of Bow Sandals you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size as number: ");
            		        f = Integer.parseInt(sc.nextLine());
				bill = bill+(b*BowSandals);
				break;	
			case 5:
				System.out.println("Enter the number of Gumshoes you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size as number: ");
            			f = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Gumshoes);
				break;
			case 6:
				System.out.println("Enter the number of Platforms you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size as number: ");
            			f = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Platforms);
				break;
			case 7:
				System.out.println("Enter the number of Stiletto you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size as number: ");
            			f = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Stiletto);
				break;
			case 8:
				System.out.println("Enter the number of Peep Toe you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size as number: ");
            			f = Integer.parseInt(sc.nextLine());
				bill = bill+(b*PeepToe);
				break;
			case 9:
				System.out.println("Enter the number of Chunky you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size as number: ");
            			f = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Chunky);
				break;
			case 10:
				System.out.println("Enter the number of Jelly you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size as number: ");
            			f = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Jelly);
				break;
			case 11:
				System.out.println("Enter the number of Snow Boots you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size as number: ");
            			f = Integer.parseInt(sc.nextLine());
				bill = bill+(b*SnowBoots);
				break;
			case 12:
				System.out.println("Enter the number of Knee Boots you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size as number: ");
            			f = Integer.parseInt(sc.nextLine());
				bill = bill+(b*KneeBoots);
				break;
			case 13:
				System.out.println("Enter the number of Kitten Heel you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size as number: ");
            			f = Integer.parseInt(sc.nextLine());
				bill = bill+(b*KittenHeel);
				break;
			case 14:
				System.out.println("Enter the number of Flip-Flop you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size as number: ");
            			f = Integer.parseInt(sc.nextLine());
				bill = bill+(b*FlipFlop);
				break;
			case 15:
				System.out.println("Enter the number of Ballerina Flats you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size as number: ");
            			f = Integer.parseInt(sc.nextLine());
				bill = bill+(b*BallerinaFlats);
				break;
			case 16:
				System.out.println("Enter the number of Wedge you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size as number: ");
            			f = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Wedge);
				break;
		default :
					System.out.println(red+bold+"Your select is invalid, please Re-Enter: "+reset);
					Footwear();
		}
		System.out.println(yellow+bold+"Enter 0-Exit\n1-Buy Again\n2-Go to WomensClothing"+reset);
	int d = Integer.parseInt(sc.nextLine());
	if(d==1)
	{
		Footwear();
		}
		else if(d==2)
		{
			WomensClothing.main(null);
		}
	}
	void Nightsuits()
	{
		double PyjamaSets= 1000.0;
		double Nightdresses= 1500.0;
		double CamisoleandShortsSets = 800.0;
		double Babydolls = 1500.0;
		double LoungewearSets = 500.0;
		double Chemises = 800.0;
		double Rompers = 500.0;
		double Sleepshirts = 1500.0;
		double Kaftans = 800.0;
		double RobeandNightieSets = 500.0;
		System.out.println(skyblue+bold+"1.Pyjama Sets-->$1000\n2.Nightdresses-->$1500\n3.Camisole and Shorts Sets-->$800\n4.Babydolls-->$1500\n5.Loungewear Sets-->$500\n6.Chemises-->$800\n7.Rompers-->$500\n8.Sleepshirts-->$1500\n9.Kaftans-->$800\n10.Robe and Nightie Sets-->$500"+reset);
		System.out.println("Select a number which Item you want to buy: ");
		int a = Integer.parseInt(sc.nextLine());
          	switch(a)
		{
			case 1:
				System.out.println("Enter the number of Pyjama Sets you want: ");
				System.out.print("Enter the quantity: ");
				int b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				String s =sc.nextLine();
				bill = bill+(b*PyjamaSets);
				break;
			case 2:
                                System.out.println("Enter the number of Nightdresses you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Nightdresses);
				break;
                        case 3:
                                System.out.println("Enter the number of Camisole and Shorts Sets you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*CamisoleandShortsSets);                                                                                                                                                                                                                  
				break;
                        case 4:
                                System.out.println("Enter the number of Babydolls you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Babydolls);
				break;	
			case 5:
				System.out.println("Enter the number of Loungewear Sets you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*LoungewearSets);
				break;
			case 6:
				System.out.println("Enter the number of Chemises you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Chemises);
				break;
			case 7:
				System.out.println("Enter the number of Rompers you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Rompers);
				break;
			case 8:
				System.out.println("Enter the number of Sleepshirts you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Sleepshirts);
				break;
			case 9:
				System.out.println("Enter the number of Kaftans you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Kaftans);
				break;
			case 10:
				System.out.println("Enter the number of Robe and Nightie Sets you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*RobeandNightieSets);
				break;
		default :
					System.out.println(red+bold+"Your select is invalid, please Re-Enter: "+reset);
					Nightsuits();
		}
		System.out.println(yellow+bold+"Enter 0-Exit\n1-Buy Again\n2-Go to WomensClothing"+reset);
	int d = Integer.parseInt(sc.nextLine());
	if(d==1)
	{
		Nightsuits();
		}
		else if(d==2)
		{
			WomensClothing.main(null);
		}
	}
	void Lingerie()
	{
		double Bras= 500.0;
		double Panties = 150.0;
		double Bralettes = 500.0;
		double Shapewear = 800.0;
		double Gstrings= 300.0;
		double Teddies = 400.0;
		double Thongs = 500.0;
		double Corsets = 500.0;
		double Bodysuits = 800.0;
		System.out.println(skyblue+bold+"1.Bras-->$1000\n2.Panties-->$1500\n3.Bralettes-->$500\n4.Shapewear-->$800\n5.G-strings-->$300\n6.Teddies-->$500\n7.Thongs-->$500\n8.Corsets-->$500\n9.Bodysuits-->$800"+reset);
		System.out.println("Select a number which Item you want to buy: ");
		int a = Integer.parseInt(sc.nextLine());
          	switch(a)
		{
			case 1:
				System.out.println("Enter the number of Bras you want: ");
				System.out.print("Enter the quantity: ");
				int b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				String s =sc.nextLine();
				bill = bill+(b*Bras);
				break;
			case 2:
                                System.out.println("Enter the number of Panties you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Panties);
				break;
                        case 3:
                                System.out.println("Enter the number of Bralettes you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Bralettes);                                                                                                                                                                                                                  
				break;
                        case 4:
                                System.out.println("Enter the number of Shapewear you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Shapewear);
				break;	
			case 5:
				System.out.println("Enter the number of G-strings you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Gstrings);
				break;
			case 6:
				System.out.println("Enter the number of Teddies you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Teddies);
				break;
			case 7:
				System.out.println("Enter the number of Thongs you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Thongs);
				break;
			case 8:
				System.out.println("Enter the number of Corsets you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Corsets);
				break;
			case 9:
				System.out.println("Enter the number of Bodysuits you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size: ");
				s =sc.nextLine();
				bill = bill+(b*Bodysuits);
				break;
		default :
					System.out.println(red+bold+"Your select is invalid, please Re-Enter: "+reset);
					Lingerie();
		}
		System.out.println(yellow+bold+"Enter 0-Exit\n1-Buy Again\n2-Go to WomensClothing"+reset);
	int d = Integer.parseInt(sc.nextLine());
	if(d==1)
	{
		Lingerie();
		}
		else if(d==2)
		{
			WomensClothing.main(null);
		}
	}
	void Accessories()
	{
		double Necklaces = 500.0;
		double Bangles = 150.0;
		double Bracelets = 50.0;
		double Chains = 100.0;
		double Watches = 2000.0;
		double Earings = 200.0;
		double Hairbands = 15.0;
		double HairClips = 15.0;
		double Hats = 250.0;
		double Belts = 500.0;
		double Sunglasses = 500.0;
		double Gloves = 100.0;
		double Rings = 50.0;
		double NoseRings = 20.0;
		System.out.println(skyblue+bold+"1.Necklaces-->$500\n2.Bangles-->$150\n3.Bracelets-->$50\n4.Chains-->$100\n5.Watches-->2000rs\n6.Earings-->200rs\n7.Hairbands-->$15\n8.Hair Clips-->$15\n9.Hats-->$250\n10.Belts-->$500\n11.Sunglasses-->500rs\n12.Gloves-->$100\n13.Rings-->$100\n14. Nose Rings-->$20"+reset);
		System.out.println("Select a number which Item you want to buy: ");
		int a = Integer.parseInt(sc.nextLine());
		switch(a)
		{
			case 1:
				System.out.println("Enter the number of Necklaces you want: ");
				System.out.print("Enter the quantity: ");
				int b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Necklaces);
				break;
			case 2:
                                System.out.println("Enter the number of Bangles you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter the size as number: ");
            			int f = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Bangles);
				break;
                        case 3:
                                System.out.println("Enter the number of Bracelets you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Bracelets);
				break;
                        case 4:
                                System.out.println("Enter the number of Chains you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Chains);
				break;
                        case 5:
                                System.out.println("Enter the number of Watches you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Watches);
				break;
                        case 6:
                                System.out.println("Enter the number of Earings you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Earings);
				break;
			case 7:
				System.out.println("Enter the number of Hairbands you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Hairbands);
				break;
			case 8:
                                System.out.println("Enter the number of Hair Clips you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*HairClips);
				break;
                        case 9:
                                System.out.println("Enter the number of Hats you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Hats);
				break;
                        case 10:
                                System.out.println("Enter the number of Belts you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Belts);
				break;
                        case 11:
                                System.out.println("Enter the number of Sunglasses you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Sunglasses);
				break;
                        case 12:
                                System.out.println("Enter the number of Gloves you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Gloves);
				break;
			case 13:
				System.out.println("Enter the number of Rings you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b*Rings);
				break;
			case 14:
                                System.out.println("Enter the number of  Nose Rings you want: ");
				System.out.print("Enter the quantity: ");
				b = Integer.parseInt(sc.nextLine());
				bill = bill+(b* NoseRings);
				break;
		default :
					System.out.println(red+bold+"Your select is invalid, please Re-Enter: "+reset);
					Accessories();
		}
	int d = Integer.parseInt(sc.nextLine());
	if(d==1)
	{
		Accessories();
		}
		else if(d==2)
		{
			WomensClothing.main(null);
		}
	}
		
		public static void main(String[]args)
	 	{
		System.out.println(purple+bold+":::       :::  ::::::::  ::::    ::::  :::::::::: ::::    :::  ::::::::");  
                	    System.out.println(":+:       :+: :+:    :+: +:+:+: :+:+:+ :+:        :+:+:   :+: :+:    :+:"); 
                            System.out.println("+:+       +:+ +:+    +:+ +:+ +:+:+ +:+ +:+        :+:+:+  +:+ +:+");
                            System.out.println("+#+  +:+  +#+ +#+    +:+ +#+  +:+  +#+ +#++:++#   +#+ +:+ +#+ +#++:++#++"); 
                            System.out.println("+#+ +#+#+ +#+ +#+    +#+ +#+       +#+ +#+        +#+  +#+#+#        +#+"); 
                            System.out.println(" #+#+# #+#+#  #+#    #+# #+#       #+# #+#        #+#   #+#+# #+#    #+#");
                            System.out.println("  ###   ###    ########  ###       ### ########## ###    ####  ########"+reset); 
									        
		System.out.println(yellow+bold+"<<<<<<-------------*****Available Products are*****------------->>>>>>"+reset);
		System.err.println(green+bold+"1.Womens Sarees\n2.Womens Dresses\n3.Womens Ethnic Wear\n4.Womens western\n5.Womens Tops\n6.Womens Leggings\n7.Womens Beauty Products\n8.Womens Jeans\n9.Womens Handbags/wallets\n10.Womens Footwear\n11.Womens Night Suits\n12.Womens Lingerie\n13.Womens Accessories"+reset);
		
		System.out.println("Select a number which Item you want to buy: ");
		int a = Integer.parseInt(sc.nextLine());
		switch(a)
		{
			case 1:
				W.Sarees();
				break;
			case 2:
				W.Dresses();
				break;
			case 3:
				W.EthnicWear();
				break;
			case 4:
				W.western();
				break;
			case 5:
				W.Tops();
				break;
			case 6:
				W.Leggings();
				break;
			case 7:
				W.BeautyProducts();
				break;
			case 8:
				W.Jeans();
				break;
			case 9:
			    	W.Handbags();
				break;
			case 10:
				W.Footwear();
				break;
			case 11:
			    	W.Nightsuits();
				break;
			case 12:
			    	W.Lingerie();
				break;
			case 13:
				W.Accessories();
			    	break;
			default:
				System.out.println(red+bold+"Your selection is invalid, Please select valid option"+reset);
				main(null);
				break;

		}
		System.out.println(purple+bold+"Press \n 1- Buy More In This Section \n2-Exit And Billing \n 3. Main Page"+reset);
		while(true)
		{
		System.out.println("Enter Your Choice : ");
		int n = Integer.parseInt(sc.nextLine());
		if(n == 1)
		{
			main(null);
			break;
		}
		else if(n==2)
		{
		    amount.total_billing();break;
		    
		}
		else if(n==3)
		{
		    os.main(null);break;
		}
		else
			System.out.println("Invalid Choice Try Again");
		
		}			
	}
}
class Main extends unicodes
{
    static Scanner obj=new Scanner(System.in);
    static double bill=0.0d;
    //float b=Float.parseFloat(s.nextLine())₹;
    static Main x=new Main();
    void furniture()
    {
        double sofa=70000;
        double chair=1000;
        double tables=10000;
        double beds=10000;
        double ward= 1000;
        double desk=1000;
        System.out.println(purple+bold+"1.Sofas= 70000  \n2.Chairs = 1000  \n3.Tables = 10000  \n4.Beds = 10000  \n5.Wardrobes = 1000 \n6.Desks= 1000"+reset);
        System.out.print(bold+"Enter a Number Which Item You Want to Buy:"+reset);
        int b=Integer.parseInt(obj.nextLine());
        switch (b)
        {
        case 1:
            System.out.print(yellow+bold+"How many items do you want to buy:"+reset);
            int a=Integer.parseInt(obj.nextLine());
            this.bill=this.bill+(sofa*a);
            break;
        case 2:
            System.out.print(skyblue+bold+"How many items do you want to buy:"+reset);
             a=Integer.parseInt(obj.nextLine());
            this.bill=this.bill+(chair*a);
            break;
        case 3:
            System.out.print(red+bold+"How many items do you want to buy:"+reset);
             a=Integer.parseInt(obj.nextLine());
            this.bill=this.bill+(tables*a);
            break;
        case 4:
            System.out.print(blue+bold+"How many items do you want to buy:"+reset);
             a=Integer.parseInt(obj.nextLine());
            this.bill=this.bill+(beds*a);
            break;
        case 5:
            System.out.print(purple+bold+"How many items do you want to buy:"+reset);
             a=Integer.parseInt(obj.nextLine());
            this.bill=this.bill+(ward*a);
            break;
        case 6:
            System.out.print(green+bold+"How many items do you want to buy:"+reset);
             a=Integer.parseInt(obj.nextLine());
            this.bill=this.bill+(desk*a);
            break;
        default :
        System.out.println(yellow+bold+"You Entered Wrong Value, Please Re-Enter:"+reset);
           furniture();
           
        
        }
        System.out.println(blue+bold+"If You want want to buy anything in Furniture:\n0.Exit 1.Re-Buy"+reset);
        int c=Integer.parseInt(obj.nextLine());
        if(c==1)
        {
            furniture();
        }
        else if(c==2)
            Main.main(null);
    }
    void homedecor()
    {
        double wall=3000;
        double mirrors=1000;
        double rugs =500;
        double curtains=1000;
        double pillow=500;
        double decorative=2000;
        System.out.println(skyblue+bold+"1.Wall art (paintings, posters) \n2.Mirrors\n3.Rugs\n4.Curtains/blinds \n5.Cushions/pillows\n6.Decorative vases"+reset);
        System.out.println(bold+"Enter Number Which Item You want to Buy:"+reset);
        int c=Integer.parseInt(obj.nextLine());
        switch(c)
        {
            case 1:
                System.out.println(yellow+bold+"Enter Quantinty:"+reset);
                int b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+wall*b;
                break;
                case 2:
                System.out.println(green+bold+"Enter Quantinty:"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+mirrors*b;
                break;
                case 3:
                System.out.println(red+bold+"Enter Quantinty:"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+rugs*b;
                break;
                case 4:
                System.out.println(purple+bold+"Enter Quantinty:"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+curtains*b;
                break;
                case 5:
                System.out.println(blue+bold+"Enter Quantinty:"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+pillow*b;
                break;
                case 6:
                System.out.println(bold+"Enter Quantinty:"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+decorative*b;
                break;
                default:
                System.out.println(red+bold+"Please Enter Current Number:"+reset);
                homedecor();
        }
        System.out.println(skyblue+bold+"Enter 1-Re Buy \n2.Exit \n"+reset);
        int b=Integer.parseInt(obj.nextLine());
        if(b==1)
        {
            homedecor();
        }
    }
    void kitchenware()
    {
        double cookware=1000; 
        double dinnerware =1000;
        double glassware=1000;
        double kitchenappliances=40000;
        double utensils=1000;
        System.out.println(yellow+bold+"1.Cookware sets (pots, pans)-1000\n2.Dinnerware (plates, bowls, cutlery)-1000 \n3.Glassware (cups, glasses)-1000\n4.Kitchen appliances (microwave, toaster, blender)-40000\n5.Utensils (spatulas, ladles)-1000"+reset);
        System.out.println(bold+"Enter Number Which Item You want to Buy:"+reset);
        int c=Integer.parseInt(obj.nextLine());
        switch(c)
        {
            case 1:
                System.out.println(green+bold+"Enter Quantinty:"+reset);
                int b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+cookware*b;
                break;
                case 2:
                System.out.println(blue+bold+"Enter Quantinty:"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+dinnerware*b;
                break;
                case 3:
                System.out.println(red+bold+"Enter Quantinty:"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+glassware*b;
                break;
                case 4:
                System.out.println(skyblue+bold+"Enter Quantinty:"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+kitchenappliances*b;
                break;
                case 5:
                System.out.println(bold+"Enter Quantinty:"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+utensils*b;
                break;
                default:
                System.out.println(green+bold+"Please Enter Current Number:"+reset);
                kitchenware();
        }
        System.out.println(red+bold+"Enter 1-Re Buy \n2.Exit "+reset);
        int b=Integer.parseInt(obj.nextLine());
        if(b==1)
        {
            kitchenware();
        }
        
    }
        
    
    void homeappliance()
    {
        double refrigerator=35000;
        double washing_machine=15000;
        double dish_washer=25000;
        double vacuum_cleaner=13000;
        double air_conditioner=34000;
        double ceiling_fans=3000;
        System.out.println(red+bold+"1.Refrigerator-35000 \n2.Washing machine-15000\n3.Dishwasher-25000 \n4.Vacuum cleaner-13000\n5.Air conditioner-34000 \n6.Ceiling fans-3000"+reset);
        System.out.println(bold+"Enter Number Which Item You want to Buy:"+reset);
        int c=Integer.parseInt(obj.nextLine());
        switch(c)
        {
            case 1:
                System.out.println(yellow+bold+"Enter Quantinty:"+reset);
                int b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+refrigerator*b;
                break;
                case 2:
                System.out.println(green+bold+"Enter Quantinty:"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+washing_machine*b;
                break;
                case 3:
                System.out.println(purple+bold+"Enter Quantinty:"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+dish_washer*b;
                break;
                case 4:
                System.out.println(blue+bold+"Enter Quantinty:"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+vacuum_cleaner*b;
                break;
                case 5:
                System.out.println(skyblue+bold+"Enter Quantinty:"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+air_conditioner*b;
                break;
                case 6:
                System.out.println(red+bold+"Enter Quantinty:"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+ceiling_fans*b;
                break;
                default:
                System.out.println(skyblue+bold+"Please Enter Current Number:"+reset);
                homeappliance();
        }
        System.out.println(green+bold+"Enter 1-Re Buy \n Exit \n"+reset);
        int b=Integer.parseInt(obj.nextLine());
        if(b==1)
        {
            homeappliance();
        }
    }
    void homeimprovementtools()
    {
        double power_drills=3500;
        double screwdriver=3500;
        double hammer=250;
        double measuring=230;
        double toolboxes=3400;
        double ladders=4000;
        System.out.println(yellow+bold+"1.Power drills - 3500\n2.Screwdriver sets - 3500\n3.Hammers -250 \n4.Measuring tape - 230  \n5.Toolboxes - 3400 \n6.Ladders - 4000"+reset);
        System.out.println(bold+"Enter Number Which Item You want to Buy:"+reset);
        int c=Integer.parseInt(obj.nextLine());
        switch(c)
        {
            case 1:
                System.out.println(red+bold+"Enter Quantinty:"+reset);
                int b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+power_drills*b;
                break;
                case 2:
                System.out.println(skyblue+bold+"Enter Quantinty:"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+screwdriver*b;
                break;
                case 3:
                System.out.println(purple+bold+"Enter Quantinty:"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+hammer*b;
                break;
                case 4:
                System.out.println(green+bold+"Enter Quantinty:"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+measuring*b;
                break;
                case 5:
                System.out.println(yellow+bold+"Enter Quantinty:"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+toolboxes*b;
                break;
                case 6:
                System.out.println(blue+bold+"Enter Quantinty:"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+ladders*b;
                break;
                default:
                System.out.println(green+bold+"Please Enter Current Number:"+reset);
                homeimprovementtools();
        }
        System.out.println(yellow+"Enter 1-Re Buy \n 2.Exit \n"+reset);
        int b=Integer.parseInt(obj.nextLine());
        if(b==1)
        {
            homeimprovementtools();
        }
    }
    void bathroomessentials()
    {
        
        double towel=350;
        double shower_certains=1500;
        double bath_mats=250;
        double toilet_brush=550;
        double soap=340;
        double bathroom=4000;
        System.out.println(skyblue+bold+"1.Towels - 350\n2.Shower curtains -1500 \n3.Bath mats - 250 \n4.Toilet brush and holder -double toilet_brush - 550 \n5.Soap dispensers - 340 \n6.Bathroom organizers/storage - 4000"+reset);
        System.out.println(bold+"Enter Number Which Item You want to Buy:"+reset);
        int c=Integer.parseInt(obj.nextLine());
        switch(c)
        {
            case 1:
                System.out.println(yellow+bold+"Enter Quantinty:"+reset);
                int b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+towel*b;
                break;
                case 2:
                System.out.println(green+bold+"Enter Quantinty:"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+shower_certains*b;
                break;
                case 3:
                System.out.println(red+bold+"Enter Quantinty:"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+bath_mats*b;
                break;
                case 4:
                System.out.println(blue+bold+"Enter Quantinty:"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+toilet_brush*b;
                break;
                case 5:
                System.out.println(purple+bold+"Enter Quantinty:"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+soap*b;
                break;
                case 6:
                System.out.println(skyblue+bold+"Enter Quantinty:"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+bathroom*b;
                break;
                default:
                System.out.println(blue+bold+"Please Enter Current Number:"+reset);
               bathroomessentials();
        }
        System.out.println(green+bold+"Enter 1-Re Buy \n2.Exit \n"+reset);
        int b=Integer.parseInt(obj.nextLine());
        if(b==1)
        {
            bathroomessentials();
        }

    }
    void cleaningsupplies()
    {
        
        double disinfectant=350;
        double broom=150;
        double mops=400;
        double trash=230;
        System.out.println(green+bold+"1.Disinfectant wipes - 350 \n2.Brooms and dustpans -150 \n3.Mops and buckets - 400 \n4.Trash bags - "+reset);
        System.out.println(bold+"Enter Number Which Item You want to Buy:"+reset);
        int c=Integer.parseInt(obj.nextLine());
        switch(c)
        {
            case 1:
                System.out.println(purple+bold+"Enter Quantinty:"+reset);
                int b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+disinfectant*b;
                break;
                case 2:
                System.out.println(skyblue+bold+"Enter Quantinty:"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+broom*b;
                break;
                case 3:
                System.out.println(red+bold+"Enter Quantinty:"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+mops*b;
                break;
                case 4:
                System.out.println(blue+bold+"Enter Quantinty:"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+trash*b;
                break;
                default:
                System.out.println(yellow+bold+"Please Enter Current Number:"+reset);
               cleaningsupplies();
        }
        System.out.println(blue+bold+"Enter 1-Re Buy \n 2.Exit \n "+reset);
        int b=Integer.parseInt(obj.nextLine());
        if(b==1)
        {
            cleaningsupplies();
        }
    }
    void homesecurity()
    {
       
        double doorlocks=350;
        double security_cameras=4500;
        double sensor=40000;
        double smoke=23000;
        System.out.println(green+bold+"1.Door locks -350 \n2.Security cameras \n3.Motion sensor lights \n4.Smoke detectors"+reset);
        System.out.println(bold+"Enter Number Which Item You want to Buy:"+reset);
        int c=Integer.parseInt(obj.nextLine());
        switch(c)
        {
            case 1:
                System.out.println(red+bold+"Enter Quantinty:"+reset);
                int b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+doorlocks*b;
                break;
                case 2:
                System.out.println(yellow+bold+"Enter Quantinty:"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+security_cameras*b;
                break;
                case 3:
                System.out.println(skyblue+bold+"Enter Quantinty:"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+sensor*b;
                break;
                case 4:
                System.out.println(blue+bold+"Enter Quantinty:"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+smoke*b;
                break;
                default:
                System.out.println(purple+bold+"Please Enter Current Number:"+reset);
               homesecurity();
        }
        System.out.println(yellow+bold+"Enter 1-Re Buy \n2.Exit \n"+reset);
        int b=Integer.parseInt(obj.nextLine());
        if(b==1)
        {
            homesecurity();
        }
        
    }
    void homeentertainment()
    {
        
        double tv=35000;
        double speakers=15000;
        double gaming=40000;
        double streaming=23000;
        double dvd=10000;
        double home_theatre=5000;
        System.out.println(skyblue+bold+"1.Television \n2.Speakers \n3.Gaming consoles \n4.Streaming devices \n5.DVD/Blue-ray players \n6.Home theatre systems"+reset);
        System.out.println(bold+"Enter Number Which Item You want to Buy:"+reset);
        int c=Integer.parseInt(obj.nextLine());
        switch(c)
        {
            case 1:
                System.out.println(red+bold+"Enter Quantinty:"+reset);
                int b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+tv*b;
                break;
                case 2:
                System.out.println(yellow+bold+"Enter Quantinty:"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+speakers*b;
                break;
                case 3:
                System.out.println(green+bold+"Enter Quantinty:"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+gaming*b;
                break;
                case 4:
                System.out.println(blue+bold+"Enter Quantinty:"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+streaming*b;
                break;
                case 5:
                System.out.println(purple+bold+"Enter Quantinty:"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+dvd*b;
                break;
                case 6:
                System.out.println(skyblue+bold+"Enter Quantinty:"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+home_theatre*b;
                break;
                default:
                System.out.println(red+bold+"Please Enter Current Number:"+reset);
               homeentertainment();
        }
        System.out.println(blue+bold+"Enter 1-Re Buy \n2.Exit \n"+reset);
        int b=Integer.parseInt(obj.nextLine());
        if(b==1)
        {
            homeentertainment();
        }
	}
	
        
    public static void main (String[] args) 
    {

	System.out.println();
System.out.println(yellow+"##   ##   #####   ##   ##  #######                ##  ######   ######   ##         ####        ##  ##   ##   #####   #######   #####   ");
System.out.println(green+"##   ##  #######  ### ###  #######               ###  #######  #######  ##         ####       ###  ##   ##  #######  #######  #######  ");
System.out.println(blue+"      #        #        #                          #        #        #                          #        #                             ");
System.out.println(red+"#######  ##   ##  ## # ##  ####                 ####  ######   ######   ##          ##       ####  ## # ##  ##       ####     ######   ");
System.out.println(blue+"##   ##  ##   ##  ##   ##  ##                  #####  ##       ##       ##          ##      #####  ##  ###  ##       ##            ##  ");
System.out.println(green+"##   ##  #######  ##   ##  #######            ##  ##  ##       ##       #######    ####    ##  ##  ##   ##  #######  #######  #######  "+reset);
System.out.println(yellow+"##   ##   #####   ##   ##  #######           ##   ##  ##       ##       #######    ####   ##   ##  ##   ##   #####   #######   #####   "+reset);
                                                                                                                                      
        System.out.println("\n");
        System.out.println(red+bold+"1.Furniture \n2.Home Decor \n3.Kitchen Ware \n4.Home Appliance \n5.Home ImproveMent Tools");
        System.out.println("6.Bath room Essentials \n7.Cleaning Supplies \n8.Home Security \n9.Home Entertainment \n10.Exit"+reset);
        System.out.print(green+bold+"Enter a Number Which Item You Want to Buy:"+reset);
        int b=Integer.parseInt(obj.nextLine());
        switch(b)
        {
            case 1:
                x.furniture();
                break;
            case 2:
                x.homedecor();
                break;
            case 3:
                x.kitchenware();
                break;
            case 4:
                x.homeappliance();
                break;
            case 5:
                x.homeimprovementtools();
                break;
            case 6:
                x.bathroomessentials();
                break;
            case 7:
                x.cleaningsupplies();
                break;
            case 8:
                x.homesecurity();
                break;
            case 9:
                x.homeentertainment();
             case 10:
                 break;
            default:
            
            System.out.println(skyblue+bold+"You Entered Wrong Value, Please Re-Enter:"+reset);
            main(null);
        }
        while(true)
        {
        System.out.println("Enter 1.Exit And Billing \n 2.Main Page \n 3.Home Appliances");
        int a=obj.nextInt();
        if(a==1)
        {
            amount.total_billing();
            break;
        }
        else if(a==2)
        {
            os.main(null);
            break;
        }
	else if(a==3)
	{
		Main.main(null);
		break;
	}
	else
	{
		System.out.println("Invalid Choice, Try Again");
	}
        
        }
	
    }
}
class GirlsClothing extends unicodes
{
	static Scanner sc = new Scanner(System.in);
	static GirlsClothing G = new GirlsClothing();
	static double bill;
	static double Tshirts = 400;
	static double NightWear = 500.0;
	static double EthnicWear = 3000.0;
	static double CasualWear = 500.0;
	static double Tops = 500.0;
	static double Leggings = 500.0;
	static double Jeggings = 600.0;
	static double Jeans = 800.0;
	static double InnerWear = 400.0;
	static double FootWear = 1000.0;
	static double Accessories = 500.0;
	static double FashionJewellery = 700.0;

	static double billing(double bill)
	{
		return bill;
	}
	void TShirts()
	{
	    double LongSleeves = 400.0;
	    double HalfSleeves = 250.0;
	    double Vneck = 300.0;
	    double ScoopNeck = 250.0;
	    double TurtleNeck = 350.0;
	    double Ringer = 400.0;
	    double CrewNeck = 350.0;
	    double Polo = 450.0;
	    System.out.println(yellow+bold+"1  Long Sleeves T-Shirt ----> Rs.400\n2  Half Sleeves T-Shirt ----> Rs.250\n3  Vneck T-Shirt ----> Rs.300\n4  Scoop Neck T-Shirt ----> Rs.250\n5  Turtle Neck T-Shirt ----> Rs.350\n6  Ringer T-Shirt ----> Rs.400\n7  Crew Neck T-Shirt ----> Rs.350\n8  Polo T-Shirt ----> Rs.450"+reset);
	    System.out.println("Enter the number which you want to buy: ");
	    int d = Integer.parseInt(sc.nextLine());
	    switch(d)
        {
        	case 1:
        	        System.out.println("You have selected Long Sleeves T-Shirt");
            		System.out.print("Enter the quantity: ");
            		int a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		String s = sc.nextLine();
            		this.bill = this.bill+(LongSleeves*a);
            		break;
            case 2:
        	        System.out.println("You have selected Half Sleeves T-Shirt");
            		System.out.print("Enter the quantity: ");
             		a=Integer.parseInt(sc.nextLine());
             		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(HalfSleeves*a);
            		break;
            case 3:
        	        System.out.println("You have selected Vneck T-Shirt");
            		System.out.print("Enter the quantity: ");
             		a=Integer.parseInt(sc.nextLine());
             		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(Vneck*a);
            		break;
            case 4:
        	        System.out.println("You have selected Scoop Neck T-Shirt");
            		System.out.print("Enter the quantity: ");
             		a=Integer.parseInt(sc.nextLine());
             		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(ScoopNeck*a);
            		break;
            case 5:
        	        System.out.println("You have selected Turtle Neck T-Shirt");
            		System.out.print("Enter the quantity: ");
             		a=Integer.parseInt(sc.nextLine());
             		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(TurtleNeck*a);
            		break;
            case 6:
        	        System.out.println("You have selected Ringer T-Shirt");
            		System.out.print("Enter the quantity: ");
             		a=Integer.parseInt(sc.nextLine());
             		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(Ringer*a);
            		break;
            case 7:
        	        System.out.println("You have selected Crew Neck T-Shirt");
            		System.out.print("Enter the quantity: ");
             		a=Integer.parseInt(sc.nextLine());
             		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(CrewNeck*a);
            		break;
            case 8:
        	        System.out.println("You have selected Polo T-Shirt");
            		System.out.print("Enter the quantity: ");
             		a=Integer.parseInt(sc.nextLine());
             		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(Polo*a);
            		break;
            default :
        		    System.out.println("Your selection is invalid, Please Re-Enter: ");
           			TShirts();
		}
		System.out.println(red+bold+"Enter 0.Exit\n1-Buy Again\n"+reset);
        int b = Integer.parseInt(sc.nextLine());
        if(b == 1)
        {
		    TShirts();
		}
	}
	
	void NightWear()
	{
	    double casualNightPants = 250.0;
	    double casualtShirts = 250.0;
	    double Palazzos = 250.0;
	    double Shorts = 250.0;
	    double Boxers = 250.0;
	    double NightDressSets = 800.0;
	    double Skirts = 500.0;
	    System.out.println(blue+bold+"1  Casual Night Pants ----> Rs.250\n2  casual T-Shirts ----> Rs.250\n3  Palazzos ----> Rs.250\n4  Shorts ----> Rs.250\n5  Boxers ----> Rs.250\n6  Night Dress Sets ----> Rs.800\n7  Skirts ----> Rs.500"+reset);
	    System.out.println("Enter the number which you want to buy: ");
	    int d = Integer.parseInt(sc.nextLine());
	    switch(d)
        {
            case 1:
        	        System.out.println("You have selected Casual Night Pants");
            		System.out.print("Enter the quantity: ");
            		int a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		String s = sc.nextLine();
            		this.bill = this.bill+(casualNightPants*a);
            		break;
            case 2:
        	        System.out.println("You have selected Casual T- Shirts");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(casualtShirts*a);
            		break;
            case 3:
        	        System.out.println("You have selected Palazzos");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(Palazzos*a);
            		break;
            case 4:
        	        System.out.println("You have selected Shorts");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(Shorts*a);
            		break;
            case 5:
        	        System.out.println("You have selected Boxers");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(Boxers*a);
            		break;
            case 6:
        	        System.out.println("You have selected Night Dress Sets");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(NightDressSets*a);
            		break;
            case 7:
        	        System.out.println("You have selected Skirts");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(Skirts*a);
            		break;
            default :
        		    System.out.println("Your selection is invalid, Please Re-Enter: ");
           			NightWear();
		}
		System.out.println(red+bold+"Enter 0-Exit\n1-Buy Again\n"+reset);
        int b = Integer.parseInt(sc.nextLine());
        if(b == 1)
        {
		    NightWear();
		}
	}
	
	void EthnicWear()
	{
		double Sarees = 2000.0;
		double Lehengas = 2500.0;
		double HalfSarees = 3000.0;
		double CropTops = 1500.0;
		double LongFrocks = 2000.0;
		double Kurtas = 1000.0;
		double Shararas = 1500.0;
		double SalwarKameez = 2000.0;
		double PalazzoSets = 1000.0;
		System.out.println(skyblue+bold+"1  Sarees ----> Rs.2000\n2  Lehengas ----> Rs.2500\n3  Half Sarees ----> Rs.3000\n4  CropTops ----> Rs.1500\n5  Long Frocks ----> Rs.2000\n6  Kurtas ----> Rs.1000\n7  Shararas ----> Rs.1500\n8  Salwar Kameez sets ----> Rs.2000\n9  Plazo Sets ----> Rs.1000"+reset);
		System.out.print("Enter the number which you want to buy: ");
        int d = Integer.parseInt(sc.nextLine());
        switch(d)
        {
        	case 1:
        	        System.out.println("You have selected Sarees");
            		System.out.print("Enter the quantity: ");
            		int a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(Sarees*a);
            		break;
        	case 2:
        	        System.out.println("You have selected Lehengas");
            		System.out.print("Enter the quantity: ");
             		a=Integer.parseInt(sc.nextLine());
             		System.out.print("Enter the size: ");
            		String s = sc.nextLine();
            		this.bill = this.bill+(Lehengas*a);
            		break;
			case 3:
			        System.out.println("You have selected Half Sarees");
            	    System.out.print("Enter the quantity: ");
             		a=Integer.parseInt(sc.nextLine());
                  	this.bill = this.bill+(HalfSarees*a);
            		break;
			case 4:
			        System.out.println("You have selected Crop tops");
            		System.out.print("Enter the quantity: ");
             	 	a=Integer.parseInt(sc.nextLine());
                    System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(CropTops*a);
            		break;
			case 5:
			        System.out.println("You have selected Long Frocks");
            	    System.out.print("Enter the quantity: ");
             		a=Integer.parseInt(sc.nextLine());
             		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(LongFrocks*a);
            		break;
            case 6:
                    System.out.println("You have selected Kurtas");  
                    System.out.print("Enter the quantity: ");
             		a=Integer.parseInt(sc.nextLine());
             		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(Kurtas*a);
            		break;
                    
            case 7:
                    System.out.println("You have selected Shararas");
                    System.out.print("Enter the quantity: ");
             		a=Integer.parseInt(sc.nextLine());
             		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(Shararas*a);
            		break;
                    
            case 8:
                    System.out.println("You have selected Salwar Kameez Sets");
                    System.out.print("Enter the quantity: ");
             		a=Integer.parseInt(sc.nextLine());
             		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(SalwarKameez*a);
            		break;
            case 9:
                    System.out.println("You have selected Plazo Sets");
				    System.out.println("Enter the quantity: ");
				    a = Integer.parseInt(sc.nextLine());
				    System.out.print("Enter the size: ");
            	    s = sc.nextLine();
				    this.bill = this.bill+(PalazzoSets*a);
				    break;
                    
			default :
        		    System.out.println("Your selection is invalid, Please Re-Enter: ");
           			EthnicWear();
		}
		System.out.println(red+bold+"Enter 0-Exit\n1-Buy Again\n"+reset);
        int b = Integer.parseInt(sc.nextLine());
        if(b == 1)
        {
		    EthnicWear();
		}

	}
	void CasualWear()
	{
	    double AnarkaliSets = 500.0;
	    double PunjabiSets = 500.0;
	    double DressMaterials = 400.0;
	    double Frocks = 400.0;
	    double PalazzoSets = 700.0;
	    double Skirts = 600.0;
	    System.out.println(green+bold+"1  Anarkali Sets ----> Rs.500\n2  Punjabi Sets ----> Rs.500\n3  Dress Materials ----> Rs.400\n4  Frocks ----> Rs.400\n5  Palazzo Sets ----> Rs.700\n6  Skirts ----> Rs.600"+reset);
	    System.out.println("Enter the number which you want to buy: ");
	    int d = Integer.parseInt(sc.nextLine());
	    switch(d)
        {
            case 1:
        	        System.out.println("You have selected Anarkali Sets");
            		System.out.print("Enter the quantity: ");
            		int a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		String s = sc.nextLine();
            		this.bill = this.bill+(AnarkaliSets*a);
            		break;
            case 2:
        	        System.out.println("You have selected Punjabi Sets");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(PunjabiSets*a);
            		break;
            case 3:
        	        System.out.println("You have selected Dress Materials");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(DressMaterials*a);
            		break;
            case 4:
        	        System.out.println("You have selected Frocks");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(Frocks*a);
            		break;
            case 5:
        	        System.out.println("You have selected Palazzo Sets ");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(PalazzoSets*a);
            		break;
            case 6:
        	        System.out.println("You have selected Skirts ");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(Skirts*a);
            		break;
            default :
        		    System.out.println("Your selection is invalid, Please Re-Enter: ");
           			CasualWear();
		}
		System.out.println(red+bold+"Enter 0-Exit\n1-Buy Again\n"+reset);
        int b = Integer.parseInt(sc.nextLine());
        if(b == 1)
        {
		    CasualWear();
		}
	}
	
	void Tops()
	{
	    double LongCutTops = 400.0;
	    double ShortCutTops = 350.0;
	    double UmbrellaTops = 400.0;
	    double ColdShoulderTops = 450.0;
	    double RuffleFrontTops = 350.0;
	    double TieFrontTops = 400.0;
	    double WrapShortTops = 350.0;
	    double ClassicTops = 400.0;
	    double OffShoulderTops = 600.0;
	    double MiddleCutTops = 500.0;
	    System.out.println(purple+bold+"1   Long Cut Tops ----> Rs.400\n2   Short Cut Tops ----> Rs.350\n3   Umbrella Tops ----> Rs.400\n4   Cold Shoulder Tops ----> Rs.450\n5   Ruffle Front Tops ----> Rs.350\n6   Tie Front Tops ----> Rs.400\n7   Wrap Short Tops ----> Rs.350\n8   Classic Tops ----> Rs.400\n9   Off Shoulder Tops ----> Rs.600\n10  Middle Cut Tops ----> Rs.500"+reset);
	    System.out.println("Enter the number which you want to buy: ");
	    int d = Integer.parseInt(sc.nextLine());
	    switch(d)
        {
            case 1:
        	        System.out.println("You have selected Long Cut Tops");
            		System.out.print("Enter the quantity: ");
            		int a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		String s = sc.nextLine();
            		this.bill = this.bill+(LongCutTops*a);
            		break;
            case 2:
        	        System.out.println("You have selected Short Cut Tops");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(ShortCutTops*a);
            		break;
            case 3:
        	        System.out.println("You have selected Umbrella Tops");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(UmbrellaTops*a);
            		break;
            case 4:
        	        System.out.println("You have selected Cold Shoulder Tops");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(ColdShoulderTops*a);
            		break;
            case 5:
        	        System.out.println("You have selected Ruffle Front Tops");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(RuffleFrontTops*a);
            		break;
            case 6:
        	        System.out.println("You have selected Tie Front Tops");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(TieFrontTops*a);
            		break;
            case 7:
        	        System.out.println("You have selected Wrap Short Tops");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(WrapShortTops*a);
            		break;
            case 8:
        	        System.out.println("You have selected Classic Tops");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(ClassicTops*a);
            		break;
            case 9:
        	        System.out.println("You have selected Off Shoulder Tops");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(OffShoulderTops*a);
            		break;
            case 10:
        	        System.out.println("You have selected Middle Cut Tops");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(MiddleCutTops*a);
            		break;
            default :
        		    System.out.println("Your selection is invalid, Please Re-Enter: ");
           			Tops();
		}
		System.out.println(red+bold+"Enter 0-Exit\n1-Buy Again\n"+reset);
        int b = Integer.parseInt(sc.nextLine());
        if(b == 1)
        {
		    Tops();
		}
	}
	void Leggings()
	{
	    double AnkleLength = 500.0;
	    double FullLength = 600.0;
	    double TwinBirdsLeggings = 800.0;
	    double LyraLeggings = 400.0;
	    double JerseyLeggings = 500.0;
	    double CottonLeggings = 400.0;
	    double SideStripeLeggings = 600.0;
	    double CapriLeggings = 400.0;
	    System.out.println(yellow+bold+"1  Ankle Length Leggings ----> Rs.500\n2  Full Length Leggings ----> Rs.600\n3  TwinBirds Leggings ----> Rs.800\n4  Lyra Leggings ----> Rs.400\n5  Jersey Leggings ----> Rs.500\n6  Cotton Leggings ----> Rs.400\n7  Side Stripe Leggings ----> Rs.600\n8  Capri Leggings ----> Rs.400"+reset);
	    System.out.println("Enter the number which you want to buy: ");
	    int d = Integer.parseInt(sc.nextLine());
	    switch(d)
        {
            case 1:
        	        System.out.println("You have selected Ankle Length Leggings");
            		System.out.print("Enter the quantity: ");
            		int a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		String s = sc.nextLine();
            		this.bill = this.bill+(AnkleLength*a);
            		break;
            case 2:
        	        System.out.println("You have selected Full Length Leggings");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(FullLength*a);
            		break;
            case 3:
        	        System.out.println("You have selected Twin Birds Leggings");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(TwinBirdsLeggings*a);
            		break;
            case 4:
        	        System.out.println("You have selected Lyra Leggings");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(LyraLeggings*a);
            		break;
            case 5:
        	        System.out.println("You have selected Jersey Leggings");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(JerseyLeggings*a);
            		break;
            case 6:
        	        System.out.println("You have selected Cotton Leggings");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(CottonLeggings*a);
            		break;
            case 7:
        	        System.out.println("You have selected Side Stripe Leggings");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(SideStripeLeggings*a);
            		break;
            case 8:
        	        System.out.println("You have selected Capri Leggings");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(CapriLeggings*a);
            		break;
            default :
        		    System.out.println("Your selection is invalid, Please Re-Enter: ");
           			Leggings();
		}
		System.out.println(red+bold+"Enter 0-Exit\n1-Buy Again\n"+reset);
        int b = Integer.parseInt(sc.nextLine());
        if(b == 1)
        {
		    Leggings();
		}
	}
	void Jeggings()
	{
	    double SkinnyFitJeggings = 800.0;
	    double StraightJeggings = 900.0;
	    double EmbellishedJeggings = 800.0;
	    double SlimFitJeggings = 600.0;
	    double WeaveJeggings = 700.0;
	    double MidRiseJeggings = 1000.0;
	    System.out.println(green+bold+"1  Skinny Fit Jeggings ----> Rs.800\n2  Straight Jeggings ----> Rs.900\n3  Embellished Jeggings ----> Rs.800\n4  Slim Fit Jeggings ----> Rs.600\n5  Weave Jeggings ----> Rs.700\n6  Mid-Rise Jeggings ----> Rs.1000"+reset);
	    System.out.println("Enter the number which you want to buy: ");
	    int d = Integer.parseInt(sc.nextLine());
	    switch(d)
        {
            case 1:
        	        System.out.println("You have selected Skinny Fit Jeggings");
            		System.out.print("Enter the quantity: ");
            		int a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		String s = sc.nextLine();
            		this.bill = this.bill+(SkinnyFitJeggings*a);
            		break;
            case 2:
        	        System.out.println("You have selected StraightJeggings");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(StraightJeggings*a);
            		break;
            case 3:
        	        System.out.println("You have selected Embelished Jeggings");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(EmbellishedJeggings*a);
            		break;
            case 4:
        	        System.out.println("You have selected Slim Fit Jeggings");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(SlimFitJeggings*a);
            		break;
            case 5:
        	        System.out.println("You have selected Weave Jeggings");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(WeaveJeggings*a);
            		break;
            case 6:
        	        System.out.println("You have selected Mid-Rise Jeggings");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(MidRiseJeggings*a);
            		break;
            default :
        		    System.out.println("Your selection is invalid, Please Re-Enter: ");
           			Jeggings();
		}
		System.out.println(red+bold+"Enter 0-Exit\n 1-Buy Again\n"+reset);
        int b = Integer.parseInt(sc.nextLine());
        if(b == 1)
        {
		    Jeggings();
		}
	}
	void Jeans()
	{
	    double BootCutJeans = 800.0;
	    double CargoPants = 540.0;
	    double MidRiseJeans = 300.0;
	    double SlimFitJeans = 550.0;
	    double StraightFitJeans = 1800.0;
	    double Joggers = 600.0;
	    double SlimFitLooperPants = 386.0;
	    double FlaredJeans = 1000.0;
	    double PrintedJeans = 350.0;
	    double SkinnyFitJeans = 300.0;
	    double BaggyPants = 500.0;
	    double WaistPants = 400.0;
	    double CottonJeans = 300.0;
	    double DenimJeans = 782.0;
	    double SequinedJeans = 330.0;
	    double EmbellishedJeans = 400.0;
	    double EmbroideredJeans = 300.0;
	    double TornJeans = 1000.0;
	    System.out.println(blue+bold+"1   Boot Cut Jeans ----> Rs.800\n2   Cargo Pants ----> Rs.540\n3   Mid-Rise Jeans ----> Rs.300\n4   Slim Fit Jeans ----> Rs.550\n5   Straight Fit Jeans ----> Rs.1800\n6   Joggers ----> Rs.600\n7   Slim Fit Looper Pants ----> Rs.386\n8   Flared Jeans ----> Rs.1000\n9   Printed Jeans ----> Rs.350\n10  Skinny Fit Jeans ----> Rs.300\n11  BaggyPants ----> Rs.500\n12  Waist Pants ----> Rs.400\n13  Cotton Jeans ----> Rs.300\n14  Denim Jeans ----> Rs.782\n15  Sequined Jeans ----> Rs.330\n16  Embellished Jeans ----> Rs.400\n17  Embroidered Jeans ----> Rs.300\n18  Torn Jeans ----> Rs.1000"+reset);
	    System.out.println("Enter the number which you want to buy: ");
	    int d = Integer.parseInt(sc.nextLine());
	    switch(d)
        {
            case 1:
        	        System.out.println("You have selected Boot Cut Jeans");
            		System.out.print("Enter the quantity: ");
            		int a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		String s = sc.nextLine();
            		this.bill = this.bill+(BootCutJeans*a);
            		break;
            case 2:
        	        System.out.println("You have selected Cargo Pants");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(CargoPants*a);
            		break;
            case 3:
        	        System.out.println("You have selected Mid-Rise Jeans");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(MidRiseJeans*a);
            		break;
            case 4:
        	        System.out.println("You have selected Slim Fit Jeans");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(SlimFitJeans*a);
            		break;
            case 5:
        	        System.out.println("You have selected Straight Fit Jeans");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(StraightFitJeans*a);
            		break;
            case 6:
        	        System.out.println("You have selected Joggers");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(Joggers*a);
            		break;
            case 7:
        	        System.out.println("You have selected Slim Fit Looper Pants");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(SlimFitLooperPants*a);
            		break;
            case 8:
        	        System.out.println("You have selected Flared Jeans");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(FlaredJeans*a);
            		break;
            case 9:
        	        System.out.println("You have selected Printed Jeans");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(PrintedJeans*a);
            		break;
            case 10:
        	        System.out.println("You have selected Skinny Fit Jeans");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(SkinnyFitJeans*a);
            		break;
            case 11:
        	        System.out.println("You have selected Baggy Pants");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(BaggyPants*a);
            		break;
            case 12:
        	        System.out.println("You have selected Waist Pants");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(WaistPants*a);
            		break;
            case 13:
        	        System.out.println("You have selected Cotton Jeans");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(CottonJeans*a);
            		break;
            case 14:
        	        System.out.println("You have selected Denim Jeans");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(DenimJeans*a);
            		break;
            case 15:
        	        System.out.println("You have selected Sequined Jeans");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(SequinedJeans*a);
            		break;
            case 16:
        	        System.out.println("You have selected Embellished Jeans");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(EmbellishedJeans*a);
            		break;
            case 17:
        	        System.out.println("You have selected Embroidered Jeans");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(EmbroideredJeans*a);
            		break;
            case 18:
        	        System.out.println("You have selected Torn Jeans");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(TornJeans*a);
            		break;
            default :
        		    System.out.println("Your selection is invalid, Please Re-Enter: ");
           			Jeans();
		}
		System.out.println(red+bold+"Enter 0-Exit\n1-Buy Again\n2-Go to Store"+reset);
        int b = Integer.parseInt(sc.nextLine());
        if(b == 1)
        {
		    Jeans();
		}
		
	}
	
	void InnerWear()
	{
	    double Camisoles = 200.0;
	    double Slips = 150.0;
	    double Bloomers = 100.0;
	    double Briefs = 150.0;
	    double KnitShorts = 300.0;
	    double ThermalVests = 500.0;
	    double HipsterPanties = 150.0;
	    System.out.println(purple+bold+"1  Camisoles ----> Rs.200\n2  Slips ----> Rs.150\n3  Bloomers ----> Rs.100\n4  Briefs ----> Rs.150\n5  Knit Shorts ----> Rs.300\n6  Thermal Vests ----> Rs.500\n7  Hipster Panties ----> Rs.150"+reset);
	    System.out.println("Enter the number which you want to buy: ");
	    int d = Integer.parseInt(sc.nextLine());
	    switch(d)
        {
            case 1:
        	        System.out.println("You have selected Camisoles");
            		System.out.print("Enter the quantity: ");
            		int a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		String s = sc.nextLine();
            		this.bill = this.bill+(Camisoles*a);
            		break;
            case 2:
        	        System.out.println("You have selected Slips");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(Slips*a);
            		break;
            case 3:
        	        System.out.println("You have selected Bloomers");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(Bloomers*a);
            		break;
            case 4:
        	        System.out.println("You have selected Briefs");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(Briefs*a);
            		break;
            case 5:
        	        System.out.println("You have selected Knit Shorts");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(KnitShorts*a);
            		break;
            case 6:
        	        System.out.println("You have selected Thermal Vests");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(ThermalVests*a);
            		break;
            case 7:
        	        System.out.println("You have selected Hipster Panties");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size: ");
            		s = sc.nextLine();
            		this.bill = this.bill+(HipsterPanties*a);
            		break;
            default :
        		    System.out.println("Your selection is invalid, Please Re-Enter: ");
           			InnerWear();
		}
		System.out.println(red+bold+"Enter 0-Exit\n1-Buy Again"+reset);
        int b = Integer.parseInt(sc.nextLine());
        if(b == 1)
        {
		    InnerWear();
		}
	}
	void FootWear()
	{
	    double FlipFlops = 200.0;
	    double Ballerinas = 300.0;
	    double Sneakers = 500.0;
	    double SportsShoe = 2000.0;
	    double SlipOnShoes = 300.0;
	    double Sandals = 400.0;
	    double RunningShoes = 900.0;
	    double Crocs = 2000.0;
	    double LaceUpShoes = 1500.0;
	    double PrintClogs = 1200.0;
	    double AnkleLengthBoots = 1000.0;
	    double HeelShoes = 4000.0;
	    double HeeledSandals = 700.0;
	    System.out.println(skyblue+bold+"1   Flip-Flops ----> Rs.200\n2   Ballerinas ----> Rs.300\n3   Sneakers ----> Rs.500\n4   Sports Shoe ----> Rs.2000\n5   Slip On Shoes ----> Rs.300\n6   Sandals ----> Rs.400\n7   Running Shoes ----> Rs.900\n8   Crocs ----> Rs.2000\n9   Lace-Up Shoes ----> Rs.1500\n10  Print Clogs ----> Rs.1200\n11  Ankle Length Boots ----> Rs.1000\n12  Heel Shoes ----> Rs.4000\n13  Heeled Sandals ----> Rs.700"+reset);
	    System.out.println("Enter the number which you want to buy: ");
	    int d = Integer.parseInt(sc.nextLine());
	    switch(d)
        {
            case 1:
        	        System.out.println("You have selected Flip-Flops");
            		System.out.print("Enter the quantity: ");
            		int a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size as number: ");
            		int f = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(FlipFlops*a);
            		break;
            case 2:
        	        System.out.println("You have selected Ballerinas");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size as number: ");
            		f = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(Ballerinas*a);
            		break;
            case 3:
        	        System.out.println("You have selected Sneakers");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size as number: ");
            		f = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(Sneakers*a);
            		break;
            case 4:
        	        System.out.println("You have selected Sports Shoe");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size as number: ");
            	    f = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(SportsShoe*a);
            		break;
            case 5:
        	        System.out.println("You have selected Slip On Shoes");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size as number: ");
            		f = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(SlipOnShoes*a);
            		break;
            case 6:
        	        System.out.println("You have selected Sandals");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size as number: ");
            		f = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(Sandals*a);
            		break;
            case 7:
        	        System.out.println("You have selected Running Shoes");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size as number: ");
            		f = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(RunningShoes*a);
            		break;
            case 8:
        	        System.out.println("You have selected Crocs");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size as number: ");
            		f = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(Crocs*a);
            		break;
            case 9:
        	        System.out.println("You have selected Lace-Up Shoes");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size as number: ");
            		f = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(LaceUpShoes*a);
            		break;
            case 10:
        	        System.out.println("You have selected Print Clogs");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size as number: ");
            		f = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(PrintClogs*a);
            		break;
            case 11:
        	        System.out.println("You have selected Ankle Length Boots");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size as number: ");
            		f = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(AnkleLengthBoots*a);
            		break;
            case 12:
        	        System.out.println("You have selected Heel Shoes");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size as number: ");
            		f = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(HeelShoes*a);
            		break;
            case 13:
        	        System.out.println("You have selected Heeled Sandals");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size as number: ");
            		f = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(HeeledSandals*a);
            		break;
            default :
        		    System.out.println("Your selection is invalid, Please Re-Enter: ");
           			FootWear();
		}
		System.out.println(red+bold+"Enter 0-Exit\n1-Buy Again\n"+reset);
        int b = Integer.parseInt(sc.nextLine());
        if(b == 1)
        {
		    FootWear();
		}
		
	}
	void Accessories()
	{
	    double Sunglasses = 800.0;
	    double Watches = 1000.0;
	    double Wallets = 300.0;
	    double HandBags = 800.0;
	    double Bags = 1000.0;
	    double Belts = 200.0;
	    double Scarves = 300.0;
	    double Stoles = 250.0;
	    double Socks = 200.0;
	    double Stockings = 400.0;
	    double Caps = 500.0;
	    System.out.println(green+bold+"1   Sunglasses ----> Rs.800\n2   Watches ----> Rs.1000\n3   Wallets ----> Rs.300\n4   Hand Bags ----> Rs.800\n5   Bags ----> Rs.1000\n6   Belts ----> Rs.200\n7   Scarves ----> Rs.300\n8   Stoles ----> Rs.250\n9   Socks ----> Rs.200\n10  Stockings ----> Rs.400\n11  Caps ----> Rs.500"+reset);
	    System.out.println("Enter the number which you want to buy: ");
	    int d = Integer.parseInt(sc.nextLine());
	    switch(d)
        {
            case 1:
        	        System.out.println("You have selected Sunglasses");
            		System.out.print("Enter the quantity: ");
            		int a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(Sunglasses*a);
            		break;
            case 2:
        	        System.out.println("You have selected Watches");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(Watches*a);
            		break;
            case 3:
        	        System.out.println("You have selected Wallets");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(Wallets*a);
            		break;
            case 4:
        	        System.out.println("You have selected HandBags");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(HandBags*a);
            		break;
            case 5:
        	        System.out.println("You have selected Bags");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(Bags*a);
            		break;
            case 6:
        	        System.out.println("You have selected Belts");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(Belts*a);
            		break;
            case 7:
        	        System.out.println("You have selected Scarves");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(Scarves*a);
            		break;
            case 8:
        	        System.out.println("You have selected Stoles");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(Stoles*a);
            		break;
            case 9:
        	        System.out.println("You have selected Socks");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(Socks*a);
            		break;
            case 10:
        	        System.out.println("You have selected Stockings");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		System.out.print("Enter the size (XS/S/M/L/XL/XXL/XXXL): ");
            		String s = sc.nextLine();
            		this.bill = this.bill+(Stockings*a);
            		break;
            case 11:
        	        System.out.println("You have selected Caps");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(Caps*a);
            		break;
            default :
        		    System.out.println("Your selection is invalid, Please Re-Enter: ");
           			Accessories();
		}
		System.out.println(red+bold+"Enter 0-Exit\n1-Buy Again\n"+reset);
        int b = Integer.parseInt(sc.nextLine());
        if(b == 1)
        {
		    Accessories();
		}

	}
	void FashionJewellery()
	{
	    double HairClips = 100.0;
	    double RubberBands = 50.0;
	    double EarStuds = 200.0;
	    double EarRings = 400.0;
	    double Chains = 200.0;
	    double NecklaceSets = 650.0;
	    double Bracelets = 300.0;
	    double HairBands = 150.0;
	    double Scrunchies = 80.0;
	    double Rings = 100.0;
	    double HairClaws = 100.0;
	    double SingleBangles = 200.0;
	    double BanglesSets = 500.0;
	    System.out.println(yellow+bold+"1   HairClips ----> Rs.100\n2   RubberBands ----> Rs.50\n3   Ear Studs ----> Rs.200\n4   Ear Rings ----> Rs.400\n5   Chains ----> Rs.200\n6   Necklace Sets ----> Rs.650\n7   Bracelets ----> Rs.300\n8   Hair Bands ----> Rs.150\n9   Scrunchies ----> Rs.80\n10  Rings ----> Rs.100\n11  Hair Claws ----> Rs.100\n12  Single Bangles ----> Rs.200\n13  Bangles Sets ----> Rs.500"+reset);
	    System.out.println("Enter the number which you want to buy: ");
	    int d = Integer.parseInt(sc.nextLine());
	    switch(d)
        {
            case 1:
        	        System.out.println("You have selected HairClips");
            		System.out.print("Enter the quantity: ");
            		int a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(HairClips*a);
            		break;
            case 2:
        	        System.out.println("You have selected Rubber Bands");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(RubberBands*a);
            		break;
            case 3:
        	        System.out.println("You have selected Ear Studs");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(EarStuds*a);
            		break;
            case 4:
        	        System.out.println("You have selected Ear Rings");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(EarRings*a);
            		break;
            case 5:
        	        System.out.println("You have selected Chains");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(Chains*a);
            		break;
            case 6:
        	        System.out.println("You have selected Necklace Sets");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(NecklaceSets*a);
            		break;
            case 7:
        	        System.out.println("You have selected Bracelets");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(Bracelets*a);
            		break;
            case 8:
        	        System.out.println("You have selected Hair Bands");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(HairBands*a);
            		break;
            case 9:
        	        System.out.println("You have selected Scrunchies");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(Scrunchies*a);
            		break;
            case 10:
        	        System.out.println("You have selected Rings");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(Rings*a);
            		break;
            case 11:
        	        System.out.println("You have selected Hair Claws");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(HairClaws*a);
            		break;
            case 12:
        	        System.out.println("You have selected Single Bangles");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(SingleBangles*a);
            		break;
            case 13:
        	        System.out.println("You have selected BanglesSets");
            		System.out.print("Enter the quantity: ");
            		a = Integer.parseInt(sc.nextLine());
            		this.bill = this.bill+(BanglesSets*a);
            		break;
            default :
        		    System.out.println("Your selection is invalid, Please Re-Enter: ");
           			FashionJewellery();
		}
		System.out.println(red+bold+"Enter 0-Exit\n1-Buy Again\n"+reset);
        int b = Integer.parseInt(sc.nextLine());
        if(b == 1)
        {
		    FashionJewellery();
		}
		
	}
			
	public static void main(String[] args)
	{
		System.out.println();
	    System.out.println(skyblue+bold+"                   . +*+.                                       .:***:");       
        System.out.println("                  -**+***        .                    .         -*****.");     
        System.out.println("                 =******-  .--.  ******++==---::..   ***-      +******.");     
        System.out.println("               .+**+:***.  .**=  -=**+++**********. -**+     :+**=.***");     
        System.out.println("              -+++- -**+   .**=   =**.        -=**  ***:    =***. .***");        
        System.out.println("            .+*+=   :-=:    ...   +**     .-=+***  =**=   .+**=   .***."+reset);      
        System.out.println(yellow+bold+"           -***-           .++=   *** :-+****+    .***   =***:     :-- ");     
        System.out.println("         .+**+. +*********  ***  .*******+-:      +**-  ******=-:.      ");     
        System.out.println("        -***-   -==+***=-- .**+  -*****+.        -**+    .:-=+*****+=-:");       
        System.out.println("      .+**+.   .-=*****:    ***  +**=-+**=.      =**:           .:-=****+:");    
        System.out.println("     -***= :-+****+=***.    ***  ***.  :+**+:   -*************.    -***+:"+reset);      
        System.out.println(green+bold+"    +****+****=-.  .***     **+ .***     .=***-. --------===--  .=***+:");      
        System.out.println("    :*****=:       :***         -**+       .-+**+-            :+***+:");         
        System.out.println("     .=-.          -**+         +**=          :=***+:      .=****=.   ");       
        System.out.println("                   =**+         ...              -*+-     +***+:      ");      
        System.out.println("                   :==-                                   .+*:        "+reset);         
        System.out.println();                     
		System.out.println(green+Italic+bold+"~~~~~~~~Available Products~~~~~~~~"+reset);
		System.out.println();            
		System.out.println(red+bold+"1   Girls T-Shirts\n2   Girls Night Wear\n3   Girls Ethnic Wear\n4   Girls Casual Wear\n5   Girls Tops\n6   Girls Leggings\n7   Girls Jeggings\n8   Girls Jeans\n9   Girls Inner Wear\n10  Girls Footwear\n11  Girls Accessories\n12  Girls Fashion Jewellery\n13  Exit"+reset);
		System.out.println(bold+"Enter the number which you want to buy: "+reset);
		int a = Integer.parseInt(sc.nextLine());
		switch(a)
		{
			case 1:
				G.TShirts();
				break;
			case 2:
				G.NightWear();
				break;
			case 3:
				G.EthnicWear();
				break;
			case 4:
				G.CasualWear();
				break;
			case 5:
				G.Tops();
				break;
			case 6:
				G.Leggings();
				break;
			case 7:
				G.Jeggings();
				break;
			case 8:
				G.Jeans();
				break;
			case 9:
			    G.InnerWear();
				break;
			case 10:
				G.FootWear();
				break;
			case 11:
			    G.Accessories();
				break;
			case 12:
			    G.FashionJewellery();
				break;
			case 13:
			    break;
			default:
				System.out.println(green+bold+"Your selection is invalid, Please select valid option"+reset);
				main(null);
				break;
		}
		while(true)
		{
		System.out.println(skyblue+bold+"Press 1.Buy More In this Section\n 2.Billing And Exit \n 3.Main Page"+reset);
		int n = Integer.parseInt(sc.nextLine());
		if(n == 1)
		{	
		    main(null);break;
		}
		else if(n==2)
		{
		    amount.total_billing();break;
		}
		else if(n==3)
		{
			os.main(null);break;
		}
		else
			System.out.println("Invalid Input, try again");
		
		}
	}
}
class Product
{
    private String name;
    private double price;

    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }
}

class ShoppingCart 
{
    private List<Product> items;

    public ShoppingCart() 
    {
        items = new ArrayList<>();
    }

    public void addItem(Product product)
    {
        items.add(product);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}

class OnlineShopping
 {
	  //unicodes 31 -37 text colors 0 reset 1 bold 5 blink 21 underline
    static String reset="\u001B[0m";    //101-107 background 

    static String under="\u001B[21m";
    static String bold="\u001B[1m";
    static String backred="\u001B[101m";
    static String green="\u001B[33m";
//wellcome to shopping

    static String blink="\u001B[5m"; 
    static String yellow="\u001B[32m";
//men shppoing

    static String RED = "\u001B[31m";
//shirt

    static String dark_blue = "\u001B[34m";
//pant

    static String purple = "\u001B[35m";
//Blazer

    static String lightblue= "\u001B[36m"; 
//jackjets
     
     static String blue="\u001B[34m";
     static ShoppingCart cart = new ShoppingCart();
//shoes

    	public static void main(String[] args) 
    {
System.out.println("\n");
System.out.println(RED+green+"##   ##  ### ###  ###  ## ");
System.out.println(" ## ##    ##  ##    ## ##  ");
System.out.println("# ### #   ##       # ## #  ");
System.out.println("## # ##   ## ##    ## ##   ");
System.out.println("##   ##   ##       ##  ##  ");
System.out.println("##   ##   ##  ##   ##  ##  ");
System.out.println("##   ##  ### ###  ###  ##  "+reset);
System.out.println("\n");
                           
        Scanner scanner = new Scanner(System.in);


	System.out.println(backred+under+bold+green+"Welcome to Online Shopping!"+reset);



        
       // Adding some sample products
        Product shirt = new Product("Shirt", 999.99);
        Product pant = new Product("Pant", 999.99);
        Product blazer = new Product("Blazer", 999.99);
        Product jacketsCoat = new Product("JacketsCoat", 99.99);
        Product shoes = new Product("Shoes", 999.99);
        Product tshirt = new Product("T-shirt", 999.99);
        Product hoodies = new Product("Hoodies", 999.99);
        Product sweatpants = new Product("Sweatpants", 999.99);
        Product accessories = new Product("Accessories", 999.99);

        // Adding various types of products
        Product poloShirt = new Product("Polo shirt", 125.99);
        Product buttonDownShirt = new Product("Button-down shirt", 535.50);
        Product dressShirt = new Product("Dress shirt", 445.00);
        Product henleyShirt = new Product("Henley shirt", 301.75);
        Product flannelShirt = new Product("Flannel shirt", 460.99);
        Product hawaiianShirt = new Product("Hawaiian shirt", 297.99);
        Product rugbyShirt = new Product("Rugby shirt", 504.00);
        Product vNeckShirt = new Product("V-neck shirt", 270.99);
        Product crewneckShirt = new Product("Crewneck shirt", 212.50);
        Product longSleeveShirt = new Product("Long sleeve shirt", 297.99);
        Product shortSleeveShirt = new Product("Short sleeve shirt", 819.99);

        Product jeans = new Product("Jeans", 496.99);
        Product chinos = new Product("Chinos", 739.50);
        Product cargoPants = new Product("Cargo pants", 845.00);
        Product khakiPants = new Product("Khaki pants", 435.75);
        Product dressPants = new Product("Dress pants", 535.99);
        Product corduroyPants = new Product("Corduroy pants", 342.99);
        Product slimFitPants = new Product("Slim fit pants", 420.00);
        Product straightLegPants = new Product("Straight leg pants", 388.99);
        Product bootcutPants = new Product("Bootcut pants", 344.50);
        Product wideLegPants = new Product("Wide leg pants", 356.99);
        Product capriPants = new Product("Capri pants", 829.99);
        Product croppedPants = new Product("Cropped pants", 934.99);

        Product singleBreastedBlazer = new Product("Single Breasted Blazer", 199.99);
        Product doubleBreastedBlazer = new Product("Double Breasted Blazer", 249.99);
        Product sportsBlazer = new Product("Sports Blazer", 149.99);
        Product navyBlazer = new Product("Navy Blazer", 179.99);
        Product linenBlazer = new Product("Linen Blazer", 169.99);
        Product velvetBlazer = new Product("Velvet Blazer", 299.99);
        Product tweedBlazer = new Product("Tweed Blazer", 159.99);
        Product corduroyBlazer = new Product("Corduroy Blazer", 189.99);
        Product casualBlazer = new Product("Casual Blazer", 139.99);
        Product formalBlazer = new Product("Formal Blazer", 209.99);

        Product denim = new Product("Denim", 970.00);
        Product leather = new Product("Leather", 250.00);
        Product bomber = new Product("Bomber", 150.00);
        Product overcoat = new Product("Overcoat", 300.00);
        Product trenchcoat = new Product("Trenchcoat", 200.00);
        Product peacoat = new Product("Peacoat", 180.00);

        Product sneakers = new Product("Sneakers", 275.00);
        Product dressShoes = new Product("Dress Shoes", 120.00);
        Product boots = new Product("Boots", 150.00);
        Product loafers = new Product("Loafers", 585.00);
        Product sandals = new Product("Sandals", 406.00);
        Product slipOns = new Product("Slip-Ons", 609.00);
        Product flipFlops = new Product("Flip-Flops", 820.00);
        Product formalShoes = new Product("Formal Shoes", 130.00);
        Product brogues = new Product("Brogues", 110.00);
        Product wingtips = new Product("Wingtips", 115.00);
        Product hikingBoots = new Product("Hiking Boots", 140.00);
        Product moccasins = new Product("Moccasins", 995.00);
        Product highTopSneakers = new Product("High-Top Sneakers", 790.00);
        Product capToeShoes = new Product("Cap-Toe Shoes", 125.00);
        Product ankleBoots = new Product("Ankle Boots", 135.00);

        Product crewneck = new Product("Crewneck ", 115.00);
        Product vneck= new Product("V-neck", 118.00);
        Product henley = new Product("Henley ", 212.00);
        Product polo = new Product("Polo ", 251.00);
        Product longSleeve = new Product("Long sleeve ", 201.00);
        Product tankTops = new Product("Tank Tops", 112.00);
        Product graphic = new Product("Graphic ", 117.00);

        Product pulloverHoodie = new Product("Pullover Hoodie", 345.00);
        Product zipUpHoodie = new Product("Zip-Up Hoodie", 440.00);
        Product graphicPrintHoodie = new Product("Graphic Print Hoodie", 445.00);
        Product plainHoodie = new Product("Plain Hoodie", 430.00);

        Product joggerSweatpants = new Product("Jogger Sweatpants", 365.00);
        Product slimFitSweatpants = new Product("Slim Fit Sweatpants", 438.00);
        Product taperedSweatpants = new Product("Tapered Sweatpants", 430.00);
        Product fleeceSweatpants = new Product("Fleece Sweatpants", 475.00);
        Product athleticSweatpants = new Product("Athletic Sweatpants", 142.00);
        Product cargoSweatpants = new Product("Cargo Sweatpants", 560.00);
        Product drawstringSweatpants = new Product("Drawstring Sweatpants", 430.00);
        Product elasticWaistSweatpants = new Product("Elastic Waist Sweatpants", 323.00);
        Product loungeSweatpants = new Product("Lounge Sweatpants", 728.00);
        Product trackSweatpants = new Product("Track Sweatpants", 397.00);

        Product sunglasses = new Product("Sunglasses", 780.00);
        Product watches = new Product("Watches", 1850.00);
        Product belts = new Product("Belts", 375.00);
        Product hats = new Product("Hats", 2599.00);
        Product wallets = new Product("Wallets", 560.00);
        Product cufflinks = new Product("Cufflinks", 600.00);
        Product ties = new Product("Ties", 20.00);
        Product scarves = new Product("Scarves", 25.00);
        Product gloves = new Product("Gloves", 30.00);
        Product bags = new Product("Bags", 1000.00);

         // Displaying available products
        System.out.println(blink+yellow+"MEN CLOTHING :"+reset);
	
       	
        System.out.println("111. " + shirt.getName() + " - $" + shirt.getPrice());
        System.out.println("112. " + pant.getName() + " - $" + pant.getPrice());
        System.out.println("113. " + blazer.getName() + " - $" + blazer.getPrice());
        System.out.println("114. " + jacketsCoat.getName() + " - $" + jacketsCoat.getPrice());
        System.out.println("115. " + shoes.getName() + " - $" + shoes.getPrice());
        System.out.println("116. " + tshirt.getName() + " - $" + tshirt.getPrice());
        System.out.println("117. " + hoodies.getName() + " - $" + hoodies.getPrice());
        System.out.println("118. " + sweatpants.getName() + " - $" + sweatpants.getPrice());
        System.out.println("119. " + accessories.getName() + " - $" + accessories.getPrice());
	




        // Adding items to the shopping cart
        System.out.println("Enter the number of the product you want to add to cart (111 -119), 0 to checkout:");
        int choice;
        do {
            choice = scanner.nextInt();
            switch (choice)
            {
                case 111:
	        System.out.println(blink+yellow+"Select type of shirt:"+reset);
        System.out.println(green+"1. Polo shirt - $125.99"+reset);
        System.out.println(green+"2. Button-down shirt - $535.50"+reset);
        System.out.println(green+"3. Dress shirt - $445.00"+reset);
        System.out.println(green+"4. Henley shirt - $301.75"+reset);
        System.out.println(green+"5. Flannel shirt - $460.99"+reset);
       	System.out.println(green+"6. Hawaiian shirt - $297.99"+reset);
        System.out.println(green+"7. Rugby shirt - $504.00"+reset);
       	System.out.println(green+"8. V neck shirt - $270.99"+reset);
        System.out.println(green+"9. Crewneck shirt - $212.50"+reset);
        System.out.println(green+"10. Long sleeve shirt - $297.99"+reset);
	System.out.println(green+"11. Short-sleeve shirt - $819.99"+reset);
        
                    int shirtChoice = scanner.nextInt();
                    System.out.println("Enter the number of the product you want to add to cart (111 -119), 0 to checkout:");
                    switch (shirtChoice) 
                        {
                            case 1:
                                cart.addItem(poloShirt );
                                break;
                            case 2:
                                cart.addItem(buttonDownShirt);
                                break;
                            case 3:
                                cart.addItem(dressShirt);
                                break;
                            case 4:
                                cart.addItem(henleyShirt);
                                break;
                            case 5:
                                cart.addItem(flannelShirt);
                                break;
                            case 6:
                                cart.addItem(hawaiianShirt);
                                break;
                            case 7:
                                cart.addItem(rugbyShirt);
                                break;
                            case 8:
                                cart.addItem(vNeckShirt);
                                break;
                            case 9:
                                cart.addItem(crewneckShirt);
                                break;
                            case 10:
                                cart.addItem(longSleeveShirt);
                                break;
                            case 11:
                                cart.addItem(shortSleeveShirt);
                                break;
                            default:
                                System.out.println(RED+"Invalid shirt choice!"+reset);
                        }break;


                    
                case 112:
        System.out.println(blink+yellow+"Select type of pant:"+reset);
        System.out.println(dark_blue+"1. Jeans - $496.99"+reset);
        System.out.println(dark_blue+"2. Chinos - $739.50"+reset);
        System.out.println(dark_blue+"3. Cargo pants - $845.00"+reset);
        System.out.println(dark_blue+"4. Khaki pants - $435.75"+reset);
        System.out.println(dark_blue+"5. Dress pants - $535.99"+reset);
        System.out.println(dark_blue+"6. Corduroy pants - $342.99"+reset);
        System.out.println(dark_blue+"7. Slim fit pants - $420.00"+reset);
        System.out.println(dark_blue+"8. Straight-leg pants - $388.99"+reset);
        System.out.println(dark_blue+"9. Bootcut pants - $344.50"+reset);
        System.out.println(dark_blue+"10. Wide leg pants - $356.99"+reset);
        System.out.println(dark_blue+"11. Capri pants - $829.99"+reset);
        System.out.println(dark_blue+"12. Cropped pants - $934.99"+reset);
        

                    
                    int pantChoice = scanner.nextInt();
                    System.out.println("Enter the number of the product you want to add to cart (111 -119), 0 to checkout:");
                    switch (pantChoice)
                        {
                            case 1 :
                                cart.addItem(jeans);
                                break;
                            case 2:
                                cart.addItem(chinos);
                                break;
                            case 3:
                                cart.addItem(cargoPants);
                                break;
                            case 4:
                                cart.addItem(khakiPants);
                                break;
                            case 5:
                                cart.addItem(dressPants);
                                break;
                            case 6:
                                cart.addItem(corduroyPants);
                                break;
                            case 7:
                                cart.addItem(slimFitPants);
                                break;
                            case 8:
                                cart.addItem(straightLegPants);
                                break;
                            case 9:
                                cart.addItem(bootcutPants);
                                break;
                            case 10:
                                cart.addItem(wideLegPants);
                                break;
                            case 11:
                                cart.addItem(capriPants);
                                break;
                            case 12:
                                cart.addItem(croppedPants);
                                break;
                            default:
                                System.out.println(RED+"Invalid pant choice!"+reset);
                  	    }break;
                  	  
               	case 113:
	        System.out.println(blink+yellow+"Select type of Blazers:"+reset);
        System.out.println(purple+"1. Single-Breasted Blazers - $250.00"+reset);
        System.out.println(purple+"2. Double-Breasted Blazers - $350.00"+reset);
        System.out.println(purple+"3. Sports Blazers - $275.00"+reset);
        System.out.println(purple+"4. Navy Blazers - $300.00"+reset);
        System.out.println(purple+"5. Linen Blazers - $325.00"+reset);
        System.out.println(purple+"6. Velvet Blazers - $500.00"+reset);
        System.out.println(purple+"7. Tweed Blazers - $450.00"+reset);
        System.out.println(purple+"8. Corduroy Blazers - $260.00"+reset);
        System.out.println(purple+"9. Casual Blazers - $275.00"+reset);
        System.out.println(purple+"10. Formal Blazers - $999.00"+reset); 
  
    				
    				int blazersChoice = scanner.nextInt();
    				System.out.println("Enter the number of the product you want to add to cart (111 -119), 0 to checkout:");
    				switch (blazersChoice)
    				    {
           				    case 1:
               				 cart.addItem(singleBreastedBlazer);
                				break;
                            case 2:
                                cart.addItem(doubleBreastedBlazer);
                                break;
                            case 3:
                                cart.addItem(sportsBlazer);
                                break;
                            case 4:
                                cart.addItem(navyBlazer);
                                break;
                            case 5:
                                cart.addItem(linenBlazer);
                                break;
                            case 6:
                                cart.addItem(velvetBlazer);
                                break;
                            case 7:
                                cart.addItem(tweedBlazer);
                                break;
                            case 8:
                                cart.addItem(corduroyBlazer);
                                break;
                            case 9:
                                cart.addItem(casualBlazer);
                                break;
                            case 10:
                                cart.addItem(formalBlazer);
                                break;
                            default:
                                System.out.println(RED+"Invalid choice!"+reset);
                         }break;
                           

                case 114:
	        System.out.println(blink+yellow+"Select type of Jackets & Coats:"+reset);
        System.out.println(lightblue+"1. Denim - $970.00"+reset);
        System.out.println(lightblue+"2. Leather - $250.00"+reset);
        System.out.println(lightblue+"3. Bomber - $150.00"+reset);
        System.out.println(lightblue+"4. Overcoat - $300.00"+reset);
        System.out.println(lightblue+"5. Trenchcoat - $200.00"+reset);
        System.out.println(lightblue+"6. Peacoat - $180.00"+reset);

                    
                    int jacketsCoatChoice = scanner.nextInt();
                    System.out.println("Enter the number of the product you want to add to cart (111 -119), 0 to checkout:");
                    switch (jacketsCoatChoice) 
                        {
                            case 1:
                                cart.addItem(denim);
                                break;
                            case 2:
                                cart.addItem(leather);
                                break;
                            case 3:
                                cart.addItem(bomber);
                                break;
                            case 4:
                                cart.addItem(overcoat);
                                break;
                            case 5:
                                cart.addItem(trenchcoat); 
                                break;
                            case 6:
                                cart.addItem(peacoat);
                                break;
                            default:
                                System.out.println(RED+"Invalid Jackets & Coat Choice!"+reset);
                        }break;

                case 115:
                            System.out.println(blink+yellow+"Select type of shoes:"+reset);
                     
        System.out.println(blue+"1. Sneakers - $275.00"+reset);
        System.out.println(blue+"2. Dress Shoes - $120.00"+reset);
        System.out.println(blue+"3. Boots - $150.00"+reset);
        System.out.println(blue+"4. Loafers - $585.00"+reset);
        System.out.println(blue+"5. Sandals - $406.00"+reset);
        System.out.println(blue+"6. Slip-Ons - $609.00"+reset);
        System.out.println(blue+"7. Flip-Flops - $820.00"+reset);
        System.out.println(blue+"8. Formal Shoes - $130.00"+reset);
        System.out.println(blue+"9. Brogues - $110.00"+reset);
        System.out.println(blue+"10. Wingtips - $115.00"+reset);
        System.out.println(blue+"11. Hiking Boots - $140.00"+reset);
        System.out.println(blue+"12. Moccasins - $995.00"+reset);
        System.out.println(blue+"13. High-Top Sneakers - $790.00"+reset);
        System.out.println(blue+"14. Cap-Toe Shoes - $125.00"+reset);
        System.out.println(blue+"15. Ankle Boots - $135.00"+reset);


                    int shoesChoice = scanner.nextInt();
                    System.out.println("Enter the number of the product you want to add to cart (111 -119), 0 to checkout:");
                    switch (shoesChoice)
                        {
                            case 1:
                                cart.addItem(sneakers);
                                break;
                            case 2:
                                cart.addItem(dressShoes);
                                break;
    			            case 3:
                                cart.addItem(boots);
                                break;
    			            case 4:
                                cart.addItem(loafers);
                                break;
    			            case 5:
                                cart.addItem(sandals);
                                break;
    			            case 6:
                                cart.addItem(slipOns);
                                break;
    		            	case 7:
                                cart.addItem(flipFlops);
                                break;
    			            case 8:
                                cart.addItem(formalShoes);
                                break;
    			            case 9:
                                cart.addItem(brogues);
                                break;
    			            case 10:
                                cart.addItem(wingtips);
                                break;
                            case 11:
                                cart.addItem(hikingBoots);
                                break;
                            case 12:
                                cart.addItem(moccasins);
                                break;
    			            case 13:
                                cart.addItem(highTopSneakers);
    
                                break;
    		             	case 14:
                                cart.addItem(capToeShoes);
                                break;
    			             case 15:
                                cart.addItem(ankleBoots);
                                break;
                            default:
                                System.out.println(RED+"Invalid shoes choice!"+reset);
                        }break;
                    
                case 116:
                         System.out.println(blink+yellow+"Select type of T-shirts:"+reset); 
        System.out.println(green+"1. Crewneck - $115.00"+reset);
        System.out.println(green+"2. V neck - $118.00"+reset);
        System.out.println(green+"3. Henley - $212.00"+reset);
        System.out.println(green+"4. Polo - $251.00"+reset);
        System.out.println(green+"5. Long sleeve - $201.00"+reset);
        System.out.println(green+"6. Tank Tops - $112.00"+reset);
        System.out.println(green+"7. Graphic - $117.00"+reset);
        



                          
                    int TshirtsChoice = scanner.nextInt();
                    System.out.println("Enter the number of the product you want to add to cart (111 -119), 0 to checkout:");
                    switch (TshirtsChoice) 
                        {   
                            case 1:
                                cart.addItem( crewneck);
                                break;
                            case 2:
                                cart.addItem(vneck);
                                break;
            			    case 3:
                                cart.addItem(henley);
                                break;
            			    case 4:
                                cart.addItem(polo);
                                break;
            			    case 5:
                               cart.addItem(longSleeve);
                                break;
            			    case 6:
                                cart.addItem(tankTops);
                                break;
            			    case 7:
                                cart.addItem(graphic);
                                break;
            			    default:
                                System.out.println(RED+"Invalid Tshirtschoice!"+reset);
                        }break;
		        case 117:
		        System.out.println(blink+yellow+"\nSelect type of hoodies:"+reset);
        System.out.println(dark_blue+"1. Pullover Hoodies - $345.00"+reset);
        System.out.println(dark_blue+"2. Zip-Up Hoodies - $440.00"+reset);
        System.out.println(dark_blue+"3. Graphic Print Hoodies - $445.00"+reset);
        System.out.println(dark_blue+"4. Plain Hoodies - $430.00"+reset);
        


                
			        int hoodiesChoice = scanner.nextInt();
			        System.out.println("Enter the number of the product you want to add to cart (111 -119), 0 to checkout:");
                    switch (hoodiesChoice) 
                        {
                            case 1:
                                cart.addItem(pulloverHoodie);
                                break;
                            case 2:
                                cart.addItem(zipUpHoodie);
                                break;
    			             case 3:
                                cart.addItem(graphicPrintHoodie);
                                    break;
    			                 case 4:
                                cart.addItem(plainHoodie);
                                break;
    			                           default:
                                System.out.println(RED+"Invalid hoodieschoice!"+reset);
                        }break;
                case 118:
	  System.out.println(blink+yellow+"\nSelect type of sweatpants:"+reset);
        System.out.println(purple+"1. Jogger Sweatpants - $365.00"+reset);
        System.out.println(purple+"2. Slim Fit Sweatpants - $438.00"+reset);
        System.out.println(purple+"3. Tapered Sweatpants - $430.00"+reset);
        System.out.println(purple+"4. Fleece Sweatpants - $475.00"+reset);
        System.out.println(purple+"5. Athletic Sweatpants - $142.00"+reset);
        System.out.println(purple+"6. Cargo Sweatpants - $560.00"+reset);
        System.out.println(purple+"7. Drawstring Sweatpants - $430.00"+reset);
        System.out.println(purple+"8. Elastic Waist Sweatpants - $323.00"+reset);
        System.out.println(purple+"9. Lounge Sweatpants - $728.00"+reset);
        System.out.println(purple+"10. Track Sweatpants - $397.00"+reset);   
        
         

                    int sweatpantsChoice = scanner.nextInt();
                    System.out.println("Enter the number of the product you want to add to cart (111 -119), 0 to checkout:");
                    switch (sweatpantsChoice) 
                        {
                            case 1:
                                cart.addItem(joggerSweatpants);
                                break;
                            case 2:
                                cart.addItem(slimFitSweatpants);
                                break;
    			            case 3:
                                cart.addItem(taperedSweatpants);
                                break;
    			            case 4:
                                cart.addItem(fleeceSweatpants);
                                break;
    			            case 5:
                                cart.addItem(athleticSweatpants);
                                break;
    			            case 6:
                                cart.addItem(cargoSweatpants);
                                break;
    			            case 7:
                                cart.addItem(drawstringSweatpants);
                                break;
    			            case 8:
                                cart.addItem(elasticWaistSweatpants);
                                break;
    			            case 9:
                                cart.addItem(loungeSweatpants);
                                break;
    			            case 10:
                                cart.addItem(trackSweatpants);
                                break;
                            default:
                                System.out.println(RED+"Invalid sweatpantschoice!"+reset);
                        }break;

        		case 119:
	        System.out.println(blink+yellow+"Select type of accessories:"+reset);
                  // System.out.println("\nSelect type of accessories:");
        System.out.println(lightblue+"1. Sunglasses - $780.00"+reset);
        System.out.println(lightblue+"2. Watches - $1850.00"+reset);
        System.out.println(lightblue+"3. Belts - $375.00"+reset);
        System.out.println(lightblue+"4. Hats - $2599.00"+reset);
        System.out.println(lightblue+"5. Wallets - $560.00"+reset);
        System.out.println(lightblue+"6. Cufflinks - $600.00"+reset);
        System.out.println(lightblue+"7. Ties - $20.00"+reset);
        System.out.println(lightblue+"8. Scarves - $25.00"+reset);
        System.out.println(lightblue+"9. Gloves - $30.00"+reset);
        System.out.println(lightblue+"10. Bags - $1000.00"+reset);

        
                    int accessoryChoice = scanner.nextInt();
                    System.out.println("Enter the number of the product you want to add to cart (111 -119), 0 to checkout:");
                    switch (accessoryChoice) 
                        {
                            case 1:
                                cart.addItem(sunglasses);
                                break;
                            case 2:
                                cart.addItem(watches);
                                break;
                            case 3:
                                cart.addItem(belts);
                                break;
                            case 4:
                                cart.addItem(hats);
                                break;
                            case 5:
                                cart.addItem(wallets);
                                break;
                            case 6:
                                cart.addItem(cufflinks);
                                break;
                            case 7:
                                cart.addItem(ties);
                                break;
                            case 8:
                                cart.addItem(scarves);
                                break;
                            case 9:
                                cart.addItem(gloves);
                                break;
                            case 10:
                                cart.addItem(bags);
                                break;
                            default:
                                System.out.println(RED+"Invalid accessory choice!"+reset);
                        }break;


                    case 0:
                        break;
                    default:
                        System.out.println(RED+"Invalid choice! \n please choose the given options from the list in the above numbers "+reset);
                }
        } while (choice != 0);
        System.out.println("Enter 1- Main Page \n 2.Billing and Exit  ");
        int a=scanner.nextInt();
        if(a==1)
        {
            os.main(null);
        }
        else if(a==2)
        {
            amount.total_billing();
        }
        
    }
}
class kids
{
	static String red="\u001B[31m";     //unicodes 31 -37 text colors 0 reset 1 bold 5 blink 21 underline
    static String reset="\u001B[0m";    //101-107 background 
    static String under="\u001B[21m";
    static String blink="\u001B[5m";
    static String bold="\u001B[1m";
    static String yellow="\u001B[32m";
    static String green="\u001B[33m";
    static String blue="\u001B[34m";
    static String backred="\u001B[101m";

    static Scanner obj=new Scanner(System.in);
    static double bill=0.0d;
    static kids x=new kids();
    void Clothing()
    {
        double Tops=2000;
        double Bottoms=1500;
        double Outwear=3000;
        double Sleepwear=1000;
        double Activewear=1000;
        double Swimwear=1000;
        double Underwear=1000;
        double Accessories=1000;
        double constumes=1000;
        System.out.println(blue+" 1.Tops=$2000 \n 2.Bottoms=$1500 \n 3.Outwear=$3000 \n 4.Sleepwear=$1000 \n 5.Activewear=$1000 \n 6.Swimwear=$1000 \n 7.Underwear=$1000 \n 8.Accessories=$1000 \n 9.constumes=$1000 "+reset);
	System.out.println(red+yellow+"Enter a Number Which Item You Want to Buy:"+reset);
        int b=Integer.parseInt(obj.nextLine());
        switch (b)
        {
        case 1:
	    System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
            int a=Integer.parseInt(obj.nextLine());
           bill=bill+(Tops*a);
            break;
        case 2:
	    System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
             a=Integer.parseInt(obj.nextLine());
            bill=bill+(Bottoms*a);
            break;
        case 3:
	    System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
             a=Integer.parseInt(obj.nextLine());
            bill=bill+(Outwear*a);
            break;
        case 4:
	    System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
             a=Integer.parseInt(obj.nextLine());
            bill=bill+(Sleepwear*a);
            break;
        case 5:
	    System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
             a=Integer.parseInt(obj.nextLine());
            bill=bill+(Activewear*a);
            break;
        case 6:
	    System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
             a=Integer.parseInt(obj.nextLine());
            bill=bill+(Swimwear*a);
            break;
        case 7:
	    System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
             a=Integer.parseInt(obj.nextLine());
           bill=bill+(Underwear*a);
            break;
        case 8:
	    System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
             a=Integer.parseInt(obj.nextLine());
           bill=bill+(Accessories*a);
            break;
        case 9:
	    System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
             a=Integer.parseInt(obj.nextLine());
           bill=bill+(constumes*a);
            break;
        default :
            System.out.println("You Enter Wrong Value, Please Re-Enter:");
           Clothing();


        }
	System.out.println(backred+bold+green+"If You want want to buy anything in Clothing: "+reset);
        System.out.println("Enter: 0.Exit  \n       1-Re Buy \n");
        int c=Integer.parseInt(obj.nextLine());
        if(c==1)
        {
            Clothing();
        }
        else if(c==2)
            kids.main(null);
    }
    void Footwear()
    {
        double Sneakers=3000;
        double Sandals=2000;
        double  Boots=3600;
        double Dress_shoes=2400;
        double Casual_shoes=2100;
        double Sports_shoes=3600;
        double Slippers=1500;
        System.out.println(yellow+" 1.Sneakers=$3000 \n 2.Sandals=$20000 \n 3.Boots=$3600 \n 4.Dres shoes=$2400 \n 5.Casual shoes=$2100\n 6.Sports shoes=$3600 \n 7.Slippers=$1500"+reset);
	System.out.println(red+yellow+"Enter a Number Which Item You Want to Buy:"+reset);
        int c=Integer.parseInt(obj.nextLine());
        switch(c)
        {
            case 1:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                int b=Integer.parseInt(obj.nextLine());
              bill=bill+Sneakers*b;
                break;
            case 2:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                 b=Integer.parseInt(obj.nextLine());
                bill=bill+Sandals*b;
                break;
            case 3:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                 b=Integer.parseInt(obj.nextLine());
                bill=bill+Boots*b;
                break;
            case 4:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                bill=bill+Dress_shoes*b;
                break;
             case 5:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                bill=bill+Casual_shoes*b;
                break;
             case 6:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                bill=bill+Sports_shoes*b;
                break;
             case 7:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                bill=bill+Slippers*b;
                break;
             default:
                System.out.println("Please Enter Current Number:");
                Footwear();
        }
	System.out.println(backred+bold+green+"If You want want to buy anything in Footwear: "+reset);
        System.out.println("Enter: 0.Exit \n       1-Re Buy ");
        int b=Integer.parseInt(obj.nextLine());
        if(b==1)
        {
            Footwear();
        }
        else if(b==2)
            kids.main(null);
    }
    void Toys_and_Games()
    {
        double Dolls=2500; 
        double Action_figures=2400;
        double Stuffed_animals=3000;
        double Board_games=2400;
        double Puzzles=1000;
        double Building_blocks=3000;
        double Outdoor_toys=3000;
        System.out.println(green+" 1.Dolls=$2500 \n 2.Action figures=$2400 \n 3.Stuffed=$3000 \n 4.Board games=$2400 \n 5.Puzzles=$1000 \n 6.Building blocks=$3000 \n 7.Outdoor toys=$3000"+reset);
	System.out.println(red+yellow+"Enter a Number Which Item You Want to Buy:"+reset);
        int c=Integer.parseInt(obj.nextLine());
        switch(c)
        {
            case 1:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                int b=Integer.parseInt(obj.nextLine());
                bill=bill+Dolls*b;
                break;
            case 2:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                 b=Integer.parseInt(obj.nextLine());
                bill=bill+Action_figures*b;
                break;
            case 3:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                 b=Integer.parseInt(obj.nextLine());
                bill=bill+Stuffed_animals*b;
                break;
            case 4:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                bill=bill+Board_games*b;
                break;
            case 5:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                bill=bill+Puzzles*b;
                break;
            case 6:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                bill=bill+Building_blocks*b;
                break;
            case 7:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                bill=bill+Outdoor_toys*b;
                break;
            default:
                System.out.println("Please Enter Current Number:");
                Toys_and_Games();
        }
	System.out.println(backred+bold+green+"If You want want to buy anything in Toys_and_Games: "+reset);
        System.out.println("Enter: 0.Exit \n       1-Re Buy \n");
        int b=Integer.parseInt(obj.nextLine());
        if(b==1)
        {
            Toys_and_Games();
        }
        else if(b==2)
            kids.main(null);
        
    }
    void Baby_Gear()
    {
        double Strollers=60000;
        double Car_seats=36000;
        double Baby_carriers=18000;
        double High_chairs=18000;
        double Baby_monitors=24000;
        double Diaper_bags=15000;
        double Swaddles_and_blankets=3000;
        System.out.println(blue+" 1.Strollers=$60000 \n 2.Car seats=$36000 \n 3.Baby carriers=$18000 \n 4.High chairs=$18000 \n 5.Baby monitors=$24000 \n 6.Diaper bags=$15000 \n 7.Swaddles and blankets=$3000"+reset);
	System.out.println(red+yellow+"Enter a Number Which Item You Want to Buy:"+reset);
        int c=Integer.parseInt(obj.nextLine());
        switch(c)
        {
            case 1:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                int b=Integer.parseInt(obj.nextLine());
                bill=bill+Strollers*b;
                break;
            case 2:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                 b=Integer.parseInt(obj.nextLine());
                bill=bill+Car_seats*b;
                break;
            case 3:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Baby_carriers*b;
                break;
            case 4:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                bill=bill+High_chairs*b;
                break;
            case 5:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                bill=bill+Baby_monitors*b;
                break;
            case 6:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                bill=bill+Diaper_bags*b;
                break;
            case 7:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Swaddles_and_blankets*b;
                break;
             default:
                System.out.println("Please Enter Current Number:");
                Baby_Gear();
        }
	System.out.println(backred+bold+green+"If You want want to buy anything in Baby_Gear: "+reset);
        System.out.println("Enter: 0.Exit \n       1-Re Buy \n  ");
        int b=Integer.parseInt(obj.nextLine());
        if(b==1)
        {
            Baby_Gear();
        }
        else if(b==2)
            kids.main(null);
    }
    void Nursery_and_Decor()
    {
        double Cribs=30000;
        double Changing_tables=12000;
        double Nursery_bedding_sets=6000;
        double Wall_decals=1800;
        double Lamps=3000;
        double Storage_bins=4000;
        double Rocking_chairs=14000;
        System.out.println(green+red+" 1.Cribs=$30000 \n 2.Changing tables=$12000 \n 3.Nursery bedding sets=$6000 \n 4.Wall decals=$1800 \n 5.Lamps=$3000 \n 6.Storage bins=$4000 \n 7.Rocking chairs=$14000"+reset);
	System.out.println(red+yellow+"Enter a Number Which Item You Want to Buy:"+reset);
        int c=Integer.parseInt(obj.nextLine());
        switch(c)
        {
            case 1:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                int b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Cribs*b;
                break;
            case 2:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Changing_tables*b;
                break;
            case 3:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Nursery_bedding_sets*b;
                break;
            case 4:
                //System.out.println("Enter Quantinty:");
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Wall_decals*b;
                break;
            case 5:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Lamps*b;
                break;
            case 6:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Storage_bins*b;
                break;
            case 7:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Rocking_chairs*b;
                break;
             default:
                System.out.println("Please Enter Current Number:");
                Nursery_and_Decor();
        }
	System.out.println(backred+bold+green+"If You want want to buy anything in Nursery_and_Decor "+reset);
        System.out.println("Enter: 0.Exit \n       1-Re Buy \n");
        int b=Integer.parseInt(obj.nextLine());
        if(b==1)
        {
            Nursery_and_Decor();
        }
        else if(b==2)
            kids.main(null);
    }
    void Health_and_Safety()
    {
        
        double Thermometers=3000;
        double Baby_proofing_equipment =1500;
        double First_aid_kits=3000;
        double Humidifiers=2000;
        double Baby_gates=6000;
        double Baby_tracking=24000;
        System.out.println(blue+" 1.Thermometers=$3000 \n 2.Baby proofing equipment=$1500 \n 3.Firstaid kits=$3000 \n 4.Humidifiers=$2000 \n 5.Baby gates=$6000 \n 6.Baby tracking=$24000"+reset);
	System.out.println(red+yellow+"Enter a Number Which Item You Want to Buy:"+reset);
        int c=Integer.parseInt(obj.nextLine());
        switch(c)
        {
            case 1:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                int b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Thermometers*b;
                break;
            case 2:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Baby_proofing_equipment*b;
                break;
            case 3:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+First_aid_kits*b;
                break;
            case 4:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Humidifiers*b;
                break;
            case 5:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Baby_gates*b;
                break;
            case 6:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Baby_tracking*b;
                break;
             default:
                System.out.println("Please Enter Current Number:");
              Health_and_Safety();
        }
	System.out.println(backred+bold+green+"If You want want to buy anything in Health_and_Safety: "+reset);
        System.out.println("Enter: 0.Exit \n       1-Re Buy \n       ");
        int b=Integer.parseInt(obj.nextLine());
        if(b==1)
        {
            Health_and_Safety();
        }
        else if(b==2)
            kids.main(null);
    }
    void Feeding_and_Nursing()
    {
        
        double Bottles=1800;
        double Breast_pumps=12000;
        double Nursing_pillows=3000;
        double Bottle_warmers=3000;
        double Bibs=1000;
        double High_chairs=18000;
        double Baby_food_makers=15000;
        System.out.println(yellow+" 1.Bottles=$1800 \n 2.Breast pumps=$12000\n 3.Nursing pillows=$3000 \n 4.Bottle warmers=$3000 \n 5.Bibs=$1000 \n 6.High chairs=$18000 \n 7.Baby food makers=$15000"+reset);
	System.out.println(red+yellow+"Enter a Number Which Item You Want to Buy:"+reset);
        int c=Integer.parseInt(obj.nextLine());
        switch(c)
        {
            case 1:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                int b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Bottles*b;
                break;
            case 2:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Breast_pumps*b;
                break;
            case 3:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Nursing_pillows*b;
                break;
            case 4:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Bottle_warmers*b;
                break;
            case 5:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Bibs*b;
                break;
            case 6:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+High_chairs*b;
                break;
            case 7:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Baby_food_makers*b;
                break;
             default:
                System.out.println("Please Enter Current Number:");
               Feeding_and_Nursing();
        }
	System.out.println(backred+bold+green+"If You want want to buy anything in Feeding_and_Nursing: "+reset);
        System.out.println("Enter: 0.Exit \n       1-Re Buy \n      ");
        int b=Integer.parseInt(obj.nextLine());
        if(b==1)
        {
            Feeding_and_Nursing();
        }
        else if(b==2)
            kids.main(null);
    }
    void Books()
    {
        double Board_books=1200;
        double Picture_books=1500;
        double Educational_toys=3000;
        double Flashcards=2300;
        double Activity_books=2300;
        double Learning_games=2400;
        double Science_kits=3000;
        System.out.println(green+" 1.Board books=$1200 \n 2.Picture book=$1500 \n 3.Educational toys=$3000 \n 4.Flashcards=$2300 \n 5.Activity books=$2300 \n 6.Learning games=$2400 \n 7.Science kits=$3000"+reset);
	System.out.println(red+yellow+"Enter a Number Which Item You Want to Buy:"+reset);
        int c=Integer.parseInt(obj.nextLine());
        switch(c)
        {
            case 1:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                int b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Board_books*b;
                break;
            case 2:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Picture_books*b;
                break;
            case 3:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Educational_toys*b;
                break;
            case 4:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Flashcards*b;
                break;
            case 5:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Activity_books*b;
                break;
            case 6:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Learning_games*b;
                break;
            case 7:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Science_kits*b;
                break;
             default:
                System.out.println("Please Enter Current Number:");
               	Books();
        }
	System.out.println(backred+bold+green+"If You want want to buy anything in Books: "+reset);
        System.out.println("Enter: 0.Exit \n       1-Re Buy \n      ");
        int b=Integer.parseInt(obj.nextLine());
        if(b==1)
        {
           Books();
        }
        else if(b==2)
            kids.main(null);
        
    }
    void School_Supplies()
    {
        
        double Backpacks=2400;
        double Lunch_boxes=300;
        double Notebooks=600;
        double Pencils=200;
        double Crayons=300;
        double Markers=400;
        double Calculators=500;
        System.out.println(yellow+" 1.Backpacks=$2400 \n 2.Lunch boxes=$300 \n 3.Notebooks=$600 \n 4.Pencils=$200 \n 5.Crayons=$300 \n 6.Markers=$400 \n 7.Calculators=$500"+reset);
	System.out.println(red+yellow+"Enter a Number Which Item You Want to Buy:"+reset);
        int c=Integer.parseInt(obj.nextLine());
        switch(c)
        {
            case 1:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                int b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Backpacks*b;
                break;
            case 2:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Lunch_boxes*b;
                break;
            case 3:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Notebooks*b;
                break;
            case 4:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Pencils*b;
                break;
            case 5:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Crayons*b;
                break;
            case 6:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Markers*b;
                break;
            case 7:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Calculators*b;
                break;
             default:
                System.out.println("Please Enter Current Number:");
                School_Supplies();
        }
	System.out.println(backred+bold+green+"If You want want to buy anything in School_Supplies: "+reset);
        System.out.println("Enter: 0.Exit \n       1-Re Buy \n      ");
        int b=Integer.parseInt(obj.nextLine());
        if(b==1)
        {
            School_Supplies();
        }
        else if(b==2)
            kids.main(null);
    }
    void Sports_and_Outdoor_Equipment()
    {
        
        double Soccer_balls=2000;
        double Baseball_gloves=20000;
        double Bicycles=12000;
        double Roller_skates=6000;
        double Scooters=25000;
        double Swimming_goggles=5000;
        double Playsets=15000;
        System.out.println(green+" 1.Soccer balls=$2000 \n 2.Baseball gloves=$20000 \n 3.Bicycles=$12000 \n 4.Roller skates=$6000 \n 5.Scooters=$25000 \n 6.Swimming goggles=$5000 \n 7.Playsets=$15000"+reset);
	System.out.println(red+yellow+"Enter a Number Which Item You Want to Buy:"+reset);
        int c=Integer.parseInt(obj.nextLine());
        switch(c)
        {
            case 1:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                int b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Soccer_balls*b;
                break;
            case 2:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Baseball_gloves*b;
                break;
            case 3:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Bicycles*b;
                break;
            case 4:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Roller_skates*b;
                break;
            case 5:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Scooters*b;
                break;
            case 6:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Swimming_goggles*b;
                break;
            case 7:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Playsets *b;
                break;
             default:
                System.out.println("Please Enter Current Number:");
               	Sports_and_Outdoor_Equipment();
        }
	System.out.println(backred+bold+green+"If You want want to buy anything in Sports_and_Outdoor_Equipment: "+reset);
        System.out.println("Enter: 0.Exit \n       1-Re Buy \n       ");
        int b=Integer.parseInt(obj.nextLine());
        if(b==1)
        {
            Sports_and_Outdoor_Equipment();
        }
        else if(b==2)
            kids.main(null);
    }
    void Electronics_and_Gadgets()
    {
       
        double Tablets=36000;
        double Educational_electronic_toys=15000;
        double Headphones=40000;
        double Gaming_consoles=60000;
        double Digital_cameras=60000;
        double Smartwatches=24000;
        double Interactive_learning_devices=30000;
        System.out.println(yellow+" 1.Tablets=$36000 \n 2.Educational electronic toys=$15000 \n 3.Headphones=$40000 \n 4.Gaming consoles=$60000  \n 5.Digital cameras=$60000 \n 6.Smartwatches=$24000 \n 7.Interactive learning devices=$30000"+reset);
	System.out.println(red+yellow+"Enter a Number Which Item You Want to Buy:"+reset);
        int c=Integer.parseInt(obj.nextLine());
        switch(c)
        {
            case 1:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                int b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Tablets*b;
                break;
            case 2:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Educational_electronic_toys*b;
                break;
            case 3:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Headphones*b;
                break;
            case 4:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Gaming_consoles*b;
                break;
            case 5:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Digital_cameras*b;
                break;
            case 6:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Smartwatches*b;
                break;
            case 7:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Interactive_learning_devices*b;
                break;
             default:
                System.out.println("Please Enter Current Number:");
               	Electronics_and_Gadgets();
        }
	System.out.println(backred+bold+green+"If You want want to buy anything in Electronics_and_Gadgets: "+reset);
        System.out.println("Enter: 0.Exit \n       1-Re Buy \n  ");
        int b=Integer.parseInt(obj.nextLine());
        if(b==1)
        {
           Electronics_and_Gadgets();
        }
        else if(b==2)
            kids.main(null);
        
    }
    void Party_Supplies()
    {
       
        double Decorations=1800;
        double Party_favors=600;
        double Tableware=1000;
        double Pinatas=3000;
        double Costumes=3000;
        double Invitations=2000;
        double Cake_toppers=1000;
        System.out.println(green+" 1.Decorations(balloons,banners)=$1800 \n 2.Party favors=$600 \n 3.Tableware(plates,cups,napkins)=$1000 \n 4.Pinatas=$3000 \n 5.Costumes=$3000 \n 6.Invitations=$2000 \n 7.Cake toppers=$1000"+reset);
	System.out.println(red+yellow+"Enter a Number Which Item You Want to Buy:"+reset);
        int c=Integer.parseInt(obj.nextLine());
        switch(c)
        {
            case 1:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                int b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Decorations*b;
                break;
            case 2:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Party_favors*b;
                break;
             case 3:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Tableware*b;
                break;
             case 4:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Pinatas*b;
                break;
             case 5:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Costumes*b;
                break;
             case 6:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Invitations*b;
                break;
             case 7:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Cake_toppers*b;
                break;
              default:
                System.out.println("Please Enter Current Number:");
               	Party_Supplies();
        }
	System.out.println(backred+bold+green+"If You want want to buy anything in Party_Supplies: "+reset);
        System.out.println("Enter: 0.Exit \n       1-Re Buy \n       ");
        int b=Integer.parseInt(obj.nextLine());
        if(b==1)
        {
           Party_Supplies();
        }
        else if(b==2)
            kids.main(null);
        
    }
    void Personal_Care_and_Hygiene()
    {
       
        double Babyshampoo_and_bodywash=450;
        double Babylotion=900;
        double Toothbrushes=500;
        double Hairbrushes=500;
        double Nail_clippers=200;
        double Bath_toys=500;
        double Hand_sanitizers=230;
        System.out.println(" 1.Babyshampoo and bodywash=$450 \n 2.Babylotion=$900  \n 3.Toothbrushes=$500 \n 4.Hairbrushes=$500\n 5.Nail clippers=$200 \n 6.Bath toys=$500 \n 7.Hand sanitizers=$230");
	System.out.println(red+yellow+"Enter a Number Which Item You Want to Buy:"+reset);
        int c=Integer.parseInt(obj.nextLine());
        switch(c)
        {
            case 1:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                int b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Babyshampoo_and_bodywash*b;
                break;
            case 2:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Babylotion*b;
                break;
            case 3:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Toothbrushes*b;
                break;
            case 4:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Hairbrushes*b;
                break;
            case 5:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Nail_clippers*b;
                break;
            case 6:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Bath_toys*b;
                break;
            case 7:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Hand_sanitizers*b;
                break;
             default:
                System.out.println("Please Enter Current Number:");
               	Personal_Care_and_Hygiene();
        }
	System.out.println(backred+bold+green+"If You want want to buy anything in Personal_Care_and_Hygiene: \nEnter: "+reset);
        System.out.println("Enter: 0.Exit \n       1-Re Buy \n       ");
        int b=Integer.parseInt(obj.nextLine());
        if(b==1)
        {
           Personal_Care_and_Hygiene();
        }
        else if(b==2)
            kids.main(null);
        
    }
    void Special_Occasion_Clothing()
    {
       
        double Formal_dresses=6000;
        double Suits_and_ties=9000;
        double Holiday_themed_outfits=4000;
        double Flower_girl_dresses=3000;
        double Ring_bearer_suits=2000;
        double Baptism_outfits=20000;
        double Communion_dresses_or_suits=23000;
        System.out.println(blue+" 1.Formal dresses=$6000 \n 2.Suits and ties=$9000 \n 3.Holiday themed outfits=$4000 \n 4.Flower girl dresses=$3000 \n 5.Ring bearer suits=$2000 \n 6.Baptism outfits=$20000 \n 7.Communion dresses or suits=$23000"+reset);
	System.out.println(red+yellow+"Enter a Number Which Item You Want to Buy:"+reset);
        int c=Integer.parseInt(obj.nextLine());
        switch(c)
        {
            case 1:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                int b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Formal_dresses*b;
                break;
            case 2:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Suits_and_ties*b;
                break;
            case 3:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                 b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Holiday_themed_outfits*b;
                break;
            case 4:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Flower_girl_dresses*b;
                break;
            case 5:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Ring_bearer_suits*b;
                break;
            case 6:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Baptism_outfits*b;
                break;
            case 7:
	    	System.out.println(blue+bold+green+"Enter Quantinty :"+reset);
                b=Integer.parseInt(obj.nextLine());
                this.bill=this.bill+Communion_dresses_or_suits*b;
                break;
             default:
                System.out.println("Please Enter Current Number:");
               	Special_Occasion_Clothing();
        }
	System.out.println(backred+bold+green+"If You want want to buy anything in Special_Occasion_Clothing: "+reset);
        System.out.println("Enter: 0.Exit \n       1-Re Buy \n       ");
        int b=Integer.parseInt(obj.nextLine());
        if(b==1)
        {
           Special_Occasion_Clothing();
        }
        else if(b==2)
            kids.main(null);
        
    }
    public static void main (String[] args) 
    {
System.out.println(blue+"		##  ##     ####   ######    ##### "); 
System.out.println(green+"		## ##      ####   #######  #######");  
System.out.println(red+" 		                        #           ");
System.out.println(yellow+"		####        ##    ##   ##  ######   ");
System.out.println(red+"		## ##       ##    ##   ##       ##  ");
System.out.println(green+"		##  ##     ####   #######  #######  ");
System.out.println(blue+"		##   ##    ####   ######    #####   \n"+reset);
  
                                  


        
        System.out.println(green+" 1.Clothing and Apparel\n 2.Shoes and Footwear\n 3.Toys and Games\n 4.Baby Gear and Essentials \n 5.Nursery and Decor");
        System.out.println(" 6.Health and Safety\n 7.Feeding and Nursing\n 8.Books and Educational Materials\n 9.School Supplies\n 10.Sports and Outdoor Equipment");
        System.out.println(" 11.Electronics and Gadgets\n 12.Party Supplies\n 13.Personal Care and Hygiene\n 14.Special Occasion Clothing\n 15.Exit.");
        //System.out.print("Enter a Number Which Item You Want to Buy:");
	System.out.println(red+"Enter a Number Which Item You Want to Buy:"+reset);
        int b=Integer.parseInt(obj.nextLine());
        
        switch(b)
        {
            case 1:
                x.Clothing();
                break;
            case 2:
                x.Footwear();
                break;
            case 3:
                x.Toys_and_Games();
                break;
            case 4:
                x.Baby_Gear();
                break;
            case 5:
                x.Nursery_and_Decor();
                break;
            case 6:
                x.Health_and_Safety();
                break;
            case 7:
                x.Feeding_and_Nursing();
                break;
            case 8:
                x.Books();
                break;
            case 9:
                x.School_Supplies();
                break;
            case 10:
                x.Sports_and_Outdoor_Equipment();
                break;
            case 11:
                x.Electronics_and_Gadgets();
                break;
            case 12:
                x.Party_Supplies();
                break;
            case 13:
                x.Personal_Care_and_Hygiene();
                break;
            case 14:
                x.Special_Occasion_Clothing();
                break;
             case 15:
                 break;
            default:
            System.out.println(blue+"You Enter Wrong Value, Please Re-Enter:"+reset);
            main(null);
        }
	while(true)
	{
        System.out.println("Enter 1.Re Buy from This Section\n 2.Exit From Online Shopping And Billing \n 3.Main Page");
        int a=obj.nextInt();
        if(a==1)
        {
            kids.main(null);
        }
        else if(a==2)
        {
            amount.total_billing();
        }
        else if(a==3)
        {
            os.main(null);
        }
	else
		
		System.out.println("Invalid Input, Try Again");
	}
    }
}
class amount extends unicodes
{
    static void total_billing()
    {
    double a=0;
	Scanner sc=new Scanner(System.in);
	if(WomensClothing.bill!=0)
	{
		System.out.println("Womens Clothing Bill="+WomensClothing.bill);
	a+=WomensClothing.bill;
	}
        if(Main.bill!=0)
        {
            System.out.println("Home Appliences Bill="+Main.bill);
            a+=Main.bill;
            
      	}
        if(GirlsClothing.bill!=0)
        {
            System.out.println("Girls Clothing Bill="+GirlsClothing.bill);
            a+=GirlsClothing.bill;
        }
	double d =OnlineShopping.cart.getTotalPrice();
        if(d!=0)
        {
            System.out.println("Mens Bill="+d);
            a+=d;
        }
	if(kids.bill!=0)
	{
		System.out.println("Kids Section Bill="+kids.bill);
            	a+=kids.bill;
	}
	if(a!=0)
	{
	System.out.println("Total Bill="+a);
	System.out.println("Enter Your Delivery Address:");
	System.out.print("\nEnter Your Dore No:");
	String h=sc.nextLine();
	System.out.print("\nEnter Your Road No:");
	String r=sc.nextLine();
	System.out.print("\nEnter Your city/village Name:");
	String p=sc.nextLine();
	while(true)
	{
	System.out.print("\nEnter Your Pincode:");
	int c=sc.nextInt();
	String k="";
	
	k=""+c;
	if(k.length()==6)
	{
		break;
	}
	else
	{
	System.out.println("Enter 6 digit number");
	}
	
	}
	
	System.out.print("\nEnter Your State:");
	String state=sc.nextLine();
	payment.payment_bill();
	int k=(int)(Math.random()*5)+5;
	System.out.println("Your Order Will be in "+k+" Days comes to Your Address");
	System.out.println("Please Give Feed Back / Suggestions");
	String st=sc.nextLine();
	System.out.println("Your Order Will be in "+k+" Days comes to Your Address");
	System.out.println(green+""+reset);
	System.out.println(blink+green+":::==== :::  === :::====  :::= === :::  === ::: === :::====  :::  ===      :::===== :::====  :::====       :::===  :::  === :::====  :::====  :::====  ::: :::= === :::=====       :::  ===  === ::: :::==== :::  ===      :::  === :::=== "); 
 	System.out.println(blink+":::==== :::  === :::  === :::===== ::: ===  ::: === :::  === :::  ===      :::      :::  === :::  ===      :::     :::  === :::  === :::  === :::  === ::: :::===== :::            :::  ===  === ::: :::==== :::  ===      :::  === :::    ");  
 	System.out.println(blink+green+"  ===   ======== ======== ======== ======    =====  ===  === ===  ===      ======   ===  === =======        =====  ======== ===  === =======  =======  === ======== === =====      ===  ===  === ===   ===   ========      ===  ===  ===== ");
 	System.out.println(blink+"  ===   ===  === ===  === === ==== === ===    ===   ===  === ===  ===      ===      ===  === === ===           === ===  === ===  === ===      ===      === === ==== ===   ===       ===========  ===   ===   ===  ===      ===  ===     ===");
 	System.out.println(blink+green+"  ===   ===  === ===  === ===  === ===  ===   ===    ======   ======       ===       ======  ===  ===      ======  ===  ===  ======  ===      ===      === ===  ===  =======         ==== ====   ===   ===   ===  ===       ======  ====== "+reset);
        System.out.println();
	System.out.println();
	System.out.println(bold+skyblue+blink+"*@@@@*   *@@@**@@@@* m@***@m@*@@@@*@@@**@@**@@@           @@        mm@***@m@       @@      *@@@@**@@@m   *@@@*"+reset);
	System.out.println(blink+"  *@@     m@    @@  m@@    *@  @@  @*   @@   *@          m@@m     m@@*     *@      m@@m       @@    @@@m    @"+reset);
	System.out.println(bold+skyblue+blink+"   @@m   m@     @@  *@@@m      @@       @@              m@*@@!    @@*       *     m@*@@!      @@    @ @@@   @"+reset);
	System.out.println(blink+"    @@m  @*     @@    *@@@@@m  @@       !@             m@  *@@    @!             m@  *@@      @@    @  *@@m @"+reset);
	System.out.println(bold+skyblue+blink+"    *!@ !*      @!        *@@  @!       !@             @@@!@!@@   @!m    *@@@@   @@@!@!@@     @!    @   *@@m!"+reset);
	System.out.println(blink+"     !@@m       @!  @@     @@  @!       !@            !*      @@  *!@m     @@   !*      @@    @!    !     !@!"+reset);
	System.out.println(bold+skyblue+blink+"     !! !*      !!  !     *@!  !!       !@             !!!!@!!@   !!!    *!@!!   !!!!@!!@     !!    !   *!!!!"+reset);
	System.out.println(blink+"     !!::       :!  !!     !!  :!       !!            !*      !!  *:!!     !!   !*      !!    :!    !     !!!  "+reset);
	}
	
	

}
    
}
class payment extends unicodes
{
    static Scanner obj=new Scanner(System.in);
    static String s="";
     static void pay_by_phonepe()
     {
	System.out.println(red+bold+"--------------------------------PHONE PE------------------------------------");
         System.out.println(red+yellow+"Enter Your  UPI ID:"+reset);
         String phonePeId = obj.next();
         while(true)
         {
             System.out.print(blue+"Enter Your 4 Digit UPI PIN:"+reset);
             int a=obj.nextInt();
             s=""+a;
             if(s.length()==4)
             {
                 System.out.println(green+"Payment Success Full"+reset);
                 break;
             }
             else
             {
                 System.out.println(red+"UPI ID MUST CUNTAIN 4 DIGITS"+reset);
             }
             
         }
     }
     static  boolean expiry_date()
    {
        int a=0;
        while(true)
        {
            System.out.print(red+yellow+"Enter Your Expiry Month(MM):"+reset);
            String b=obj.nextLine();
            s=""+b;
            if(s.length()==2)
            {
                a++;
                System.out.print(red+green+"Enter Your Expiry Year(YYYY):"+reset);
                b=obj.next();
                s=""+b;
                if(s.length()==4)
                {
                    a++;
		    break;
                }
                break;
            }
            
        else
        {
            System.out.println(red+"Re Enter The Details"+reset);
            
        }
        }
    if(a==2)
        return true;
    else    
        return false;
        
    }

    static void pay_by_googlepay()
     {
	System.out.println(green+bold+"--------------------------------GOOGLE PAY------------------------------------");
         System.out.print(blue+"Enter Your  UP ID:"+reset);
         String phonePeId = obj.next();
         while(true)
         {
             System.out.print(yellow+"Enter Your 4 Digit UPI PIN:"+reset);
             int a=obj.nextInt();
              s=""+a;
             if(s.length()==4)
             {
                 System.out.println(green+"Payment Success Full"+reset);
                 break;
             }
             else
             {
                 System.out.println(red+"UPI ID MUST CUNTAIN 4 DIGITS"+reset);
             }
             
         }
     }
     static boolean cvv()
     {
         String a=obj.next();
         s=""+a;
         if(s.length()==3)
         {
             return true;
             
         }
         return false;
     }
     static int generateOTP() 
    {
    
        int otp = (int) ((Math.random() * 900000) + 100000);
        System.out.print("Your OTP= "+otp);
        return otp;
    }
     static void pay_by_card()
     {
	System.out.println(green+bold+"--------------------------------DEBIT CARD------------------------------------");
         while(true)
         {
         System.out.print(blue+"Enter Your 16 Digit Card Number: "+reset);
         long a=obj.nextLong(),c=0;
         s=""+a;
         
         if(s.length()==16)
         {
             c++;
             System.out.print(yellow+"Enter Your CVV Number:"+reset);
             if(cvv())
             {
                 c++;
                 while(true)
                 {
                 if(expiry_date())
                 {
                     c++;
                     while(true)
                     {
                     int v=generateOTP();
                     System.out.print("\n Enter OTP: ");
                     if(v==obj.nextInt())
                     {
                         c++;
                         System.out.println("Payment Success Full");
                         break;
                     }
                     else
                     {
                         System.out.println("Invalid OTP");
                     }
                     }
                     break;
                 }
                 }
             }
             if(c==4)
             {
                 break;
             }
         }
         else
         {
             System.out.println("CARD NUMBER MUST CUNTAIN 16 DIGITS");
         }
         }
     }
    
    static void payment_bill()
    {
        while(true)
        {
        System.out.println("Enter 1: Cash On Delivery \n 2.Phone Pe \n 3.Google Pay \n 4.Card");
        System.out.print("Enter Your Chioce: ");
        int a=obj.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Cash on Delivery selected. Payment will be made upon delivery.");
                break;
            case 2:
                pay_by_phonepe();
                break;
            case 3:
                pay_by_phonepe();
                break;
            case 4:
                pay_by_card();
                break;
            default:
                System.out.println("Please choose Current Option");
                break;
            
        }
        if(a>=1 && a<=4)
            break;
        
        
    }
    }
    
	
	

}
