public class numdisplay {
    private int num;
    private final int batas;

    public numdisplay(int batas, int num){
        this.num = num;
        this.batas = batas;
    }

    public int getnum(){
        return num;
    }
    
    public void increment(){
        num = (num + 1) % batas;
    }

    public String getdisplaynum(){
        if(num < 10){
            return "0" + num;
        }else {
            return "" + num;
        }
    }
}
