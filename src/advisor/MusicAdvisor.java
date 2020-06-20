package advisor;

import java.util.Scanner;
import static java.lang.System.exit;
import com.sun.net.httpserver;

public class Main {

    static void authorized()
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while(  !input.equals("auth")){
            if(input.contains("exit")) exit(0);
            System.out.println("Please, provide access for application.\n");
            input = scanner.nextLine();
        }
        System.out.println();
        System.out.println("---SUCCESS---\n");
    }

    void getStarted()
    {
        Scanner scatter = new Scanner(System.in);
        authorized();
        String input = scatter.nextLine();
        String[] result = input.split(" ");
        while(!result[0].equals("exit")){
            System.out.println(result[0]);
            if(result[0].equals("new")) { new_();}
            if(result[0].equals("featured")) { featured_();}
            if(result[0].equals("categories")) {categories_();}
            if(result[0].equals("playlists")) {playlists_();}
            if(result[0].equals("auth")) {authorized();}

            input = scatter.nextLine();
            result = input.split(" ");

        }
        exit_();
    }

    public static void new_()
    {
        System.out.println("---NEW RELEASES---\n" +
                "Mountains [Sia, Diplo, Labrinth]\n" +
                "Runaway [Lil Peep]\n" +
                "The Greatest Show [Panic! At The Disco]\n" +
                "All Out Life [Slipknot]");
    }

    public static void featured_()
    {
        System.out.println("---FEATURED---\n" +
                "Mellow Morning\n" +
                "Wake Up and Smell the Coffee\n" +
                "Monday Motivation\n" +
                "Songs to Sing in the Shower");
    }

    public static void categories_()
    {
        System.out.println("---CATEGORIES---\n" +
                "Top Lists\n" +
                "Pop\n" +
                "Mood\n" +
                "Latin");
    }

    public static void playlists_()
    {
        System.out.println("---MOOD PLAYLISTS---\n" +
                "Walk Like A Badass  \n" +
                "Rage Beats  \n" +
                "Arab Mood Booster  \n" +
                "Sunday Stroll");
    }
    public static void exit_()
    {
        System.out.println("---GOODBYE!---");
    }
    
}
