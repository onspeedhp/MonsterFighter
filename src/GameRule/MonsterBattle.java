// package GameRule;

// import java.util.Random;

// import ObjectModel.Monster;
// import ObjectModel.Monster.SkillType;
// import ObjectModel.DefenceMonster;

// public class MonsterBattle {
	
// 	public static void main(String[] args){
	
// 		DefenceMonster shark = new DefenceMonster("Sharken", 2500, 100, SkillType.BITE);
// 		DefenceMonster whales = new DefenceMonster("Whalesio", 5000, 20, SkillType.BITE);
// 		startBattle(shark, whales);
// 	}
	
// 	private static void startBattle(Monster a, Monster b){
		
// 		System.out.println(a.getMonsterName() + "(" + a.getHp() +") Versus " + b.getMonsterName() + "(" + b.getHp() + ")");
// 		System.out.println("+----------------------------------------------+");
		
// 		boolean result = false;
// 		int turn = 0;
// 		Random random = new Random();
	    
// 		do {
// 			if (turn == 0){
// 				result = a.attackingUsingSkill(b, random.nextBoolean());
// 				turn = 1;
// 			}else{
// 				result = b.attackingUsingSkill(a, random.nextBoolean());
// 				turn = 0;
// 			}
// 		} while (!result);
// 	}
// }
