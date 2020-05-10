public class GenConstructor{
  private double value;
  public<T extends Number> GenConstructor(T v){
    value = v.doubleValue();
  }
  public void showValue(){
    System.out.println("Value is : "+value);
  }
}
