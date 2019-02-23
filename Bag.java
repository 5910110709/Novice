import java.util.*;

public class Bag
{
    private HashMap<String, Integer> myBag;//initail size of bag;

    public Bag(){
        myBag = new HashMap<String, Integer>() ;
        myBag.put("small_Health", 0);
        myBag.put("small_Mana", 0);
        myBag.put("Big_Health", 0);
    }

    public void getItem(int number){
        if(number == 3){
            myBag.computeIfPresent("small_Health", (k, v) -> v + 1);

        }
        else if(number == 1){
            myBag.computeIfPresent("small_Mana", (k, v) -> v + 1);
        }
        else if(number == 2){
            myBag.computeIfPresent("Big_Health", (k, v) -> v + 1);
        }

    }
    public void showItemBag(){
        int a = 1;
            System.out.println("-------------------------------");
            for (String i : myBag.keySet()) {
            //System.out.println(a +"."+ i +"     "+ myBag.get(i));
            System.out.println("|"+ a +".     "+ myBag.get(i) +"   "+ i +"         |");
            System.out.println("-------------------------------");
            a++;
         }
    }
  //  public void insertItem(){

  //  }


    
}