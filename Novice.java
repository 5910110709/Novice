
public class Novice
{
    private int maxHp;
    private int expCurr;
    private int powerCurr;
    private int currHp;
    private int maxPower;

    public Novice(int hp,int exp,int power){
        maxHp = hp;
        expCurr = exp;
        maxPower = power;
        currHp = maxHp;
        powerCurr = maxPower;
    }
    public Novice(){

    }
 //   public void setHp(int hp){
 //       maxHp = hp;
 //       currHp = maxHp;

 //   }
 //   public void setPower(int pow){
 //       maxPower = pow;
 //       powerCurr = maxPower;

  //  }

    public void attck(){ //set cuase tired
        powerCurr = powerCurr - 10;
        expCurr = expCurr + 2;
        System.out.println("c==||------>>");
        System.out.println();
    }
    public void getDamage(int damage){
        currHp = currHp - damage;
    }
    public void heal(int fruit){
        if(currHp == maxHp){
            System.out.println("HP is full!!");
            System.out.println("");
        }
        else if((currHp+fruit)<maxHp){
            currHp = currHp + fruit;
        }
        else{
            currHp = maxHp;
        }
    }
    public void sleep(){
        if(currHp<maxHp){
            currHp++;
        }
        if(powerCurr < maxPower){
            powerCurr = powerCurr + 10;
        }

    }
    public void status(){
        String statuses = "";

    
        statuses = "HP: "+currHp+"|| Power:"+powerCurr+"||EXP:"+expCurr;
        System.out.println(statuses);
        
    }
   // System.out.println(currHoo);
   public boolean lowPower(){
       if(powerCurr < 50){
           return true;
       }
       return false;
   }
}
