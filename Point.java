/**
  Represent a point, using Cartesian coordinates
 */
public class Point implements Comparable<Object>{
    private double xcor;
    private double ycor;

    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this Point is closer,
      equidistant, or farther than the Point referred to
      by the parameter.
     */
    public int compareTo( Object otherObj){
        /* Use the Pythagorean theorem.
           Double.compare helped me.
           If the math is a problem, use a simpler
           relationship, like "higher is bigger"
           and change the tests accordingly */
        if (otherObj instanceof Point){
            Point store = (Point) otherObj;
            double value0 = Math.pow(this.xcor, 2) + Math.pow(this.ycor, 2);
            double value1 = Math.pow(store.xcor, 2) + Math.pow(store.ycor, 2);
            if (value0 > value1) return 1;
            else if (value1 > value0) return -1;
        }
        return 0; // temp: all Points are One
    }

    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")";
    }

}
