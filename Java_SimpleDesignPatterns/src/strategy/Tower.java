package strategy;

public class Tower {

	protected AttackBehavior ab;
	
	public void setAttackBehavior(AttackBehavior ab) {
		this.ab = ab;
	}
	
	public void performAttackBehavior() {
		ab.attack();
	}
}
