package strategy;

public class TestAttackBehavior {

	public static void main(String[] args) {
		Tower t1 = new PowerfulTower();
		Tower t2 = new SlowTower();
		Tower t3 = new AddSpeedTower();
		t1.performAttackBehavior();
		t2.performAttackBehavior();
		t3.performAttackBehavior();
	}
}
