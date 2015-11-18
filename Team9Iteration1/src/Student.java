
public class Student extends Users{

	private Advisor advisor;
	private ProgramOfStudy template;

	public Advisor getAdvisor() {
		return advisor;
	}

	public void setAdvisor(Advisor advisor) {
		this.advisor = advisor;
	}

	public ProgramOfStudy getProgram() {
		return template;
	}

	public void setProgram(ProgramOfStudy template) {
		this.template = template;
	}
	
	public boolean showProgram() {
		if (template == null) {
			System.out.println("This student doesn't have a program yet!");
			return false;
		} else {
			System.out.println(template.toString());
			return true;
		}
	}

}
