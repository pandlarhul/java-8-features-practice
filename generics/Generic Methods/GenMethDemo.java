public class GenMethDemo{
  public static <T extends Comparable<T>,V extends T> boolean isIn(T x, V[] y){
    for(int i=0 ; i < y.length; i ++){
      if(x.equals(y[i])) return true;
    }
    return false;
  }

  public static void main(String args[]){
    Integer i[] = {11,22,33,44,55,66};
    Double d[] = {11.0, 22.0, 33.0, 44.0, 55.0};
    String s[] = {"first", "second", "third", "forth", "fifth"};

   if(GenMethDemo.<String,String>isIn("firsta", s)) Util.pln("available");
     else 
	Util.pln("Not present");
  }
}
