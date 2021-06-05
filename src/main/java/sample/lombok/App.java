package sample.lombok;

import sample.lombok.model.Model;
import java.util.List;
import java.util.ArrayList;

/**
 * Lombok使う
 */
public class App {
  public static void main( String[] args ) {
    Model model = new Model();
    
    model.setStr("hoge");
    model.setI(10);
    List<String> list = new ArrayList<String>();
    list.add("piyo");
    list.add("fuga");
    model.setList(list);

    System.out.println(model);
    

  }
}
