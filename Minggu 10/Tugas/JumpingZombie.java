public class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level){
        super(health, level);
    }

    @Override
    public void heal() {
        switch(level){
            case 1:
                health += health * 0.1;
                break;
            case 2:
                health += health * 0.2;
                break;
            case 3: 
                health += health * 0.3;
                break;
        }
    }
    
    @Override
    public void destroyed() {
        health -= health * 0.01;
    }

    @Override
    public String getZombieInfo(){
        return "Jumping zombie:\n " + super.getZombieInfo();
    }
}
