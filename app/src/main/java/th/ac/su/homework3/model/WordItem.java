package th.ac.su.homework3.model;

public class WordItem {
    public final int imageResId;
    public final String wordEng;
    public final String wordTh;

    public WordItem(int imageResId, String wordEng,String wordTh) {
        this.imageResId = imageResId;
        this.wordEng = wordEng;
        this.wordTh = wordTh;
    }
}
