package tw.edu.ntub.imd.birc.rpggame.character;

import tw.edu.ntub.imd.birc.rpggame.trainingcamp.Archer;
import tw.edu.ntub.imd.birc.rpggame.trainingcamp.TrainingCamp;

public class ArcherTrainingCamp implements TrainingCamp {
	@Override
	public Career train() {
		Archer archer = new Archer();
		archer.setHealthPoint(165);
		archer.setMagicPoint(79);
		archer.setAttack(65);
		archer.setMagicAttack(20);
		archer.setDefence(10);
		archer.setMagicDefence(10);
		return archer;
	}
}