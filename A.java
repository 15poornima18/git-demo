//change again in master 
class A
{
  /*int v1;
  public static void main(String args[])
  {
	  A pt=new A();  //helloo
	  A hj=new A();
	  A s2=new A();
	  
	  pt.v1=1000;
	  hj.v1=2000;
	  
	  s2.v1=pt.v1+hj.v1;
	  
	  System.out.println(pt.v1);
	  System.out.println(hj.v1);
	  System.out.println(s2.v1);
	  System.out.println(this);

  }*/
  
  static A obj;
  A()
  {
	  System.out.println("3).obj:"+obj);
	  System.out.println("this:"+this);
  }
  public static void main(String args[])
  {
      // A obj=null;
	  System.out.println("1).obj:"+obj);
	  obj=new A();
	  System.out.println("2).obj:"+obj);

  }
 

}
