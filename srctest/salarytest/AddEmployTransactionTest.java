package salarytest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import implement.classification.CommissionedClassfication;
import implement.classification.HourlyClassification;
import implement.classification.SalariedClassfication;
import implement.database.PayrollDatabase;
import implement.entity.Employee;
import implement.method.HoldMethod;
import implement.schedule.MonthlySchedule;
import implement.transaction.AddCommissionedEmployee;
import implement.transaction.AddHourlyEmployee;
import implement.transaction.AddSalariedEmployee;

public class AddEmployTransactionTest {
	PayrollDatabase payrollDatabase = PayrollDatabase.getPayrollDatabase();

    @Test
    public void testaddSalariedEmployee(){
        int empId = 1;
        String name = "Bob";
        String address = "Bob.home";
        double monthlyPay = 1000.0;

        AddSalariedEmployee addSalariedEmployee = new AddSalariedEmployee(empId,name,address,monthlyPay);
        addSalariedEmployee.execute();

        Employee e = payrollDatabase.getEmployeeById(empId);

        SalariedClassfication salariedClassification = (SalariedClassfication) e.getPaymentclassification();

        MonthlySchedule monthlySchedule = (MonthlySchedule) e.getPaymentSchedule();
        System.out.println(monthlySchedule.toString());

        HoldMethod holdMethod = (HoldMethod) e.getPaymentMethod();
        assertNotNull(e);
    }

    @Test
    public void testaddHourlyEmployee(){
        long id = 2;
        String name = "Bobh";
        String address = "Bobh.home";
        double hourPay = 150;

        AddHourlyEmployee addHourlyEmployee = new AddHourlyEmployee(id,name,address,hourPay);
        addHourlyEmployee.execute();

        Employee e = payrollDatabase.getEmployeeById(id);
        assertEquals(e.getName(),name);

        HourlyClassification classification = (HourlyClassification) e.getPaymentclassification();
        assertEquals(hourPay,classification.getHourlyPay(),0.01);
    }


    @Test
    public void testAddCommissionedEmployee(){
        long id = 3;
        String name = "Bob3";
        String address = "Bob3.home";
        double monthPay = 200;
        double commissionRate = 5;

        AddCommissionedEmployee addCommissionedEmployee = new AddCommissionedEmployee(id,name,address,monthPay,commissionRate);
        addCommissionedEmployee.execute();

        Employee e = payrollDatabase.getEmployeeById(id);
        assertEquals(e.getName(),name);

        CommissionedClassfication commissionedClassification = (CommissionedClassfication) e.getPaymentclassification();

    }
}
