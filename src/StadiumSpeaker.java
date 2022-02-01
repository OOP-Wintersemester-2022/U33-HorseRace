import de.ur.mi.oop.graphics.Label;

import java.util.ArrayList;

public class StadiumSpeaker implements FinishListener{

    private Label finishLabel;
    private ArrayList<Label> rankings;

    public StadiumSpeaker(){
        finishLabel = new Label(Config.LABEL_X, Config.FIRST_LABEL_Y, Config.HEADER_TEXT, Config.TEXT_COLOR);
        finishLabel.setFontSize(Config.LABEL_SIZE);
        rankings = new ArrayList<>();
    }

    public void draw(){
        finishLabel.draw();
        for(Label horseLabel : rankings){
            horseLabel.draw();
        }
    }

    @Override
    public void hasEnteredFinishLine(int horseId) {
        int rankingOfHorse = rankings.size() + 1;
        String finishText = rankingOfHorse + ".Platz: Horse " + horseId;
        float yPosLabel = Config.FIRST_LABEL_Y + (Config.LABEL_SIZE * rankingOfHorse);

        Label label = new Label(Config.LABEL_X, yPosLabel, finishText, Config.TEXT_COLOR);
        rankings.add(label);
    }

}
