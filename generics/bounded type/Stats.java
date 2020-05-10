public class Stats<T extends Number>{
  T[] nums;

  public Stats(T[] o){
    nums = o;
  }

  public double average(){
    double sum = 0;
    for(int i = 0 ; i < nums.length ; i ++)
      sum += nums[i].doubleValue();
    return sum/nums.length;
  }

  public boolean sameAvg(Stats<?> ob1){
    //double avg1 = average();
    //double avg2 = ob1.average();
    //return avg1 == avg2 ? true : false;
    return false;
  }
}
