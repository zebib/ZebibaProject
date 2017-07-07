package july5th;

public class CreditCardJ {
	int reward;
	CreditCardJ(int reward){
		this.reward=reward;
		
	}
	public int getReward(int reward) {
		if(reward>25) {
			return reward;
		}
		else {
		return 0;
		}
	}

}
