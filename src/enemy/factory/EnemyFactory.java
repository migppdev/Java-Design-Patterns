package enemy.factory;

import enemy.Alien;
import enemy.Enemy;
import enemy.EnemyType;
import enemy.Zombie;

public class EnemyFactory {
		
    public static Enemy createEnemy(EnemyType type) {
    	switch (type) {
    	
			case EnemyType.ALIEN: {
				return new Alien();
			}
			
			case EnemyType.ZOMBIE: {
				return new Zombie();
			}
			
		default:
			throw new IllegalArgumentException("Unknown type " + type);
		}
    }
}