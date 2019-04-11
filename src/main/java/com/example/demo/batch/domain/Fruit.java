package com.example.demo.batch.domain;

public class Fruit {

  private String fruitName;
  private int price;

  public Fruit() {}

  public Fruit(String fruitName, int price) {
    this.fruitName = fruitName;
    this.price = price;
  }

  public String getFruitName() {
    return fruitName;
  }

  public void setFruitName(String fruitName) {
    this.fruitName = fruitName;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
