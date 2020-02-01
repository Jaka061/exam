package Exam_3;

public class Bag {
    private Flatable flat;
    private Cylindricalable cylindr;
    private Roundable[] round;

    public Bag(Flatable flat, Cylindricalable cylindr, Roundable[] round) {
        this.flat = flat;
        this.cylindr = cylindr;
        this.round = round;
    }

    public Bag(Flatable flat, Cylindricalable cylindr, Roundable[] round , Roundable[] round1 ) {
        this.flat = flat;
        this.cylindr = cylindr;
        this.round = round;
        this.round = round1;
    }



}
