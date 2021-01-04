public class TestCircleWithPrivateDataFields {
	/** Main method */
	public static void main(String[] args) {
		//Create a circle with radius 5.0
		Circle myCircle = new Circle(5.0);
		System.out.println("The area of the circle of radius " + 
		myCircle.getRadius() + " is " + myCircle.geaArea());
		// Increase myCircle's radius by 10%
		myCircle.setRadius(myCircle.getRadius()*1.1);
		System.out.println("The area of the circle of radius " + 
		myCircle.getRadius() + " is " + myCircle.geaArea());
		System.out.println("the number of objects created is " +
		myCircle.getNumberOfObject());
	}

}
