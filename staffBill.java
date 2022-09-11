
public class staffBill extends Bill{

   



    public void order() {
   
        while(true){
 
            System.out.println(" Enter your option");
            choice = Sc.nextInt();
            switch(choice) 
            {
                case 1://ugaliBeef
                System.out.println(" You have selected Ugali Beef");
                System.out.println();
                System.out.println(" Enter your desired quantity");
                quantity=Sc.nextInt();
                total = total + quantity*ugaliBeef;

                    break;

                case 2://mcheleBeef
                System.out.println(" You have selected Mchele Beef");
                System.out.println();
                System.out.println(" Enter your desired quantity");
                quantity=Sc.nextInt();
                total = total + quantity*mcheleBeef;

                    break;

                case 3://chapoBeans
                System.out.println(" You have selected Chapo Beans");
                System.out.println();
                System.out.println(" Enter your desired quantity");
                quantity=Sc.nextInt();
                total = total + quantity*chapoBeans;
                
                    break;

                case 4://fries
                System.out.println(" You have selected Fries");
                System.out.println();
                System.out.println(" Enter your desired quantity");
                quantity=Sc.nextInt();
                total = total + quantity*fries;
                
                    break;

                case 5://ugaliFish
                System.out.println(" You have selected Ugali Fish");
                System.out.println();
                System.out.println(" Enter your desired quantity");
                quantity=Sc.nextInt();
                total = total + quantity*ugaliFish;
                    
                    break;

                case 6://ugaliKuku
                System.out.println(" You have selected Ugali Kuku");
                System.out.println();
                System.out.println(" Enter your desired quantity");
                quantity=Sc.nextInt();
                total = total + quantity*ugaliKuku;
                        
                    break;
                    
                case 7://mcheleKuku
                System.out.println(" You have selected Mchele Kuku");
                System.out.println();
                System.out.println(" Enter your desired quantity");
                quantity=Sc.nextInt();
                total = total + quantity*mcheleKuku;
                        
                    break;

                case 8://exit
                System.exit(1);
                break;



                default:
                    break;
            }

            System.out.println(" Enter your desired quantity");
            System.out.print(" Do you wish to make another order?(Y/N):");
            extraOrder=Sc.next();
            if(extraOrder.equalsIgnoreCase("Y"))
            {order();}
            else if(extraOrder.equalsIgnoreCase("N"))
            {generateBill();
            System.exit(1);}
            else{System.out.println("Invalid choice in your selection!");}
            
            
        }


    }
    
}
