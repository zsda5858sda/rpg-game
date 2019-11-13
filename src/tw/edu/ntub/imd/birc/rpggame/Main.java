package tw.edu.ntub.imd.birc.rpggame;

import tw.edu.ntub.imd.birc.rpggame.character.ArcherTrainingCamp;
import tw.edu.ntub.imd.birc.rpggame.character.Career;
import tw.edu.ntub.imd.birc.rpggame.character.Warrior;
import tw.edu.ntub.imd.birc.rpggame.trainingcamp.Archer;
import tw.edu.ntub.imd.birc.rpggame.trainingcamp.TrainingCamp;
import tw.edu.ntub.imd.birc.rpggame.trainingcamp.WarriorTrainingCamp;

public class Main {

	public static void main(String[] args) {
		TrainingCamp warriorTrainingCamp = new WarriorTrainingCamp();
		Career warrior = warriorTrainingCamp.train();
		System.out.println(warrior);
		
		TrainingCamp archerTrainingCamp = new ArcherTrainingCamp();
		Career archer = archerTrainingCamp.train();
		System.out.println(archer);
		
		TrainingCamp wizardTrainingCamp = new ArcherTrainingCamp();
		Career wizard = archerTrainingCamp.train();
		System.out.println(wizard);
	}

}