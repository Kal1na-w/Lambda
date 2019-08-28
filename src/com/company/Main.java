package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    BinaryOperator<Integer> multiply = (x, y) -> x*y;

    System.out.println(multiply.apply(3, 5)); // 15
    System.out.println(multiply.apply(10, -2)); // -20
  }

}
