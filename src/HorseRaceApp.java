import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;

public class HorseRaceApp extends GraphicsApp {

    @Override
    public void initialize() {
        setupCanvas();
        initSpeaker();
        initHorses();
    }

    private void setupCanvas() {
        setCanvasSize(Config.CANVAS_WIDTH, Config.CANVAS_HEIGHT);
        setFrameRate(Config.FRAME_RATE);
    }

    private void initSpeaker() {

    }

    private void initHorses() {

    }

    @Override
    public void draw() {
        drawHorses();
        drawSpeakerAnnouncements();
    }

    private void drawSpeakerAnnouncements() {

    }

    private void drawHorses() {

    }

    public static void main(String[] args) {
        GraphicsAppLauncher.launch();
    }

}
