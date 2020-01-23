public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1500, 2015, 'A');
        nowaMetoda(notebook);

        Notebook heavyNotebook = new Notebook(2000, 1100, 2008, 'B');
        nowaMetoda(heavyNotebook);

        Notebook oldNotebook = new Notebook(1600, 600, 2004, 'C');
        nowaMetoda(oldNotebook);
    }

    private static void nowaMetoda(Notebook oldNotebook) {
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year + " " + oldNotebook.grade);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();
        oldNotebook.checkOwner();
    }
}



