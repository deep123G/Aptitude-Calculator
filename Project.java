import java.util.*;


class Choose{
    void simpleMathOption(int a1){
        System.out.println("a: Addition");
        System.out.println("b: Substraction");
        System.out.println("c: Multiplication");
        System.out.println("d: Division");
        System.out.println("e: Reminder");
    }
}

class simpleMathe{
    void add(float a,float b){
        System.out.println(a+b);
    }
    void sub(float a,float b){
        System.out.println(a-b);
    }
    void mul(float a,float b){
        System.out.println(a*b);
    }
    void div(float a,float b){
        System.out.println(a/b);
    }
    void rem(float a,float b){
        System.out.println(a%b);
    }

}
//Percentage:

class PercentOption{
    void option(int b){
        System.out.print("Choose the option: ");
        System.out.println();

        System.out.println("a: How much Percent");
        System.out.println("b: What Percent");
        System.out.println("c: What Percent less: ");
        System.out.println("d: What Percent more: ");

    }
}

class Percentage{
    Scanner scan = new Scanner(System.in);
    void howMuchPercent(){

        System.out.print("Enter the Secure mark: ");
        float  secureMark = scan.nextFloat();
        System.out.print("Enter the Total Mark: ");
        float totalMark = scan.nextFloat();;

        float result = (secureMark/totalMark)*100;
        System.out.println(result);
    }

    void whatPercent(){
        System.out.print("Enter the Total: ");
        float Total= scan.nextFloat();
        System.out.print("Enter the percentage value required: ");
        float percentage=scan.nextFloat();

        float Result = (percentage/100)*Total;

        System.out.println(Result);
    }

    void whatPercentLess(){
        System.out.print("Enter the having value: ");
        float haveValue = scan.nextFloat();
        System.out.print("Enter the Total: ");
        float Total =scan.nextFloat();

        //Difference:
        float dif =(Total - haveValue);

        float result =(dif/Total)*100;

        System.out.println(result);
    }

    void whatPercentMore(){
        System.out.print("Enter the having value: ");
        float haveValue = scan.nextFloat();
        System.out.print("Enter the Total: ");
        float Total =scan.nextFloat();

        //Difference:
        float dif =(Total - haveValue);

        float result = (dif/haveValue)*100;

        System.out.println(result);
    }

}

public class Project {
    public  static void main(String[] args){
        //For taking Input:
        Scanner scan =new Scanner(System.in);

        //Heading:
        System.out.println("!......WELCOME TO APTITUDE CALC......!");

        //For Gap:
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Please Choose the topic: ");

        System.out.println("1: Simple mathematics Calculation");
        System.out.println("2: Percentage");
        System.out.println("3: Ratio");
        System.out.println("4: Average");
        System.out.println("5: Profit,Loss and Discount");
        System.out.println("6: Time and Work");
        System.out.println("7: Pipe and Cistern");
        System.out.println("7: Mensuration");



        System.out.println();


        System.out.print("Enter here: ");

        int a1 = scan.nextInt();



        Choose c =new Choose();
        PercentOption p = new PercentOption();

        Percentage p1 = new Percentage();

        if(a1 == 1){
            c.simpleMathOption(a1);
            {

                char o1 = scan.next().charAt(0);

                simpleMathe a = new simpleMathe();
                System.out.print("Enter the num1: ");
                float num1 = scan.nextFloat();
                System.out.print("Enter the num2: ");
                float num2 = scan.nextFloat();
                if (o1=='a'){
                    a.add(num1,num2);
                } else if (o1 == 'b') {
                    a.sub(num1,num2);
                } else if (o1 == 'c') {
                    a.mul(num1,num2);
                } else if (o1 == 'd') {
                    a.div(num1,num2);
                } else if (o1 == 'e') {
                    a.rem(num1,num2);
                }
            }
        } else if (a1 == 2) {

            p.option(a1);
            System.out.print("Enter which kind of operation you want to perform: ");
            char ch =scan.next().charAt(0);
                    if (ch == 'a'){
                        p1.howMuchPercent();
                    } else if (ch == 'b') {
                        p1.whatPercent();
                    } else if (ch=='c') {
                        p1.whatPercentLess();
                    } else if (ch=='d') {
                        p1.whatPercentMore();
                    }
        }



    }

}
