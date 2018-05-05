class CLA
{
  public static void main(String args[])
  {
  	CLA2 cla2 = new CLA2();
  	CLA2.doStaticMethod();
  	//cla.doStaticMethod();
    System.out.println(cla2.sv);
    System.out.println(CLA2.sv);
    //System.out.println(args[1]);
    //System.out.println(args[2]);
    // output exeption if not enough parameters 
  }
}
class CLA2
{
  int nsv = 1;
  static int sv = 1 ;
  static void doStaticMethod()
  {	
  	sv += 1;
  }
  void doNonStaticMethod()
  {
  	doStaticMethod();
  }
}