class Animal
{  
void eat()
{
System.out.println("eating...");
}  
}  
class Fish extends Animal
{  
void swim()
{
System.out.println("Swimming...");
}  
}  
class TestInheritance
{  
public static void main(String args[])
{  
Fish f=new Fish();  
f.swim();  
f.eat();  
}
}
