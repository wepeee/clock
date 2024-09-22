public class clockdisplay {
    private final numdisplay detik;
    private final numdisplay menit;
    private final numdisplay jam;

    public clockdisplay(int detik, int menit, int jam){
        this.detik = new numdisplay(60, detik);
        this.menit = new numdisplay(60, menit);
        this.jam = new numdisplay(24, jam);
    }

    public void timeincrement(){
        detik.increment();
        if(detik.getnum() == 0){
            menit.increment();
            if(menit.getnum() == 0){
                jam.increment();
            }
        }
    }

    public String getdisplayclock(){
        return jam.getdisplaynum() + " : " + menit.getdisplaynum() + " : " + detik.getdisplaynum();
    }
}
