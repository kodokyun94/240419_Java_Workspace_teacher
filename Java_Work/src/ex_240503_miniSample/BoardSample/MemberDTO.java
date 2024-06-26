package ex_240503_miniSample.BoardSample;

public class MemberDTO {
	// 모델클래스, 
	// DTO(Data Transfer Object) , 
	// 제너릭 , 설명할 때, 장난감 비유. 
	// 상자에 담을 때, Object 담으면, 담기는 편하지만, 꺼낼 때 힘들다. 
	// 모델을 이용하자 . DTO 
	
	// 게시판을 만들 때, 
	// 게시판에 작성하는 항목 요소를,여기에 정의할 예정. 
	  private String id;
	    private String pwd;
	    private String name;
	    private String tel;
	    private String addr;
	    private String birth;
	    private String job ;
	    private String gender;
	    private String email;
	    private String intro;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getAddr() {
			return addr;
		}
		public void setAddr(String addr) {
			this.addr = addr;
		}
		public String getBirth() {
			return birth;
		}
		public void setBirth(String birth) {
			this.birth = birth;
		}
		public String getJob() {
			return job;
		}
		public void setJob(String job) {
			this.job = job;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getIntro() {
			return intro;
		}
		public void setIntro(String intro) {
			this.intro = intro;
		}
		@Override
		public String toString() {
			return "MemberDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", tel=" + tel + ", addr=" + addr
					+ ", birth=" + birth + ", job=" + job + ", gender=" + gender + ", email=" + email + ", intro="
					+ intro + "]";
		}
	 
}