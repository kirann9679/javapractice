package comparator;

public class studentcomp1 implements Comparable<studentcomp1> {
		int rollno;
		String name;
		public studentcomp1(int rollno, String name) {
			this.rollno=rollno;
			this.name=name;
		}
		public int compareTo(studentcomp1 o) {
			if(rollno>o.rollno) {
			return 1;
			}
			else {
				return -1;
		}
		}
}
