package org.example;

public class CungThu extends BinhLinh {

    public double tinhSucManh() {
        return trangBi ? sucManh * 1.3 : sucManh;
    }
}
