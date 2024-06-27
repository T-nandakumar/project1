package operatorstoloops;

public class question13 {

	public static void main(String[] args) {
//Given three values representing the lengths of the three sides of a triangle, determine whether the triangle is 
//regular (all three sides are equal), symmetric (two sides are equal), or irregular (no two sides are equal).
		int a=10,b=10,c=25;
		if(a==b&&b==c&&c==a)
			System.out.println("all sides are equal");
		else if(a==b||b==a||c==a)
		System.out.println("2 side");
		else
			System.out.println("not equal");
	}

}
