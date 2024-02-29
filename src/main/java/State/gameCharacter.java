package State;

class gameCharacter {
    private String name;
    private int experiencePoints;
    private int healthPoints;
    public CharacterState currentState;

    public gameCharacter(String name) {
        this.name = name;
        this.currentState = new NoviceState();
        this.experiencePoints = 0;
        this.healthPoints = 100;
    }

    public String getName() {
        return name;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void increaseExperience(int amount) {
        experiencePoints += amount;
        checkAndUpdateState();
    }

    public void increaseHealth(int amount) {
        healthPoints += amount;
    }

    public void decreaseHealth(int amount) {
        healthPoints -= amount;
        if (healthPoints <= 0) {
            System.out.println("Game Over! Your character has lost all health points.");
            System.exit(0);
        }
    }

    public void train() {
        currentState.train(this);
    }

    public void meditate() {
        currentState.meditate(this);
    }

    public void fight() {
        currentState.fight(this);
    }

    public void displayStatus() {
        currentState.displayStatus(this);
    }

    private void checkAndUpdateState() {
        if (experiencePoints >= 100 && currentState instanceof NoviceState) {
            currentState = new IntermediateState();
        } else if (experiencePoints >= 200 && currentState instanceof IntermediateState) {
            currentState = new ExpertState();
        } else if (experiencePoints >= 300 && currentState instanceof ExpertState) {
            currentState = new MasterState();
        }
    }
}

