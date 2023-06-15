package dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;



public class Filter {

 public static <T> List<T> FilterAll(List<T> listT,Predicate<T> pradicate){
  List<T> list = new ArrayList<>();
  for (T e : listT) {
    if(pradicate.test(e)){
      list.add(e);
     
    }
     
}
 return list;
    
}
}