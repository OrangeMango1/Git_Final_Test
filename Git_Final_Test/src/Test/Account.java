package Test;

public class Account extends Calender {
	double monthlyIncome = 1000000; // 수입
    double monthlyExpense = 0.0; //지출
    
    // 일간 사용 금액
    double dailyUsage = 20000.0;
    // 하루 예산 계산
    double dailyBudget = (monthlyIncome - monthlyExpense) / daysRemaining;
    // 하루 예산 경고 기준 (90%)
    double budgetWarningThreshold = 0.9 * dailyBudget;
    // 월 예산 사용량 계산
    double monthlyBudgetUsage = monthlyIncome - monthlyExpense - dailyUsage;
    
    

}
