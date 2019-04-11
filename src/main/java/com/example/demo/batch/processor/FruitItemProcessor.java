package com.example.demo.batch.processor;

import com.example.demo.batch.domain.Fruit;
import org.springframework.batch.item.ItemProcessor;

public class FruitItemProcessor implements ItemProcessor<Fruit, Fruit> {

  @Override
  public Fruit process(final Fruit fruit) throws Exception {
    final String title = fruit.getName().toUpperCase();
    final int price = fruit.getPrice();

    final Fruit transformColumns = new Fruit(title, price);

    return transformColumns;
  }
}
