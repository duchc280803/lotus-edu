package org.example;

public class MonAn {

    private String name;

    private Integer price;

    private String introduce;

    private String ingredient;

    public MonAn() {
    }

    public MonAn(String name, Integer price, String introduce, String ingredient) {
        this.name = name;
        this.price = price;
        this.introduce = introduce;
        this.ingredient = ingredient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public String toString() {
        return "MonAn{" +
                "Tên món ăn='" + name + '\'' +
                ", Giá bán=" + price +
                ", Giới thiệu món ăn='" + introduce + '\'' +
                ", Nguyên liệu='" + ingredient + '\'' +
                '}';
    }
}
