
//change in master branch

class A3{
   static B obj;     //B=null,here B class will not load,B loaded when new keyword used
   static B test()    //here B is use as userdefined return data type
   {
       System.out.println("Hello students");
       return new B();   //here B class will load
   }
   public static void main(String args[])
   {
       test();
       test();
       obj=A3.test();
       C xyz=obj.test();
       A3 jky=xyz.test();
       jky.test2();
   }
   void test2()
   {
       System.out.println("Hello shailesh");
   }
}
class B{
    static
    {
        System.out.println("Hello shakshi");
    }
    C test()   //here test will load only
   {
          System.out.println("Hello chanchal");
         return new C();
    }
    {
       new A3().test2();
    }
}
class C
{
     A3 test()
     {
         System.out.println("Hello Anisha");
         return new A3();
     }  
}
    
