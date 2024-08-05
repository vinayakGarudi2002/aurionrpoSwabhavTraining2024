package com.aurionpro.behavioural.command.model;

public class PastaOrder  implements Order {
    private IChef chef;

    public PastaOrder(IChef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.cook();
    }
}
