class GenericsDemo{
  public static void main(String args[])	{
		Gen<Integer> iob;
		iob = new Gen<Integer>(88);
		// show the type of 
		System.out.println(iob.getob());
		iob.showType();
  }
}
