package org.example;

public class Goods {
    private int hid;
    private String hname;
    private String haddress;

    public Goods() {
    }

    public Goods(int hid, String hname, String haddress) {
        this.hid = hid;
        this.hname = hname;
        this.haddress = haddress;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public String getHaddress() {
        return haddress;
    }

    public void setHaddress(String haddress) {
        this.haddress = haddress;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "ID=" + hid +
                ", 小区名称='" + hname + '\'' +
                ", 小区地址='" + haddress + '\'' +
                '}';
    }
}
