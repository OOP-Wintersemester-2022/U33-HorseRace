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

    public static final int NUM_HORSES = 10;
    public static final int HORSE_RADIUS = (CANVAS_HEIGHT / NUM_HORSES) / 2;
    public static final int MAX_HORSE_SPEED = 7;
}
