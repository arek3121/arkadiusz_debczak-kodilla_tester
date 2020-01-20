public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1500, 2015, 'A');
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year + " " + notebook.grade);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();
        notebook.checkOwner();

        Notebook heavyNotebook = new Notebook(2000, 1100, 2008, 'B');
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year + " " + heavyNotebook.grade);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();
        heavyNotebook.checkOwner();

        Notebook oldNotebook = new Notebook(1600, 600, 2004, 'C');
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year + " " + oldNotebook.grade);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();
        oldNotebook.checkOwner();
    }
}