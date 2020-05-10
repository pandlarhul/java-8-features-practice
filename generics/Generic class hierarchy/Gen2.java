class Gen2<T,V> extends Gen<T>{
  V ob2;
  Gen2(T o1,V o2){ 
    super(o1);
    ob2 = o2;
  }

  V getob2(){
    return ob2;
  }

}
