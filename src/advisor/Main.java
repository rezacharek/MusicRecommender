package advisor;
 
public class Main {
    public static void main(String[] args) {
        if (args.length > 1) { Config.SPOTIFY_PATH = args[1]; }
 
        MusicAdvisor advisor = new MusicAdvisor();
        advisor.getStarted();
    }
}