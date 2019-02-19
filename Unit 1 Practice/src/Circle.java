/**
 * Created by thomassmuir on 2018-12-06.
 */
public class Circle {

        private double x; // x co-ordinate of the center
        private double y; // y co-ordinate of the center
        private double r; // radius

        public double circumference() {

                return 2 * Math.PI * r;
        }

        public double getX() {

                return x;
        }

        public double getY() {

                return y;
        }

        public double getR() {

                return r;
        }

        /*Write a constructor method that has no parameters. This method should construct a Circle object with
center (0, 0) and radius 1.
        */

        public Circle() {

                x = 0;
                y = 0;
                r = 1;
        }

        /*
        Write a constructor method that has 3 parameters representing the co-ordinates of the center and the
radius of the object to be constructed. Ensure the radius is not negative by changing the sign of any
negative radius parameters.
         */

        public Circle(double x, double y, double r) {

                this.x = x;
                this.y = y;
                this.r = Math.abs(r);
        }

        /*
        Write a constructor method with a parameter, an object of type Circle. The method should construct a
new Circle object with the same field values as those of the parameter.
        */

        Circle (Circle other){

                x = other.getX();
                y = other.getY();
                r = other.getR();

        }

        /*
        Write an accessor method that returns a new Circle object with the same field values as those of the
implicit object.
         */

        public Circle clone(){

                return new Circle(this);

        }

        /*
        Write a method larger that could be called by a statement like: c3 = c1.larger(c2); where c1, c2 and c3 are
objects of type Circle. The method should make c3 refer to the larger of the circles represented by c1 and
c2 (or c1 if the circles are the same size). Hint: You will need to make use of the accessor methods you
wrote in question 2 b.
         */

        public Circle larger(Circle c2){
                if(this.r > c2.getR() || this.r == c2.getR()) {
                        return this;
                }
                else {
                        return c2;
                }
        }

        /*
        Write a boolean instance method called equals that returns true if and only if one Circle object is equal to
another one, that could be called by a statement like if(c1.equals(c2)). Assume circles are equal if the
radius is the same.
         */

        public boolean equals(Circle c2){
                return (this.r == c2.getR());
        }


}

