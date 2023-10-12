package controller;

import helper.InputHelper;
import model.Cat;

import java.util.ArrayList;
import java.util.List;

public class CatController {

    private List<Cat> list = new ArrayList<>();

    public void hienThi() {
        for (Cat c : list) {
            c.inThongTin();
        }
    }

    public void themMeo(Cat cat) {
        list.add(cat);
    }

    public void thayDoiTiengKeu(Integer id) {
        for (Cat c : list) {
            if (c.getId().equals(id)) {
                System.out.println("Nhập Tiếng Kêu Mới:");
                String sound = InputHelper.readString();
                c.sound(sound);
            }
        }
    }

    public void delete(Integer id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
                break;
            }
        }
    }

    public void hienThiTheoId(Integer id) {
        for (Cat c : list) {
            if (c.getId().equals(id)) {
                c.inThongTin();
            }
        }
    }
}
