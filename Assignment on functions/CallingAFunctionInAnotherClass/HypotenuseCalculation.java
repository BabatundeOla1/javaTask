public class HypotenuseCalculation{


    public static double getHypotenus(double side1, double side2){

	double side1Square = Math.pow(side1, 2);

	double side2Square = Math.pow(side2, 2);

	double toGetSide3 = side1Square + side2Square;

	double side3 = Math.sqrt(toGetSide3);

	double side =  side1 + side2 + side3;

	double toGetArea = side * ((side - side1) * (side - side2) * (side - side3));

	double area = Math.sqrt(toGetArea);

	return area;
}

}