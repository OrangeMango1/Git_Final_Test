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
    
    public void isLastDayOfMonth() {
    	//월 마지막일 때 월 예산 사용량 알림
    	if (isLastDayOfMonth) {
    		System.out.println("오늘은 월 마지막 날입니다.");
        	System.out.println("이번 달 예산 사용량: " + monthlyBudgetUsage + "원");
    	}
    }
    public void BudgetWarning() {
    	if (dailyBudget < dailyUsage) {
    		System.out.println("경고: 하루 예산을 초과하였습니다!");
    	}
    }

}
