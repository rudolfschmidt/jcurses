package com.rudolfschmidt.jcurses;

public interface Key {

	// A wchar_t contains a key code
	int CODE_YES = 0400;
	// Minimum curses key
	int MIN = 0401;
	// Break key (unreliable)
	int BREAK = 0401;
	// Soft (partial) reset (unreliable)
	int SRESET = 0530;
	// Reset or hard reset (unreliable)
	int RESET = 0531;
	// down-arrow key
	int DOWN = 0402;
	// up-arrow key
	int UP = 0403;
	// left-arrow key
	int LEFT = 0404;
	// right-arrow key
	int RIGHT = 0405;
	// home key
	int HOME = 0406;
	// backspace key
	int BACKSPACE = 0407;
	// Function keys.  Space for 64
	int F0 = 0410;
	// Value of KEY_F0 + n
	int F1 = 0411;
	// Value of KEY_F0 + n
	int F2 = 0412;
	// Value of KEY_F0 + n
	int F3 = 0413;
	// Value of KEY_F0 + n
	int F4 = 0414;
	// Value of KEY_F0 + n
	int F5 = 0415;
	// Value of KEY_F0 + n
	int F6 = 0416;
	// Value of KEY_F0 + n
	int F7 = 0417;
	// Value of KEY_F0 + n
	int F8 = 0420;
	// Value of KEY_F0 + n
	int F9 = 0421;
	// Value of KEY_F0 + n
	int F10 = 0422;
	// Value of KEY_F0 + n
	int F11 = 0423;
	// Value of KEY_F0 + n
	int F12 = 0424;
	// delete-line key
	int DL = 0510;
	// insert-line key
	int IL = 0511;
	// delete-character key
	int DC = 0512;
	// insert-character key
	int IC = 0513;
	// sent by rmir or smir in insert mode
	int EIC = 0514;
	// clear-screen or erase key
	int CLEAR = 0515;
	// clear-to-end-of-screen key
	int EOS = 0516;
	// clear-to-end-of-line key
	int EOL = 0517;
	// scroll-forward key
	int SF = 0520;
	// scroll-backward key
	int SR = 0521;
	// next-page key
	int NPAGE = 0522;
	// previous-page key
	int PPAGE = 0523;
	// set-tab key
	int STAB = 0524;
	// clear-tab key
	int CTAB = 0525;
	// clear-all-tabs key
	int CATAB = 0526;
	// enter/send key
	int ENTER = 0527;
	// print key
	int PRINT = 0532;
	// lower-left key (home down)
	int LL = 0533;
	// upper left of keypad
	int A1 = 0534;
	// upper right of keypad
	int A3 = 0535;
	// center of keypad
	int B2 = 0536;
	// lower left of keypad
	int C1 = 0537;
	// lower right of keypad
	int C3 = 0540;
	// back-tab key
	int BTAB = 0541;
	// begin key
	int BEG = 0542;
	// cancel key
	int CANCEL = 0543;
	// close key
	int CLOSE = 0544;
	// command key
	int COMMAND = 0545;
	// copy key
	int COPY = 0546;
	// create key
	int CREATE = 0547;
	// end key
	int END = 0550;
	// exit key
	int EXIT = 0551;
	// find key
	int FIND = 0552;
	// help key
	int HELP = 0553;
	// mark key
	int MARK = 0554;
	// message key
	int MESSAGE = 0555;
	// move key
	int MOVE = 0556;
	// next key
	int NEXT = 0557;
	// open key
	int OPEN = 0560;
	// options key
	int OPTIONS = 0561;
	// previous key
	int PREVIOUS = 0562;
	// redo key
	int REDO = 0563;
	// reference key
	int REFERENCE = 0564;
	// refresh key
	int REFRESH = 0565;
	// replace key
	int REPLACE = 0566;
	// restart key
	int RESTART = 0567;
	// resume key
	int RESUME = 0570;
	// save key
	int SAVE = 0571;
	// shifted begin key
	int SBEG = 0572;
	// shifted cancel key
	int SCANCEL = 0573;
	// shifted command key
	int SCOMMAND = 0574;
	// shifted copy key
	int SCOPY = 0575;
	// shifted create key
	int SCREATE = 0576;
	// shifted delete-character key
	int SDC = 0577;
	// shifted delete-line key
	int SDL = 0600;
	// select key
	int SELECT = 0601;
	// shifted end key
	int SEND = 0602;
	// shifted clear-to-end-of-line key
	int SEOL = 0603;
	// shifted exit key
	int SEXIT = 0604;
	// shifted find key
	int SFIND = 0605;
	// shifted help key
	int SHELP = 0606;
	// shifted home key
	int SHOME = 0607;
	// shifted insert-character key
	int SIC = 0610;
	// shifted left-arrow key
	int SLEFT = 0611;
	// shifted message key
	int SMESSAGE = 0612;
	// shifted move key
	int SMOVE = 0613;
	// shifted next key
	int SNEXT = 0614;
	// shifted options key
	int SOPTIONS = 0615;
	// shifted previous key
	int SPREVIOUS = 0616;
	// shifted print key
	int SPRINT = 0617;
	// shifted redo key
	int SREDO = 0620;
	// shifted replace key
	int SREPLACE = 0621;
	// shifted right-arrow key
	int SRIGHT = 0622;
	// shifted resume key
	int SRSUME = 0623;
	// shifted save key
	int SSAVE = 0624;
	// shifted suspend key
	int SSUSPEND = 0625;
	// shifted undo key
	int SUNDO = 0626;
	// suspend key
	int SUSPEND = 0627;
	// undo key
	int UNDO = 0630;
	// Mouse event has occurred
	int MOUSE = 0631;
	// Terminal resize event
	int RESIZE = 0632;
	// We were interrupted by an event
	int EVENT = 0633;
	// Maximum key value is 0633
	int MAX = 0777;

}
