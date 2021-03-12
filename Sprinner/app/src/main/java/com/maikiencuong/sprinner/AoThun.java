package com.maikiencuong.sprinner;

public class AoThun {
    private String ten;
    private double gia;
    private int image;

    public AoThun(String ten, double gia, int image) {
        this.ten = ten;
        this.gia = gia;
        this.image = image;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "AoThun{" +
                "ten='" + ten + '\'' +
                ", gia=" + gia +
                ", image=" + image +
                '}';
    }
}
