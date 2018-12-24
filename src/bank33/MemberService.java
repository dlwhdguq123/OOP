package bank33;

public interface MemberService {
	// 회원가입
	public void join(String id, String pass, String name, String ssn);

	// =================================
	// 목록보기
	public void list();

	// 개인정보 검색
	public void find(String id);

	// 로그인
	public void login(String id, String pass);

	// 회원수
	public void count();

	// =================================
	// 정보 수정
	public void update(String id, String pass, String newPass);

	// 회원탈퇴
	public void delete(String id, String pass, String name, String ssn);
}
