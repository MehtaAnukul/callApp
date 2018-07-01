package ClassObj;

/**
 * Created by Anukul-PC on 22-06-2018.
 */
public class CallAppModel {
    private long number;
    private String name;
    private boolean pic;
    private String date;
    private int misscall;
    private int incoming;
    private int outcoming;


    public CallAppModel(long number, String name, boolean pic, String date, int misscall, int incoming, int outcoming) {
        this.number = number;
        this.name = name;
        this.pic = pic;
        this.date = date;
        this.misscall = misscall;
        this.incoming = incoming;
        this.outcoming = outcoming;
    }

    public CallAppModel() {
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPic() {
        return pic;
    }

    public void setPic(boolean pic) {
        this.pic = pic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getMisscall() {
        return misscall;
    }

    public void setMisscall(int misscall) {
        this.misscall = misscall;
    }

    public int getIncoming() {
        return incoming;
    }

    public void setIncoming(int incoming) {
        this.incoming = incoming;
    }

    public int getOutcoming() {
        return outcoming;
    }

    public void setOutcoming(int outcoming) {
        this.outcoming = outcoming;
    }
}

