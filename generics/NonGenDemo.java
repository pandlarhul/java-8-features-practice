class NonGenDemo{
  public static void main(String args[]){
    NonGen iob;
    iob = new NonGen(88);
    iob.showType();
    int i = (Integer)iob.getob();
    Util.pln("iob.getob(): "+i);
  
    NonGen strob = new NonGen("NonGen String test");
    strob.showType();
   
    String str = (String)strob.getob();
    Util.pln("NonGen String value: "+str);

   iob = strob;
   i = (Integer)iob.getob();
  }
}
