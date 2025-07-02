package com.que4;

public class GamesMAin {
public static void main(String[] args) {
	
	IGames gamesIndoor=()->{
		System.out.println("Indoor are Caroom,Ludo");
	};
	gamesIndoor.showGames();
	
	gamesIndoor=()->{
		System.out.println("outdoor are cricket,kabaddi");

	};
	gamesIndoor.showGames();
	
}
}
