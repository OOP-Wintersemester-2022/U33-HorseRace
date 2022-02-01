import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Circle;

import java.util.Random;

public class Horse {

    private static int horseCounter = 0;

    private int id;
    private boolean running = true;
    private Circle circle;
    static Random random = new Random();

    private FinishListener finishListener;

    public Horse(float yPos, FinishListener finishListener) {
        horseCounter++;
        id = horseCounter;
        this.finishListener = finishListener;
        circle = new Circle(Config.HORSE_RADIUS, yPos, Config.HORSE_RADIUS, Colors.getRandomColor());
    }

    public void draw() {
        update();
        circle.draw();
    }

    public void update() {
        if (running) {
            float dx = random.nextInt(Config.MAX_HORSE_SPEED);
            circle.move(dx, 0);
            checkIfFinished();
        }
    }

    private void checkIfFinished() {
        if (circle.getRightBorder() >= Config.CANVAS_WIDTH) {
            finishListener.hasEnteredFinishLine(id);
            running = false;
        }
    }

}
