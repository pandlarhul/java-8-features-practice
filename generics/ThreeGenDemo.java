public class ThreeGenDemo{
  public static void main(String args[]){

  ThreeGen<Integer,String,Double> isd ;
  isd = new ThreeGen<Integer.class, String, Double>
		     (11,"Passed String",11.090);
  
  isd.showTypes();
  
  
  }
}
