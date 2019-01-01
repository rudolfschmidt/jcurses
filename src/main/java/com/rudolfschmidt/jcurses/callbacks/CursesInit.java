package com.rudolfschmidt.jcurses.callbacks;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;

public interface CursesInit extends Callback {
	int invoke(Pointer win, int value);
}