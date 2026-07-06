package OOPs;

/**
 * InnermultipalInhire
 */
interface A4 {

  void show();
}

interface B6 {
  void show();

}

class C6 implements A4, B6 {

  public void show() {
    System.out.println("Hello show");
  }

  public static void main(String[] args) {
    C6 c = new C6();
    c.show();
  }
}
