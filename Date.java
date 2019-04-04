/**
  Represent a date
 */
public class Date implements Comparable<Object>{
    private int y,m,d;


    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    public int compareTo( Object otherObj){
        if (otherObj instanceof Date){
            Date store = (Date) otherObj;
            int value0 = this.y*365+this.m*this.d;
            int value1 = store.y*365+store.m*store.d;
            if (value0 > value1) return 1;
            else if (value1 > value0) return -1;
        }
        return 0;

    }
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // someday: ISO 8601
        return y + "-" + m + "-" + d;
    }

}
