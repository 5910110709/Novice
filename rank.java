import java.util.*;

public class rank 
{
public static void Menu(){
    System.out.println("Select <=");
    System.out.println("press 1. Status");
    System.out.println("press 2. list of items");
    System.out.println("press 3. choose items");
    System.out.println("press 4. my Bag");
    System.out.println();
    
}

    public static void main(String args[]){
        int a ;
        boolean b = true;
        Scanner sp = new Scanner(System.in);
        Novice charactor = new Novice(500,0,400); // create charactor Novic
        Item items = new Item();
        Bag stored = new Bag();
        String c = ""; 
        String d = "";
        
       

    while(b){
        System.out.println("========== Welcome Ranknarok M ==========");
        System.out.println(">>1 Farm");
        System.out.println(">>2 Shop");
        a = sp.nextInt();
        sp.nextLine();
        if(a == 1){
        while(b){
            System.out.println("press 1: Attack Mini monsters");
            System.out.println("press 2: Attack Boss");
            a = sp.nextInt();
            sp.nextLine();
            if(a == 1){
                System.out.println("<1> Poring <LEVEL 1>");
                System.out.println("<2> Spore <LEVEL 15>");
                System.out.println("<3> Skeleton <LEVEL 30>");
                System.out.print("SELECT => ");
                a = sp.nextInt();
                sp.nextLine();
                if(a == 1){
                    charactor.attck(); //when attack,Increase exp,Decrease power
                    charactor.getDamage(10); //get damage from pouring
                }
                else if(a == 2){
                    charactor.attck();
                    charactor.getDamage(48); //get damage from Spore
                }
                else if(a == 3){
                    charactor.attck();
                    charactor.getDamage(79);   //get damage from Skeleton
                }

            }
            else if(a == 2){
                System.out.println("<1> Mini Boss <LEVEL 35>");
                System.out.println("<2> Big Boss <LEVEL 40>");
                System.out.print("SELECT => ");
                a = sp.nextInt();
                sp.nextLine();
                if(a == 1){
                    charactor.attck(); //when attack,Increase exp,Decrease power
                    charactor.getDamage(100); //get damage from Boss in the end
                }
                if(a == 2){
                    charactor.attck(); //when attack,Increase exp,Decrease power
                    charactor.getDamage(200); //get damage from pouring
                }
            
            }
            System.out.print("Exit Farming (yes/no)? : ");

            c = sp.nextLine();
            d = c.toLowerCase();
            System.out.println();

            if(d.equals("no")){
              
                continue;
            }
            else{
              break;
            } 

            

        }
    }
    else if(a == 2){
        while(b){
            Menu();
            System.out.println("Select for Novice");
            a = sp.nextInt();
            sp.nextLine();
            if(a == 1){
                System.out.println("<< Status >>");
                charactor.status();         //show status of novice
                System.out.println();
            }
            else if(a == 2){
                System.out.println("<< Items in Store >>");
                items.showItem();               //tshow all items in store
                System.out.println();
            }
            else if(a == 3){
                System.out.println("<< List of items >>");
                items.showItem();                     // Show list of items
                System.out.print("Number of item: ");
                a = sp.nextInt();
                stored.getItem(a);
                sp.nextLine();
   
            }
            else if(a == 4){
              System.out.println("My items in a bag");
              stored.showItemBag();
              System.out.println();
            }
            System.out.print("Exits shop (yes/no)?");

            c = sp.nextLine();
            d = c.toLowerCase();
            System.out.println();
            
            System.out.println("------------------------");

            if(d.equals("no")){
              
                continue;
            }
            else{
              break;
            }  

        }
    }
    System.out.print("Exit Game (yes/no)? = ");
    c = sp.nextLine();
    d = c.toLowerCase();
    System.out.println();
    if(d.equals("yes")){
        break;
    }
    else{
        continue;
    } 
    }
        sp.close();
        
        

    
  }
}