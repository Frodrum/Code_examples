import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {
        Track game = new Track(new ArrayList<>());
        game.getParticipants().add(new Participant("\uD83C\uDFCD" + "#1", 3, 0));
        game.getParticipants().add(new Participant("\uD83D\uDE93" + "#2", 3, 0));
        game.getParticipants().add(new Participant("\uD83C\uDFC3" + "#3", 3, 0));
        game.getParticipants().add(new Participant("\uD83D\uDC0E" + "#4", 3, 0));
        game.run();
        game.printWinner();
    }
}
