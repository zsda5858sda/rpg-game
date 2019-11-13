package tw.edu.ntub.imd.birc.rpggame.character;

public abstract class Career {
	private int healthPoint;
	private int magicPoint;
	private int attack;
	private int magicAttack;
	private int defence;
	private int magicDefence;

	public int getHealthPoint() {
		return healthPoint;
	}

	public void setHealthPoint(int healthPoint) {
		if (healthPoint > 0) {
			this.healthPoint = healthPoint;
		} else {
			System.out.println("生命值不能是負數!");
		}
	}

	public int getMagicPoint() {
		return magicPoint;
	}

	public void setMagicPoint(int magicPoint) {
		if (magicPoint > 0) {
			this.magicPoint = magicPoint;
		} else {
			System.out.println("魔力不能是負數!");
		}
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		if (attack > 0) {
			this.attack = attack;
		} else {
			System.out.println("攻擊力不能是負數!");
		}
	}

	public int getMagicAttack() {
		return magicAttack;
	}

	public void setMagicAttack(int magicAttack) {
		if (magicAttack > 0) {
			this.magicAttack = magicAttack;
		} else {
			System.out.println("魔法攻擊力不能是負數!");
		}
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		if (defence > 0) {
			this.defence = defence;
		} else {
			System.out.println("防禦不能是負數!");
		}
	}

	public int getMagicDefence() {
		return magicDefence;
	}

	public void setMagicDefence(int magicDefence) {
		if (magicDefence > 0) {
			this.magicDefence = magicDefence;
		} else {
			System.out.println("魔法防禦力不能是負數!");
		}
	}

	public abstract String getCareerName();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getCareerName() + " [healthPoint=").append(healthPoint).append(", magicPoint=")
				.append(magicPoint).append(", attack=").append(attack).append(", magicAttack=").append(magicAttack)
				.append(", defence=").append(defence).append(", magicDefence=").append(magicDefence).append("]");
		return builder.toString();
	}
}
