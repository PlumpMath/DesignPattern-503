import java.util.Comparator;


public class MyComparator implements Comparator<Student>{

      @Override
      public int compare(Student o1, Student o2) {
            if(o1.getsAge()<o2.getsAge()){
                  return 1;
            }
            else{
                  return 0;
            }
      }
	                                                                           
}
