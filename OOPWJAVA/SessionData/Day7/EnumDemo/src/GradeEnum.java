
public enum GradeEnum {
	GRADE_1(70),
	GRADE_2(80);
	
	private int marks;
	private GradeEnum(int marks) {
		this.marks = marks;
	}
	
	public int getValue() {
		return marks;
	}
}
