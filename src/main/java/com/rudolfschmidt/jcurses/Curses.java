package com.rudolfschmidt.jcurses;

import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class Curses {

	static {
		Native.register("ncursesw");
	}

	public static native Pointer initscr();
	public static native int raw();
	public static native void printw(String str);
	public static native int getch();
	public static native int endwin();

	public static final int A_NORMAL = 0;
	public static final int A_ATTRIBUTES = NCURSES_BITS(~0, 0);
	public static final int A_CHARTEXT = NCURSES_BITS(1, 0) - 1;
	public static final int A_COLOR = NCURSES_BITS(((1) << 8) - 1, 0);
	public static final int A_STANDOUT = NCURSES_BITS(1, 8);
	public static final int A_UNDERLINE = NCURSES_BITS(1, 9);
	public static final int A_REVERSE = NCURSES_BITS(1, 10);
	public static final int A_BLINK = NCURSES_BITS(1, 11);
	public static final int A_DIM = NCURSES_BITS(1, 12);
	public static final int A_BOLD = NCURSES_BITS(1, 13);
	public static final int A_ALTCHARSET = NCURSES_BITS(1, 14);
	public static final int A_INVIS = NCURSES_BITS(1, 15);
	public static final int A_PROTECT = NCURSES_BITS(1, 16);
	public static final int A_HORIZONTAL = NCURSES_BITS(1, 17);
	public static final int A_LEFT = NCURSES_BITS(1, 18);
	public static final int A_LOW = NCURSES_BITS(1, 19);
	public static final int A_RIGHT = NCURSES_BITS(1, 20);
	public static final int A_TOP = NCURSES_BITS(1, 21);
	public static final int A_VERTICAL = NCURSES_BITS(1, 22);
	public static final int A_ITALIC = NCURSES_BITS(1, 23);

	public static native int attrset(int attrs);
	public static native int attron(int attrs);
	public static native int attroff(int attrs);

	private static final int NCURSES_ATTR_SHIFT = 8;

	private static int NCURSES_BITS(int mask, int shift) {
		return mask << (shift + NCURSES_ATTR_SHIFT);
	}

}
