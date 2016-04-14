package Model.Direction;

/**
 * Created by Michael on 4/13/16.
 */
public enum Direction {
    N (0 , 1),
    oddNE (-1,0),
    oddSE(-1,-1),
    S(0,-1),
    oddSW(1,-1),
    oddNW(1,0),
    evenNE (-1,1),
    evenSE(-1,0),
    evenSW(1,0),
    evenNW(1,1);

    private Point point;
    Direction(int x, int y){
        this.point = new Point(x,y);
    }

    private Point point(){
        return point;
    }


    class Point{
        private int x;
        private int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
