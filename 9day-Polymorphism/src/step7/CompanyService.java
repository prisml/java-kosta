package step7;

public class CompanyService {

	public void calculateAnnualIncome(Employee employee) {
		int sum = 0;
		sum = employee.getSalary() * 12;
		if (employee instanceof Engineer)
			sum += ((Engineer) employee).getBonus() * 12;
		System.out.println(sum);
	}

	public void calculateTotalCost(Employee[] empList) {
		int sum = 0;
		for (int i = 0; i < empList.length; i++) {
			sum += empList[i].getSalary() * 12;
			if (empList[i] instanceof Engineer)
				sum += ((Engineer) empList[i]).getBonus() * 12;

		}
		System.out.println(sum);
	}

}
