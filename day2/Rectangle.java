class Rectangcle
{
  private int Width;
  private int Length;
  Rectangcle(int Width,int Length)
  {
  	this.Width = Width;
  	this.Length = Length;
  }
  public int getWidth()
  {
  	return this.Width;
  }
  public int getLength()
  {
  	return this.Length;
  }
  public int getArea()
  {
  	return this.Width*this.Length;
  }
  public static void main(String args[])
  {
  	Rectangcle rectangcle = new Rectangcle(5,8);
    System.out.println("Width of rectangcle:" + rectangcle.getWidth());
    System.out.println("Length of rectangcle:" + rectangcle.getLength());
    System.out.println("Area of rectangcle:" + rectangcle.getArea());
  }
}