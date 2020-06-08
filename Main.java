package advisor;

import java.util.Scanner;

public class Main {

    static void authorized() {
        Scanner scanner = new Scanner(System.in);
        String url = "https://accounts.spotify.com/authorize?" +
                "client_id=38e1d17aa75d464785c5849bd72342d2&redirect_uri=http://localhost:8080&response_type=code";
        String input = scanner.nextLine();

        while(  input!= "auth"){
            if(input.contains("exit")) exit();
            System.out.println("Please, provide access for application.\n");
            input = scanner.nextLine();
        }
    }

    public static void main(String[] args) { 
        Scanner scatter = new Scanner(System.in);
        String input = scatter.nextLine();
        authorized();
        String[] result = input.split(" ");
        while(!result[0].equals("exit")){
            System.out.println(result[0]);
            if(result[0].equals("new")) { new_();}
            if(result[0].equals("featured")) { featured_();}
            if(result[0].equals("categories")) {categories_();}
            if(result[0].equals("playlists")) { playlists_();}

            input = scatter.nextLine();
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
