// 2. learn java inner classes and implement using simple project


// main classs
public class JavaInnerClasses 
{


    // inner class
    public class JavaInnerClassesDemo
    {
        
        // inner class method that is innerTest() 
        public void innerTest()
        {
            System.out.println("Inside the inner class.....");
        }
        
    }


    // main class method that is test()
    public void test()
    {
        JavaInnerClassesDemo innerclass=new JavaInnerClassesDemo();
        innerclass.innerTest();

        System.out.println("This in the main classs.....");
    }


    public static void main(String args[])
    {
        
        JavaInnerClasses in=new JavaInnerClasses();

        in.test();

    }    
}
