package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	
	private HashSet<String> lottery = new HashSet<String>();
	private HashSet<String> win = new HashSet<String>();
	
	public boolean insertObject(Lottery l) {
		
		boolean result = lottery.add(l.toString());
		
		return result;
	}
	
	public HashSet<String> selectAll(){
		return lottery;
	}
	
	public boolean deleteObject(Lottery l) {
		boolean result = lottery.remove(l.toString());
		
		if(!win.isEmpty() && result) {
			win.remove(l.toString());
		}
		
		return result;
	}
	
	public HashSet<String> winObject() {
		
		if(lottery.size() < 4) {
			return null;
		} else {
			ArrayList<String> list = new ArrayList<String>(lottery);
			
			while(win.size() != 4) {
				int num = (int)(Math.random() * list.size());
				win.add(list.get(num));
			}
			
			return win;
		}
	}
	
	public boolean searchWinner(Lottery l) {
		boolean result = win.contains(l.toString());
		return result;
	}

}
