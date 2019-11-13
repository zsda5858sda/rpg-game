package tw.edu.ntub.imd.birc.rpggame.trainingcamp;

import tw.edu.ntub.imd.birc.rpggame.character.Career;
import tw.edu.ntub.imd.birc.rpggame.character.Warrior;

public class WarriorTrainingCamp implements TrainingCamp {
	@Override
	public Career train() {
		Warrior warrior = new Warrior();
		warrior.setHealthPoint(300);
		warrior.setMagicPoint(10);
		warrior.setAttack(45);
		warrior.setMagicAttack(5);
		warrior.setDefence(20);
		warrior.setMagicDefence(5);
		return warrior;
	}
}