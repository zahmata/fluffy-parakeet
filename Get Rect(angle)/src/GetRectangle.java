public class GetRectangle 
{ 
	double width; 
	double height;
	
public void Rectangle() 
	{ 
		width = 0; 
		height = 0; 
	} 
public GetRectangle(double h, double w) 
{ 
	width = w; 
	height = h; 
	} 
double getArea(){ 
	return width * height; 
	} 
	double getPerimeter() 
	{ 
	return 2*(width+height); 
	} 

public static void main(String []a) 
	{ 
	GetRectangle A=new GetRectangle(4,40); 
	GetRectangle B=new GetRectangle(3.5, 35.9); 
	
	System.out.println("Area: "+A.getArea());
	System.out.println("Perimeter: "+A.getPerimeter());
	
	
	System.out.println("Area:"+B.getArea());
	System.out.println("Perimeter: "+B.getPerimeter());
	

} 
}
