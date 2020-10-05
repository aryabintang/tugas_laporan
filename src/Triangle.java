public class Triangle extends Bentuk {
    private float height;
    private float base;

    public Triangle(float height, float base) {
        this.height = height;
        this.base = base;
    }
    @Override
    float getArea(){
        return 0.5f *base *height;
    }
}
