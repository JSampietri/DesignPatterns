package table;
public class Main {
  public static void main(String[] args) {
    Line l1 = new Line();
    l1.add(new Cell("Jo�o"));
    l1.add(new Cell("Maria"));
    l1.add(new Cell("Jos�"));

    Line l2 = new Line();
    l2.add(new Cell("10"));
    l2.add(new Cell("10"));
    l2.add(new Cell("7.5"));

    Table t = new Table();
    t.add(l1);
    t.add(l2);
    t.print();
  }
}