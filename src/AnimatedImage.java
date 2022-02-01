import de.ur.mi.oop.graphics.Image;

public class AnimatedImage {

    private Image image;
    private final String imageBasePath;
    private final String fileExtension;
    private final int numOfFrames;
    private final int frameDelay;

    private int currentFrame;
    private boolean isAnimated;

    public AnimatedImage(float xPos, float yPos, float width, float height, String imageBasePath, String fileExtension, int numOfFrames, int frameDelay) {
        this.imageBasePath = imageBasePath;
        this.numOfFrames = numOfFrames;
        this.frameDelay = frameDelay;
        this.fileExtension = fileExtension;
        image = new Image(xPos, yPos, getFullImagePath(0));
        image.setHeight(height);
        image.setWidth(width);
        currentFrame = 0;
        isAnimated = true;
    }

    public void draw() {
        if (isAnimated) {
            if (currentFrame % frameDelay == 0) {
                if (currentFrame >= numOfFrames * frameDelay) {
                    currentFrame = 0;
                }
                int selectedFrameNumber = currentFrame / frameDelay;
                Image i = new Image(image.getXPos(), image.getYPos(), getFullImagePath(selectedFrameNumber));
                i.setHeight(image.getHeight());
                i.setWidth(image.getWidth());
                image = i;
            }
            currentFrame++;
        }
        image.draw();
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

    private String getFullImagePath(int selectedFrame) {
        return String.format("%s%d.%s", imageBasePath, selectedFrame, fileExtension);
    }
}
