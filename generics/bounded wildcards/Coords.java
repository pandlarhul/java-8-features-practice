public class Coords<T extends TwoD>{
  T[] coords;
  Coords(T[] o){
    coords = o;
  }

  public static void showXY(Coords<?> c){
    Util.pln("X Y coordinates");
    for(int i = 0 ; i < c.coords.length; i ++){
      Util.pln(c.coords[i].x+" "+c.coords[i].y);
    }
    Util.pln("");

  }

  public static void showXYZ(Coords<? extends ThreeD> c){
    Util.pln("X Y coordinates");
    for(int i = 0 ; i < c.coords.length; i ++){
      Util.pln(c.coords[i].x+" "+c.coords[i].y+" "+c.coords[i].z);
    }
    Util.pln("");

  }

  public static void showAll(Coords<? extends FourD> c){
    Util.pln("X Y coordinates");
    for(int i = 0 ; i < c.coords.length; i ++){
      Util.pln(c.coords[i].x+" "+c.coords[i].y+" "+c.coords[i].z + " "+c.coords[i].t);
    }
    Util.pln("");

  }


}
