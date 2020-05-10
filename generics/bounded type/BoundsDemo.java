public class BoundsDemo{
  public static void main(String args[]){
    Stats<Integer> ob;

    Integer array1[] = {1, 2, 3, 4, 5};
//    Integer array2[] = {1, 2, 3, 4, 7};

    Double array2[] = {1.0,2.0, 3.0, 4.0, 5.0};

    ob = new Stats(array1);
    double d = ob.average();

    Stats<Double> ob2 = new Stats<Double>(array2);
 //   Stats<Integer> ob2 = new Stats<Integer>(array2);

   Gen<Integer> gen = new Gen<Integer>(10);
   Util.pln("have same average : "+ob.sameAvg(gen));

    
  
  }
}
