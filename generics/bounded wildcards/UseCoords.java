public class UseCoords{
  public static void main(String args[]){
    TwoD[] two = {new TwoD(20,21),new TwoD(22,23), new TwoD(24,25),new TwoD(26,27)};

    ThreeD three[] = {new ThreeD(30,31,32),new ThreeD(33,34,35),new ThreeD(36,37,38)};
    FourD four[] = {new FourD(44,45,46,47), new FourD(40,41,42,43)};
    Coords<FourD> coords = new Coords(four);
    Coords<ThreeD> coords1 = new Coords<ThreeD>(three);
    Coords<TwoD> coords2 = new Coords<TwoD>(two);

    Coords.showAll(coords);
  }
}
