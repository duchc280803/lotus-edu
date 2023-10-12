package org.example;

public class DauSi extends BinhLinh {

    public double tinhSucManh() {
        return trangBi ? sucManh * 1.7 : sucManh;
    }
}
