class slope{

static double Slope;
public static double calculate(String[] args){
try{
// coords
int x1 = Integer.parseInt(args[0]);
int y1 = Integer.parseInt(args[1]);
int x2 = Integer.parseInt(args[2]);
int y2 = Integer.parseInt(args[3]);

double n, d;

n = y1-y2;
d = x1-x2;
if (d == 0){
Slope = 1;
} else {
Slope = n / d;
}
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Y U NO ENTER THE 2 COORDINATES AND 4 ARGS?????");
  try{
   System.in.read();}
  catch(java.lang.Exception ex){
   System.out.println("");
  }
System.out.println("Well, screw you.  You should've typed:  java slope x1 y1 x2 y2");
} catch (ArithmeticException | NumberFormatException e){
System.out.println("Y U NO DO MATH RIGHT???");
}
return Slope;
}
public static void main(String args[]){
double result = calculate(args);
System.out.println("The slope is: " + result);
}
}