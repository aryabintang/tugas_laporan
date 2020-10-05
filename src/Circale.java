public class Circale extends Bentuk {

    private float radius;

    public Circale(float radius) {
        this.radius = radius;
    }

    @Override
   float getArea(){
        return (float) (Math.PI*radius*radius);
    }
}
