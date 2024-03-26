public class Main {
    class Dog implements Animal {

        @Override
        public void sound() {
            System.out.println("Гав");
        }

        @Override
        public void eat() {
            System.out.println("еда для собак");
        }
    }

    class Cat implements Animal{

        @Override
        public void sound() {
            System.out.println("Мяу");
        }

        @Override
        public void eat() {
            System.out.println("еда для кошек");

        }
    }

    class Dog1 implements Pet{

        @Override
        public void sound() {
            System.out.println("Гав");

        }

        @Override
        public void eat() {
            System.out.println("еда для собак");

        }

        @Override
        public void Play() {
            System.out.println("игра с собакой");
        }
    }

    class Cat1 implements Pet{

        @Override
        public void sound() {
            System.out.println("Мяу");

        }

        @Override
        public void eat() {
            System.out.println("еда для кошек");

        }

        @Override
        public void Play() {
            System.out.println("играете с кошкой");
        }
    }
}