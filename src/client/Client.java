package client;

import drinks.Coffee;

public class Client {

        private Coffee coffee;

        public void getCoffee() {coffee.prepareDrink();}

        public void setCoffee(Coffee coffee) {
            this.coffee = coffee;
        }
}

