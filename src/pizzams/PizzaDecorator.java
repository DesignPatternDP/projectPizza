/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzams;

/**
 *
 * @author Ramis
 */
abstract class PizzaDecorator implements IPizza {
    
    Pizza pizza;

    public PizzaDecorator(Pizza newPizza) {
        this.pizza = newPizza;
    }

    @Override
    public String bakePizza() {
        return pizza.bakePizza();
    }
}
