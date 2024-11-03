import emp.emp;
class emppay{
public static void main(String st[]){
emp e=new emp("person",10,"manager",60000);
e.calculateHRA();
e.calculateDA();
e.calculateAllowance();
e.calculateGrosspay();
e.calculateIncomeTax();
e.calculateNetpay();
e.calculatePF();
e.displayDetails();
}

}