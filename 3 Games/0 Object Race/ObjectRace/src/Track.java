import java.util.Collections;
import java.util.List;

public class Track {
    static Track game;
    private List<Participant> participants;

    public Track(List<Participant> participants) {
        this.participants = participants;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void run() {
        for (int i = 0; i < 30; i++) {
            move();
            print();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Something wrong with sleep");
            }

        }
    }

    public void move() {
        participants.forEach(Participant::move);
    }

    public void print() {
        participants.forEach(Participant::print);

        for (int i = 0; i < 3; i++) {
            System.out.println();
        }
    }

    public Participant getWinner() {
        return Collections.max(getParticipants());
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
