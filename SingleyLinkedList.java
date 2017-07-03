import java.util.Scanner;



public class SingleyLinkedList {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		linkedList ll=new linkedList();
		
		System.out.println("\nSingly Linked List Test\n");
		
		char ch;
		
		do
		{
			System.out.println("Singly Linked List Operation");
			System.out.println("1.Insert at Begining ");
			System.out.println("2.Insert at End ");
			System.out.println("3.Insert at Position ");
			System.out.println("4.Delete at Position ");
			System.out.println("5.Check Empty ");
			System.out.println("6.Get Size ");
			int choice =scan.nextInt();
			
			switch(choice)
			{
				case 1:	System.out.println("Enter element to insert");
						ll.insertAtStart(scan.nextInt());
						break;
				case 2:	System.out.println("Enter element to insert");
						ll.insertAtStart(scan.nextInt());
						break;
				case 3:	System.out.println("Enter element to insert");
						int num=scan.nextInt();
						System.out.println("Enter the position");
						int pos=scan.nextInt();
						if(pos<=1||pos> ll.getSize())
						{
							System.out.println("Invalid Position");
							
						}
						else
						{
							ll.insertAtpos(num, pos);
						}
						 break;
				case 4:System.out.println("Enter the position");
					   int p=scan.nextInt();	
					   if(p<=1 || p> ll.getSize())
						{
							System.out.println("Invalid Position");
							
						}
						else
						{
							ll.deleteAtPos(p);
						}
					   break;
				case 5:System.out.println("Empty status = "+ ll.isEmpty());
                	   break;
				case 6:System.out.println("Size = "+ ll.getSize() +" \n");
                	   break; 
				default:System.out.println("Wrong Entry \n ");
	                    break; 
				
			}
			ll.display();
			System.out.println("Do u want to continue type y or n \n");
			ch=scan.next().charAt(0);
			
			
		
	}while (ch=='Y' || ch=='y');

}
}

