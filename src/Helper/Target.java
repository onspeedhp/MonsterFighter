package Helper;

import ObjectModel.Monster;

public interface Target {
	abstract boolean attackanothermonstaer(Monster enemyMonster, boolean isSkillUsed);
}
