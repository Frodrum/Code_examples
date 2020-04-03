

public class Participant implements Comparable<Participant> {
    private String name;
    private double speed;
    private double distance;

    public Participant(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    public void move() {
        this.distance += this.speed * Math.random();
    }

    public void print() {
        StringBuilder path = new StringBuilder();

        for (int i = 0; i < Math.floor(getDistance()); i++) {
            path.append(".");
        }

        path.append(getName());
        System.out.println(path);
    }

    @Override
    public int compareTo(Participant o) {
        if (this.distance > o.getDistance()) {
            return 1;
        } else if (this.distance < o. getDistance()) {
            return -1;
        } else {
            return 0;
        }
    }
}