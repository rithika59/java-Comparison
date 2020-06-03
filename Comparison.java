
public class Comparison {
    public static void main(String[] args){
        Double num1,num2;
        if(args.length != 2)
        {
            System.out.println("Cannot accept more than two args.");
            System.exit(0);
        }
        else{
            try{
                num1 = Double.parseDouble(args[0]);
                num2 = Double.parseDouble(args[1]);
                if(num1 == num2)
                System.out.println(num1+" = "+num2);
                else{
                    if(num1>num2)
                    System.out.println(num1+" > "+num2);
                    else
                    System.out.println(num1+" < "+num2);
                }
            }
            catch(NumberFormatException e){
                System.err.println("Argument must be numbers.");
                System.exit(1);
            }
        }
    }
}