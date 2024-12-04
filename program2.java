// Title: Write a java program to implement Box class application to depict constructor
// overloading.


// Problem Description: Given three classes called A, B, and C, C can be a subclass of B,
// which is a subclass of A. When this type of situation occurs, each subclass inherits all of the
// traits found in all of its super classes. methods with different parameters.


// Method: In this program, C inherits all aspects of B and A. To see how a multilevel
// hierarchy can be useful, consider the following program. In it, the subclass BoxWeight is
// used as a superclass to create the subclass called Shipment. Shipment inherits all of the traits
// of BoxWeight and Box, and adds a field called cost, which holds the cost of shipping such a
// parcel.


// Code:
class Box {
double length;
double width;
double height;
// Default constructor
Box() {
length = -1;
width = -1;
height = -1;
}
// Parameterized constructor
Box(double len, double wid, double hgt) {
length = len;
width = wid;
height = hgt;
}
// Copy constructor
Box(Box ob) {
length = ob.length;
width = ob.width;
height = ob.height;
}
Box(double len)
{
width=height=length=len;
}
// Method to calculate volume
double volume() {
return length * width * height;
}
}
// Define the BoxWeight class that extends Box
class BoxWeight extends Box {
double weight;
// Default constructor
BoxWeight() {
super();
weight = -1;
}
// Parameterized constructor
BoxWeight(double len, double wid, double hgt, double wt) {
super(len, wid, hgt);
weight = wt;
}
// Copy constructor
BoxWeight(BoxWeight ob) {
super(ob);
weight = ob.weight;
}
BoxWeight(double len, double wt)
{
super(len);
weight=wt;
}
}
// Define the Shipment class that extends BoxWeight
class Shipment extends BoxWeight {
double cost;
// Default constructor
Shipment() {
super();
cost = -1;
}
// Parameterized constructor
Shipment(double len, double wid, double hgt, double wt, double c) {
super(len, wid, hgt, wt);
cost = c;
}
// Copy constructor
Shipment(Shipment ob) {
super(ob);
cost = ob.cost;
}
Shipment(double len, double wt, double c)
{
super(len,wt);
cost=c;
}
}
public class BoxClassApplication
{
public static void main(String[] args)
{
Shipment shipment1 =new Shipment(10, 20, 15, 10, 3.41);
Shipment shipment2 =new Shipment(2, 3, 4, 0.76, 1.28);
double vol;
vol = shipment1.volume();
System.out.println("Volume of shipment1 is " + vol);
System.out.println("Weight of shipment1 is "+ shipment1.weight);
System.out.println("Shipping cost: $" + shipment1.cost);
System.out.println();
vol = shipment2.volume();
System.out.println("Volume of shipment2 is " + vol);
System.out.println("Weight of shipment2 is "+ shipment2.weight);
System.out.println("Shipping cost: $" + shipment2.cost);
}
}