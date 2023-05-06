import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Number_Guessing_Game{

    //Computer picks a number- generates a random integer between 1 and 100
    static int comp_num= (int)Math.floor((Math.random()*100)+1);

    public static String logoMaker(String file_name)throws IOException
    {
        return new String(Files.readAllBytes(Paths.get(file_name)));
    }
    
    public static void easy()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        
        int total= 1,guess= 0;

        System.out.println(logoMaker("easy.txt"));
        System.out.println(logoMaker("mode.txt"));

        while(guess!=comp_num)
        {
            System.out.print("\nEnter Your Guess Here: ");
            guess=sc.nextInt();
            if(guess>comp_num)
            {
                total++;
                System.out.println("Number is Too High!! Guess again...");
            }
            else if(guess<comp_num)
            {
                total++;
                System.out.println("Number is Too Low!! Guess again...");
            }
            else if(guess>100 || guess<1)
            {
                System.out.println("Number exceeds limits!! Guess again...");
            }
        }
        System.out.println("The Correct Answer is: "+comp_num);
        System.out.println("You took a total of "+total+" guesses.");
        sc.close();
    }

    public static void medium()throws IOException
    {
        Scanner sc=new Scanner(System.in);

        int total= 1,guess= 0,lives= 10;

        System.out.println(logoMaker("medium.txt"));
        System.out.println(logoMaker("mode.txt"));

        while(guess!=comp_num && lives>0)
        {
            System.out.print("\nEnter Your Guess Here: ");
            guess=sc.nextInt();
            if(guess>comp_num)
            {
                total++;
                lives--;
                System.out.println("Number is Too High!! Guess again...");
                if(lives>0)
                    System.out.println("You have "+lives+" lives remaining, play carefully!!");
            }
            else if(guess<comp_num)
            {
                total++;
                lives--;
                System.out.println("Number is Too Low!! Guess again...");
                if(lives>0)
                    System.out.println("You have "+lives+" lives remaining, play carefully!!");
            }
            else if(guess>100 || guess<1)
            {
                System.out.println("Number exceeds limits!! Guess again...");
            }
        }
        if(lives>0){
            System.out.println("The Correct Answer is: "+comp_num);
            System.out.println("You took a total of "+total+" guesses.");
        }
        else{
            System.out.println("Oops!! You ran out of lives...");
            System.out.println("The Correct Answer was: "+comp_num);
        }
        sc.close();
    }

    public static void hard()throws IOException
    {
        Scanner sc=new Scanner(System.in);

        int total= 1,guess= 0,lives=5;

        System.out.println(logoMaker("hard.txt"));
        System.out.println(logoMaker("mode.txt"));

        while(guess!=comp_num && lives>0)
        {
            System.out.print("\nEnter Your Guess Here: ");
            guess=sc.nextInt();
            if(guess>comp_num)
            {
                total++;
                lives--;
                System.out.println("Number is Too High!! Guess again...");
                if(lives>0)
                    System.out.println("You have "+lives+" lives remaining, play carefully!!");
            }
            else if(guess<comp_num)
            {
                total++;
                lives--;
                System.out.println("Number is Too Low!! Guess again...");
                if(lives>0)
                    System.out.println("You have "+lives+" lives remaining, play carefully!!");
            }
            else if(guess>100 || guess<1)
            {
                System.out.println("Number exceeds limits!! Guess again...");
            }
        }
        if(lives>0){
            System.out.println("The Correct Answer is: "+comp_num);
            System.out.println("You took a total of "+total+" guesses.");
        }
        else{
            System.out.println("Oops!! You ran out of lives...");
            System.out.println("The Correct Answer was: "+comp_num);
        }
        sc.close();
    }

    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(logoMaker("logo.txt"));
        System.out.println(logoMaker("logo2.txt"));
        
        System.out.println("Game Mode: ");
        System.out.println("Easy \nMedium \nHard");
        System.out.print("\nType 'easy' or 'medium' or 'hard' here: ");
        String mode=sc.nextLine();

        if(mode.equalsIgnoreCase("easy"))
        {
            easy();
        }
        else if(mode.equalsIgnoreCase("medium"))
        {
            medium();
        }
        else if(mode.equalsIgnoreCase("hard"))
        {
            hard();
        }
        else
        {
            System.out.println("\n\n!!! INVALID INPUT !!! \n\n");
        }

        
        sc.close();
    }

}