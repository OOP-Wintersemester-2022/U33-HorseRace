import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;

public class Config {

    public static final int CANVAS_HEIGHT = 600;
    public static final int CANVAS_WIDTH = 1000;
    public static final int FRAME_RATE = 60;

    public static final int LABEL_SIZE = 20;
    public static final float LABEL_X = 10;
    public static final float FIRST_LABEL_Y = 25;
    public static final Color TEXT_COLOR = Colors.BLACK;
    public static final String HEADER_TEXT = "And the winner is ...";

    public static final String IMAGE_BASE_PATH = "data/assets/frame-";
    public static final String FILE_EXTENSION = "png";
    public static final int NUM_OF_FRAMES = 19;
    public static final int FRAME_DELAY = 3;

    public static final int RACE_TOP_OFFSET = 50;
    public static final int NUM_HORSES = 10;
    public static final int HORSE_HEIGHT = (CANVAS_HEIGHT - RACE_TOP_OFFSET) / NUM_HORSES;
    // Keep original aspect ratio of 376*240
    public static final int HORSE_WIDTH = (int) (376.0 * (HORSE_HEIGHT / 240.0));
    public static final int MAX_HORSE_SPEED = 7;
}
