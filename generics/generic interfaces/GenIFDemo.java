public class GenIFDemo{
  public static void main(String args[]){
    Integer nums[] = {11,22,33,44,55,77};
    String strs[] = {"first", "second", "third"};
    Character chs[] = {'a', 'b', 'z', 'x', 'c'};
    
    MyClass<Integer> iob = new MyClass<Integer>(nums);

    Util.pln("min="+iob.min());
    Util.pln("max="+iob.max());

   MyClass<String> sob = new MyClass<String>(strs);
    Util.pln("min="+sob.min());
    Util.pln("max="+sob.max());


  }
}
