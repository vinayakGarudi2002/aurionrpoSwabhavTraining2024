package com.aurionpro.behavioural.command.test;

import com.aurionpro.behavioural.command.model.BurgerOrder;
import com.aurionpro.behavioural.command.model.CookBurger;
import com.aurionpro.behavioural.command.model.CookPasta;
import com.aurionpro.behavioural.command.model.IChef;
import com.aurionpro.behavioural.command.model.Order;
import com.aurionpro.behavioural.command.model.PastaOrder;
import com.aurionpro.behavioural.command.model.Waiter;

public class ReasturantTest {
    public static void main(String[] args) {
        IChef chef = new CookBurger();
        IChef chef1 = new CookPasta();
        
        Waiter waiter = new Waiter();

        // Customer orders a burger
        Order burgerOrder = new BurgerOrder(chef);
        waiter.takeOrder(burgerOrder);
        waiter.placeOrder(); // Output: Chef is cooking a burger.

        // Customer orders pasta
        Order pastaOrder = new PastaOrder(chef1);
        
        
        
        waiter.takeOrder(pastaOrder);
        waiter.placeOrder(); // Output: Chef is cooking pasta.
    }

}
