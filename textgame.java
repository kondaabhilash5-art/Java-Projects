import java.util.*;

class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter your name:");
        String name=sc.next();
        String mywepon="shovel";
        System.out.println("Welcome "+name+" your weapon is "+mywepon);
        System.out.println("you have just awaken in a ruines of your village which has just been attacked by a monster you set out on an adventure to kill the monster");
        int myhp=10;
        System.out.println("your hp is "+myhp);
         String play="yes";

        while(play.equals("yes")){
            myhp = 10; 

        while(myhp>0){
            System.out.println("you are at the entrance of the forest on the way to the monster's lair");
            System.out.println("1.go north");
            System.out.println("2.go east");
            System.out.println("3.go west");
            int choice=sc.nextInt();

            if(choice==2 || choice==3){
                System.out.println("you have taken two step north");
                System.out.println("you see a chest");
                System.out.println("1.open the chest");
                System.out.println("2.leave the chest");

                if(sc.nextInt()==1){
                    System.out.println("you have been poisoned by a trap in the chest");
                    myhp=myhp-2;
                    System.out.println("your hp is "+myhp);
                }else{
                    System.out.println("you have left the chest and continue on your way");
                }

                System.out.println("you see a monster");
                System.out.println("enter the no of attack you want to do between 1 and 5");

                int monsterhp=10;

                while(monsterhp>0 && myhp>0){
                    int attack=sc.nextInt();
                    for(int i=0;i<attack;i++){
                        monsterhp=monsterhp-2;
                    }
                    myhp=myhp-1;
                    System.out.println("your hp is "+myhp);
                }

                System.out.println("you have killed the monster and continue on your way");

                System.out.println("you see a chest");
                System.out.println("1.open the chest");
                System.out.println("2.leave the chest");

                if(sc.nextInt()==1){
                    System.out.println("you have found a health potion in the chest");
                    myhp=myhp+5;
                    System.out.println("your hp is "+myhp);
                    System.out.println("you have found a new weapon in the chest");
                    mywepon="sword";
                    System.out.println("your weapon is "+mywepon);
                }else{
                    System.out.println("you have left the chest and continue on your way");
                }

                System.out.println("you see the monster's lair");
                System.out.println("you are starting to fight the monster");
                System.out.println("enter the no of attack you want to do between 10 and 20");

                int monsterhp2=20;

                while(monsterhp2>0 && myhp>0){
                    int attack=sc.nextInt();
                    for(int i=0;i<attack;i++){
                        monsterhp2--;   
                    }
                    myhp-=2;
                    System.out.println("your hp is "+myhp);
                }

                System.out.println("YOU HAVE WON THE GAME");
                break;
            }

           else if(choice==1){
                System.out.println("you see a monster");
                System.out.println("enter the no of attack you want to do between 1 and 5");

                int monsterhp=10;

                while(monsterhp>0 && myhp>0){
                    int attack=sc.nextInt();
                    for(int i=0;i<attack;i++){
                        monsterhp--;
                    }
                    myhp--;
                    System.out.println("your hp is "+myhp);
                }

                System.out.println("you have killed the monster");

                System.out.println("you see a chest");
                System.out.println("1.open the chest");
                System.out.println("2.leave the chest");

                if(sc.nextInt()==1){
                    System.out.println("you have been poisoned");
                    myhp=myhp-2;
                    System.out.println("your hp is "+myhp);
                }

                System.out.println("you see another monster");

                monsterhp=10;

                while(monsterhp>0 && myhp>0){
                    int attack=sc.nextInt();
                    for(int i=0;i<attack;i++){
                        monsterhp--;
                    }
                    myhp--;
                    System.out.println("your hp is "+myhp);
                }

                System.out.println("you see the final boss");

                int monsterhp2=20;

                while(monsterhp2>0 && myhp>0){
                    int attack=sc.nextInt();
                    for(int i=0;i<attack;i++){
                        monsterhp2--;  
                    }
                    myhp-=2;
                    System.out.println("your hp is "+myhp);
                }

                System.out.println("YOU HAVE WON THE GAME");
                break;
           }
        }

        if (myhp<=0){
            System.out.println("YOU HAVE DIED GAME OVER");
        }

        System.out.println("do you want to play again? yes or no");
        play=sc.next();
    }

    sc.close();
}
}