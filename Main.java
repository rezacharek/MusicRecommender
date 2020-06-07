package advisor;
 
import java.util.Scanner;
 
public class Main {
    public static void main(final String[] args) { 
        final Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] result = input.split(" ");
        while(!result[0].equals("exit")){
            System.out.println(result[0]);
            if(result[0].equals("new")) { new_();}
            if(result[0].equals("featured")) { featured_();}
            if(result[0].equals("categories")) {categories_();}
            if(result[0].equals("playlists")) { playlists_();}
 
            input = scanner.nextLine();
            result = input.split(" ");
 
        }
        exit();
    }
 
    public static void new_(){
        System.out.println("---NEW RELEASES---\n" +
                "Mountains [Sia, Diplo, Labrinth]\n" +
                "Runaway [Lil Peep]\n" +
                "The Greatest Show [Panic! At The Disco]\n" +
                "All Out Life [Slipknot]");
    }
 
    public static void featured_(){
        System.out.println("---FEATURED---\n" +
                "Mellow Morning\n" +
                "Wake Up and Smell the Coffee\n" +
                "Monday Motivation\n" +
                "Songs to Sing in the Shower");
    }
 
    public static void categories_(){
        System.out.println("---CATEGORIES---\n" +
                "Top Lists\n" +
                "Pop\n" +
                "Mood\n" +
                "Latin");
    }
 
    public static void playlists_(){
        System.out.println("---MOOD PLAYLISTS---\n" +
                        "Walk Like A Badass  \n" +
                        "Rage Beats  \n" +
                        "Arab Mood Booster  \n" +
                        "Sunday Stroll");
    }
    public static void exit(){
        System.out.println("---GOODBYE!---");
    }
    
    
}