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

class C4 implements A4, B6 {

  public void show() {
    System.out.println("Hello show");
  }

  public static void main(String[] args) {
    C4 c = new C4();
    c.show();
  }
}
