public class OnlineRegistration {

    // Interface LibraryUser
    interface LibraryUser {
        void registerAccount(int age);

        void requestBook(String bookType);
    }

    // KidUser class implementing LibraryUser
    static class KidUser implements LibraryUser {
        private int age;

        public void registerAccount(int age) {
            if (age <= 11) {
                System.out.println("You have successfully registered under a Kids Account");
                this.age = age;
            } else {
                System.out.println("Sorry, age must be less than or equal to 11 to register as a kid.");
            }
        }

        public void requestBook(String bookType) {
            if (age <= 11) {
                if (bookType.equals("Kids")) {
                    System.out.println("Book issued successfully, please return the book within 10 days");
                } else {
                    System.out.println("Oops, you are allowed to take only kids books.");
                }
            } else {
                System.out.println("You are not registered as a kid.");
            }
        }
    }


    static class AdultUser implements LibraryUser {
        private int age;

        public void registerAccount(int age) {
            if (age >= 12) {
                System.out.println("You have successfully registered under an Adult Account.");
                this.age = age;
            } else {
                System.out.println("Sorry, age must be greater than or equal to 12 to register as an adult.");
            }
        }

        public void requestBook(String bookType) {
            if (age >= 12) {
                if (bookType.equals("Fiction")) {
                    System.out.println("Book issued successfully, please return the book within 7 days.");
                } else {
                    System.out.println("Oops, you are allowed to take only adult Fiction books.");
                }
            } else {
                System.out.println("You are not registered as an adult.");
            }
        }
    }

    public static void main(String[] args) {
        KidUser kid = new KidUser();
        kid.registerAccount(10);
        kid.requestBook("Kids");

        AdultUser adult = new AdultUser();
        adult.registerAccount(25);
        adult.requestBook("Fiction");
    }
}







