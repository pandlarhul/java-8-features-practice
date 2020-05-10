public class RawDemo{
  public static void main(String args[]){
    Gen<Integer> iob = new Gen<Integer>(10);
    Util.pln(iob.getob()+"");

    Gen dob = new Gen("ssss");

    dob = iob;
    int i = (int)dob.getob();
    Util.pln(dob.getob()+"");
  }
}
