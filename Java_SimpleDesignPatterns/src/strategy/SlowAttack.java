package strategy;

public class SlowAttack implements AttackBehavior{

	public void attack() {
		System.out.println("This attack aims for slowing down!");
	}	
}
