
public enum TitleEnum {
	SE("Software Enginer"),
	PE("Principal Engineer"),
	HR("HR Executive");
	
	private String str;
	private TitleEnum(String str) {
		this.str = str;
	}
	
	public String getValue() {
		return str;
	}
}
