package ua.lviv.iot.algo.part1.lab1.Plate;
import lombok.*;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Plate {
    private double diameter;
    private String material;
    private String color;
    private boolean isClean = false;
    private boolean hasFood = false;

    private static Plate instance=new Plate();
    private static Plate getInstance() {
        return instance;
    }
    public void wash() {
        isClean = true;
    }

    public void dirty() {
        isClean = false;
    }

    public void eat() {
        hasFood = false;
        dirty();
    }

    public void addFood() {
        hasFood = true;
    }

    public boolean isClean() {
        return isClean;
    }

    public boolean hasFood() {
        return hasFood;
    }
    public static void main (String[] args) {
        Plate[] plates=new Plate[4];
        plates[0]=new Plate(2.7, "metal", "white", false, false);
        plates[1]=instance.getInstance();
        plates[2]=instance.getInstance();
        plates[3]=new Plate();

        for (int i=0; i<4; i++){
            System.out.println(plates[i]);
        }
    }
}
