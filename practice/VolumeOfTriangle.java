public class VolumeOfTriangle{

   public static void main(String...args){

	double lengthOfATriangle = 3.5;

	double areaFirstStep = Math.sqrt(3) / 4;
	
	double area = areaFirstStep * (lengthOfATriangle);

	double volume = area * lengthOfATriangle;

	System.out.printf("The volume of the triangle is %f", volume);



}

}

	