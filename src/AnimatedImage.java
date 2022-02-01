import de.ur.mi.oop.graphics.Image;

public class AnimatedImage {

    private Image image;
    private int currentFrame;
    private boolean isAnimated;

    public AnimatedImage(float xPos, float yPos, float width, float height) {
        image = new Image(xPos, yPos, getFullImagePath(0));
        image.setHeight(height);
        image.setWidth(width);
        currentFrame = 0;
        isAnimated = true;
    }

    public void draw() {
        if (isAnimated) {
            animateImage();
        }
        image.draw();
    }

    /**
     * Alle 3 Frames soll das Bild ausgetauscht werden.
     * Wenn alle Bilder einmal verwendet wurden, wird mit dem ersten Bild fortgefahren.
     */
    private void animateImage() {
        if (currentFrame % Config.FRAME_DELAY == 0) {
            if (currentFrame >= Config.NUM_OF_FRAMES * Config.FRAME_DELAY) {
                currentFrame = 0;
            }
            int selectedFrameNumber = currentFrame / Config.FRAME_DELAY;
            replaceImage(selectedFrameNumber);
        }
        currentFrame++;
    }

    /**
     * Das aktuelle Bild wird mit dem darauffolgenden neuen Bild überschrieben.
     * @param selectedFrameNumber ist die Nummer des Bildes, welches nun angezeigt werden soll.
     */
    private void replaceImage(int selectedFrameNumber) {
        Image i = new Image(image.getXPos(), image.getYPos(), getFullImagePath(selectedFrameNumber));
        i.setHeight(image.getHeight());
        i.setWidth(image.getWidth());
        image = i;
    }

    public void move(float dx, float dy) {
        image.move(dx, dy);
    }

    public float getRightBorder() {
        return image.getRightBorder();
    }

    public void setAnimated(boolean animated) {
        isAnimated = animated;
    }

    /**
     * Es wird die Nummer des anzuzeigenden Bildes im Imagepath ergänzt.
     * @param selectedFrame ist die Nummer des Bildes, welches nun angezeigt werden soll.
     * @return imagepath mit dem Format: frame-NUMMER.png
     */
    private String getFullImagePath(int selectedFrame) {
        return String.format("%s%d.%s", Config.IMAGE_BASE_PATH, selectedFrame, Config.FILE_EXTENSION);
    }
}
