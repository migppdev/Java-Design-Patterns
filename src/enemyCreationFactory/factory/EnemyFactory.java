package enemyCreationFactory.factory;

import enemyCreationFactory.Alien;
import enemyCreationFactory.Enemy;
import enemyCreationFactory.EnemyType;
import enemyCreationFactory.Zombie;

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