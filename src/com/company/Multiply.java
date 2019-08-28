package com.company;

@FunctionalInterface
public interface Multiply {
  int multiply(int x, int y);

  default void desc() {
    System.out.println("Do some");
  }
}
