package com.rudolfschmidt.jcurses.types;

import com.sun.jna.IntegerType;

public class UnsignedInit32 extends IntegerType {
	public UnsignedInit32() {
		this(0);
	}
	public UnsignedInit32(int value) {
		super(4, value, true);
	}
}