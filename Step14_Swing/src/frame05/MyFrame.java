package frame05;

import java.awt.BorderLayout;
//import java.awt.FlowLayout;
//import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame{
	
	//생성자
	public MyFrame(String title) {
		//부모생성자에 프레임의 제목 넘겨주기
		super(title);
		
		//MyFrame a=this;
		//JFrame b=this;
		//Object c=this;        이렇게 사용가능하고 가능한 이유는 자바의 객체에 다형성 때문
		//Component d=this;
		
		setLayout(new FlowLayout());
		
		JButton sendBtn=new JButton("전송");
		
		//프레임에 버튼 추가하기 (FlowLayout 의 영향을 받는다)
		add(sendBtn);
		
		//버튼의 동작을 리스닝할 객체
		ActionListener listener=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("이게 전송 돼?");
				/*
				 *  JOptionPane 클래스의 static 메소드를 호출해서 메세지
				 *  
				 *  .showMessageDialog(프레임의 참조값, 띄울 메세지)
				 * */
				JOptionPane.showMessageDialog(MyFrame.this,"전송합니다");
			}								//class명.this
		};
		
		sendBtn.addActionListener(listener);
		
		
		//삭제 버튼을 만들어서
		JButton deleteBtn= new JButton("삭제");
		//프레임에 추가하기
		add(deleteBtn);
		/*
		 * 지역변수를 안 만들고 할 수는 없을까?
		 * 
		 * 추상메소드가 하나니깐 함수 형태로 만들수는 없을까?
		 * */
		deleteBtn.addActionListener((e)->{
		JOptionPane.showMessageDialog(MyFrame.this,"삭제합니다");
		});
		/*
		 * ActionListener listener2=new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * JOptionPane.showMessageDialog(MyFrame.this,"삭제합니다"); } };
		 * deleteBtn.addActionListener(listener2);
		 */
	}
	
	public static void main(String[] args) {
		
		JFrame f=new MyFrame("나의 프레임");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
