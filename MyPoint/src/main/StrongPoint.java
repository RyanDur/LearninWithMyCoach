import java.awt.*;


public final class StrongPoint implements ThePoint {
    private int x;
    private int y;

    public StrongPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Point getPoint() {
        return new Point(x,y);
    }
}
