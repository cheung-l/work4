
public class Circle {

	/**The radius of the circle */
	double radius;
	
	/** The number of objects created */
	static int numberOfObject = 0;//统计创建的Circle类的对象个数
	
	/** Construct a circle with radius 1 */
	Circle(){
		radius = 1;
		numberOfObject++;
	}
	
	Circle (double newRadius){
		radius = newRadius;
		numberOfObject++;
	}
	/**Return numberOfObject */
	static int getNumberOfObjects() {
		return numberOfObject;
	}
	double getArea() {
		return radius * radius * Math.PI;
	
	}
	
}
