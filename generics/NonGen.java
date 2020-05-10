public class NonGen{
  Object ob;
  public NonGen(Object o){
    ob = o;
  }
  
  Object getob(){
    return ob;
  }

  void showType(){
    Util.pln("Type of ob is :"+ob.getClass().getName());
  }
}
