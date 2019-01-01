package com.rudolfschmidt.jcurses.callbacks;

import com.sun.jna.Callback;

public interface CursesPutc extends Callback {
	int invoke(int signal);
}