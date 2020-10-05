public abstract class Bentuk {
        String color ;

        void set (String color){
            this.color = color ;
        }

        String getColor (){
            return this.color;
        }

        abstract float getArea();
    }


