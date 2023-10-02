import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArrayList<Utente> users = new ArrayList<>();

        users.add(new Utente("Tomás", "M", 19, 1.82F, 70));
        users.add(new Utente("Gui", "M", 20, 1.80F, 70));
        users.add(new Utente("Granjo", "M", 21, 1.83F, 80));
        users.add(new Utente("Carlota", "F", 19, 1.65F, 60));
        users.add(new Utente("Miriam", "F", 20, 1.60F, 60));
        users.add(new Utente("Carlão", "M", 20, 1.50F, 120));

        // Get the details of each user
        for (Utente user : users) {
            System.out.println(user.toString());
        }

        System.out.println();


        // Get the name, IMC and obesity degree of each user
        for (Utente user : users) {
            String name = user.getNome();
            float imc = user.calculateImc();
            String obesityDegree = user.calculateObesityDegree();

            System.out.println("---Users---");
            System.out.println("Name: " + name);
            System.out.println("IMC: " + imc);
            System.out.println("Obesity Degree: " + obesityDegree);
            System.out.println();
        }


        // Get the name and obesity degree of unhealthy users
        for (Utente user : users) {
            String name = user.getNome();
            String obesityDegree = user.calculateObesityDegree();

            if (!obesityDegree.equals("Healthy")) {
                System.out.println("---Unhealthy users---");
                System.out.println("Name: " + user.getNome());
                System.out.println("Obesity Degree: " + user.calculateObesityDegree());
                System.out.println();
            }
        }


        // Trade ages between two users
        int tempAge = users.get(0).getIdade();
        users.get(0).setIdade(users.get(1).getIdade());
        users.get(1).setIdade(tempAge);


        // Check the youngest between two users
        if (users.get(0).getIdade() < users.get(1).getIdade()) {
            System.out.println(users.get(0).getNome() + " is the youngest");
            System.out.println();
        }
        else if (users.get(1).getIdade() < users.get(0).getIdade()) {
            System.out.println(users.get(1).getNome() + " is the youngest");
            System.out.println();
        }
        else {
            System.out.println("They are both the same age");
            System.out.println();
        }


        // name of the person to be found
        String searchingName = "Tomás";

        // search the array list to find the user and show his/her informations
        boolean userFound = false;

        for (Utente user : users) {
            if (user.getNome().equals(searchingName)) {
                System.out.println("---User Info---");
                System.out.println(user.toString());
                System.out.println("IMC: " + user.calculateImc());
                System.out.println("Obesity Degree: " + user.calculateObesityDegree());
                userFound = true;
                break;
            }
        }

        if (!userFound) {
            System.out.println("User not found");
        }


        // calculate average height
        double sum = 0;
        for (Utente user : users) {
            sum += user.getAltura();
        }

        double averageHeight = sum / users.size();

        System.out.println();
        System.out.println("The average height is " + averageHeight + " meters");
    }
}