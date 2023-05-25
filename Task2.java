/*----------------------------------------------------------------         
                  OASIS INFOBYTE  
                JAVA DEVELOPEMENT INTERNSHIP
                  SIDDHIKA MUNDADA
	        TASK #2 :- NUMBER GUESSING GAME
 ----------------------------------------------------------------*/

import java.util.*;
import java.util.Scanner;

public class Task2{

  public static void GuessNumberGame(int a,int b,int i){
        if(b==a){
              System.out.println("\t\t\tCongratulations you won this game in "+i+" Chance");
              System.exit(i);
        }
        else if(b>a){
              System.out.println("\t\t\tThe Computer number is greater");
        }else{
              System.out.println("\t\t\tThe Computer number is smaller");
        }
  }
  

  public static void main(String[] args) {
        System.out.println("\t\t\t*********HEY THERE!! LET'S PLAY NUMBER GUESSING GAME*********");
        Random r = new Random();
        int randomNo = r.nextInt(100);


        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\tALL THE BEST");
        System.out.println("\t\t\t\tHOW MANY CHANCE YOU NEED TO GUESS THE NUMBER!!");
        int n = sc.nextInt();

        for(int i=1 ;i<=n; i++){
              int remaining = n-i;
              System.out.println();
              System.out.println("\t\tEnter the number for "+i+" chance and you have " + remaining+" Chances remaining");
              int num = sc.nextInt();

              GuessNumberGame(num,randomNo,i);


        }
        
        System.out.println("\t\t\tOpps! You lost the Game");
        System.out.println("\t\t\tThe computer number was :"+randomNo);
        

  }
}