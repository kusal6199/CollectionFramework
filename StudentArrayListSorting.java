import java.util.ArrayList;

public class StudentArrayListSorting {

    public String name;
    public double gpa;

    public StudentArrayListSorting(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public static void main(String[] args) {
        ArrayList<StudentArrayListSorting> list = new ArrayList<>();

        list.add(new StudentArrayListSorting("Ram",3.7));
        list.add(new StudentArrayListSorting("sita",3.5));
        list.add(new StudentArrayListSorting("shyam",3.2));
        list.add(new StudentArrayListSorting("hari", 3.5));

        // for descending sorting
        list.sort((o1, o2) -> {
            if (o2.getGpa() - o1.getGpa()>0){
            return 1;

            } else if (o2.getGpa()-o1.getGpa()<0) {
                return -1;

            }else {
                return 0;

            }
        });

        for(StudentArrayListSorting st : list){
            System.out.println( st.getName()+" :  "+ st.getGpa());
        }

        // for ascending sorting

        list.sort((o2, o1) -> {
            if (o2.getGpa()- o1.getGpa()>0){
                return 1;
            } else if (o2.getGpa()-o1.getGpa()<0) {
                return -1;
            }else {
                return 0;
            }
        });

        System.out.println("-----------------------");
        for (StudentArrayListSorting ob : list){
            System.out.println(ob.getName()+"  :  "+ob.getGpa());
        }
    }
}
