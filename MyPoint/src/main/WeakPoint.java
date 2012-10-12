import java.awt.*;

public final class WeakPoint implements ThePoint {

    private Point point;

    public WeakPoint(int x, int y) {
        this.point = new Point(x,y);
    }

    @Override
    public Point getPoint() {
        return point;
    }
}
