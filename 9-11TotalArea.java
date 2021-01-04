public class TotalArea {

	/** Main method */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare circleArray
		Circle[] circleArray;
		
		//Creat circleArray
		circleArray = createCircleArray();
		
		//Print circleArray and total areas of the circles
		printCircleArray(circleArray);
	}

	public static Circle[] createCircleArray() {
		Circle[] circleArray = new Circle[5];
		for( int i = 0 ; i < circleArray.length ; i++ ) {
			circleArray[i] = new Circle(Math.random() * 100);
		}
		// Return Circle array
		return circleArray;
	}
	/** Print an array of circles and their total area */
	public static void printCircleArray(Circle[] circleArray) {
		System.out.printf("%-30s%-15s\n","Radius","Area");
		for(int i = 0 ; i<circleArray.length ; i++ ) {
			System.out.printf("%-30f%-15f\n",circleArray[i].getRadius(),circleArray[i].geaArea());
		}
		System.out.println("------------------------------------------------------------------");
		//Compute and display the result
		System.out.printf("%-30s%-15f\n","The total area of circles is",sum(circleArray));
	}
	/** Add circle area */
	public static double sum(Circle[] circleArray) {
		//Initialize sum
		double sum = 0;
		//Add areas to sum
		for(int i = 0 ; i < circleArray.length ; i++) {
			sum+=circleArray[i].geaArea();
		}
		return sum;
	}
}
