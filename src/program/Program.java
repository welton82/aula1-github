package program;

import entities.Employee;
import entities.OutSourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        OutSourceEmployee out = new OutSourceEmployee();
        List<Employee> listEmp = new ArrayList<Employee>();


        System.out.print("Informe a quantidade de Funcionários: ");
        int n = scan.nextInt();

        for(int i=0;i<n;i++){
            scan.nextLine();
            System.out.print("Informe o nome: ");
            String nome = scan.nextLine();

            System.out.print("Funcionario Terceirzado[s/n]? ");
            char ch =scan.next().charAt(0);
            scan.nextLine();
            System.out.print("Horas: ");
            int horas = scan.nextInt();
            System.out.print("Valor Por Horas: ");
            double valHor = scan.nextDouble();

            if(ch == 's' || ch== 'S' ){
                System.out.print("Adicionar despesa adicional: ");
                double add = scan.nextDouble();
                OutSourceEmployee emp = new OutSourceEmployee(nome,horas,valHor,add);
                listEmp.add(emp);
            }else{
                Employee emp = new Employee(nome,horas,valHor);
                listEmp.add(emp);
            }
        }

        for(Employee emp: listEmp){
            System.out.println(emp.getName() + "R$ " + String.format("%.2f",emp.payment()));
        }


        scan.close();
    }
}
