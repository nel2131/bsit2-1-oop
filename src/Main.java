public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Jett", 20, "BSIT", 85, 90, 88);
        Student s2 = new Student("Harbor", 19, "BSCS", 90, 87, 94);
        Student s3 = new Student("Fade", 21, "BSIT", 87, 90, 80);

        Student[] students = { s1, s2, s3 };
        int passingCount = 0;

        for (Student stdnts : students) {
            stdnts.displayInfo();
            if (stdnts.isPassing()) {
                passingCount++;
            }
        }

        System.out.println("Summary: " + passingCount + " out of " +
                students.length + " students are passing.");
    }
}