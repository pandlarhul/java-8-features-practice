public class TwoGen<T,U,V>{
  T ob1;
  U ob2;
  V ob3;
  TwoGen(T o1, U o2, V o3){
    ob1 = o1;
    ob2 = o2;
    ob3 = o3;
  }

  public showTypes(){
    Util.pln("Type of member1:"+ob1.getClass().getName());
    Util.pln("Type of member2:"+ob2.getClass().getName());
    Util.pln("Type of member3:"+ob3.getClass().getName());
  }

  T getob1(){
    return ob1;
  }

  U getob2(){
    return ob2;
  }

  V getob3(){
    return ob3;
  }

  
}
