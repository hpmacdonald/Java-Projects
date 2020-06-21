public class Test{
    public static void main(String[] args){
        Calculator calc = new Calculator();
        Calculator calc2 = new Calculator();
        Calculator calc3 = new Calculator();
        calc.setNum1(20.5);
        calc.setNum2(50.2);
        calc.setOperator('+');
        calc.performEquation();
        calc.getResults();

        // Test #2

        calc2.setNum1(83.5);
        calc2.setNum2(30.10);
        calc2.setOperator('-');
        calc2.performEquation();
        calc2.getResults();

        //Test #3
        calc3.setNum1(5.);
        calc3.setNum2(5.);
        calc3.setOperator('*');
        calc3.performEquation();
        calc3.getResults();
    }
}