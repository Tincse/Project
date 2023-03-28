package com.jdbc.studentmgt;
import java.util.Scanner;

import com.jdbc.studentmgt.dao.StudentDAO;
import com.jdbc.studentmgt.daoimpl.StudentDAOImpl;
import com.jdbc.studentmgt.entity.Address;


public class App {

	


	    public static void main( String[] args )
	    {
	    	StudentDAO sdao=new StudentDAOImpl();
	    	Address add=new Address();
	    	
	    	char k;
			 do{
	    	System.out.println("1. Create Student");
	    	System.out.println("2. View Student");
	    	System.out.println("3. Update Student");
	    	System.out.println("4. Delete Student");
	    	System.out.println("5. Exit");
	    	
	    	System.out.println("Enter choice :");
	    	Scanner sc=new Scanner(System.in);
	    	int ch=sc.nextInt();
	    	
	    	switch(ch)
	    	{
	    	//insert
	    	case 1:
	    	   
	    		System.out.println("Enter Name :");
	    		String name=sc.next();
	    		System.out.println("Enter contact:");
	    		String contact=sc.next();
	    		System.out.println("Enter the house no:");
	    		int hno=sc.nextInt();
	    		System.out.println("Enter the City name:");
	    		String city=sc.next();
	    		System.out.println("Enter the State:");
	    		String state=sc.next();
	    		System.out.println("Enter the Pin code:");
	    		String pin=sc.next();
	    		add.setHno(hno);
	    		add.setCity(city);
	    		add.setState(state);
	    		add.setPin(pin);
	    		sdao.insertStudent(name,contact,add);
	    		break;
	    	    //view
	    	case 2:
	    		System.out.println("Enter Student Id :");
				int id=sc.nextInt();
				System.out.println(sdao.getStudent(id));
				break;
				
				
				//update
			case 3:
				System.out.println("Enter Id: ");
				id=sc.nextInt();
				System.out.println("Enter name: ");
				name=sc.next();
				System.out.println("Enter contact: ");
				contact=sc.next();
				System.out.println("Enter the house no:");
	    		hno=sc.nextInt();
	    		System.out.println("Enter the City name:");
	    		city=sc.next();
	    		System.out.println("Enter the State:");
	    		state=sc.next();
	    		System.out.println("Enter the Pin code:");
	    		pin=sc.next();
				sdao.updateStudent(id,name,contact,add);
				 break;
			//delete
			case 4: 
				System.out.println("Enter Id ");
				 id=sc.nextInt();
				 sdao.deleteStudent(id);
			System.out.println("Record deleted successfully...");
			break;
	    	 //exit  
	    	case 5:
	    		System.out.println("EXIT.");
	    		System.exit(0);
	    	
	    	}
	    	System.out.println("Do you want to continue Y:y?");
	    	 k=sc.next().charAt(0);
		    	}
				while(k=='Y'|| k=='y');
	        
	               
	    }
	}


