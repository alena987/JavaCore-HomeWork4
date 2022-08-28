package lesson4;

public class Main {

    public static void main(String[] args) {
        doPhoneBook();
        WordsArray wordsArray = new WordsArray(createArrayWords());
        wordsArray.doArrayWords();
    }

    private static void doPhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addElementPhoneBook("Alena","89111234567");
        phoneBook.addElementPhoneBook("Alena","89111234568");
        phoneBook.addElementPhoneBook("Alena","89111234569");

        phoneBook.addElementPhoneBook("Alex","88126923715");
        phoneBook.addElementPhoneBook("Alex","88126923715");
        phoneBook.addElementPhoneBook("Alex","88126923715   ");
        phoneBook.addElementPhoneBook("Alex","8 812    692 3715 ");

        System.out.println("Alena: " + phoneBook.getPhonesByName("Alena"));
        System.out.println("Alex: " + phoneBook.getPhonesByName("Alex"));
        System.out.println("Maks: " + phoneBook.getPhonesByName("Maks"));
        System.out.println("Inkognito: " + phoneBook.getPhonesByName("Inkognito"));
    }

    private static String[] createArrayWords() {
        String [] strings = new String[10];
        strings[0] = "Mars";
        strings[1] = "Mars";
        strings[2] = "Luna";
        strings[3] = "Neptun";
        strings[4] = "Upiter";
        strings[5] = "Pluton";
        strings[6] = "Saturn";
        strings[7] = "Venera";
        strings[8] = "Upiter";
        strings[9] = "Saturn";
        return strings;
    }

}

