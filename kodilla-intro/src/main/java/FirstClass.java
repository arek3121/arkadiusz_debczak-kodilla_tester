public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1500, 2015, 'A');
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year + " " + notebook.grade);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();
        notebook.checkOwner();
        notebook.checkCpu();


        Notebook heavyNotebook = new Notebook(2000, 800, 2010, 'B');
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year + " " + heavyNotebook.grade);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();
        heavyNotebook.checkOwner();
        heavyNotebook.checkCpu();


        Notebook oldNotebook = new Notebook(1600, 500, 2000, 'C');
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year + " " + oldNotebook.grade);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();
        oldNotebook.checkOwner();


    }
}