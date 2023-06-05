package java17.newfeatures.switchexpr;

public class SwitchExpressionDemo {

  public static void main(String[] args) {
    withSwitchExpr(Fruit.APPLE);
    withSwitchExpr(Fruit.AVOCADO);
    withSwitchExpr(Fruit.MANGO);

    withReturnValue(Fruit.APPLE);
    withReturnValue(Fruit.AVOCADO);
    withReturnValue(Fruit.MANGO);
  }

  private static void withSwitchExpr(Fruit fruit) {
    switch (fruit) {
      case APPLE, PEAR -> System.out.println("Common fruit");
      case ORANGE, AVOCADO -> System.out.println("Exotic fruit");
      default -> System.out.println("Undefined fruit");
    }
  }

  private static void withReturnValue(Fruit fruit) {
    String fruitName = switch (fruit) {
      case APPLE, PEAR -> {
        System.out.println("=============================");
        System.out.println("with Return Value");
        yield "Common fruit";
      }
      case ORANGE, AVOCADO ->  "Exotic fruit";
      default -> "Undefined fruit";
    };
    System.out.println(fruitName);
  }

}
