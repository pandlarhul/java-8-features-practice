public class MyClass<T extends Comparable<T>> implements MinMax<T>{
  T[] vals;
  public MyClass(T[] v){
    vals = v;
  }

  public T min(){
    T v = vals[0];
    for(int i = 0 ; i < vals.length; i ++){
      if(vals[i].compareTo(v) < 0)
	v = vals[i];
    }
    return v;
  }

  public T max(){
    T v = vals[0];
    for(int i = 0 ; i < vals.length; i ++){
      if(vals[i].compareTo(v) > 0)
	v = vals[i];
    }
    return v;
  }

}

