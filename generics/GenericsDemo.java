class GenericsDemo{
  public static void main(String args[])	{
		Gen<Integer> iob;
		iob = new Gen<Integer>(88);
		// show the type of 
		System.out.println(iob.getob());
		iob.showType();
		int i = iob.getob();
		Util.pln("int i :"+i);
		
		Gen<String> strob = new Gen<String>("String object");
		strob.showType();

		String str = strob.getob();
		Util.pln(str);
  }

}
