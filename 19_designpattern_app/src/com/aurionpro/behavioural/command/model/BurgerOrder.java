package com.aurionpro.behavioural.command.model;

public class BurgerOrder implements Order {
    private IChef chef;

    public BurgerOrder(IChef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.cook();
    }
}
