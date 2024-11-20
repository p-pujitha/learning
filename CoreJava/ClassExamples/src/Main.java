public class Main {
  public static void main(String[] args) {
    Person tom = new Person();
    tom.name = "tom";
    tom.lastName = "john";
    System.out.println(tom.hashCode());
    tom.walk();

    String fullName = tom.fullName();
    System.out.println(tom.fullName());
    tom.eat("rice");
  }
}
