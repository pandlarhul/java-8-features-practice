public class HierDemo{
  public static void main(String args[]){
    Gen2<String,Integer> gen2 = new Gen2<String,Integer>("first",12);
    
    Util.pln(""+gen2.getob());
    Util.pln(""+gen2.getob2());

  }
}
