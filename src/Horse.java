import java.util.Random;

public class Horse {

    private static int horseCounter = 0;

    private int id;
    private boolean running = true;
    private AnimatedImage animatedImage;
    static Random random = new Random();

    private FinishListener finishListener;

    public Horse(float yPos, FinishListener finishListener) {
        horseCounter++;
        id = horseCounter;
        this.finishListener = finishListener;
        animatedImage = new AnimatedImage(0, yPos, Config.HORSE_WIDTH, Config.HORSE_HEIGHT,
                Config.IMAGE_BASE_PATH, Config.FILE_EXTENSION, Config.NUM_OF_FRAMES, Config.FRAME_DELAY);
    }

    public void draw() {
        update();
        animatedImage.draw();
    }

    public void update() {
        if (running) {
            float dx = random.nextInt(Config.MAX_HORSE_SPEED);
            animatedImage.move(dx, 0);
            checkIfFinished();
        }
    }

    private void checkIfFinished() {
        if (animatedImage.getRightBorder() >= Config.CANVAS_WIDTH) {
            finishListener.hasEnteredFinishLine(id);
            running = false;
            animatedImage.setAnimated(false);
        }
    }

}
