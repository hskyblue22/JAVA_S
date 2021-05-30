package com.kh.collection.silsub1.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.collection.silsub1.model.vo.Board;

public class BoardDao {

	private ArrayList<Board> al = new ArrayList<Board>();
	
	public BoardDao() {
		// TODO Auto-generated constructor stub
		//board_list.dat
		//파일의 내용을 읽어서 list 에 저장함
		//null될 때까지 저장함
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("board_list.dat"))) {
			
		//1. al.add() -> 안됨 (index++; 와 관계없이 안된다.)
		//파일 있는 경우 -> ClassCastException
		//파일 없는 경우 -> FileNotFoundException
			
//			int index = 0;
//			while(true) {
//				al.add(/*index,*/ (Board)(ois.readObject()));
//				index++;
//			}
		
		//2. al.addAll(List로 형변환)
		//파일 있는 경우 -> 오류X
		//파일 없는 경우 -> FileNotFoundException	
		al.addAll((ArrayList<Board>)ois.readObject());
			
		}catch(EOFException e) {
			return;
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public int getLastBoardNo() {
		//게시글의마지막 번호 리턴
		return al.get(al.size()-1).getBoardNo();
	}
	
	public void writeBoard(Board board) {
		//전달받은 게시글을 list 에 추가
		al.add(board);
	}
	
	public Board displayBoard(int no) {
		//전달받은글 번호와 일치하는게시글 리턴
		return al.get(no-1);
	}
	
	public ArrayList<Board> displayAllList(){
		//게시글전체 list 를 리턴
		return al;
	}
	
	public void upReadCount(int no) {
		//전달받은 글 번호와 일치하는 게시글의 조회수 1 올려주기
		Board board = al.get(no-1);
		int rc = board.getReadCount()+1;
		board.setReadCount(rc);
		
	}
	
	public void modifyTitle(int no, String title) {
		//전달받은 글 번호와 일치하는 게시글의 제목을 수정하기
		al.get(no-1).setBoardTitle(title);
	}
	
	public void modifyContent(int no, String content) {
		//전달받은 글 번호와 일치하는 게시글 내용 수정
		al.get(no-1).setBoardContent(content);
	}
	
	public void deleteBoard(int no) {
		//전달받은 글 번호와 일치하는 게시글 삭제
		
		al.remove(no-1);
	}
	
	public ArrayList<Board> searchBoard(String title) {
		//전달받은 제목이 포함되어있는 게시글들 list 리턴
		
		ArrayList<Board> temp = new ArrayList<>();
		
		for(int i=0; i<al.size(); i++) {
			if(al.get(i).getBoardTitle().contains(title)) {
				temp.add(al.get(i));
			}else {
				System.out.println("찾으시는 게시글이 없습니다.");
			}
		}
		
		return temp;
	}
	
	public void saveListFile() {
		//board_list.dat 파일 저장하기
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("board_list.dat"))) {
			
			oos.writeObject(al);
			System.out.println("board_list.dat 에 저장되었습니다.");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
