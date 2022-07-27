/**
 *
 * @author dkoch
 */
public class Office extends Room {
    public double lengthHall; // длина коридора
    public double widthHall; // ширина коридора
    public double heightHall; // высота коридора
    public double paintConsOffice; // расход краски на офис
    final double PAINT_CONS = 0.25; // расход краски
    private double squareHallWithout;

    public void calcSquareHallWallsWithoutDoorAndWindow () {
        if ((heightHall == 0) || (widthHall == 0) || (lengthHall == 0)) 
        {squareHallWithout = 0;} else 
        {
        squareHallWithout = (2 * heightHall * (widthHall + lengthHall)) - 
                SQUARE_WINDOW - SQUARE_DOOR;
        }    
    }
    
    public void calcPaintConsOffice() {
        double PaintConsRoom = PAINT_CONS * (squareWithout + (width * length));
        double PaintConsOfficeHall = PAINT_CONS * (squareHallWithout + (width * length));
        paintConsOffice = PaintConsRoom +  PaintConsOfficeHall;
    }
}
