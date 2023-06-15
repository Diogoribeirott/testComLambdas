package test;

import java.util.ArrayList;
import java.util.List;
import  java.util.function.Function;

import javax.print.DocFlavor.STRING;
public class FunctionPart1 {
  public static void main(String[] args) {
    List<String> names = List.of("diogo","Jose","cleitin");
    List<String> x= listTransformer(names, name -> name.toUpperCase());
    System.out.println(x);

  }
  private static <T , R> List<R> listTransformer(List<T> list, Function<T, R> functionReturn ){
    List<R> result = new ArrayList<>();
    for (T e : list) {
      R r = functionReturn.apply(e);

    result.add(r);

      
    }
    return result;
  }
    
}