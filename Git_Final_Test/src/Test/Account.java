package Test;

public class Account extends Calender {
	double monthlyIncome = 1000000; // 수입
    double monthlyExpense = 0.0; //지출
    
 // 일간 사용 금액
    double dailyUsage = 20000.0;
 // 하루 예산 계산
    double dailyBudget = (monthlyIncome - monthlyExpense) / daysRemaining;
    
    

}
