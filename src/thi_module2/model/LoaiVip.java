package thi_module2.model;

public class LoaiVip {
    private int stt;
    private String vip;

    public LoaiVip(int stt, String vip) {
        this.stt = stt;
        this.vip = vip;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return
                "stt=" + stt +
                ", vip='" + vip + '\'' ;
    }
    public String getInfo(){
        return this.stt+","+this.vip;
    }
}
