package com.rudolfschmidt;

import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class NCurses {

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

	public enum KEY {
		// A wchar_t contains a key code
		CODE_YES(0400),
		// Minimum curses key
		MIN(0401),
		// Break key (unreliable)
		BREAK(0401),
		// Soft (partial) reset (unreliable)
		SRESET(0530),
		// Reset or hard reset (unreliable)
		RESET(0531),
		// down-arrow key
		DOWN(0402),
		// up-arrow key
		UP(0403),
		// left-arrow key
		LEFT(0404),
		// right-arrow key
		RIGHT(0405),
		// home key
		HOME(0406),
		// backspace key
		BACKSPACE(0407),
		// Function keys.  Space for 64
		F0(0410),
		// Value of KEY_F0 + n
		F1(0411),
		// Value of KEY_F0 + n
		F2(0412),
		// Value of KEY_F0 + n
		F3(0413),
		// Value of KEY_F0 + n
		F4(0414),
		// Value of KEY_F0 + n
		F5(0415),
		// Value of KEY_F0 + n
		F6(0416),
		// Value of KEY_F0 + n
		F7(0417),
		// Value of KEY_F0 + n
		F8(0420),
		// Value of KEY_F0 + n
		F9(0421),
		// Value of KEY_F0 + n
		F10(0422),
		// Value of KEY_F0 + n
		F11(0423),
		// Value of KEY_F0 + n
		F12(0424),
		// delete-line key
		DL(0510),
		// insert-line key
		IL(0511),
		// delete-character key
		DC(0512),
		// insert-character key
		IC(0513),
		// sent by rmir or smir in insert mode
		EIC(0514),
		// clear-screen or erase key
		CLEAR(0515),
		// clear-to-end-of-screen key
		EOS(0516),
		// clear-to-end-of-line key
		EOL(0517),
		// scroll-forward key
		SF(0520),
		// scroll-backward key
		SR(0521),
		// next-page key
		NPAGE(0522),
		// previous-page key
		PPAGE(0523),
		// set-tab key
		STAB(0524),
		// clear-tab key
		CTAB(0525),
		// clear-all-tabs key
		CATAB(0526),
		// enter/send key
		ENTER(0527),
		// print key
		PRINT(0532),
		// lower-left key (home down)
		LL(0533),
		// upper left of keypad
		A1(0534),
		// upper right of keypad
		A3(0535),
		// center of keypad
		B2(0536),
		// lower left of keypad
		C1(0537),
		// lower right of keypad
		C3(0540),
		// back-tab key
		BTAB(0541),
		// begin key
		BEG(0542),
		// cancel key
		CANCEL(0543),
		// close key
		CLOSE(0544),
		// command key
		COMMAND(0545),
		// copy key
		COPY(0546),
		// create key
		CREATE(0547),
		// end key
		END(0550),
		// exit key
		EXIT(0551),
		// find key
		FIND(0552),
		// help key
		HELP(0553),
		// mark key
		MARK(0554),
		// message key
		MESSAGE(0555),
		// move key
		MOVE(0556),
		// next key
		NEXT(0557),
		// open key
		OPEN(0560),
		// options key
		OPTIONS(0561),
		// previous key
		PREVIOUS(0562),
		// redo key
		REDO(0563),
		// reference key
		REFERENCE(0564),
		// refresh key
		REFRESH(0565),
		// replace key
		REPLACE(0566),
		// restart key
		RESTART(0567),
		// resume key
		RESUME(0570),
		// save key
		SAVE(0571),
		// shifted begin key
		SBEG(0572),
		// shifted cancel key
		SCANCEL(0573),
		// shifted command key
		SCOMMAND(0574),
		// shifted copy key
		SCOPY(0575),
		// shifted create key
		SCREATE(0576),
		// shifted delete-character key
		SDC(0577),
		// shifted delete-line key
		SDL(0600),
		// select key
		SELECT(0601),
		// shifted end key
		SEND(0602),
		// shifted clear-to-end-of-line key
		SEOL(0603),
		// shifted exit key
		SEXIT(0604),
		// shifted find key
		SFIND(0605),
		// shifted help key
		SHELP(0606),
		// shifted home key
		SHOME(0607),
		// shifted insert-character key
		SIC(0610),
		// shifted left-arrow key
		SLEFT(0611),
		// shifted message key
		SMESSAGE(0612),
		// shifted move key
		SMOVE(0613),
		// shifted next key
		SNEXT(0614),
		// shifted options key
		SOPTIONS(0615),
		// shifted previous key
		SPREVIOUS(0616),
		// shifted print key
		SPRINT(0617),
		// shifted redo key
		SREDO(0620),
		// shifted replace key
		SREPLACE(0621),
		// shifted right-arrow key
		SRIGHT(0622),
		// shifted resume key
		SRSUME(0623),
		// shifted save key
		SSAVE(0624),
		// shifted suspend key
		SSUSPEND(0625),
		// shifted undo key
		SUNDO(0626),
		// suspend key
		SUSPEND(0627),
		// undo key
		UNDO(0630),
		// Mouse event has occurred
		MOUSE(0631),
		// Terminal resize event
		RESIZE(0632),
		// We were interrupted by an event
		EVENT(0633),
		// Maximum key value is 0633
		MAX(0777),;

		public final int code;

		KEY(int code) {
			this.code = code;
		}
	}

}
