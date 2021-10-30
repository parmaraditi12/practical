import java.lang.Math; 
class UserInputDemo { 
static int factorial(int n){    
if (n == 0) 
return 1; 
else 
return(n * factorial(n-1));  
} 
public static void main(String[] args) 
{ 
int x= Integer.parseInt(args[0]); 
int n= Integer.parseInt(args[1]); 
double sum = 1; 
sum += (Math.pow(x, i)/factorial(i)); 
} 
System.out.println(sum); 
} 
}