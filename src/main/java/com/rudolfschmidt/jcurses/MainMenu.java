//package com.rudolfschmidt.jcurses;
//
//import com.sun.jna.Pointer;
//import com.sun.jna.Structure;
//import com.sun.jna.ptr.ByReference;
//import com.sun.jna.ptr.PointerByReference;
//
//import java.util.Arrays;
//
//public class MainMenu {
//
//	private static final String[] choices = new String[]{
//			"Choice 1",
//			"Choice 2",
//			"Choice 3",
//			"Choice 4",
//			"Exit",
//	};
//
//	public static void main(String[] args) {
//
////		final Window window = new Window(C.initscr());
////		C.cbreak();
////		C.noecho();
////		window.keypad(true);
////
////		final Pointer[] my_items = new Pointer[choices.length];
////		for (int i = 0; i < choices.length; i++) {
////			final Pointer menu_item = Menu.new_item(choices[i], choices[i]);
////			System.out.println(menu_item);
////			my_items[i] = menu_item;
////		}
////		final Pointer menu = Menu.new_menu(my_items);
////		C.refresh();
////
////
////		C.endwin();
//	}
//}
