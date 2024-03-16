 class Calculator extends Extended_Calculator {
    float addition(float num1,float num2){
        return(num1 + num2);
    }
    float substraction(float num1,float num2){
        return(num1 - num2);

 }
 float multiplication(float num1,float num2){
    return(num1 * num2);
 }
 float division(float num1,float num2){
    return(num1 / num2);
 }
 
 public static void main(String []args){
    float num1=6;
    float num2=56;
    Calculator calc = new Calculator();
    float add = calc.addition(num1, num2);
    System.out.println("addition"+ add);
    float sub = calc.substraction(num1, num2);
    System.out.println("substraction"+ sub);
    float mul = calc.multiplication(num1, num2);
    System.out.println("multiplication"+ mul);
    float div = calc.division(num1, num2);
    System.out.println("division"+ div);
   float sqr = calc.square(num1);
   System.out.println("square"+ sqr);
   float cubes = calc.cube(num1);
   System.out.println("cube"+ cubes);

    



    
    
    


 }
}




 
 

 

