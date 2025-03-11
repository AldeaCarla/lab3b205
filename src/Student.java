import java.util.*;

class Student {
    String nume;
    String prenume;
    String grupa;
    List<Integer> note;
    Student(String nume, String prenume, String grupa) {
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        this.note = new ArrayList<>();
    }
    public void genereazaNoteAleatorii() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            note.add(rand.nextInt(7) + 4); // Note în intervalul [4, 10]
        }
    }
    public String toString() {
        return nume + " " + prenume + " | Grupa: " + grupa + " | Note: " + note;
    }
}