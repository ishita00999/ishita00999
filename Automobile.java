
   
class Car extends Automobile{
    public void No_of_tyres()
    {
        System.out.println("There are 4 tyres");
    }
        public void fuel(){
            System.out.println("Petrol");
        } 
        public void fuel(String fuel){
            System.out.println("Also runs on diesel");
        }
        public void seating(){
            System.out.println("4 seating");
        }
        class Bike extends Automobile{
            public void No_of_tyres()
            {
                System.out.println("There are 2 tyres");
            }
            public void fuel(){
                System.out.println("Petrol");
            }
            public void seating(){
                System.out.println("2 seating");
            }
