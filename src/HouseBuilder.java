public class HouseBuilder {
//    HouseBuilder
    private Wall wall;
    private Roof roof;

    public HouseBuilder setWall(Wall wall) {
        this.wall = wall;
        return this;
    }

    public HouseBuilder setRoof(Roof roof) {
        this.roof = roof;
        return this;
    }

    public House build(){
        return new House(wall, roof);
    }

}