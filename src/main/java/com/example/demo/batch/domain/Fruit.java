package com.example.demo.batch.domain;

public class Fruit {

  private String name;
  private int price;

  public Fruit() {}

  public Fruit(String name, int price) {
    this.name = name;
    this.price = price;
  }

  // getter-setter
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
