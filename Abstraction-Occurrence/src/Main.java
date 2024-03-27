public class Main {
    public static void main(String[] args)
    {
        TVSeries joJosBizarreAdventure = new TVSeries("JoJo's Bizarre Adventure", "Hiroyuki Oomori");
        Episode episode1 = new Episode("JoJo's Bizarre Adventure", "Hiroyuki Oomori", 1, "Dio the Invader", "England 1868. A thief tries to raid an overturned carriage, but discovers that two of the occupants, a man and his young son are still alive. The man, George Joestar, claims he will forever be indebted to his savior, who reveals himself to be Dario Brando.");

        System.out.println("TV Series: " + joJosBizarreAdventure.getSeriesName());
        System.out.println("Producer: " + joJosBizarreAdventure.getProducer());
        System.out.println("Episode Number: " + episode1.getNumber());
        System.out.println("Episode Title: " + episode1.getTitle());
        System.out.println("Episode Synopsis: " + episode1.getStorySynopsis());
    }
}