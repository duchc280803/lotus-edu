package org.example;

public class KiemSi extends BinhLinh {

    public double tinhSucManh() {
        return trangBi ? sucManh * 1.5 : sucManh;
    }
}
