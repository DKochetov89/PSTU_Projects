public class Room 
{
    public double length; // длина
    public double width; // ширина
    public double height; // высота
    public double square; // площадь стен
    public double squareWithout; // площадь стен без окна и двери
    final double SQUARE_WINDOW = 3.0; // площадь окна
    final double SQUARE_DOOR = 1.6; // площадь двери

    // площадь стен
    public void calcSquareWalls() {
        if ((height == 0) || (width == 0) || (length == 0)) 
        {square = 0;} else 
        {square = 2 * height * (width + length);}
    }

    // площадь стен без окна и двери
    public void calcSquareWallsWithoutDoorAndWindow () {
        if ((height == 0) || (width == 0) || (length == 0)) 
        {squareWithout = 0;} else 
        {
        squareWithout = 2 * height * (width + length) - 
                SQUARE_WINDOW - SQUARE_DOOR;
        }
    }   
}
