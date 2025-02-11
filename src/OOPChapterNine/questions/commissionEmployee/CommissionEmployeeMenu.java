package OOPChapterNine.questions.commissionEmployee;

import OOPChapterNine.questions.commissionEmployee.BasePlusCommissionEmployee;
import OOPChapterNine.questions.commissionEmployee.CommissionBaseEmployee;

public class CommissionEmployeeMenu {

    public static void main(String[] args) {
        CommissionBaseEmployee commissionBaseEmployee = new CommissionBaseEmployee("Babatunde", "Olaleye", "12345", 1.0, 20_000);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(commissionBaseEmployee, "Babatunde", "Olaleye",
                "12345", 10000.0, 1.0, 10_000);

        System.out.println(basePlusCommissionEmployee.earning());

    }
}
