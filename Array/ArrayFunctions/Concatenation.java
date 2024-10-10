/*public class Concatenation{

    public static void main(String [] args){

	int [] firstArray = {a, b, c};

	int [] secondArray = {1, 4, 7};

	int totalLength = firstArray.length + secondArray.length ;

	int [] concatenatedLen = new int[totalLength];

	

	for(int count = 0; count < lenOfFirst; count++){
		concatenatedLen[count] = firstArray[count];
	}

	for(int count = 0; count < lenOfSecond; count++){
		concatenatedLen[lenOfFirst + count] = secondArray[count];
	}

	for(int count = 0; count < totalLength; count++){
	
		System.out.print(concatenatedLen[count]);
	}

    }

}*/


public class Concatenation{

    public static void main(String [] args){

	int [] firstArray = {a, b, c};

	int [] secondArray = {1, 4, 7};

	int lenOfFirst = firstArray.length;

	int lenOfSecond = secondArray.length;

	int totalLength = lenOfFirst + lenOfSecond;

	int [] concatenatedLen = new int[totalLength];

	for(int count = 0; count < lenOfFirst; count++){
		concatenatedLen[count] = firstArray[count];
	}

	for(int count = 0; count < lenOfSecond; count++){
		concatenatedLen[lenOfFirst + count] = secondArray[count];
	}

	for(int count = 0; count < totalLength; count++){
	
		System.out.print(concatenatedLen[count]);
	}

    }

}
