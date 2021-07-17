package com.sy.example.collection.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.sy.example.collection.model.vo.Board;

public class BoardDao {
	private ArrayList<Board> list = new ArrayList<Board>();
	
	public BoardDao() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("board_list.dat"));
			
			Board b;
			while((b = (Board)ois.readObject()) != null) {
				list.add(b);
			}
			
		} catch(EOFException e) {
			//오류처리
		} catch (FileNotFoundException e) {
//			File f = new File("board_list.dat");
//			System.out.println("파일 생성");  --> 파일 없을 때 경우의 수도 있으니까 생성하지 말자
			System.out.println("파일 없음");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int getLastBoardNo() {
		int bNo = list.get(list.size()-1).getBoardNo();
		return bNo+1;
	}
	
	public void writeBoard(Board board) {
		list.add(board);
	}
	
	public ArrayList<Board> displayAllList() {
		return list;
	}
	
	public Board displayBoard(int no) {
//		Board bd = new Board();  --> 이렇게 생성하면 안됨
		for(Board b : list) {
			if(b.getBoardNo() == no) {
				return b;
			}
		}
		return null;
	}
	
	public void upReadCount(int no) {
		for(Board b : list) {
			if(b.getBoardNo() == no) {
				b.setReadCount(b.getReadCount()+1);
			}
		}
	}
	
	public void modifyTitle(int no, String title) {
		for(Board b : list){
			if(b.getBoardNo() == no) {
				b.setBoardTitle(title);
			}
		}
	}
	
	public void modifyContent(int no, String content) {
		for(Board b : list){
			if(b.getBoardNo() == no) {
				b.setBoardTitle(content);
			}
		}
	}
	
	public void deleteBoard(int no) {
		int index = 0;
//		for(Board b : list) {    --> ConcurrentModificationException
//			if(b.getBoardNo()==no) {
//				list.remove(b);
//			}
//		}
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getBoardNo()==no) {
				index = i;
			}
		}
		list.remove(index);
	}
	
	public ArrayList<Board> searchBoard(String title) {
		ArrayList<Board> tList = null;
		for(Board b : list) {
			if(b.getBoardTitle().contains(title)) {
				tList = new ArrayList<Board>();
				tList.add(b);
			}
		}		
		return tList;
	}
	
	public void saveListFile() {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("board_list.dat"))){
			
			//list 전체 돌면서 파일에 덮어씌우기
			//삭제되는 글도 있을 수 있으므로 ,true로 추가해주지 않았다.
			for(Board b : list) {
				oos.writeObject(b);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
