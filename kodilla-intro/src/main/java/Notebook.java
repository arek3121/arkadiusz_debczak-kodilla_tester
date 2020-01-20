public class Notebook {

    int weight;
    int price;
    int year;
    char grade;

    public Notebook(int weight, int price, int year, char grade) {
        this.weight = weight;
        this.price = price;
        this.year = year;
        this.grade = grade;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 700 && this.weight < 1900) {
            System.out.println("This notebook is not too heavy");
        } else {
            System.out.println("This notebook is very heavy");
        }
    }

    public void checkYearAndPrice() {

        if (this.year < 2005 ) {
            System.out.println("This notebook have Windows XP operating system");
        } else if (this.year > 2006 && this.year < 2014 && this.price < 1200) {
            System.out.println("This notebook have Windows Vista operating system");
        } else {
            System.out.println("This notebook have Windows 10 operating system");
        }
    }

    public void checkOwner() {
        if (this.price < 600) {
            System.out.println("This notebook is for Daniel");
        } else if (this.price > 700 && this.price < 1200) {
            System.out.println("This notebook is for Paweł");
        } else {
            System.out.println("This notebook is for Arek");
        }
    }
}