package test.mypac;
/*
 * 	프로그래머가 필요에 따라 예외 객체를 생성할 클래슬르 직접 만들 수도 있다.
 * 
 * 	실행중에 발생한느 예외를 발생 시키고 싶으면 RuntimeException 을 상속 받아서 만들면 된다.
 * */
public class SleepyException extends RuntimeException {
	//생성자
	public SleepyException(String msg) {
		//예외 메세지를 생성자의 인자로 전달 받아서 부모 생성자에 전달한다.
		super(msg);
		//전달된 예외 메세지는 나중에 .getMEssage()를 호출하면 리턴된다.
	}
}
