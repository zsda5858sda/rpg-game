package tw.edu.ntub.imd.birc.rpggame.trainingcamp;

import tw.edu.ntub.imd.birc.rpggame.character.Career;
import tw.edu.ntub.imd.birc.rpggame.character.Wizard;

public class WizardTrainingCamp implements TrainingCamp {
	
	@Override
	public Career train() {
		Wizard wizard = new Wizard();
		wizard.setHealthPoint(300);
		wizard.setMagicPoint(10);
		wizard.setAttack(45);
		wizard.setMagicAttack(5);
		wizard.setDefence(20);
		wizard.setMagicDefence(5);
		return wizard;
	}
}
