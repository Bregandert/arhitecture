public class Appli {
    private static Wall wall;
    private static Roof roof;

    public static void main(String[] args) {
        HouseBuilder hb=new HouseBuilder();
        hb=hb.setWall(wall).setRoof(roof);
        House h=hb.build();
    }
}
