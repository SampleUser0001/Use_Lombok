package sample.lombok.model;

import lombok.Data;
import java.util.List;

@Data
public class Model {
  private String str;
  private int i;
  private List<String> list;
}