class Ab{
static int a=10;
static int b=12;
void m1()
{
 System.out.println("m1 method");
}
void m2()
{
 System.out.println("m2 method");
}

 public static void main(String args[])
{
 System.out.println(a);
 System.out.println(b);
 new Ab().m1();
 new Ab().m2();
}
}