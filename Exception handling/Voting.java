public class Voting {
    public static void main(String[] args) {
        int age = 17;
        try {
            if (age < 18) {
                throw new UnderAgeException("Tushar you cannot Vote!");
            } else {
                System.out.println("You can vote!");
            }
        } catch (UnderAgeException e) {
            e.printStackTrace();
        }
    }
}
