class Main {

  public static void main(String[] args) {
    Calculator calc = Calculator.instance.get();
    int a = calc.plus.apply(1, 2);
    int b = calc.minus.apply(1, 1);
    int c = calc.abs.apply(-10);

    calc.println.accept(c);

  }
}