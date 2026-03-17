package enemyCreationFactory;

import enemyCreationFactory.factory.EnemyFactory;

public class Main {
    public static void main(String[] args) {
    	
    	Enemy e = EnemyFactory.createEnemy(EnemyType.ALIEN);
    	Enemy e2 = EnemyFactory.createEnemy(EnemyType.ZOMBIE);
    	
    	e.attack();
    	e2.attack();
    }
}